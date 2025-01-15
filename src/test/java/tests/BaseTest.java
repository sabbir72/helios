package tests;

import factory.BrowserFactory;
import enums.Browsers;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import pages.LoginPage;

import java.time.Duration;

public class BaseTest {

    // TODO: Externalise config data
    protected WebDriver driver;
    protected HomePage homePage;

    private Browsers browser = Browsers.CHROME; // Default browser
    private String url = "https://www.saucedemo.com/"; // Default URL

    @BeforeMethod
    public void setup() {
        // Initialize the WebDriver
        driver = BrowserFactory.launch(browser);

        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Adjust time as needed

        // Maximize the browser window
        driver.manage().window().maximize();

        // Navigate to the base URL
        driver.get(url);

        performLogin();
    }

     public void performLogin() {
        LoginPage loginPage = new LoginPage(driver);
        homePage = loginPage.login("standard_user", "secret_sauce");
    }

    @AfterMethod
    public void tearDown() {
        // Quit the WebDriver after each test
        if (driver != null) {
            driver.quit();
        }
    }
}
