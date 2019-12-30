package test;

import controller.BaseController;
import domain.Article;
import domain.ArticleToShow;
import domain.Comment;
import domain.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import service.ArticleService;
import service.UserService;
import service.impl.ArticleServiceImpl;

import java.util.Date;
import java.util.List;

/**
 * @User MOTI
 * @Time 2019/8/7 0:17
 */
public class ArticleControllerTest {
    @Autowired
    public ArticleService as;
    @Autowired
    public UserService us;

    /**
     * 分页获得所有文章测试
     */
    @Test
    public void test1(){
        BaseController controller = new BaseController();
        as = controller.as;
        us = controller.us;
        List<ArticleToShow> list = as.getAllArticleByLimit(1);
        System.out.println("分页查找的结果为:"+list);
    }

    /**
     * 添加文章测试
     */
    @Test
    public void test2(){
        BaseController controller = new BaseController();
        as = controller.as;
        Article article = new Article();
        article.setUser_id(-1);
        article.setArticle_tag("test");
        article.setRead_count(100);
        article.setArticle_time(new Date());
        article.setArticle_kind("learn");
        article.setArticle_title("title");
        article.setArticle_content("content");
        article.setIs_private("yes");
        as.addArticle(article);
    }

    /**
     * 根据文章ID获得文章测试
     */
    @Test
    public void getArticleById(){
        BaseController controller = new BaseController();
        as = controller.as;
        ArticleToShow article = as.getArticleById(312);
        System.out.println(article);
    }
    @Test
    public void getPageNum(){
        BaseController controller = new BaseController();
        as = controller.as;
        System.out.println(as.getPageNum()+"页");
    }
    @Test
    public void addComment(){
        BaseController controller = new BaseController();
        as = controller.as;
        Comment comment = new Comment();
        comment.setArticle_id(110);
        comment.setUser_name("test");
        comment.setComment_content("我是评论内容");
        comment.setComment_time(new Date());
        as.addComment(comment);
    }
    @Test
    public void getAllComment(){
        BaseController controller = new BaseController();
        as = controller.as;
        List<Comment> list = as.getAllComments(524);
        System.out.println(list);
    }
    @Test
    public void getAllArticleByUserId(){
        BaseController controller = new BaseController();
        as = controller.as;
        List<ArticleToShow> list = as.getAllArticleByUserId(41);
    }
    @Test
    public void getAllArticleByKind(){
        BaseController controller = new BaseController();
        as = controller.as;
        List<ArticleToShow> list = as.getAllArticleByKind("学习笔记");
        System.out.println(list);
    }
    @Test
    public void getAllArticleByTitle(){
        BaseController controller = new BaseController();
        as = controller.as;
        List<ArticleToShow> list = as.getAllArticleByTitle("hh");
        System.out.println(list);
    }
    @Test
    public void getTopByRead(){
        BaseController controller = new BaseController();
        as = controller.as;
        List<ArticleToShow> list = as.getTopByRead();
        System.out.println(list);
    }
    @Test
    public void getTopByLike(){
        BaseController controller = new BaseController();
        as = controller.as;
        List<ArticleToShow> list = as.getTopLike();
        System.out.println(list);
    }
    @Test
    public void getMyArticleByLimit(){
        BaseController controller = new BaseController();
        as = controller.as;
        List<ArticleToShow> list = as.getMyArticleByLimit(1,1);
        System.out.println(list);
    }
    @Test
    public void getMyPageNum(){
        BaseController controller = new BaseController();
        as = controller.as;
        System.out.println(as.getMyPageNum(1));
    }
    @Test
    public void getMyTopByRead(){
        BaseController controller = new BaseController();
        as = controller.as;
        System.out.println(as.getMyTopByRead(1));
    }
    @Test
    public void deleteArticle(){
        BaseController controller = new BaseController();
        as = controller.as;
        as.deleteArticle(576);
    }
    @Test
    public void updateArticle(){
        BaseController controller = new BaseController();
        as = controller.as;
        Article article = as.getMyArticleById(579);
        article.setArticle_title("hahahaha");
        as.updateArticle(article);
    }
    @Test
    public void getUserIdByArticleId(){
        BaseController controller = new BaseController();
        as = controller.as;
        int user_id = as.getUserIdByArticleId(1);
        System.out.println(user_id);
    }


}
