package JAVA300;

public class TestSuper {
    public static void main(String[] args) {
        brid b = new brid();
        b.run();
    }

    public static class animal {
        String eye;

        public void run() {
            System.out.println("test1");
        }

        public void eat() {
            System.out.println("test2");
        }

        public void sleep() {
            System.out.println("test3");
        }

        public animal() {
            super();
            System.out.println("TEST1");
        }
    }

    public static class mammal extends animal {
        public void taisheng() {
            System.out.println("test4");
        }
    }

    public static class brid extends animal {
        public void run() {
            super.run();
            System.out.println("test5");
        }

        public void eggsheng() {
            System.out.println("test6");
        }

        public brid() {
            super();
            System.out.println("TEST2");
        }
    }
}
