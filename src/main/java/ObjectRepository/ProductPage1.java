package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage1 {
	
	public ProductPage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[text()='Sauce Labs Fleece Jacket']")
	private WebElement prod1;
	
	@FindBy(xpath="//div[text()='Sauce Labs Onesie']")
	private WebElement prod2;
	
	@FindBy(className="shopping_cart_link")
	private WebElement cartIcon;
	
	@FindBy(className="product_sort_container")
	private WebElement prodSortContainer;
	
	@FindBy(id="add-to-cart")
	private WebElement AddTocartBtn;

	public WebElement getAddTocartBtn() {
		return AddTocartBtn;
	}

	public WebElement getProd1() {
		return prod1;
	}

	public WebElement getProd2() {
		return prod2;
	}

	public WebElement getCartIcon() {
		return cartIcon;
	}

	public WebElement getProdSortContainer() {
		return prodSortContainer;
	}

	
	
	

}
