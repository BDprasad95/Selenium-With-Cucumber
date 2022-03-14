package Stepdef;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/HooksDemo/BAckground.feature"},
		glue= {"StepsForBackground"},
		plugin = {"json:target/cucumber.json"})
public class TestRunnerForBackground {

}
