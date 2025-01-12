package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Basepage {
    protected WebDriver driver;
    private WebDriverWait wait;

    // Constructor
    public Basepage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Default wait
    }

    // Click element
    public void click(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    // Input text into a text field
    public void enterText(By locator, String text) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        element.clear(); // Clear existing text if any
        element.sendKeys(text); // Enter the provided text
    }


    // Get text from element
    public String getText(By locator) {
       return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).getText();
    }


    // Get attribute value
    public String getAttribute(By locator, String attribute) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).getAttribute(attribute);
    }

    // Hover over element
    public void hover(By locator) {
        Actions actions = new Actions(driver);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        actions.moveToElement(element).perform();
    }

    // Scroll to element
    public void scrollToElement(By locator) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    // Select dropdown by visible text
    public void selectByVisibleText(By locator, String text) {
        WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        Select select = new Select(dropdown);
        select.selectByVisibleText(text);
    }

    // Select dropdown by value
    public void selectByValue(By locator, String value) {
        WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        Select select = new Select(dropdown);
        select.selectByValue(value);
    }

    // Select dropdown by index
    public void selectByIndex(By locator, int index) {
        WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        Select select = new Select(dropdown);
        select.selectByIndex(index);
    }

    // Get all options in a dropdown
    public List<WebElement> getDropdownOptions(By locator) {
        WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        Select select = new Select(dropdown);
        return select.getOptions();
    }

    // Check if element is displayed
    public boolean isDisplayed(By locator) {
        try {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).isDisplayed();
        } catch (TimeoutException e) {
            return false;
        }
    }

    // Scroll and click
    public void scrollAndClick(By locator) {
        scrollToElement(locator);
        click(locator);
    }
}
