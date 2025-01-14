package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.Product_buy;

public class testProductBuy {

    private WebDriver driver;
    private Product_buy productBuy;

    public testProductBuy(WebDriver driver) {
        this.driver = driver;
        this.productBuy = new Product_buy(driver);
    }

    @Test(priority = 2)
    public void testProductBuy() {
        productBuy.clickProductName();
        productBuy.Add_Card();
        productBuy.cardBox();
        productBuy.Checkout();
    }
}
