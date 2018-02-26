package JAVA300.JAVA064_autoboxing;

public class AutoBox {
    public static void main(String[] args) {
        //Integer i1 = new Integer(100);
        //Integer i2 = new Integer(2000);

        /**
         * 编译器帮我们改进代码相当于上面被注释的代码
         */
        Integer i1 = 100;
        Integer i2 = 2000;

        int c = i2;//实际上是i2.intValue();
        System.out.println(c);

        Integer d = 1234;
        Integer d2 = 1234;
        System.out.println(d == d2);//false
        System.out.println(d.equals(d2));//true
        System.out.println("----------------------------------");


        Integer d3 = -129;//[-128,127]之间的数，仍然当做基本数据类型来处理
        Integer d4 = -129;
        System.out.println(d3 == d4);
        System.out.println(d3.equals(d4));
    }
}
