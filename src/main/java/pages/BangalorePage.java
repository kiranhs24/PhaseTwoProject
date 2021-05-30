package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BangalorePage extends BaseClass{
	
	public BangalorePage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[contains(@href, 'bangalore')]")
	public WebElement Bangalore;
	
	@FindBy(xpath="//div[contains(text(), 'Where might we find you')]")
	public WebElement gotToBangaloreLocations;
	
	@FindBy(xpath="//a[contains(@href, 'central-bangalore')]")
	public WebElement BangaloreLocation;
	
	@FindBy(xpath="//a[contains(@href, 'top-rated')]")
	public WebElement topRatedRecipes;
	
	@FindBy(xpath="//span[contains(@class, 'icon-star')]/parent::div")
	public WebElement recipeRating; 
	
}
