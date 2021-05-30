package step_defs;


import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumber.listener.Reporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import pages.BaseClass;

public class Hooks extends BaseClass{
	
	@Before
	public void beforeHook() throws MalformedURLException {
		
		System.out.println(" =========================== ");
		System.out.println(" Before Hook ");
		System.out.println(" =========================== ");
		
		BaseClass.initChromeBrowser();
		
	}
		
	@After
	public void afterHook(Scenario scenario) throws IOException {
		
		System.out.println(" =========================== ");
		System.out.println(" After Hook ");
		System.out.println(" =========================== ");
		
		if (scenario.isFailed()) {
			
			TakesScreenshot shot = (TakesScreenshot) driver;
			String destination = "data:image/png;base64," + shot.getScreenshotAs(OutputType.BASE64);
			Reporter.addScreenCaptureFromPath(destination);
			
		}
		
		driver.quit();
		System.out.println(" Browser Closed ");
		System.out.println(" =========================== ");
		
	}
	
}
