package pages;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//public class HomePage {
//    private WebDriver driver;
//
//    // Locators
//    private By MainLogo= By.xpath("//div[@class='app_logo']");

//    private By ManuBtn = By.xpath("//div[@class='bm-burger-button']");
//    private By logoutButton = By.xpath("//a[@id='logout_sidebar_link']");
//
//    // Constructor
//    public HomePage(WebDriver driver) {
//        this.driver = driver;
//    }
//
//    // Actions
//    public String  mainLogo(){
//      return driver.findElement(MainLogo).getText();
//    }
//    public  void clickManu() {
//        driver.findElement(ManuBtn).click();
//    }
//
//    public By getManuBtn() {
//        return ManuBtn;
//    }
//
//    public void clickLogout() {
//        driver.findElement(logoutButton).click();
//    }
//}


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }



    public String mainLogo() {
        return driver.findElement(By.xpath("//div[@class='app_logo']")).getText();
    }

    public void clickMenu() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement menuButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='react-burger-menu-btn']")));
        menuButton.click();
    }

    public void clickLogout() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement logoutButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='logout_sidebar_link']")));
        logoutButton.click();
    }
}
