package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US7HomePage {

    public US7HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//*[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail'])[1]")
    public WebElement _1urun ;

    @FindBy(xpath = "(//*[@data-product_id='13182'])[2]")
    public WebElement _1urunCompareButton;

    @FindBy(xpath = "//*[@class='compare-popup-overlay']")
    public WebElement boslugaBasma;

    @FindBy(xpath = "(//*[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail'])[3]")
    public WebElement _2urun ;

    @FindBy(xpath = "(//*[@data-product_id='13194'])[2]")
    public WebElement _2urunCompareButton;

    @FindBy(xpath = "(//*[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail'])[5]")
    public WebElement _3urun ;

    @FindBy(xpath = "(//*[@data-product_id='13170'])[2]")
    public WebElement _3urunCompareButton;

    @FindBy(xpath = "(//*[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail'])[7]")
    public WebElement _4urun ;

    @FindBy(xpath = "(//*[@data-product_id='13230'])[2]")
    public WebElement _4urunCompareButton;

    @FindBy(xpath = "(//*[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail'])[9]")
    public WebElement _5urun ;

    @FindBy(xpath = "(//*[@data-product_id='13215'])[2]")
    public WebElement _5urunCompareButton;
    @FindBy(xpath = "//*[@class='btn btn-dark btn-rounded']")
    public WebElement startCompare;

    @FindBy(xpath = "(//*[@class='w-icon-times-solid'])[1]")
    public WebElement _1urunCarpiButton;
    @FindBy(xpath = "(//*[@class='w-icon-times-solid'])[2]")
    public WebElement _2urunCarpiButton;
    @FindBy(xpath = "(//*[@class='w-icon-times-solid'])[3]")
    public WebElement _3urunCarpiButton;
    @FindBy(xpath = "(//*[@class='w-icon-times-solid'])[4]")
    public WebElement _4urunCarpiButton;

    @FindBy(xpath = "(//h2)[2]")
    public WebElement NoProductsAdded;
    @FindBy(xpath = "//*[@class='woocommerce-Button button']")
    public WebElement goShop;

    @FindBy(xpath = "(//*[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail'])[1]")
    public WebElement urn1;
    @FindBy(xpath = "(//*[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail'])[5]")
    public WebElement urn2;
    @FindBy(xpath = "(//*[@data-product_id='18831'])[2]")
    public WebElement urn1Cmpr;

    @FindBy(xpath = "(//*[@data-product_id='18139'])[2]")
    public WebElement urn2Cmpr;
}
