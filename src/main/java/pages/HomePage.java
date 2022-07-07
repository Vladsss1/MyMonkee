package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public static final By BUTTON_SIGNUP = By.xpath("//section[@id='buttons']//a[@href='https://my.monkkee.com/account/registration?language=en']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(BUTTON_SIGNUP);
    }
    public HomePage OpenHome() {
        driver.get("https://www.monkkee.com/en/");
        return this;
    }
}
