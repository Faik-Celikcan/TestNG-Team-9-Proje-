package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US18HomePage {
    public US18HomePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }


        @FindBy(xpath = "//a[@class='login inline-type']")
        public WebElement signIn;


        @FindBy(xpath = "//input[@id='username']")
        public WebElement username;

        @FindBy(xpath = "//input[@id='password']")
        public WebElement password;

        @FindBy(xpath = "//button[@name='login']")
        public WebElement submit;

        @FindBy(xpath = "//a[contains(text(),'My Account')]")
        public WebElement myAccount;
}
