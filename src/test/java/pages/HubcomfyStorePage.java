package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class HubcomfyStorePage {
    public HubcomfyStorePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[@href='https://hubcomfy.com/store-manager/products/']")
    public WebElement products;


    @FindBy(xpath = "//span[contains(text(),'Add New')]")
    public  WebElement addNew;

    @FindBy(xpath = "//select[@id='product_type']")
    public  WebElement  simpleProduct;


}
