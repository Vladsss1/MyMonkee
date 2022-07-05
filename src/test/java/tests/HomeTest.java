package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class HomeTest extends BaseTest {
    @Test
    public void openHomePage() throws InterruptedException {
        loginPage
                .open()
                .login()
                .submitFormLogin();
        homePage
                .OpenHome();
        boolean isOpenHomePage = homePage
                .isPageOpen();
        assertTrue(isOpenHomePage,"Страница не открыта");
    }
}
