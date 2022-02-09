package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"C:\\Users\\SauravSharma\\IdeaProjects\\Cucumber_Project\\src\\main\\java\\featurefiles"},
        glue = {"StepDefinitions"},
        monochrome = true,
        //strict = true,
        plugin = {"pretty",
                "json:Report/Cucumber.json",
                "junit:Report/XMLReport.xml",
                "html:Report/cucumberReport.html"},
        tags={"@SmokeTest"}
                )

public class Login_Runner {

}

