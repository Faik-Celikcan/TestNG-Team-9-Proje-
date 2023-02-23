package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US18ProductPage;
import pages.US18StorePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US18 {

    US18StorePage US18StorePage = new US18StorePage();
    US18ProductPage US18ProductPage = new US18ProductPage();

    @Test
    public void tc01() {
        ReusableMethods.loginAsWendor();
        ReusableMethods.waitFor(5);
        ReusableMethods.goToProduct();
        Select sipmleDropDown = new Select(US18StorePage.simpleProduct);
        sipmleDropDown.selectByVisibleText("External/Affiliate Product");

        String actualREsult = sipmleDropDown.getFirstSelectedOption().getText();
        String expectedREsult = "External/Affiliate Product";
        Assert.assertEquals(actualREsult, expectedREsult);

    }

    @Test
    public void tc02() throws InterruptedException {

        ReusableMethods.loginAsWendor();
        ReusableMethods.waitFor(5);
        ReusableMethods.goToProduct();

        Select sipmleDropDown = new Select(US18StorePage.simpleProduct);
        sipmleDropDown.selectByVisibleText("External/Affiliate Product");

        US18ProductPage.productTitle.sendKeys(ConfigReader.getProperty("product_title"));

        US18ProductPage.resim1.click();

        US18ProductPage.resim1_2.click();

        US18ProductPage.resim1_3.click();

        US18ProductPage.resim1_select.click();

        US18ProductPage.resim2.click();

        US18ProductPage.resim2_2.click();

        US18ProductPage.resim2_addToGallery.click();

        ReusableMethods.clickByJS(US18ProductPage.categories);

        US18ProductPage.urlText.sendKeys(ConfigReader.getProperty("url_title"));

        Assert.assertTrue(US18ProductPage.urlText.isDisplayed());

        US18ProductPage.buttonText.sendKeys(ConfigReader.getProperty("buttonText"), Keys.TAB,ConfigReader.getProperty("priceText"),
                Keys.TAB,ConfigReader.getProperty("salePrice"));

        Assert.assertTrue(US18ProductPage.buttonText.isDisplayed());

        ReusableMethods.waitFor(3);

        ReusableMethods.clickByJS(US18ProductPage.submit);

        Assert.assertEquals("Published", US18ProductPage.published.getText());


    }

    @Test
    public void tc03(){

        ReusableMethods.loginAsWendor();
        ReusableMethods.waitFor(5);
        ReusableMethods.goToProduct();
        Select sipmleDropDown = new Select(US18StorePage.simpleProduct);
        sipmleDropDown.selectByVisibleText("External/Affiliate Product");

        String actualREsult = US18StorePage.simpleProduct.getText();

        Assert.assertTrue(actualREsult.contains("Simple Product"));
        Assert.assertTrue(actualREsult.contains("Variable Product"));
        Assert.assertTrue(actualREsult.contains("Grouped Product"));
        Assert.assertTrue(actualREsult.contains("External/Affiliate Product"));

        US18ProductPage.productTitle.sendKeys(ConfigReader.getProperty("product_title"));

        US18ProductPage.resim1.click();

        US18ProductPage.resim1_2.click();

        US18ProductPage.resim1_3.click();

        US18ProductPage.resim1_select.click();

        US18ProductPage.resim2.click();

        US18ProductPage.resim2_2.click();

        US18ProductPage.resim2_addToGallery.click();

        Driver.getDriver().switchTo().frame(US18ProductPage.iframeShort);

        US18ProductPage.shortText.sendKeys(ConfigReader.getProperty("US18shortText"));

        ReusableMethods.scrollDown();

        Driver.getDriver().switchTo().defaultContent();

        Driver.getDriver().switchTo().frame(US18ProductPage.iframeLong);

        US18ProductPage.description.sendKeys(ConfigReader.getProperty("US18description"));

        Driver.getDriver().switchTo().defaultContent();

       // NewReusable.typeWithJS(hubcomfyProductPage.description,ConfigReader.getProperty("US18description"));

        ReusableMethods.clickByJS(US18ProductPage.categories);

        US18ProductPage.tagText.sendKeys(ConfigReader.getProperty("US18tagText"));

        Select select=new Select(US18ProductPage.catalogVisibility);

        select.selectByVisibleText("Hidden");

        ReusableMethods.clickByJS(US18ProductPage.submit);

        Assert.assertEquals("Published", US18ProductPage.published.getText());

        US18StorePage.products.click();

        Assert.assertEquals(US18ProductPage.productUrun.getText(),ConfigReader.getProperty("product_title"));


    }
    @Test
    public void tc04(){
        ReusableMethods.loginAsWendor();
        ReusableMethods.waitFor(5);
        ReusableMethods.goToProduct();
        Select sipmleDropDown = new Select(US18StorePage.simpleProduct);
        sipmleDropDown.selectByVisibleText("External/Affiliate Product");
        ReusableMethods.scrollDown();
        ReusableMethods.scrollDownArrow();
        Assert.assertTrue(US18ProductPage.inventory.isEnabled());// 7 taneside boylemi yazilacak
        US18ProductPage.SKU.sendKeys(ConfigReader.getProperty("US18SKU"));
        Assert.assertNotNull(US18ProductPage.SKU);
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(US18ProductPage.Attributes);
        ReusableMethods.waitFor(5);
        ReusableMethods.clickByJS(US18ProductPage.attributesColor);
        ReusableMethods.clickByJS(US18ProductPage.renkSecimi);
        US18ProductPage.black.click();
        Assert.assertEquals("×Black", US18ProductPage.renkKutucuk.getText());
        ReusableMethods.clickByJS(US18ProductPage.seo);
        US18ProductPage.seoKutucuk.sendKeys(ConfigReader.getProperty("US18seoKutucuk"));
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(US18ProductPage.advanced);
        Assert.assertTrue(US18ProductPage.advancedKutucuk.isSelected());
    }

}
