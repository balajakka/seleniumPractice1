package StepDefinitions;

import cucumber.api.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

/**
 * Created by balajakka on 19/08/2018.
 */
public class DriverNavigationStepDefinition {

    WebDriver driver;

    @Given("^I am a chrome user$")
    public void I_am_a_chrome_user(){
        System.setProperty("webdriver.chrome.driver","/Users/balajakka/Desktop/chromedriver");
        driver = new ChromeDriver();

    }
    @When("^I access google search site$")
    public void I_access_google_search_site(){

        driver.get("https://google.com");
    }
    @And("^I access amazon site$")
    public  void I_access_amazon_site(){
        driver.navigate().to("https://amazon.com");
    }
    @And("^I click on backward broswer button$")
    public void I_click_on_backward_browser_button(){
        driver.navigate().back();
    }
    @And("^I click on forward browser button$")
    public void I_click_on_forward_browser_button(){
        driver.navigate().forward();
    }
    @Then("^I will see google search site$")
    public void I_will_see_google_search_site(){
        Assert.assertEquals(driver.findElement(By.xpath("//input[@value=\"Google Search\"]")).isDisplayed(),true);
        driver.quit();

    }
    @Then("^I will see Amazon site$")
    public void I_will_see_Amazon_site(){
        Assert.assertEquals(driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).isDisplayed(),true);
        driver.quit();

    }
}
