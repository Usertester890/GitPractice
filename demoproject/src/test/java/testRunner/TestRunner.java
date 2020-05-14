package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/Feature/Test2Parameterisation.feature",
		glue="stepDefinition")

public class TestRunner {

		
}
