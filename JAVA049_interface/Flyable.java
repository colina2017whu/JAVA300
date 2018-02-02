package JAVA300.JAVA049_interface;

public interface Flyable {
    int MAX_SPEED = 11000;
    int MIN_HEIGHT = 1;
    void fly();
}

interface Attack {
    void attack();
}

class Plane  implements Flyable{
    @Override
    public void fly() {
        System.out.println("飞机靠发动机飞！");
    }
}

class Man  implements Flyable{
    @Override
    public void fly() {
        System.out.println("跳起来，飞！");
    }
}

class Stone implements Flyable, Attack{
    int weight;
    @Override
    public void fly() {
        System.out.println("被人扔出去，飞！");
    }

    @Override
    public void attack() {
        System.out.println("石头攻击!");
    }
}

