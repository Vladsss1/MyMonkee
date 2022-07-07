package tests;

import lombok.extern.log4j.Log4j2;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

@Log4j2
public class LoginTest extends BaseTest {
    @Test
    public void login() throws InterruptedException {
        log.info("entering the correct data");
        boolean isLoginPageOpened = loginPage
                .open()
                .login()
                .submitFormLogin()
                .isPageOpen();
        assertTrue(isLoginPageOpened, "Страница не открыта");

    }
    @Test
    public void invalidLogInPassword() throws InterruptedException {
        log.info("entering the incorrect password");
        loginPage
                .open()
                .inputInvalidPassword()
                .submitFormLogin();
        loginPage
                .errorMessage();
    }
    @Test
    public void inputInvalidlogin() throws InterruptedException {
        log.info("entering the incorrect email");
        loginPage
                .open()
                .inputInvalidlogin()
                .submitFormLogin();
        loginPage
                .errorMessage();
    }
}
