package JAVA300.JAVA56_58_StringBuilder_StringBuffer;

/**
 * String：不可变字符序列
 * 测试可变字符序列，StringBuilder（线程不安全，效率高）StringBuffer（线程安全，效率低）
 */
public class Test01 {
    public static void main(String[] args) {


        /**
         * 创建长度为16的字符数组
         */
        StringBuilder sb = new StringBuilder();

        /**
         * 字符数组长度为32
         */
        StringBuilder sb1 = new StringBuilder(32);

        /**
         * 字符数组长度仍为32，value[]={'a','b','c','d','\u0000',....}
         */
        StringBuilder sb2 = new StringBuilder("abcd");

        /**
         * append添加,返回值是this,可以多个append
         */
        sb2.append("efg").append("hijk");//添加到sb2的后面,
        System.out.println(sb2.length());

        System.out.println("----------------------");

        StringBuilder gh = new StringBuilder("a");//这有两个对象
        for(int i = 0; i < 10; i++) {
            gh.append(i);
        }
        System.out.println(gh);

    }
}
