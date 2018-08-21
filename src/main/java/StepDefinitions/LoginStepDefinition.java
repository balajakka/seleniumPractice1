package StepDefinitions;

import cucumber.api.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by balajakka on 11/08/2018.
 */
public class LoginStepDefinition {
    WebDriver driver;
    @Given("^I am a existing Gmail user$")
    public void i_am_a_existing_Gmail_user(){
        System.setProperty("webdriver.chrome.driver","/Users/balajakka/Desktop/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
    }
    @When("^I enter username and password$")
    public void i_enter_username_and_password(){
        driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("jbkrao8281");
        driver.findElement(By.xpath("//div[@id=\"identifierNext\"]")).click();

    }
    @And("^I click login button$")
    public void i_click_login_button(){


    }
    @Then("^I will see Gmail Inbox screen$")
    public void i_will_see_Gmail_Inbox_screen(){

    }

}
