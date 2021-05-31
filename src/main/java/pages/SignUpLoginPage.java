package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpLoginPage extends BaseClass{
	
	public SignUpLoginPage() {
			
			PageFactory.initElements(driver, this);
			
	}
	
	@FindBy(xpath="//a[contains(text(), 'Login')]")
	public WebElement signIn;
	
	@FindBy(id = "mobile")
	public WebElement mobilePhone;
	
	@FindBy(xpath = "//a[contains(text(), 'create an account')]")
	public WebElement createAccount;
	
	@FindBy(id = "name")
	public WebElement name;
	
	@FindBy(id = "email")
	public WebElement email;
	
	@FindBy(id = "password")
	public WebElement password;

}
