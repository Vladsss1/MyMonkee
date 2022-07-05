package pages;

import elements.ButtonWithText;
import elements.Input;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.PropertyReader;

public class LoginPage extends BasePage {

    public String email = System.getenv().getOrDefault("MONKEE_EMAIL", PropertyReader.getProperty("monkee.email"));
    public String password = System.getenv().getOrDefault("MONKEE_PASSWORD", PropertyReader.getProperty("monkee.password"));
    public static final By LOGIN_BUTTON = By.xpath("//div[@class='btn-text-content']");
    public static final By LOGIN = By.xpath("//input[@id='login']");
    public static final By PASSWORD = By.xpath("//input[@id='password']");
    public static final By SUBMIT_FORM_LOGIN = By.xpath("//h1[.='Feed the monkkee']");
    public static final By ERROR_MESSAGE = By.xpath("//div[@id='main']//div[@class='login-wrapper']//div[@class='alert alert-danger']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(LOGIN_BUTTON);
    }

    public LoginPage open() {
        driver.get(BASE_URL);
        return this;
    }

    public LoginPage login() {
        new Input(driver, "login").write(email);
        new Input(driver, "password").write(password);
        new ButtonWithText(driver, "submit").clickButtonWithText();

        return new LoginPage(driver);
    }

    public EntriesPage submitFormLogin() throws InterruptedException {
        if (isExist(SUBMIT_FORM_LOGIN)) {
            Thread.sleep(3000);
            driver.findElement(By.xpath("//div[@class='donation-notice-buttons']/button/div[@class='btn-text-content']")).click();
        } else if (driver.findElement(By.xpath("//a[@href='#/settings/locale']")).isDisplayed()) {
            return new EntriesPage(driver);
        }
        return new EntriesPage(driver);
    }

    public LoginPage inputInvalidPassword() {
        new Input(driver, "login").write(email);
        driver.findElement(PASSWORD).sendKeys("213214");
        new ButtonWithText(driver, "submit").clickButtonWithText();
        return new LoginPage(driver);
    }
    public LoginPage inputInvalidlogin() {
        driver.findElement(LOGIN).sendKeys("wqeqwe@mail.ru");
        new Input(driver, "password").write(password);
        new ButtonWithText(driver, "submit").clickButtonWithText();
        return new LoginPage(driver);
    }
    public LoginPage errorMessage() {
        driver.findElement(ERROR_MESSAGE).isDisplayed();
        return new LoginPage(driver);
    }
}
