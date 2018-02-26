package JAVA300.JAVA065_Date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * 思路总结：
 *  1.第一步先通过具体行动把骨架建起来。
 *  2.根据题意,利用日历知识解决实际问题，三个知识点
 * 	a)本月的第一天是星期几，确定了前面的空格的个数。int w=Calendar.get(Calendar.Date)
 *
 *  b)本月的最后一天是30还是31，还是28，决定的循环的临界值。 c)输入的字符串通过new
 * 		simpleDateFormat("yyyy-MM-dd").parse(str)变成日期对象date。
 有Calendar c =new GregorianCalendar();c.setTime(date)方法把日期对象变成日历。
 */
public class CalendarTest {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入日期，例如：2015-11-15");
        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine();

        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(temp);
        Calendar c = new GregorianCalendar();
        c.setTime(date);

        c.add(Calendar.DATE, 1);// 月份的第一天。
        // System.out.println(c.get(Calendar.DAY_OF_WEEK));
        int maxDate = c.getActualMaximum(Calendar.DATE);
        int day = c.get(Calendar.DATE);
        // int week = c.get(Calendar.DAY_OF_WEEK);
        // System.out.println(week);

        /**
         * 1.首先判断当前日期是星期几？ 2.判断当前月是几月？
         *
         */

        System.out.println("日\t一\t二\t三\t四\t五\t六");
        for (int i = 0; i < c.get(Calendar.DAY_OF_WEEK) - 2; i++) {// 根据月初是星期几，判断前面空格的数量。
            System.out.print("\t");
        }

        for (int i = 1; i <= maxDate; i++) {
            System.out.print(i + "\t");
            int w = c.get(Calendar.DAY_OF_WEEK);
            if (w == Calendar.SATURDAY) {
                System.out.println();
            }
            c.add(Calendar.DATE, 1);
        }
    }

}
