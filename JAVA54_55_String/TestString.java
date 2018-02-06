package JAVA300.JAVA54_55_String;

/**
 * String:不可变字符序列
 * 1.练习String类的常用方法
 * 2.结合数组查看源码
 */

public class TestString {
    public static void main(String[] args) {
       String str = new String("abcd");
       String str2 = new String("abcd");

        System.out.println(str.charAt(2));
        System.out.println(str2.equals(str));
        System.out.println(str2==str);
        System.out.println("------------------------------");

        String str3 = "def";
        String str4 = "def";
        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));
        System.out.println(str3.indexOf('y'));
        System.out.println("------------------------------");

        String s = str3.substring(0); //从什么位置开始读取，0是第一位
        System.out.println(s);
        String str5 = str3.replace('e', '*'); //替换字符
        System.out.println(str5);
        System.out.println("------------------------------");

        String str6 = "abcde,rrtt,cccee";
        String[] strArray = str6.split(",");//以，为切割点
        for(int i=0;i<strArray.length;i++){
            System.out.println(strArray[i]);
        }
        String str7 = "  aa  bb  ";
        String str77 = str7.trim();//去除首尾空格
        System.out.println(str77.length());
        System.out.println("------------------------------");

        System.out.println("Abc".equalsIgnoreCase("abc"));//忽略大小写
        System.out.println("Abcbd".indexOf('b'));
        System.out.println("Abcbd".lastIndexOf('b'));
        System.out.println("Abcbd".startsWith("Ab"));
        System.out.println("Abcbd".endsWith("bd"));
        System.out.println("Abcbd".toLowerCase());
        System.out.println("Abcbd".toUpperCase());

        System.out.println("##################");
        String gh = new String("a");
        for (int i = 0; i < 1000; i++) {//要避免此类代码，此处有1002个对象
            gh = gh + i;
        }
        System.out.println(gh);
    }

}
