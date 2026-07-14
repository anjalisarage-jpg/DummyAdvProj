package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
	
	public LoginPage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="user-name")
	private WebElement un;
	
	@FindBy(id="password")
	private WebElement pw;
	
	@FindBy(id="login-button")
	private WebElement logbtn;
	
	

	public WebElement getUn() {
		return un;
	}

	public WebElement getPw() {
		return pw;
	}

	public WebElement getLogbtn() {
		return logbtn;
	}
	
	

}
