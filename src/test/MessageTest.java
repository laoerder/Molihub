package test;

import controller.BaseController;
import domain.ArticleToShow;
import domain.MessageToShow;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import service.ArticleService;
import service.MessageService;
import service.UserService;
import service.impl.MessageServiceImpl;

import java.util.List;

/**
 * @User MOTI
 * @Time 2019/9/8 13:34
 *
 */
public class MessageTest {
    public static void main(String[] args) {
        MessageService ms = new MessageServiceImpl();
//        ms.addLikeMessage(1,2,3);
//        ms.addCommentMessage(2,3,44,"哈哈啊哈");
//        ms.addOtherMessage(5,2,3,"我是其他评论");
//        ms.setLooked(2);
//        ms.deleteRead(2);
//        ms.deleteLikeMessage(1,2,3);
        List<MessageToShow> list = ms.getAllMessages(57);
        System.out.println(list);
    }
}
