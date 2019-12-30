package test;

import org.junit.Test;
import service.AdminService;
import service.impl.AdminServiceImpl;

/**
 * @User MOTI
 * @Time 2019/8/22 16:59
 */
public class AdminTest {
    AdminService adminService;
    @Test
    public void countTest(){
        adminService = new AdminServiceImpl();
        int userC = adminService.getUserCount();
        int ArticleC = adminService.getArticleCount();
        System.out.println(userC);
        System.out.println(ArticleC);
    }
}
