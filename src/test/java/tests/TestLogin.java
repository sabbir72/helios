//package tests;
//
//import factory.BrowserFactory;
//import enums.Browsers;
//import org.junit.Test;
////import org.junit.jupiter.api.AfterEach;
////import org.junit.jupiter.api.BeforeAll;
////import org.junit.jupiter.api.BeforeEach;
////import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.BeforeSuite;
//import pages.HomePage;
//import pages.LoginPage;
//
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//public class TestLogin {
//    private WebDriver driver;
//    private LoginPage loginPage;
//    private HomePage homePage;
//
//    @BeforeSuite
//    public void setUp() {
//        // Launch browser
//        driver = BrowserFactory.launch(Browsers.CHROME);
//
//        // Navigate to the login page
//        driver.get("https://www.saucedemo.com/");
//
//        // Initialize the LoginPage object
//        loginPage = new LoginPage(driver);
//    }
//
//    @Test
//    public void testLoginAndLogout() throws InterruptedException {
//        // Login to the application
//        homePage = loginPage.login("standard_user", "secret_sauce");
//
//
//        // Verify that the menu button is present after login
//        assertTrue(homePage.mainLogo().equals("Swag Labs"));
//
//        // Click the menu button
//        homePage.clickManu();
//         Thread.sleep(3000);
//        // Logout from the application
//        homePage.clickLogout();
//
//    }
//
//    @AfterSuite
//    public void tearDown() {
//        // Close the browser
//        if (driver != null) {
////            driver.quit();
//        }
//    }
//}
//
//


package tests;

import factory.BrowserFactory;
import enums.Browsers;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import static org.testng.Assert.assertEquals;

public class TestLogin {
    private WebDriver driver;
    private LoginPage loginPage;
    private HomePage homePage;

    @BeforeSuite
    public void setUp() {
        // Launch browser
        driver = BrowserFactory.launch(Browsers.CHROME);

        // Navigate to the login page
        driver.get("https://www.saucedemo.com/");

        // Initialize the LoginPage object
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testLoginAndLogout() throws InterruptedException {
        // Login to the application
        homePage = loginPage.login("standard_user", "secret_sauce");

        // Verify that the main logo text is correct after login
        assertEquals(homePage.mainLogo(), "Swag Labs", "Main logo text mismatch!");

        // Click the menu button
        homePage.clickManu();
         Thread.sleep(3000);
        // Logout from the application
        homePage.clickLogout();
    }

    @AfterSuite
    public void tearDown() {
        // Close the browser
        if (driver != null) {
//            driver.quit();
        }
    }
}
