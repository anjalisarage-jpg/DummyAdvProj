package TestCasePackage;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import GenericUtility.ExcelUtility;
import GenericUtility.PropertiesFileUtility;
import GenericUtility.WebDriverUtility;
import ObjectRepository.CartPage1;
import ObjectRepository.LoginPage1;
import ObjectRepository.ProductPage1;

public class AddLowProductToCart {

	public static void main(String[] args) throws Throwable {
		
		PropertiesFileUtility putil= new PropertiesFileUtility();
		ExcelUtility eutil= new ExcelUtility();
		WebDriverUtility wutil= new WebDriverUtility();
		
		//WebDriver driver= new EdgeDriver();
WebDriver driver= null;
		
		/*FileInputStream fis= new FileInputStream("./src/test/resources/Commondata.properties");
		Properties prop= new Properties();
		prop.load(fis);
		String BROWSER = prop.getProperty("Browser");
		String URL = prop.getProperty("Url");
		String USERNAME = prop.getProperty("Username");
		String PASSWORD = prop.getProperty("Password");*/

     String BROWSER = putil.toReadDtaFromProp("Browser");
     String URL = putil.toReadDtaFromProp("Url");
     String USERNAME = putil.toReadDtaFromProp("Username");
     String PASSWORD = putil.toReadDtaFromProp("Password");

		
		System.out.println(BROWSER);
		
		
		if(BROWSER.equals("Edge"))
		{
			driver= new EdgeDriver();
		}
		else if(BROWSER.equals("Chrome"))
			{
			driver= new ChromeDriver();
			}
		else if(BROWSER.equals("Firefox"))
		{
		driver= new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		wutil.waitForPageToLoad(driver);
		driver.get(URL);
		
		/*//login
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
	    driver.findElement(By.id("password")).sendKeys("secret_sauce");
	    driver.findElement(By.id("login-button")).click();*/
		
		/*driver.findElement(By.id("user-name")).sendKeys(USERNAME);
		driver.findElement(By.id("password")).sendKeys(PASSWORD);
		driver.findElement(By.id("login-button")).click();*/
		
		LoginPage1 lp= new LoginPage1(driver);
		lp.getUn().sendKeys(USERNAME);
		lp.getPw().sendKeys(PASSWORD);
		lp.getLogbtn().click();
		
		/*FileInputStream fis1= new FileInputStream("./src/test/resources/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis1);
		Sheet sh = wb.getSheet("Products");
		Row row = sh.getRow(5);
		String prodname1 = row.getCell(3).getStringCellValue();
		System.out.println(prodname1);*/
		String prodname1 = eutil.toReadDataFromExcel("Products", 5, 3);
	    
	  //add lowest product
	  		/*driver.findElement(By.xpath("//div[text()='"+prodname1+"']")).click();
	  		driver.findElement(By.id("add-to-cart")).click();
	  		
	  		driver.findElement(By.className("shopping_cart_link")).click();*/
		
		  ProductPage1 pp= new ProductPage1(driver);
		  pp.getProd2().click();
		  pp.getAddTocartBtn().click();
		  pp.getCartIcon().click();
	  		
	  		//validation
	  		//String cartItem = driver.findElement(By.className("inventory_item_name")).getText();
		  CartPage1 cp= new CartPage1(driver);
		String cartItem = cp.getInventItem().getText();
	  		if(cartItem.equals(prodname1))
	  		{
	  			System.out.println("pass");
	  		}
	  		else
	  		{
	  			System.out.println("fail");
	  		}
	  		
	  		//logout
	  		/*driver.findElement(By.id("react-burger-menu-btn")).click();
	  		driver.findElement(By.id("logout_sidebar_link")).click();*/
	  		
	  		cp.getBurgerIcon().click();
			cp.getLogout().click();
	  		
	  		driver.quit();
	  	}
	  
	}

