package JAVA300;

public class JAVA034 {
    public static void main(String[] args) {
        JAVA03401 sc = new JAVA03401();
       // sc.JAVA034010();

        JAVA03402 p = new JAVA03402(3,3,5);
        JAVA03402 p2 = new JAVA03402(4,5,6);
        System.out.println(p.x);

        p.JAVA03403(6);
        System.out.println(p.x);

        System.out.println("两个点之间的距离是：" + p.JAVA03404(p2));
    }

    public static class JAVA03401{
        int speed;
        public JAVA03401() { //构造器
            System.out.println("constructure");
        }
    }

    public static class JAVA03402 {
        double x;
        double y;
        double z;
        public JAVA03402(double _x,double _y, double _z) {
            this.x = _x;
            this.y = _y;
            this.z = _z;
        }

        public void JAVA03403(double _x) {//更换一个坐标
            this.x = _x;
        }

        public double JAVA03404(JAVA03402 p) {
            double X = Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y) + (z - p.z) * (z - p.z));
            return X;
        }
    }
}
