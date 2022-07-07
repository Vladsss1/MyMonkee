package tests;

import lombok.extern.log4j.Log4j2;
import models.Tags;
import models.TagsFactory;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;
@Log4j2
public class TagsTest extends BaseTest {
    @Test
    public void openTagsPage() throws InterruptedException {
        log.info("entering the correct data");
        loginPage
                .open()
                .login()
                .submitFormLogin();
        log.info("open the tags page");
        tagsPage
                .clickOnButtonManagerTags();
        boolean isOpenTagsPage = tagsPage
                .isPageOpen();
        assertTrue(isOpenTagsPage, "страница управления тегами не открыта");
        log.info("open the edit tags");
        tagsPage
                .clickOnEditTags();
        boolean isOpenEditTags = editTags
                .isPageOpen();
        assertTrue(isOpenEditTags, "страница редактирования тегов не открыта");
        log.info("clear tag name");
        editTags
                .clearTagName();
        Tags tags = TagsFactory.get();
        log.info("create new tag");
        editTags
                .createNewNameTags(tags)
                .clickOnButtonSubmit();
    }
}