package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US18ProductPage {

    public US18ProductPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "pro_title")
    public WebElement productTitle;

    @FindBy(id = "featured_img_display")
    public WebElement resim1;

    @FindBy(id = "menu-item-browse")
    public WebElement resim1_2;

    @FindBy(xpath = "(//*[@class='attachment-preview js--select-attachment type-image subtype-jpeg landscape'])[1]")
    public WebElement resim1_3;

    @FindBy(xpath = "//*[@class='button media-button button-primary button-large media-button-select']")
    public WebElement resim1_select;

    @FindBy(id = "gallery_img_gimage_0_display")
    public WebElement resim2;

    @FindBy(xpath = "(//*[@class='attachment-preview js--select-attachment type-image subtype-webp portrait'])[5]")
    public WebElement resim2_2;

    @FindBy(xpath = "(//*[@class='button media-button button-primary button-large media-button-select'])[2]")
    public WebElement resim2_addToGallery;

    @FindBy(xpath = "//*[@data-super_parent='510']")
    public WebElement categories;

    @FindBy(id = "product_url")
    public WebElement urlText;

    @FindBy(id = "button_text")
    public WebElement buttonText;

    @FindBy(id = "wcfm_products_simple_submit_button")
    public WebElement submit;

    @FindBy(xpath = "//*[@class='product-status product-status-publish']")
    public WebElement published;

    @FindBy(id = "excerpt_ifr")
    public WebElement iframeShort;

    @FindBy(xpath = "(//*[@id='tinymce'])[1]")
    public WebElement shortText;

    @FindBy(xpath = "//*[@data-id='description']")
    public WebElement description;

    @FindBy(id = "product_tags")
    public WebElement tagText;

    @FindBy(id = "catalog_visibility")
    public WebElement catalogVisibility;

    @FindBy(xpath = "//*[@class='product_tags wcfm_title wcfm_full_ele product_tags_ele']")
    public WebElement tagLogo;

    @FindBy(id = "description_ifr")
    public WebElement iframeLong;

    @FindBy(xpath = "//*[text()='Inventory']")
    public WebElement inventory;

    @FindBy(id = "sku")
    public WebElement SKU;

    @FindBy (xpath = "(//*[@class='page_collapsible_content_holder'])[5]")
    public WebElement Attributes;

    @FindBy(xpath = "(//*[@class='select2-selection select2-selection--multiple'])[2]")
    public WebElement renkSecimi;

    @FindBy (id = "attributes_is_active_1")
    public WebElement attributesColor;

    @FindBy(id = "attributes_is_active_1")
    public WebElement attributeClick2;

    @FindBy(xpath = "(//*[@class='page_collapsible_content_holder'])[8]")
    public WebElement seo;

    @FindBy(xpath = "(//*[text()='Black'])[2]")
    public WebElement black;

    @FindBy(xpath = "(//*[@class='select2-selection__rendered'])[2]")
    public WebElement renkKutucuk;

    @FindBy(id = "yoast_wpseo_focuskw_text_input")
    public WebElement seoKutucuk;

    @FindBy(xpath = "(//*[@class='page_collapsible_content_holder'])[10]")
    public WebElement advanced;

    @FindBy(xpath = "//*[@id='enable_reviews']")
    public WebElement advancedKutucuk;

    @FindBy(xpath = "(//*[@class='wcfm_product_title'])[1]")
    public WebElement productUrun;
}
