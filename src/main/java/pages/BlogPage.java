package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BlogPage extends BasePage {


        public static final By TITLE_BLOG = By.xpath("//div[@class='inner']/h1[text()='Blog']");
        public static final By DOG_FOOD_LINK = By.xpath("//div[@class='post-body']//a");
        public static final By DOG_FOOD_TITLE = By.xpath("//section[@class='blog']//h1[text()='Eating your own dog food']");
        public static final By DOG_FOOD_LINK_WIKI = By.xpath("//div[@class='post-body']//a");
        public static final By WIKI_TITLE = By.xpath("//h1[@id='firstHeading']");
        public static final By FORGET_TITLE = By.xpath("//div[@class='post post-single']//a[text()='Why you must never forget your monkkee password!!']");
        public static final By IMG_PASSWORD_POLICY = By.xpath("//div[@class='row']//div[@class='post-body']/p[4]/img");
        public static final By LINK_PASSWORD_REMINDER = By.xpath("//div[@class='post-body']//a[text()='Send password reminder']");
        public static final By TITLE_PASSWORD_REMINDER = By.xpath("//div[@class='content-container']/h1");
        public static final By INPUT_EMAIL = By.xpath("//input[@id='email']");
        public static final By AFTER_INPUT_EMAIL_MESSAGE = By.xpath("//div[@id='main']//p");
        public static final By ERROR_MESSAGE = By.xpath("//div[@class='help-block']");

    public BlogPage (WebDriver driver) {
        super(driver);
    }

        @Override
        public boolean isPageOpen() {
            return isExist(TITLE_BLOG);
        }



    public BlogPage openBlogPage() {
        driver.get(BLOG_URL);
        return this;
    }
}
