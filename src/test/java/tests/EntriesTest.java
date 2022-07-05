package tests;

import models.Entries;
import models.EntriesFactory;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class EntriesTest extends BaseTest {
    @Test
    public void EntriesPageTest() throws InterruptedException {
        loginPage
                .open()
                .login()
                .submitFormLogin();
        boolean isEntriesPageOpened = entriesPage
                .isPageOpen();
        assertTrue(isEntriesPageOpened, "Страница  не открыта");
        entriesPage
                .checkTitleTags()
                .checkTitleCalendar();
    }


    @Test
    public void EntriesNewData() throws InterruptedException {
        loginPage
                .open()
                .login()
                .submitFormLogin();
        boolean isEntriesPageOpened = entriesPage
                .isPageOpen();
        assertTrue(isEntriesPageOpened, "Страница  не открыта");
        entriesPage
                .entriesButton();
        Entries entries = EntriesFactory.get();
        entriesPage
                .createNewEntries(entries)
                .BackToOverview();

    }
}