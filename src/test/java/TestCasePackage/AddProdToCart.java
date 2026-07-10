package TestCasePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddProdToCart {
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	    driver.findElement(By.partialLinkText("Log in")).click();
	    driver.findElement(By.id("Email")).sendKeys("GitaBai@gmail.com");
	    driver.findElement(By.id("Password")).sendKeys("Gita@123");
	    driver.findElement(By.className("login-button")).click();
	    
	    
		
	
	}

}
