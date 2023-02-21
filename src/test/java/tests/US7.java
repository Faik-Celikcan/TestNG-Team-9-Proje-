package tests;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US7HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US7 {

    US7HomePage us7HomePage=new US7HomePage();

    Actions actions=new Actions(Driver.getDriver());
    @Test
    public void tc01(){ // END
        ReusableMethods.us7homePg();
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(us7HomePage.startCompare);
        Assert.assertTrue(us7HomePage._1urunCompareButton.isEnabled());
        Assert.assertTrue(us7HomePage._2urunCompareButton.isEnabled());
        Assert.assertTrue(us7HomePage._3urunCompareButton.isEnabled());
        Assert.assertTrue(us7HomePage._4urunCompareButton.isEnabled());
    }

    @Test
    public void tc02(){
        ReusableMethods.us7homePg();
        us7HomePage.boslugaBasma.click();
        actions.moveToElement(us7HomePage._5urun).perform();
        ReusableMethods.waitFor(2);
        us7HomePage._5urunCompareButton.click();
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(us7HomePage.startCompare);
        ReusableMethods.getScreenshot("US7Bug","us7bug");
    }

    @Test
    public void tc03(){
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.scrollDown();
        ReusableMethods.waitFor(2);
        actions.moveToElement(us7HomePage._1urun).perform();
        ReusableMethods.waitFor(2);
        us7HomePage._1urunCompareButton.click();
        us7HomePage.boslugaBasma.click();
        actions.moveToElement(us7HomePage._2urun).perform();
        ReusableMethods.waitFor(2);
        us7HomePage._2urunCompareButton.click();
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(us7HomePage.startCompare);
        Assert.assertTrue(us7HomePage._1urunCompareButton.isEnabled());
        Assert.assertTrue(us7HomePage._2urunCompareButton.isEnabled());
        try {
            us7HomePage._3urunCompareButton.isEnabled();
            System.out.println("3. Urun Var");
        }
        catch (NoSuchElementException e){
            e.printStackTrace();
        }
        us7HomePage._1urunCarpiButton.click();
        ReusableMethods.waitFor(3);
        us7HomePage._1urunCarpiButton.click();
        ReusableMethods.waitFor(2);
        Assert.assertEquals(us7HomePage.NoProductsAdded.getText(),"No products added to the compare");
        us7HomePage.goShop.click();
        actions.moveToElement(us7HomePage.urn1).perform();
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(us7HomePage.urn1Cmpr);
        us7HomePage.boslugaBasma.click();
        actions.moveToElement(us7HomePage.urn2).perform();
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(us7HomePage.urn2Cmpr);

    }
    @Test
    public void tc04(){
        ReusableMethods.us7homePg();
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(us7HomePage.startCompare);
        Assert.assertTrue(us7HomePage._1urunCompareButton.isEnabled());
        Assert.assertTrue(us7HomePage._2urunCompareButton.isEnabled());
        Assert.assertTrue(us7HomePage._3urunCompareButton.isEnabled());
        Assert.assertTrue(us7HomePage._4urunCompareButton.isEnabled());
    }
    @Test
    public void tc05(){
        ReusableMethods.us7homePg();
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(us7HomePage.startCompare);
        Assert.assertTrue(us7HomePage._1urunCompareButton.isEnabled());
        Assert.assertTrue(us7HomePage._2urunCompareButton.isEnabled());
        Assert.assertTrue(us7HomePage._3urunCompareButton.isEnabled());
        Assert.assertTrue(us7HomePage._4urunCompareButton.isEnabled());
        us7HomePage._1urunCarpiButton.click();
        ReusableMethods.waitFor(3);
        us7HomePage._1urunCarpiButton.click();
        ReusableMethods.waitFor(3);
        us7HomePage._1urunCarpiButton.click();
        ReusableMethods.waitFor(3);
        us7HomePage._1urunCarpiButton.click();
        ReusableMethods.waitFor(3);
        Assert.assertEquals(us7HomePage.NoProductsAdded.getText(),"No products added to the compare");
    }
}
