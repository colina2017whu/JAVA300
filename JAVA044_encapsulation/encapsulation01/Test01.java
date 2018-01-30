package JAVA300.JAVA044_encapsulation.encapsulation01;

public  class Test01 {
    private String str;

    protected void print() { //注意权限修饰符
        String s = str;
        System.out.println("Test01.print()");
    }
}

class Test001 extends Test01 {
    public void pp() {
        super.print();
        System.out.println("dududu");
    }

    public static void main(String[] args) {
        Test01 t = new Test01();
        t.print();
    }
}
