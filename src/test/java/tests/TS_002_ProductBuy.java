package tests;

import com.aventstack.extentreports.ExtentTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Product_buy;

public class TS_002_ProductBuy extends BaseTest {
     private ExtentTest test;
    private Product_buy productBuy;


    @BeforeMethod
    public void setUpTest() {
        test = ExtentReportManager.createTest("TS_002_ProductBuy");
    }

    @Test(priority = 2)
    public void TS_002_ProductBuy() {
        try {

            test.info("Started adding product to the cart.");
        productBuy = new Product_buy(driver);
        productBuy.clickProductName();
        test.pass("Product selected.");
        productBuy.Add_Card();
        test.pass("Product added to the cart.");
        productBuy.cardBox();
        test.pass("Entered the cart box.");
        productBuy.Checkout();
        test.pass("Checkout completed.");

        } catch (Exception e) {
            test.fail("Test failed: " + e.getMessage());
        }
    }


    @AfterMethod
    public void tearDownTest() {
        ExtentReportManager.flushReports();
    }
}
