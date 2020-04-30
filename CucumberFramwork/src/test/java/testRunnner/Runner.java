package testRunnner;


import cucumber.api.CucumberOptions;


@CucumberOptions(
		features = "src/test/java/Features",
		 glue="StepDefinitions")

public class Runner {

}
