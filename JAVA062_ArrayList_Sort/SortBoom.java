package JAVA300.JAVA062_ArrayList_Sort;

import java.util.Arrays;

public class SortBoom {
    public static void main(String[] args) {
        int[] arr = {3,1,6,2,9,0,7,4,5,8};
        sort(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        int temp = 0;

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
