package JAVA300;


public class JAVA040 {
    public static void main(String[] args) {
        Object OBJ1 = new Object();
        Object OBJ2 = new Object();
        System.out.println(OBJ1.toString());
        System.out.println(OBJ2.toString());

        System.out.println(OBJ1==OBJ2);
        System.out.println(OBJ1.equals(OBJ2));

        //String str;
        JAVA0401 M = new JAVA0401();
        System.out.println(M.toString());
    }

    public static class JAVA0401 {
        public String toString() {
            return "WHU";
        }
    }
}
