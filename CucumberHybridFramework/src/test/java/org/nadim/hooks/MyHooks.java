package org.nadim.hooks;

import java.io.File;
import java.util.Properties;

import org.nadim.base.Base;
import org.nadim.utility.ConfigProperty;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class MyHooks extends Base {
	private WebDriver driver;
	
	ConfigProperty cp;
	@Before
	public void startUp() throws Exception {
		cp = new ConfigProperty();
		Properties pData = cp.getData();
		driver = lauchBrowser(pData.getProperty("browser-name"),pData.getProperty("application-url"));
	}

	@After
	public void tearDown(Scenario scenario) {
		
		String scenarioName = scenario.getName().replace(" ", "");
		
		if(scenario.isFailed()) {
			byte[] screenshotAs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshotAs, "image/png", scenarioName);
		}
		driver.close();
	}
}
