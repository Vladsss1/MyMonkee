package tests;

import lombok.extern.log4j.Log4j2;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;
@Log4j2
public class HomeTest extends BaseTest {
    @Test
    public void openHomePage() throws InterruptedException {
        log.info("entering the correct data");
        loginPage
                .open()
                .login()
                .submitFormLogin();
        log.info("open the home page");
        homePage
                .OpenHome();
        boolean isOpenHomePage = homePage
                .isPageOpen();
        assertTrue(isOpenHomePage,"Страница не открыта");
    }
}
