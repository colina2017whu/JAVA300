package JAVA300.JAVA065_Date;

import java.util.Date;

public class TestDate {
    public static void main(String[] args) {
        /**
         * 可以查看Date类的源码
         */

        Date d = new Date();//得到当前时间的毫秒数
        long l1 = System.currentTimeMillis();
        System.out.println(l1);//毫秒数

        Date d2 = new Date(1000);
        System.out.println(d2.toString());

        d2.setTime(24324324);
        System.out.println(d2.getTime());
        //System.out.println(d.getTime() < d2.setTime());

        Date date1 = new Date();
        System.out.println(date1.toString());//输出时间
        long i = date1.getTime();

        Date date2 = new Date(i - 1000);
        Date date3 = new Date(i + 1000);

        System.out.println(date1.after(date2));
        System.out.println(date1.before(date2));
        System.out.println(date1.equals(date2));

        System.out.println(date1.after(date3));
        System.out.println(date1.before(date3));
        System.out.println(date1.equals(date3));

        System.out.println(new Date(1000L * 60 * 60 * 24 * 365 * 39L).toString());

    }
}
