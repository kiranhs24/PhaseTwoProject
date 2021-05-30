package pages;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static WebDriver driver;
	public static WebDriverWait wait;

	public static void initChromeBrowser() throws MalformedURLException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--headless");
		options.addArguments("--disable-gpu");
		options.addArguments("--disable-extensions");
		options.addArguments("--no-sandbox");
		options.addArguments("--allow-insecure-localhost");
		
		driver = new ChromeDriver(options);
		wait = new WebDriverWait(driver, 20);

	}

}
