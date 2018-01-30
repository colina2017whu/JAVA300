package JAVA300;

public class JAVA030 {
    public static void main(String[] args) {
        JAVA0301 s1 = new JAVA0301();
        s1.name = "student1";
        s1.age = 18;
        s1.java0301();
        s1.java0302("du");

        JAVA0302 s3 = new JAVA0302();
        s3.brand = "acer";
        s1.sklse01 = s3;
        s3.brand = "lenove";
        System.out.println(s1.sklse01.brand);

        JAVA0301 s2 = new JAVA0301();
        s2.name = "student3";
        s2.age = 20;
        s3.sklse02 = s2;
        s2.name = "student4";
        System.out.println(s3.sklse02.name);

        JAVA0302 s4 = new JAVA0302();
        s4.java0304(10000);

    }

    public static class JAVA0301 {
        String name;
        int id;
        int age;
        int weight;
        String gender;
        JAVA0302 sklse01;

        public void java0301(){
            System.out.println(name + " study");
        }

        public void java0302(String sname) {
            System.out.println(name + " sayhello to " + sname);
        }
    }

    public static class JAVA0302 {
        String brand;
        int speed;
        JAVA0301 sklse02;

        public void java0303() {
            System.out.println(brand + " 牌子");
        }

        public void java0304(int sd) {
            System.out.println("speed " + sd);
        }
    }
}
