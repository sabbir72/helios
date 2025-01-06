package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;

    // Locators
    private By MainLogo= By.xpath("//div[@class='app_logo']");
    private By ManuBtn = By.xpath("//div[@class='bm-burger-button']");
    private By logoutButton = By.xpath("//a[@id='logout_sidebar_link']");

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public String  mainLogo(){
      return driver.findElement(MainLogo).getText();
    }
    public  void clickManu() {
        driver.findElement(ManuBtn).click();
    }

    public By getManuBtn() {
        return ManuBtn;
    }

    public void clickLogout() {
        driver.findElement(logoutButton).click();
    }
}
