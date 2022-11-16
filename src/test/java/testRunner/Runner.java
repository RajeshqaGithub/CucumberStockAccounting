package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"FeatureFile"},monochrome=true,dryRun=false,glue= {"stepDefination"}
,plugin = {"pretty", "html:target/cucumber-reports"})
public class Runner {

}
