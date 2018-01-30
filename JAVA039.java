package JAVA300;

public class JAVA039 {
    public static void main(String[] args) {
        JAVA0392 S1 = new JAVA0392();
        S1.JAVA03903();

        JAVA0393 S2 = new JAVA0393();
        S2.JAVA03904("XIEJUN");
        S2.JAVA03901();
        S1.JAVA03902();
    }

    public static class JAVA0391 {
        public void JAVA03901() {
            System.out.println("test1");
        }
        public void JAVA03902() {
            System.out.println("test2");
        }
    }

    public static class JAVA0392 extends JAVA0391{
        public void JAVA03903() {
            System.out.println("test3");
        }
    }

    public static class JAVA0393 extends JAVA0391{
        public void JAVA03901() { //重写了父类中的方法
            super.JAVA03901();
            System.out.println("test4");
        }

        public void JAVA03904(String name) {
            System.out.println(name + " dududu");
        }
    }
}
