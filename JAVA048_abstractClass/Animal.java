package JAVA300.JAVA048_abstractClass;

public abstract class Animal {
    String str;
    public abstract void run(); //抽象方法的意义在于：将方法的设计和实现分离！！
    public void breath(){
        System.out.println("呼吸！");
        run();
    }
    public Animal(){
        System.out.println("创造一个动物！");
    }
}

class Cat extends Animal {
    public void run(){
        System.out.println("猫步小跑");
    }
}
class Dog extends Animal  {
    public void run(){
        System.out.println("狗步狂奔");
    }
}

