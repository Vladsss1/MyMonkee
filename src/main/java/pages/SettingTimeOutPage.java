package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SettingTimeOutPage extends BasePage {


    public static final By TIMEOUT = By.xpath("//div[@id='settings-menu']//a[@href='#/settings/logout']");
    public static final By INACTIVITY_TIMEOUT = By.xpath("//div[@class='container-fluid']//h1");
    public static final By WAIT_SETTING = By.xpath("//div[@id='settings-content']//select[@name='autoLogout']");
    public static final By SUBMIT_SETTING = By.xpath("/html//div[@id='settings-content']//div[@class='btn-text-content']");


    public SettingTimeOutPage(WebDriver driver) {
        super(driver);
    }
    @Override

    public boolean isPageOpen() {
        return isExist(INACTIVITY_TIMEOUT);
    }

    public SettingTimeOutPage settingTimeOutOpen() {
        driver.findElement(TIMEOUT).click();
        return this;
    }
    public SettingTimeOutPage settingWaitOpen() {
        driver.findElement(WAIT_SETTING).click();
        return this;
    }
    public SettingTimeOutPage  settingWaitDeactivaited() {
        driver.findElement(WAIT_SETTING).sendKeys("Deactivaited");
        return this;
    }
    public SettingTimeOutPage  settingWaitFiveMinutes() {
        driver.findElement(WAIT_SETTING).sendKeys("5 minutes");
        return this;
    }
        public SettingTimeOutPage  settingWaitTenMinutes() {
        driver.findElement(WAIT_SETTING).sendKeys("10 minutes");
        return this;
    }
    public SettingTimeOutPage  settingWaitTwentyMinutes() {
        driver.findElement(WAIT_SETTING).sendKeys("20 minutes");
        return this;
    }
    public SettingTimeOutPage  settingWaitThirtyMinutes() {
        driver.findElement(WAIT_SETTING).sendKeys("30 minutes");
        return this;
    }
    public SettingTimeOutPage settingSubmit() {
        driver.findElement(SUBMIT_SETTING).click();
        return this;
    }
}
