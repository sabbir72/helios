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




//import factory.BrowserFactory;
//import enums.Browsers;
//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.Test;
//import pages.HomePage;
//import pages.LoginPage;
//import pages.Product_buy;
//
//import static org.testng.Assert.assertEquals;
//
//public class TestLogin {
//    private WebDriver driver;
//    private LoginPage loginPage;
//    private HomePage homePage;
//    private Product_buy productBuy;
//
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
//
//    }
//
//    @Test
//    public void testLogin() throws InterruptedException {
//        // Login to the application
//        homePage = loginPage.login("standard_user", "secret_sauce");
//
//        // Verify that the main logo text is correct after login
//        assertEquals(homePage.mainLogo(), "Swag Labs", "Main logo text mismatch!");
//
//    }
//    @Test
//    public void test_Logout() throws InterruptedException {
//        // Click the menu button
//        homePage.clickMenu();
//        Thread.sleep(3000);
//        // Logout from the application
////        homePage.clickLogout();
//    }
//    @Test
//    public void Product() throws InterruptedException {
//        productBuy=new Product_buy(driver);
//       productBuy.P_commind();
//    }
//
//
//
//@Test
//    @AfterSuite
//    public void tearDown() {
//        // Close the browser
//        if (driver != null) {
////            driver.quit();
//        }
//    }
//}
//================================================================v2==========================================================
//package tests;
//import factory.BrowserFactory;
//import enums.Browsers;
//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.Test;
//import pages.HomePage;
//import pages.LoginPage;
//import pages.MyInform;
//import pages.Product_buy;
//
//import static org.testng.Assert.assertEquals;
//
//public class TestLogin {
//
//    private WebDriver driver;
//
//    private LoginPage loginPage;
//    private HomePage homePage;
//    private Product_buy productBuy;
//    private MyInform myInform;
//
//    @BeforeSuite
//    public void setUp() {
//
//        // Launch browser
//        driver = BrowserFactory.launch(Browsers.CHROME);
//        driver.manage().window().maximize();
//
//        // Navigate to the login page
//        driver.get("https://www.saucedemo.com/");
//
//        // Initialize the LoginPage object
//        loginPage = new LoginPage(driver);
//    }
//
//    @Test(priority = 1)
//    public void testLogin() {
//        // Login to the application
//        homePage = loginPage.login("standard_user", "secret_sauce");
//       assertEquals(homePage.mainLogo(), "Swag Labs", "Main logo text mismatch!");
//    }
//    @Test(priority = 2, dependsOnMethods = "testLogin")
//    public void testProductBuy() {
//        productBuy = new Product_buy(driver);
//        // Perform actions in Product_buy
////        productBuy.product_Name();
//        productBuy.clickProductName();
//        productBuy.Add_Card();
//        productBuy.cardBox();
//        productBuy.Checkout();
//    }
//    @Test(priority =3 , dependsOnMethods = "testLogin")
//    public void testLogout() {
//        homePage.clickMenu();
//        // Logout from the application
////        homePage.clickLogout();
//    }
//
//    @Test(priority =4 , dependsOnMethods = "testLogin")
//    public void AddInfo() throws InterruptedException {
//        myInform =new MyInform(driver);
//        myInform.firstName();
//        myInform.lastName();
//        myInform.zip();
//        myInform.continuBtn();
//        myInform.finishBtn();
//        String Text01 =myInform.textGet();
////        System.out.println("Thank you for your order!"+ Text01);
//         assertEquals(Text01,"Thank you for your order!", "Order confirmation message mismatch!");
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
//================================================================v 3==========================================================
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
        driver = BrowserFactory.launch(Browsers.CHROME);
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
    }

    @Test(priority = 1)
    public void testLogin() {
        homePage = loginPage.login("standard_user", "secret_sauce");
        assertEquals(homePage.mainLogo(), "Swag Labs", "Main logo text mismatch!");
    }

    public WebDriver getDriver() {
        return driver;
    }

    @AfterSuite
    public void tearDown() {
        if (driver != null) {
//            driver.quit();
        }
    }
}
