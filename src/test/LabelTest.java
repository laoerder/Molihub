package test;

import service.LabelService;
import service.impl.LabelServiceImpl;

/**测试
 * @User MOTI
 * @Time 2019/8/31 23:23
 */
public class LabelTest {
    public static void main(String[] args) {
        LabelService ls = new LabelServiceImpl();
//        System.out.println(ls.getLabel("测试",1));

//        System.out.println(ls.getArticleLabel(558));
        ls.updateLabel("二","2",41);
    }
}
