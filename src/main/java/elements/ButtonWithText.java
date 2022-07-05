package elements;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class ButtonWithText {
    WebDriver driver;
    String type;

    String buttonWithTextLocator = "//button[@type='submit']";

    public ButtonWithText(WebDriver driver, String type) {
        this.driver = driver;
        this.type = type;
    }

    public void clickButtonWithText() {
        driver.findElement(By.xpath(String.format(buttonWithTextLocator, type))).click();
    }

}