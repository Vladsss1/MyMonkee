package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class BlogTest extends BaseTest {

    @Test
    public void openBlog() throws InterruptedException {
        loginPage
                .open()
                .login()
                .submitFormLogin();
        blogPage
                .openBlogPage();
        boolean isOpenBlog = blogPage
                .isPageOpen();
        assertTrue(isOpenBlog, "Страница ,блога не открыта");
    }
}
