package test;

import domain.User;
import domain.other.Sex;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

import java.util.Set;

/**
 * 用户测试类
 * @User MOTI
 * @Time 2019/8/3 18:14
 */
public class UserTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService us = (UserService) context.getBean("userServiceImpl");
//        TestAddUser(us);
//        TestGetUserById(us);
//        TestGetUserByUserName(us);
//        TestGetUserByUserNameAndPassword(us);
//        TestGetUserByEmailAndPassword(us);
//        TestGetUserByPhoneAndPassword(us);
//        TestUpdateUser(us);
    }

    /**
     * 添加用户测试
     */
    @Test
    public  void TestAddUser(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService us = (UserService) context.getBean("userServiceImpl");

        TestgetAllCommentUsersId(us);
//        User user = new User();
//        user.setUser_name("moti");
//        user.setPassword("983934");
//        user.setAge(19);
//        user.setEmail("6666@qq.com");
//        user.setPhone("100861111");
//        user.setSex(Sex.女);
//        us.addUser(user);
    }

    public static void TestGetUserById(UserService us){
        User user = us.getUserById(1);
        System.out.println(user);
    }
    public static void TestGetUserByUserName(UserService us){
        User user = us.getUserByUserName("mm");
        System.out.println(user);
    }
    public static void TestGetUserByUserNameAndPassword(UserService us){
        User user = us.getUserByUserNameAndPassword("moti","983934");
        System.out.println(user);
    }
    public static void TestGetUserByEmailAndPassword(UserService us){
        User user = us.getUserByEmailAndPassword("6666@qq.com","983934");
        System.out.println(user);
    }
    public static void TestGetUserByPhoneAndPassword(UserService us){
        User user = us.getUserByPhoneAndPassword("10086","123");
        System.out.println(user);
    }
    public static void TestUpdateUser(UserService us){
        User user = us.getUserById(1);
        user.setUser_name("莫提");
        user.setPassword("xuewei333333");
        us.updateUser(user);
    }
    public static void TestgetAllCommentUsersId(UserService us){
       Set<Integer> set = us.getAllCommentUsersId(622);
       System.out.println(set);
    }
}
