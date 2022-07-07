package tests;

import lombok.extern.log4j.Log4j2;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;
@Log4j2
public class SettingTest extends BaseTest{
    @Test
    public void SettingPageTest() throws InterruptedException {
        log.info("entering the correct data");
        boolean isLoginPageOpened = loginPage
                .open()
                .login()
                .submitFormLogin()
                .isPageOpen();
        assertTrue(isLoginPageOpened,"Страница не открыта");
        log.info("open the setting page");
        boolean isSettingPageTest = settingPage
                .clickOnButtonSetting()
                .isPageOpen();
        assertTrue(isSettingPageTest,"Страница настроек не открыта");
        log.info("Check setting visible.");
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
        log.info("entering the correct data");
        boolean isLoginPageOpened = loginPage
                .open()
                .login()
                .submitFormLogin()
                .isPageOpen();
        assertTrue(isLoginPageOpened,"Страница не открыта");
        log.info("open the setting page");
        boolean isSettingPageTest = settingPage
                .clickOnButtonSetting()
                .isPageOpen();
        assertTrue(isSettingPageTest,"Страница настроек не открыта");
        log.info("Open Inactivity timeout.");
        boolean isSettingTimeOutTest = settingTimeOutPagePage
                .settingTimeOutOpen()
                .isPageOpen();
        assertTrue(isSettingTimeOutTest,"Страница тайм-аут не открыта");
        log.info("Selecting the standby setting.");
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
