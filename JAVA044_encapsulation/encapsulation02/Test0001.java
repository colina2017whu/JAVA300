package JAVA300.JAVA044_encapsulation.encapsulation02;

import JAVA300.JAVA044_encapsulation.encapsulation01.Test01;

public class Test0001 extends Test01 {
    public void ttt() {
        super.print();
        print();
    }

    public static void main(String[] args) {
        Test0001 t = new Test0001();
        t.print();
    }
}
