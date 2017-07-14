package FeatureRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "featureFiles",	glue = "stepDefinitions", tags={"@Login"})
public class testRunner {

}
