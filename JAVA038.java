package JAVA300;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class JAVA038 {
    public static void main(String[] args) {

        JAVA03804 S1 = new JAVA03804();
        S1.JAVA03805();
        S1.JAVA03802();
        S1.JAVA03803();

        JAVA03806 S2 = new JAVA03806();
        S2.JAVA03807();
    }

    public static class JAVA03801 {

       //String s1;

        public void JAVA03802() {
            System.out.println("test1");
        }

        public void JAVA03803() {
            System.out.println("test2");
        }

        public JAVA03801() {
            System.out.println("create");
        }
    }

    public static class JAVA03804 extends JAVA03801 {
        public void JAVA03805() {
            System.out.println("test3");
        }
    }

    public static class JAVA03806 extends JAVA03801 {
        public void JAVA03807() {
            //this.JAVA03801();
            System.out.println("test4");
        }
    }
}
