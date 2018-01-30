package JAVA300;

/**
 * 测试static
 */
public class JAVA036 {
    public static void main(String[] args) {
        //JAVA03601 a = new JAVA03601();
        JAVA03601.a1 = 100;
        JAVA03601.JAVA03602();
    }

    public static class JAVA03601 {
        static int a1;
        public static void JAVA03602() {
            System.out.println(a1);
        }
    }
}
