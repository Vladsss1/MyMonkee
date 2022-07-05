package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import pages.*;
import utils.TestListener;

import java.util.concurrent.TimeUnit;


@Listeners(TestListener.class)
public abstract class BaseTest {

    protected WebDriver driver;
    protected LoginPage loginPage;
    protected HomePage homePage;
    protected EntriesPage entriesPage;
    protected TagsPage tagsPage;
    protected EditTags editTags;
    protected BlogPage blogPage;
    protected SettingPage settingPage;
    protected SettingTimeOutPage settingTimeOutPagePage;


    @BeforeMethod
    public void setup(ITestContext context) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        context.setAttribute("driver", driver);
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        entriesPage = new EntriesPage(driver);
        tagsPage = new TagsPage(driver);
        editTags = new EditTags(driver);
        blogPage = new BlogPage(driver);
        settingPage = new SettingPage(driver);
        settingTimeOutPagePage = new SettingTimeOutPage(driver);

    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }
}