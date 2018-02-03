package JAVA300.JAVA050_callback;

public abstract class MyFrame {
    public void paint(){
        System.out.println("把自己窗口画出来！");
    }
}
interface IMyFrame {
    void paint();
}
