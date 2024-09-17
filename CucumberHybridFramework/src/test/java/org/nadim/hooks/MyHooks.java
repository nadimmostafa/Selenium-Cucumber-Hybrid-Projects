package org.nadim.hooks;

import java.util.Properties;

import org.nadim.base.Base;
import org.nadim.utility.ConfigProperty;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

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
	public void tearDown() {
		driver.close();
	}
}
