package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyInform extends Basepage {

    private  WebDriver driver;
    public MyInform(WebDriver driver) {
        super(driver);
    }


    private By F_name = By.xpath("//input[@id='first-name']");
    private By L_name = By.xpath("//input[@id='last-name']");
    private By Zip = By.xpath("//input[@id='postal-code']");
    private By Continu = By.xpath("//input[@id='continue']");
    private By FinishBtn = By.xpath("//button[@id='finish']");
    public By FinalContent = By.xpath("//h2[normalize-space()='Thank you for your order!']");


    public void firstName(){
        enterText(F_name, "sabbir");
    }
    public void lastName(){
       enterText(L_name, "ahamed");
    }
    public void zip(){
       enterText(Zip, "1710");
    }
    public void continuBtn(){
       click(Continu);
    } public void finishBtn(){
       click(FinishBtn);
    }
    public String textGet( ){
        return getText(FinalContent);
    }
}
