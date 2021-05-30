package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart extends BaseClass{
	
	public Cart() {
			
			PageFactory.initElements(driver, this);
			
	}
	
	@FindBy(xpath="//a[contains(@href, 'checkout')]")
	public WebElement cart;
	
	@FindBy(xpath = "//div[contains(text(), 'cart is empty')]")
	public WebElement emptyCartMessage;
	
	@FindBy(xpath = "//div[contains(text(), 'Payment')]/parent::div/parent::div")
	public WebElement payment;
	
	@FindBy(xpath = "//div[contains(text(), 'Delivery address')]/parent::div/parent::div")
	public WebElement delivery;

}
