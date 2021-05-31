package step_defs;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.ui.ExpectedConditions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BaseClass;
import pages.SignUpLoginPage;

public class Test2 extends BaseClass {
	
	SignUpLoginPage loginSignUp = new SignUpLoginPage();
	
	@When("^Clicks on Login$")
	public void clicks_on_sign_in() {
	    
		loginSignUp.signIn.click();
		
	}

	@Then("^User should see login page and create account button$")
	public void check_login_and_create_account() {
	  
		wait.until(ExpectedConditions.visibilityOf(loginSignUp.mobilePhone));
		assertTrue(loginSignUp.mobilePhone.isDisplayed());
		assertTrue(loginSignUp.createAccount.isDisplayed());
		
	}
	
	@When("^Clicks on create account$")
	public void clicks_on_sign_up() {
	    
		loginSignUp.signIn.click();
		wait.until(ExpectedConditions.visibilityOf(loginSignUp.mobilePhone));
		loginSignUp.createAccount.click();
		
	}
	
	@Then("^User should be able to see sign up page$")
	public void check_delivery_and_payment_options() {
		
		wait.until(ExpectedConditions.visibilityOf(loginSignUp.mobilePhone));
		assertTrue(loginSignUp.mobilePhone.isDisplayed());
		assertTrue(loginSignUp.name.isDisplayed());
		assertTrue(loginSignUp.email.isDisplayed());
		assertTrue(loginSignUp.password.isDisplayed());
		
	}

}
