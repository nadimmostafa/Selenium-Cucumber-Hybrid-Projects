package org.nadim.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features= {"src/test/resources/features/Login.feature"},
		features= {"src/test/resources/features/Login.feature","src/test/resources/features/Search.feature"},
		glue={"org.nadim.stepdefinations","org.nadim.hooks"},
		//tags = ("@search"),
		plugin = {"pretty","html:target/reports/report.html"}
		)
public class TestRunner {

}
