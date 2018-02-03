package JAVA300.JAVA051_innerclass;

public class Outer {
    public static void main(String[] args) {
        Face f = new Face();
        Face.Nose n = f.new Nose();
        n.breath();

        Face.Ear e = new Face.Ear();
        e.hear();
    }
}

class Face {
    int type = 10;
    String shape = "beauty";
    static String color = "红润！";

    /**
     * 普通的成员内部类可以访问外部类的普通的属性方法
     * 普通的成员内部类可以看作外部类的一个普通的属性
     */
    class Nose {
        String type = "haha";
        void breath() {
            System.out.println(shape);
            System.out.println(Face.this.type);
            System.out.println(this.type);
            System.out.println("breath!");
        }
    }

    static class Ear {
        int SPEED;
        void hear() {
            /**
             * 静态内部类可以看作外部类的一个静态成员
             * 静态内部类的实例方法不能直接访问外部类的实例方法
             * 静态内部类可以访问外部类的静态属性方法
             */
            System.out.println(color);
            System.out.println("I am listenning!");
        }
    }
}


