package JAVA300.JAVA052_array;

public class Test02 {
    /**
     * 数组的基本语法
     */
    public static void main(String[] args) {
        //声明
        int[] a;
        int b[];

        //创建数组对象，数组元素相当于对象的成员变量
        a = new int[4];
        b = new int[5];

        //初始化（对数组元素的初始化）
        //默认初始化：数组元素相当于对象的成员变量，默认值跟成员变量的规则一样，数字0，布尔false

        //动态初始化
        for(int i = 0; i < a.length; i++) {
            a[i] = i * 12;
        }

        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        //静态初始化
        int c[] = {23,45,56,78};
        Car[] cars = {
                new Car("奔驰"),
                new Car("比亚迪"),
                new Car("宝马")
        };
        Car c2 = new Car("奔驰");
        System.out.println(c2.equals(cars[0]));
    }


    public static class Car {
        String name;
        public Car(String name) {
            this.name = name;
        }
    }
}
