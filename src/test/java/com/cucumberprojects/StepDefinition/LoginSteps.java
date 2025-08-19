package com.cucumberprojects.StepDefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class LoginSteps {
    WebDriver driver;

    @Given("User is on the login page")
    public void user_is_on_login_page() {
    	System.getProperty("webdriver.driver.chrome", "C:\\Users\\manim\\eclipse-workspace\\Testingcucumber\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://example.com/login");
    }

    @When("User enters valid username and password")
    public void user_enters_credentials() {
        driver.findElement(By.id("username")).sendKeys("testuser");
        driver.findElement(By.id("password")).sendKeys("testpass");
    }

    @And("clicks the login button")
    public void clicks_login_button() {
        driver.findElement(By.id("loginBtn")).click();
    }

    @Then("User should be redirected to the homepage")
    public void verify_homepage() {
        boolean isHome = driver.getCurrentUrl().contains("homepage");
        assert isHome;
        driver.quit();
    }
}
