package tests;

import org.testng.annotations.Test;
import lombok.extern.log4j.Log4j2;
import static org.testng.Assert.assertTrue;
@Log4j2
public class BlogTest extends BaseTest {
    @Test
    public void openBlog() throws InterruptedException {
        log.info("entering the correct data");
        loginPage
                .open()
                .login()
                .submitFormLogin();
        log.info("open the blog page");
        blogPage
                .openBlogPage();
        boolean isOpenBlog = blogPage
                .isPageOpen();
        assertTrue(isOpenBlog, "Страница ,блога не открыта");
    }
}
