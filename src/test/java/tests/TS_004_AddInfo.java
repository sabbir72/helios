//
//package tests;
//
//import com.aventstack.extentreports.ExtentTest;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//import pages.MyInform;
//import pages.Product_buy;
//
//import static org.testng.Assert.assertEquals;
//
//public class TS_004_AddInfo extends BaseTest {
//    private ExtentTest test;
//    private MyInform myInform;
//    private Product_buy productBuy;
//    @Test(priority = 4)
//    public void TS_004_AddInfo()  {
////  add card
//         productBuy = new Product_buy(driver);
//        productBuy.clickProductName();
//        productBuy.Add_Card();
//        productBuy.cardBox();
//        productBuy.Checkout();
//
////       user  information
//        myInform = new MyInform(driver);
//        myInform.firstName();
//        myInform.lastName();
//        myInform.zip();
//        myInform.continuBtn();
//        myInform.finishBtn();
//
//
//        String text01 = myInform.textGet();
//        assertEquals(text01, "Thank you for your order!", "Order confirmation message mismatch!");
//    }
//
//    @BeforeMethod
//    public void setUpTest() {
//        test = ExtentReportManager.createTest("TS_004_AddInfo");
//    }
//
//    @Test
//    public void loginTest() {
//        try {
//            // টেস্ট লজিক এখানে লিখুন
//            test.pass("লগইন টেস্ট সফল হয়েছে।");
//        } catch (Exception e) {
//            test.fail("লগইন টেস্ট ব্যর্থ হয়েছে: " + e.getMessage());
//        }
//    }
//
//    @AfterMethod
//    public void tearDownTest() {
//        ExtentReportManager.flushReports();
//    }
//}
package tests;

import com.aventstack.extentreports.ExtentTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.MyInform;
import pages.Product_buy;

import static org.testng.Assert.assertEquals;

public class TS_004_AddInfo extends BaseTest {
    private ExtentTest test; // ExtentTest object
    private MyInform myInform;
    private Product_buy productBuy;

    @BeforeMethod
    public void setUpTest() {
        // Create a new ExtentTest instance before each test
        test = ExtentReportManager.createTest("TS_004_AddInfo");
    }

    @Test(priority = 4)
    public void TS_004_AddInfo() {
        try {
            // Add to Cart
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

            // User Information
            test.info("Started adding user information.");
            myInform = new MyInform(driver);
            myInform.firstName();
            test.pass("First Name added.");
            myInform.lastName();
            test.pass("Last Name added.");
            myInform.zip();
            test.pass("ZIP Code added.");
            myInform.continuBtn();
            test.pass("Continue button clicked.");
            myInform.finishBtn();
            test.pass("Finish button clicked.");

            // Validation
            String text01 = myInform.textGet();
            assertEquals(text01, "Thank you for your order!", "Order confirmation message mismatch!");
            test.pass("Order confirmed and message validated.");
        } catch (Exception e) {
            test.fail("Test failed: " + e.getMessage());
            throw e; // Stop the test if it fails
        }
    }

    @AfterMethod
    public void tearDownTest() {
        // Flush the reports after the test
        ExtentReportManager.flushReports();
    }
}
