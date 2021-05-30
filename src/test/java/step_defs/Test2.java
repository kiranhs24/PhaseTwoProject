package step_defs;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BaseClass;
import pages.Cart;

public class Test2 extends BaseClass {
	
	Cart shoppingCartPage = new Cart();
	JavascriptExecutor je = (JavascriptExecutor) driver;
	
	@When("^Clicks on Cart without adding any items$")
	public void clicks_on_Cart_without_adding_any_items() {
	    
		wait.until(ExpectedConditions.visibilityOf(shoppingCartPage.cart));
		shoppingCartPage.cart.click();
		
	}

	@Then("^A message should be displayed saying your cart is empty$")
	public void a_message_should_be_displayed_saying_your_cart_is_empty() {
	  
		wait.until(ExpectedConditions.visibilityOf(shoppingCartPage.emptyCartMessage));
		assertTrue(shoppingCartPage.emptyCartMessage.isDisplayed());
		
	}
	
	@Then("^Delivery and Payment should not be enabled$")
	public void check_delivery_and_payment_options() {
		
		je.executeScript("arguments[0].scrollIntoView(true)", shoppingCartPage.delivery);
		wait.until(ExpectedConditions.visibilityOf(shoppingCartPage.delivery));
		assertTrue(shoppingCartPage.delivery.isEnabled());
		assertTrue(shoppingCartPage.payment.isEnabled());
		
	}

}
