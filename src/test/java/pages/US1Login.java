package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US1Login {
    public US1Login(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//*[@class='register inline-type']")
    public WebElement registerButton;


    @FindBy(id = "reg_username")
    public WebElement userName;

    @FindBy(xpath = "(//*[@id='reg_email'])[1]")
    public WebElement mail;

    @FindBy(xpath = "(//*[@id='reg_password'])[1]")
    public WebElement password;


    @FindBy(xpath = "(//*[@id='register-policy'])[1]")
    public WebElement onayKutucugu;

    @FindBy(xpath = "(//*[@value='Sign Up'])[1]")
    public WebElement singUp;

    @FindBy(xpath = "//*[@class='login-popup']")
    public WebElement popup;
}
