package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.MyInform;

import static org.testng.Assert.assertEquals;

public class testAddInfo {

    private WebDriver driver;
    private MyInform myInform;

    public testAddInfo(WebDriver driver) {
        this.driver = driver;
        this.myInform = new MyInform(driver);
    }

    @Test(priority = 4)
    public void addInfo() throws InterruptedException {
        myInform.firstName();
        myInform.lastName();
        myInform.zip();
        myInform.continuBtn();
        myInform.finishBtn();
        String Text01 = myInform.textGet();
        assertEquals(Text01, "Thank you for your order!", "Order confirmation message mismatch!");
    }
}
