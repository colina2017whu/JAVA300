package JAVA300;

import java.util.Scanner;

public class JAVA027 {
    //测试Scanner类
    public static void main(String[] args) {
        java027();
    }

    public static void java027() {

        System.out.println("输入第一个数：");
        Scanner s1 = new Scanner(System.in);
        int a = s1.nextInt();

        System.out.println("输入第二个数：");
        Scanner s2 = new Scanner(System.in);
        int b = s2.nextInt();

        int s3 = a + b;

        System.out.println("sum：" + s3);
    }
}
