package JAVA300.JAVA060_061_ArrayList;

public class Test01 {
    public static void main(String[] args) {
        /**
         * 静态初始化
         */
        int[][] a = {
                {1,2},
                {3,4,5},
                {6,7,8,9}
        };

        /**
         * 动态初始化
         */
        int[][] b = new int[3][];
        b[0] = new int[2];
        b[1] = new int[3];
        b[2] = new int[4];

        b[0][0] = 1;
        b[0][1] = 2;

        b[1][0] = 3;
        b[1][1] = 4;
        b[1][2] = 5;

        b[2][0] = 6;
        b[2][1] = 7;
        b[2][2] = 8;
        b[2][3] = 9;

        System.out.println(b[2][2]);
    }
}
