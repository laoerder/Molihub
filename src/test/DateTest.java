package test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 格式化时间
 * @User MOTI
 * @Time 2019/8/8 22:14
 */
public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(1565240985000L);

        SimpleDateFormat sd = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

        String time = sd.format(date);
        System.out.println(time);
    }
}
