package JAVA300;


public class JAVA041 {
    public static void main(String[] args) {
//        JAVA0412 S1 = new JAVA0412();
//        S1.JAVA04103();

//        JAVA0411 S2 = new JAVA0411();
//        S2.JAVA04103();
//
//        JAVA0410 S3 = new JAVA0410();
//        S3.JAVA04102("WHU");

        JAVA0413 S5 = new JAVA0413();
        S5.S4.JAVA04101();//仔细注意区分
        S5.JAVA04101();
    }

    public static class JAVA0410{
        String S1;
        int S2;

        public void JAVA04101() {
            System.out.println("test1");
        }

        public void JAVA04102(String name) {
            System.out.println(name + " test2");
        }

        public JAVA0410() {
            super();
            System.out.println("TEST");
        }
    }

    public static class JAVA0411 extends JAVA0410 {
        public void JAVA04103() {
            System.out.println("test3");
        }
    }

    public static class JAVA0412 extends JAVA0411 {
        public void JAVA04103() {
            super.JAVA04103();
            System.out.println("test4");
        }

        public JAVA0412() {
            System.out.println("TEST1");
        }
    }

    public static class JAVA0413 {
        JAVA0411 S4 = new JAVA0411();
        public void JAVA04101() {
            S4.JAVA04101();
            System.out.println("test5");
        }
    }
}
