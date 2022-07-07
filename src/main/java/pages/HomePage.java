package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BasePage {

    public static final By MENU_HOME_LINK = By.xpath("//ul[@class='footer-menu']//a[@href='https://www.monkkee.com/en/']");
    public static final By BUTTON_SIGNUP = By.xpath("//section[@id='buttons']//a[@href='https://my.monkkee.com/account/registration?language=en']");
    public static final By TITLE_HOME_PAGE = By.xpath("//section[@id='monkkee-safest-place-thoughts']//p[.='monkkee – the safest place for your thoughts']");

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
