package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.HubcomfyHomePage;
import pages.HubcomfyMyAccount;
import pages.HubcomfyStorePage;
import pages.US7HomePage;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;
public class ReusableMethods {
    static HubcomfyHomePage HubcomfyHomePage = new HubcomfyHomePage();
    static HubcomfyMyAccount HubcomfyMyAccount = new HubcomfyMyAccount();
    static HubcomfyStorePage HubcomfyStorePage = new HubcomfyStorePage();

    static US7HomePage us7HomePage=new US7HomePage();
    static Actions actions=new Actions(Driver.getDriver());
    public static void switchToWindow(String targetTitle) {
        String origin = Driver.getDriver().getWindowHandle();
        for (String handle : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(handle);
            if (Driver.getDriver().getTitle().equals(targetTitle)) {
                return;
            }
        }
        Driver.getDriver().switchTo().window(origin);
    }

    public static void waitFor(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static String getScreenshot(String testerName, String testName) {
        waitFor(1);
        // naming the screenshot with the current date to avoid duplication
        String date = new SimpleDateFormat("yyyy-MM-dd-hhmmss").format(new Date());
        // TakesScreenshot is an interface of selenium that takes the screenshot
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        // full path to the screenshot location
        String target = "src/test/java/pearlymarket/testoutputs/screenshots/" + testerName + "/" + testName + "-" + date + ".png";
        File finalDestination = new File(target);
        // save the screenshot to the path given
        try {
            FileUtils.copyFile(source, finalDestination);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return target;
    }

    public static WebElement waitForVisibility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void verifyElementDisplayed(By by) {
        try {
            assertTrue("Element not visible: " + by, Driver.getDriver().findElement(by).isDisplayed());
        } catch (NoSuchElementException e) {
            Assert.fail("Element not found: " + by);
        }
    }

    public static void verifyElementNotDisplayed(By by) {
        try {
            assertFalse("Element should not be visible: " + by, Driver.getDriver().findElement(by).isDisplayed());
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }


    public static void loginAsWendor() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        HubcomfyHomePage.signIn.click();
        waitFor(3);
        HubcomfyHomePage.username.sendKeys(ConfigReader.getProperty("vendor_email"));
        waitFor(2);
        HubcomfyHomePage.password.sendKeys(ConfigReader.getProperty("vendor_password"));
        waitFor(2);
        HubcomfyHomePage.submit.click();

    }


    public static void goToProduct() {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        waitFor(2);
        HubcomfyHomePage.myAccount.click();
        waitFor(2);
        HubcomfyMyAccount.storeManager.click();
        waitFor(2);
        HubcomfyStorePage.products.click();
        waitFor(2);
        HubcomfyStorePage.addNew.click();
        waitFor(2);

    }

    public static void clickByJS(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        js.executeScript("arguments[0].click();",element);
    }


    public static void scrollDown() {

        Actions actions = new Actions(Driver.getDriver());

        actions

                .sendKeys(Keys.PAGE_DOWN).perform();
    }
    public static void typeWithJS(WebElement element, String metin) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].setAttribute('value','" + metin + "')", element);
    }
    public static void scrollDownArrow() {

        Actions actions = new Actions(Driver.getDriver());

        actions

                .sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN).perform();
    }


    public static void us7homePg(){

        Driver.getDriver().get(ConfigReader.getProperty("url"));

        ReusableMethods.scrollDown();

        waitFor(2);

        actions.moveToElement(us7HomePage._1urun).perform();

        ReusableMethods.waitFor(2);

        us7HomePage._1urunCompareButton.click();

        us7HomePage.boslugaBasma.click();

        actions.moveToElement(us7HomePage._2urun).perform();

        ReusableMethods.waitFor(2);

        us7HomePage._2urunCompareButton.click();

        us7HomePage.boslugaBasma.click();

        actions.moveToElement(us7HomePage._3urun).perform();

        ReusableMethods.waitFor(2);

        us7HomePage._3urunCompareButton.click();

        us7HomePage.boslugaBasma.click();

        actions.moveToElement(us7HomePage._4urun).perform();

        ReusableMethods.waitFor(2);

        us7HomePage._4urunCompareButton.click();

    }


}
