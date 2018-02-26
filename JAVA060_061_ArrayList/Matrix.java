package JAVA300.JAVA060_061_ArrayList;

public class Matrix {

    public static void print(int[][] c) {
        for(int i = 0; i < c.length; i++) {
            for(int j = 0; j < c.length; j++) {
                System.out.println(c[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] a = {
                {1,2},
                {3,4}
        };

        int[][] b = {
                {5,6},
                {7,8}
        };

        int[][] c = new int[2][2];

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                c[i][j] = a[i][j] + b[i][j];

                System.out.println(c[i][j]);
            }
        }


    }
}
