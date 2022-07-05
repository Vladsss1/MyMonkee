package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SettingTest extends BaseTest{

    @Test
    public void SettingPageTest() throws InterruptedException {
        boolean isLoginPageOpened = loginPage
                .open()
                .login()
                .submitFormLogin()
                .isPageOpen();
        assertTrue(isLoginPageOpened,"Страница не открыта");
        boolean isSettingPageTest = settingPage
                .clickOnButtonSetting()
                .isPageOpen();
        assertTrue(isSettingPageTest,"Страница настроек не открыта");
        settingPage
                .settingEmailVisible()
                .settingPasswordVisible()
                .settingLoginAliasVisible()
                .settingTimeOutVisible()
                .settingEditorVisible()
                .settingDonationsVisible();
    }
    @Test
    public void SettingTimeOutTest() throws InterruptedException {
        boolean isLoginPageOpened = loginPage
                .open()
                .login()
                .submitFormLogin()
                .isPageOpen();
        assertTrue(isLoginPageOpened,"Страница не открыта");
        boolean isSettingPageTest = settingPage
                .clickOnButtonSetting()
                .isPageOpen();
        assertTrue(isSettingPageTest,"Страница настроек не открыта");
        boolean isSettingTimeOutTest = settingTimeOutPagePage
                .settingTimeOutOpen()
                .isPageOpen();
        assertTrue(isSettingTimeOutTest,"Страница тайм-аут не открыта");
        settingTimeOutPagePage
                .settingWaitOpen()
                .settingWaitDeactivaited()
                .settingWaitOpen()
                .settingWaitFiveMinutes()
                .settingWaitOpen()
                .settingWaitTenMinutes()
                .settingWaitOpen()
                .settingWaitTwentyMinutes()
                .settingWaitOpen()
                .settingWaitThirtyMinutes()
                .settingSubmit();
    }
}
