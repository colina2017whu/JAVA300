package JAVA300.JAVA052_array;

public class Test01 {
    public static void main(String[] args) {
        /**
         * 1.数组相同的数据类型（任何）的有序集合
         * 2.数组也是对象，数组元素相当于对象的成员变量
         * 3.数组长度是确定的，不可变的，越界报错：ArrayIndexOutOfBoundsException
         */
        int[] a = new int[3];
        a[0] = 23;
        a[1] = 28;
        a[2] = 32;

        Car[] cars = new Car[4];
        cars[0] = new Car("Benzs");
        cars[1] = new Car("Das.Auto");
        cars[2] = new Car("Haffv");
        cars[3] = new Car("Toyota");
        System.out.println(a.length);
        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println(cars[0].name);
    }

    public static class Car {
        String name;
        public Car(String name) {
            this.name = name;
        }
    }
}
