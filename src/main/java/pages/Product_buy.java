package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Product_buy extends Basepage {

   private  WebDriver driver;
    public Product_buy(WebDriver driver) {
       super(driver);
    }

    private By productName = By.xpath("//a[@id='item_4_title_link']");
    private By A_Card = By.xpath("//button[@id='add-to-cart']");
    private By CardBox = By.xpath("//a[@class='shopping_cart_link']");
    private By checkOut = By.xpath("//button[@id='checkout']");
//    public By Product_Name= By.id("//a[@id='item_4_title_link']");
//    public By Add_card= By.xpath("//button[@id='add-to-cart']");


//    public void product_Name() {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement p_Name = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='item_4_title_link']")));
//       p_Name.click();
//    }


    // Actions
    public void clickProductName() {
        click(productName);
    }

//somapti
//    public void product_Name (){
//        driver.findElement(Product_Name).click();
//    }
    public void Add_Card(){
        click(A_Card);
        System.out.println("done");
    }
     public void cardBox(){
        click(CardBox);
        System.out.println("done");
    }

   public void Checkout(){
        click(checkOut);
   }
    public void P_commind(){
       clickProductName();
        Add_Card();
        System.out.println("hello");
    }
}
