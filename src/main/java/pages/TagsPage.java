package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TagsPage extends BasePage {

    public static final By BUTTON_MANAGER_TAGS = By.xpath("//section[@id='tags']//a[text()='Manage tags']");
    public static final By TITLE_MANAGER_TAGS = By.xpath("//h1[.='Manage Tags']");
        public static final By EDIT_TAGS = By.xpath("//div[@id='main']//a[@href='#/tags/226806/edit']");

       public TagsPage (WebDriver driver){
           super(driver);
    }



@Override
public boolean isPageOpen() {
    return isExist(TITLE_MANAGER_TAGS);
}
    public TagsPage clickOnButtonManagerTags(){
            driver.findElement(BUTTON_MANAGER_TAGS).click();
            return this;
    }
    public TagsPage clickOnEditTags() {
        driver.findElement(EDIT_TAGS).click();
        return this;
    }
    }