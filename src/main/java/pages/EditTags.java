package pages;
import elements.Input;
import models.Tags;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditTags extends BasePage {

    public static final By TITLE_EDIT_TAGS = By.xpath("//h1[.='Edit Tag']");
    public static final By INPUT_TAG_NAME = By.xpath("//input[@id='tag']");
    public static final By BUTTON_SUBMIT = By.xpath("//button[@class='btn btn-primary']");



    public EditTags (WebDriver driver) {
        super(driver);
    }

        @Override
        public boolean isPageOpen () {
            return isExist(TITLE_EDIT_TAGS);

        }
        public EditTags clearTagName () {
            driver.findElement(INPUT_TAG_NAME).clear();
            return this;

        }
        public EditTags clickOnButtonSubmit () {
            driver.findElement(BUTTON_SUBMIT).click();
            return this;
        }
    public EditTags createNewNameTags(Tags tags) {
        new Input(driver, "tag").writeTags(tags.getTags());
        return this;
    }

}
