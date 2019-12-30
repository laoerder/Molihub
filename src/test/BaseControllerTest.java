package test;

import controller.BaseController;
import dao.UserDao;
import domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.UserService;
import service.impl.UserServiceImpl;

import javax.annotation.Resource;

/**
 * @User MOTI
 * @Time 2019/8/3 23:51
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "../applicationContext.xml")
public class BaseControllerTest {

    @Autowired
    public UserService us;

    @Test
    public void test1(){
        User user = us.getUserByEmailAndPassword("6666@qq.com","983934");
        System.out.println(user);
    }
    @Test
    public void test2(){
        BaseController controller = new BaseController();
        us = controller.us;
        User user = us.getUserByEmailAndPassword("6666@qq.com","983934");
        System.out.println(user);
    }

}
