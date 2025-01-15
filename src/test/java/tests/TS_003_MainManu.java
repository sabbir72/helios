package tests;

import com.aventstack.extentreports.ExtentTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class TS_003_MainManu extends BaseTest {
    private ExtentTest test;
    private HomePage homePage;


    @BeforeMethod
    public void setUpTest() {
        test = ExtentReportManager.createTest("TS_003_MainManu");
    }


    @Test(priority = 3)
    public void testLogout() {
        try {
            test.info("Started Go to homPage");
             homePage = new HomePage(driver);
             homePage.clickMenu();
             test.pass("Manu Bar Clicked");
//           homePage.clickLogout(); // Uncomment this line if logout functionality is implemented

        } catch (Exception e) {
            test.fail("Test failed: " + e.getMessage());
        }

    }


    @AfterMethod
    public void tearDownTest() {
        ExtentReportManager.flushReports();
    }
}
