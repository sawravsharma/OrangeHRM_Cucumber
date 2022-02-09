package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Login {
    WebDriver driver;

    @Given("^User is on a login page$")
    public void User_is_on_a_login_page(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
    }

    @Then("^User enters username in username textfield$")
    public void User_enters_username_in_username_textfield(){
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
    }

    @Then("^User enters password in password textfield$")
    public void User_enters_password_in_password_textfield(){
        driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
    }

    @Then("^User clicks on login button$")
    public void User_clicks_on_login_button(){
        driver.findElement(By.id("btnLogin")).click();
    }

    @Then("^User is on a home page$")
    public void User_is_on_a_home_page(){
        Assert.assertEquals("OrangeHRM", driver.getTitle());
    }
}
