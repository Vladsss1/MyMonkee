package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SettingPage extends BasePage {


    public static final By SETTING_BUTTON = By.xpath("//div[@class='ng-scope']/a[@class='user-menu-btn']");
    public static final By SETTING_TITLE = By.xpath("//div[@class='container-fluid']/h1[text()='Language selection']");
    public static final By EMAIL = By.xpath("//div[@id='settings-menu']//a[@href='#/settings/email']");
    public static final By PASSWORD = By.xpath("//div[@id='settings-menu']//a[@href='#/settings/password']");
    public static final By LOGIN_ALIAS = By.xpath("//div[@id='settings-menu']//a[@href='#/settings/login']");
    public static final By TIMEOUT = By.xpath("//div[@id='settings-menu']//a[@href='#/settings/logout']");
    public static final By EDITOR = By.xpath("//div[@id='settings-menu']//a[@href='#/settings/editor']");
    public static final By DONATIONS = By.xpath("//div[@id='settings-menu']//a[@href='#/settings/donation_payment']");
    public static final By DELETE_ACCOUNT = By.xpath("//div[@id='settings-menu']//a[@href='#/settings/delete_account']");
    public static final By EXPORT = By.xpath("//div[@id='settings-menu']//a[@href='#/settings/export']");
    public static final By ALERT_MESSAGE = By.xpath("//div[@id='settings-content']//div[@class='alert alert-success']");
    public static final By POP_UP_CANCEL = By.xpath("/html/body/div[7]//button[@class='btn btn-primary']");
    public static final By POP_UP_HEADER = By.xpath("//div[@class='modal-header']");


    public SettingPage(WebDriver driver) {
        super(driver);
    }

    @Override


    public boolean isPageOpen() {
        return isExist(SETTING_TITLE);
    }

    public SettingPage clickOnButtonSetting() {
        driver.findElement(SETTING_BUTTON).click();
        return this;
    }

    public SettingPage settingEmailVisible() {
         driver.findElement(EMAIL).isDisplayed();
         return this;
    }

    public SettingPage settingPasswordVisible() {
        driver.findElement(PASSWORD).isDisplayed();
        return this;
    }

    public SettingPage settingLoginAliasVisible() {
         driver.findElement(LOGIN_ALIAS).isDisplayed();
        return this;
    }

    public SettingPage settingTimeOutVisible() {
         driver.findElement(TIMEOUT).isDisplayed();
        return this;
    }

    public SettingPage settingEditorVisible() {
         driver.findElement(EDITOR).isDisplayed();
        return this;
    }

    public SettingPage settingDonationsVisible() {
         driver.findElement(DONATIONS).isDisplayed();
        return this;
    }
}

