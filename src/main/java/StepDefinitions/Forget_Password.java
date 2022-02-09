package StepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import static StepDefinitions.Login.driver;

public class Forget_Password {

    @When("^user clicks on the forget password link$")
    public void user_clicks_on_the_forget_password_link()
    {
        driver.findElement(By.id("forgotPasswordLink")).click();
    }

    @Then("^user is redirecting to the ForgetPassword page$")
    public void user_is_redirecting_to_the_ForgetPassword_page()
    {
        Assert.assertEquals(driver.getTitle(),"OrangeHRM");
        driver.close();
    }
}