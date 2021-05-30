package step_defs;

import static org.testng.Assert.assertEquals;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BangalorePage;
import pages.BaseClass;
import utilities.Utilities;

public class Test1 extends BaseClass{
	
	BangalorePage bangalorePage = new BangalorePage();
	JavascriptExecutor je = (JavascriptExecutor) driver;

	@Given("^The user opens swiggy$")
	public void the_user_opens_a_website() throws IOException {
		
		driver.get(Utilities.readExcel().get("site_url").toString());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		System.out.println(" Browser Opened ");
		System.out.println(" =========================== ");
		System.out.println(driver.getCurrentUrl());
		System.out.println(" =========================== ");
		
	}

	@When("^User clicks on Bangalore$")
	public void user_enter_the_username() throws IOException, InterruptedException {
		
		wait.until(ExpectedConditions.visibilityOf(bangalorePage.Bangalore));
		bangalorePage.Bangalore.click();
		Thread.sleep(3000);
		
	}

	@Then("^Bangalore Location should be set$")
	public void user_enter_the_password() throws IOException {
		
		je.executeScript("arguments[0].scrollIntoView(true)", wait.until(ExpectedConditions.visibilityOf(bangalorePage.gotToBangaloreLocations)));
		assertEquals(bangalorePage.BangaloreLocation.isDisplayed(), false);
		
	}
	
	@When("^Selects top rated section$")
	public void select_top_rated_section() {
		
		je.executeScript("arguments[0].scrollIntoView(true)", wait.until(ExpectedConditions.visibilityOf(bangalorePage.topRatedRecipes)));
		bangalorePage.topRatedRecipes.click();
		
	}
	
	@Then("^Display recipes related to selection$")
	public void display_recipes() throws IOException {
	
		wait.until(ExpectedConditions.visibilityOf(bangalorePage.recipeRating));
		assertEquals(bangalorePage.recipeRating.getText(), Utilities.readExcel().get("recipe_rating_1").replace("\"", "").toString() + ".0");
		
	}
	
}
