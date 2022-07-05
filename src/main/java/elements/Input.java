package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Input {
    WebDriver driver;
    String name;
    String inputLocator = "//input[@id = '%s']";
    String inputLocator2 = "//div[@id='editable']";

    public Input(WebDriver driver, String name) {
        this.driver = driver;
        this.name = name;
    }
    public void writeTags(String text) {
        driver.findElement(By.xpath(String.format(inputLocator, this.name))).sendKeys(text);
    }
    public void writeEntries(String text) {
        driver.findElement(By.xpath(String.format(inputLocator2, this.name))).sendKeys(text);
    }
    public void write(String text) {
        driver.findElement(By.xpath(String.format(inputLocator, this.name))).sendKeys(text);

    }
    public void clear() {
        driver.findElement(By.xpath(String.format(inputLocator, this.name))).clear();
    }
    public void click() {
        driver.findElement(By.xpath(String.format(inputLocator, this.name))).click();
    }
}

