package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.HomePage;

public class testLogout {

    private WebDriver driver;
    private HomePage homePage;

    public testLogout(WebDriver driver) {
        this.driver = driver;
        this.homePage = new HomePage(driver);
    }

    @Test(priority = 3)
    public void testLogout() {
        homePage.clickMenu();
//        homePage.clickLogout();
    }
}
