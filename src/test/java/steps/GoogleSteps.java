package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoogleSteps {

    WebDriver driver;

    @Given("user opens google")
    public void user_opens_google() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        driver.get("https://www.google.com");
    }

    @Then("title should contain {string}")
    public void title_should_contain(String title) {
        Assert.assertTrue(driver.getTitle().contains(title));
        driver.quit();
    }
}
