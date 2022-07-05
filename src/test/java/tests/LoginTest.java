package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {
    @Test
    public void login() throws InterruptedException {
        boolean isLoginPageOpened = loginPage
                .open()
                .login()
                .submitFormLogin()
                .isPageOpen();
        assertTrue(isLoginPageOpened, "Страница не открыта");
    }


    @Test
    public void invalidLogInPassword() throws InterruptedException {
        loginPage
                .open()
                .inputInvalidPassword()
                .submitFormLogin();
        loginPage
                .errorMessage();

    }

    @Test
    public void inputInvalidlogin() throws InterruptedException {
        loginPage
                .open()
                .inputInvalidlogin()
                .submitFormLogin();
        loginPage
                .errorMessage();
    }
}
