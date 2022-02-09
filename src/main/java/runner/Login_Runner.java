package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src//main//java//com//feature//Login.feature"},
        glue = {"stepdefinition"},
        monochrome = true,
        //strict = true,
        plugin = {"pretty", "json:Report/Cucumber.json"+
                "junit: Report/XMLReport.xml"+"html: Report/cucumberReport"}
                )

public class Login_Runner {

}

