package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HubcomfyProductPage;
import pages.HubcomfyStorePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class HubcomfyTest {

    HubcomfyStorePage HubcomfyStorePage = new HubcomfyStorePage();
    HubcomfyProductPage hubcomfyProductPage = new HubcomfyProductPage();

    @Test
    public void tc01() {
        ReusableMethods.loginAsWendor();
        ReusableMethods.waitFor(5);
        ReusableMethods.goToProduct();
        Select sipmleDropDown = new Select(HubcomfyStorePage.simpleProduct);
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

        Select sipmleDropDown = new Select(HubcomfyStorePage.simpleProduct);
        sipmleDropDown.selectByVisibleText("External/Affiliate Product");

        hubcomfyProductPage.productTitle.sendKeys(ConfigReader.getProperty("product_title"));

        hubcomfyProductPage.resim1.click();

        hubcomfyProductPage.resim1_2.click();

        hubcomfyProductPage.resim1_3.click();

        hubcomfyProductPage.resim1_select.click();

        hubcomfyProductPage.resim2.click();

        hubcomfyProductPage.resim2_2.click();

        hubcomfyProductPage.resim2_addToGallery.click();

        ReusableMethods.clickByJS(hubcomfyProductPage.categories);

        hubcomfyProductPage.urlText.sendKeys(ConfigReader.getProperty("url_title"));

        Assert.assertTrue(hubcomfyProductPage.urlText.isDisplayed());

        hubcomfyProductPage.buttonText.sendKeys(ConfigReader.getProperty("buttonText"), Keys.TAB,ConfigReader.getProperty("priceText"),
                Keys.TAB,ConfigReader.getProperty("salePrice"));

        Assert.assertTrue(hubcomfyProductPage.buttonText.isDisplayed());

        ReusableMethods.waitFor(3);

        ReusableMethods.clickByJS(hubcomfyProductPage.submit);

        Assert.assertEquals("Published",hubcomfyProductPage.published.getText());


    }

    @Test
    public void tc03(){

        ReusableMethods.loginAsWendor();
        ReusableMethods.waitFor(5);
        ReusableMethods.goToProduct();
        Select sipmleDropDown = new Select(HubcomfyStorePage.simpleProduct);
        sipmleDropDown.selectByVisibleText("External/Affiliate Product");

        String actualREsult = HubcomfyStorePage.simpleProduct.getText();

        Assert.assertTrue(actualREsult.contains("Simple Product"));
        Assert.assertTrue(actualREsult.contains("Variable Product"));
        Assert.assertTrue(actualREsult.contains("Grouped Product"));
        Assert.assertTrue(actualREsult.contains("External/Affiliate Product"));

        hubcomfyProductPage.productTitle.sendKeys(ConfigReader.getProperty("product_title"));

        hubcomfyProductPage.resim1.click();

        hubcomfyProductPage.resim1_2.click();

        hubcomfyProductPage.resim1_3.click();

        hubcomfyProductPage.resim1_select.click();

        hubcomfyProductPage.resim2.click();

        hubcomfyProductPage.resim2_2.click();

        hubcomfyProductPage.resim2_addToGallery.click();

        Driver.getDriver().switchTo().frame(hubcomfyProductPage.iframeShort);

        hubcomfyProductPage.shortText.sendKeys(ConfigReader.getProperty("US18shortText"));

        ReusableMethods.scrollDown();

        Driver.getDriver().switchTo().defaultContent();

        Driver.getDriver().switchTo().frame(hubcomfyProductPage.iframeLong);

        hubcomfyProductPage.description.sendKeys(ConfigReader.getProperty("US18description"));

        Driver.getDriver().switchTo().defaultContent();

       // NewReusable.typeWithJS(hubcomfyProductPage.description,ConfigReader.getProperty("US18description"));

        ReusableMethods.clickByJS(hubcomfyProductPage.categories);

        hubcomfyProductPage.tagText.sendKeys(ConfigReader.getProperty("US18tagText"));

        Select select=new Select(hubcomfyProductPage.catalogVisibility);

        select.selectByVisibleText("Hidden");

        ReusableMethods.clickByJS(hubcomfyProductPage.submit);

        Assert.assertEquals("Published",hubcomfyProductPage.published.getText());

        HubcomfyStorePage.products.click();

        Assert.assertEquals(hubcomfyProductPage.productUrun.getText(),ConfigReader.getProperty("product_title"));


    }
    @Test
    public void tc04(){
        ReusableMethods.loginAsWendor();
        ReusableMethods.waitFor(5);
        ReusableMethods.goToProduct();
        Select sipmleDropDown = new Select(HubcomfyStorePage.simpleProduct);
        sipmleDropDown.selectByVisibleText("External/Affiliate Product");
        ReusableMethods.scrollDown();
        ReusableMethods.scrollDownArrow();
        Assert.assertTrue(hubcomfyProductPage.inventory.isEnabled());// 7 taneside boylemi yazilacak
        hubcomfyProductPage.SKU.sendKeys(ConfigReader.getProperty("US18SKU"));
        Assert.assertNotNull(hubcomfyProductPage.SKU);
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(hubcomfyProductPage.Attributes);
        ReusableMethods.waitFor(5);
        ReusableMethods.clickByJS(hubcomfyProductPage.attributesColor);
        ReusableMethods.clickByJS(hubcomfyProductPage.renkSecimi);
        hubcomfyProductPage.black.click();
        Assert.assertEquals("×Black",hubcomfyProductPage.renkKutucuk.getText());
        ReusableMethods.clickByJS(hubcomfyProductPage.seo);
        hubcomfyProductPage.seoKutucuk.sendKeys(ConfigReader.getProperty("US18seoKutucuk"));
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(hubcomfyProductPage.advanced);
        Assert.assertTrue(hubcomfyProductPage.advancedKutucuk.isSelected());
    }

}
