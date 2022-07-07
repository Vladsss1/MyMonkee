package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

     public static final String BASE_URL = "https://my.monkkee.com/#/";
     public static final String EDIT_TAGS_URL = "https://my.monkkee.com/#/tags/226806/edit";
     public static final String BLOG_URL = "https://www.monkkee.com/en/blog/";

     WebDriver driver;
     WebDriverWait wait;

     public BasePage(WebDriver driver) {
          this.driver = driver;
          wait = new WebDriverWait(driver, 20);
     }
     public abstract boolean isPageOpen ();

     protected boolean isExist(By locator) {
          try {
               return driver.findElement(locator).isDisplayed();
          } catch (NoSuchElementException ex) {
               return false;
          }
     }

}