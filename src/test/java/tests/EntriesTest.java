package tests;

import lombok.extern.log4j.Log4j2;
import models.Entries;
import models.EntriesFactory;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;
@Log4j2
public class EntriesTest extends BaseTest {
    @Test
    public void EntriesPageTest() throws InterruptedException {
        log.info("entering the correct data");
        loginPage
                .open()
                .login()
                .submitFormLogin();
        log.info("open the entries page");
        boolean isEntriesPageOpened = entriesPage
                .isPageOpen();
        assertTrue(isEntriesPageOpened, "Страница  не открыта");
        log.info("Check visibility tags, calendar and search.");
        entriesPage
                .checkTitleTags()
                .checkTitleCalendar();
    }
    @Test
    public void EntriesNewData() throws InterruptedException {
        log.info("entering the correct data");
        loginPage
                .open()
                .login()
                .submitFormLogin();
        log.info("open the entries page");
        boolean isEntriesPageOpened = entriesPage
                .isPageOpen();
        assertTrue(isEntriesPageOpened, "Страница  не открыта");
        log.info("click entries button");
        entriesPage
                .entriesButton();
        Entries entries = EntriesFactory.get();
        log.info("create new entries");
        entriesPage
                .createNewEntries(entries)
                .BackToOverview();

    }
}