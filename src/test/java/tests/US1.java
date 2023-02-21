package tests;

import org.testng.annotations.Test;
import pages.US1Login;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US1 {

    US1Login us1Login=new US1Login();

    @Test
    public void tc01(){
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        us1Login.registerButton.click();
        ReusableMethods.waitFor(2);
        us1Login.userName.sendKeys(ConfigReader.getProperty("US1userName"));

        us1Login.mail.sendKeys(ConfigReader.getProperty("US1mail"));
        us1Login.password.sendKeys(ConfigReader.getProperty("US1password"));
        us1Login.onayKutucugu.click();
        us1Login.singUp.click();
    }

    @Test
    public void tc02(){
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        us1Login.registerButton.click();
        ReusableMethods.waitFor(2);
        us1Login.mail.sendKeys(ConfigReader.getProperty("US1mail"));
        us1Login.password.sendKeys(ConfigReader.getProperty("US1password"));
        us1Login.onayKutucugu.click();
        us1Login.singUp.click();
        System.out.println(us1Login.popup.getText());
        // NewReusable.getScreenshot("US1EkranFoto","tc02");// Locaite alinmiyor
    }

    @Test
    public void tc03(){
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        us1Login.registerButton.click();
        ReusableMethods.waitFor(2);
        us1Login.userName.sendKeys(ConfigReader.getProperty("US1userName"));
        us1Login.password.sendKeys(ConfigReader.getProperty("US1password"));
        us1Login.onayKutucugu.click();
        us1Login.singUp.click();
        ReusableMethods.getScreenshot("US1EkranFoto","tc03");
    }
    @Test
    public void tc04(){
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        us1Login.registerButton.click();
        ReusableMethods.waitFor(2);
        us1Login.userName.sendKeys(ConfigReader.getProperty("US1userName"));
        us1Login.mail.sendKeys(ConfigReader.getProperty("US1mail"));
        us1Login.onayKutucugu.click();
        us1Login.singUp.click();
        ReusableMethods.getScreenshot("US1EkranFoto","tc04");
    }

    @Test
    public void tc05(){
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        us1Login.registerButton.click();
        ReusableMethods.waitFor(2);
        us1Login.userName.sendKeys(ConfigReader.getProperty("US1userName"));
        us1Login.mail.sendKeys(ConfigReader.getProperty("US1mail"));
        us1Login.password.sendKeys(ConfigReader.getProperty("US1password"));
        us1Login.singUp.click();
        ReusableMethods.getScreenshot("US1EkranFoto","tc05");
    }
    @Test
    public void tc06(){
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        us1Login.registerButton.click();
        ReusableMethods.waitFor(2);
        us1Login.userName.sendKeys(ConfigReader.getProperty("US1userName"));

        us1Login.mail.sendKeys("birmail");
        us1Login.password.sendKeys(ConfigReader.getProperty("US1password"));
        us1Login.onayKutucugu.click();
        us1Login.singUp.click();
        ReusableMethods.getScreenshot("US1EkranFoto","tc06");
    }
    @Test
    public void tc07(){
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        us1Login.registerButton.click();
        ReusableMethods.waitFor(2);
        us1Login.userName.sendKeys(ConfigReader.getProperty("US1userName"));

        us1Login.mail.sendKeys("birmail@");
        us1Login.password.sendKeys(ConfigReader.getProperty("US1password"));
        us1Login.onayKutucugu.click();
        us1Login.singUp.click();
        ReusableMethods.getScreenshot("US1EkranFoto","tc07");
    }

}
