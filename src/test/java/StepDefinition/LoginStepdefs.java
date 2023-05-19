package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class LoginStepdefs {

    public static WebDriver driver;

    @Given("user has base url")
    public void userHasBaseUrl() {
        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<>();
        Map<String, Object> profile = new HashMap<>();
        Map<String, Integer> contentSetting = new HashMap<>();

        contentSetting.put("notifications" , 2);
        contentSetting.put("geolocation" , 2);
        profile.put("managed_default_content_settings", contentSetting);
        prefs.put("profile" , profile);
        options.setExperimentalOption("prefs", prefs);
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("user enter {string} and {string} and {string}")
    public void userEnterFirstNameAndLastNameAndEmail(String firstName, String lastName, String email) throws InterruptedException {
//        Thread.sleep(5000);
        driver.findElement(By.xpath("(//input[@name=\"name\"])[1]")).sendKeys(firstName);
        driver.findElement(By.xpath("(//input[@name=\"name\"])[2]")).sendKeys(lastName);
        driver.findElement(By.xpath("(//input[@type])[3]")).sendKeys(email);

    }

    @And("enter {string} and {string}")
    public void enterPasswordAndRepeatPassword(String password, String repeatPassword) throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("((//input[@type=\"password\"])[1]")).sendKeys(password);
        driver.findElement(By.xpath("((//input[@type=\"password\"])[2]")).sendKeys(repeatPassword);
    }

    @And("click Register")
    public void clickRegister() {
        driver.findElement(By.xpath("")).click();
    }

    @Then("user will be registered successfully")
    public void userWillBeRegisteredSuccessfully() {
    }
}
