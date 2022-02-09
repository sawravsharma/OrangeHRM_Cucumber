package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TagScenario {
    static WebDriver driver;
    @Given("^user is on the Login page$")
    public void user_is_on_the_Login_page()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }
    @When("^user enters username and password in respective textfields$")
    public void user_enters_username_and_password_in_respective_textfields(io.cucumber.datatable.DataTable dataTable){
        List<List<String>> data = dataTable.asLists(String.class);
        driver.findElement(By.id("txtUsername")).sendKeys(data.get(1).get(0));
        driver.findElement(By.id("txtPassword")).sendKeys(data.get(1).get(1));
    }
    @When("^user clicks on the demo OrangeHRM Login button$")
    public void user_clicks_on_the_demo_OrangeHRM_Login_button(){
        driver.findElement(By.id("btnLogin")).click();
    }
    @Then("^user is on the demo OrangeHRM Homepage$")
    public void user_is_on_the_demo_OrangeHRM_Homepage(){
        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
        driver.close();
    }
}
