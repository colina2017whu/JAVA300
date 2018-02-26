package JAVA300.JAVA062_ArrayList_Sort;

import java.util.Arrays;

public class SortErFen {
    public static void main(String[] args) {
        //System.out.println(args[1]);
        int[] arr = { 234, 245, 77, 3, 543, 67, 78, 95, 378, 678, 205, 753, 457, 2903, 340 };
        int searchWord = 6780; // 所要查找的数
        int searchCount = 0; // 循环的次数

        System.out.printf("普通循环查找%d的次数是%d", searchWord, genetalLoop(arr, searchWord));
        System.out.printf("二分法查找%d的次数是%d", searchWord, binarySearch(arr, searchWord));
    }

    static int genetalLoop(int[] arr, int searchWord) {
        // 普通的循环法，最少需要比较一次，比如查找1，最多需要比较15次，比如8721
        int searchCount = 0;
        for (int i = 0; i < arr.length; i++) {
            searchCount++;
            if (searchWord == arr[i])
                break;
        }
        return searchCount;
    }

    // int[] arr = {234,245,77,3,543,67,78,95,378,678,205,753,457,2903,340};
    static int binarySearch(int[] arr, int searchWord) {
        Arrays.sort(arr); // 先对传进来的数组进行排序
        System.out.println("\n" + Arrays.toString(arr));
        // 二分法查找
        int iIndex = 0; // 相当于指针的东西
        int iStart = 0;
        int iEnd = arr.length - 1;
        int searchCount = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            searchCount++;
            iIndex = (iStart + iEnd) / 2;
            if (arr[iIndex] < searchWord) {
                System.out.println("aa");
                iStart = iIndex;
            } else if (arr[iIndex] > searchWord) {
                System.out.println("bb");
                iEnd = iIndex;
            } else {
                break;
            }
        }
        return searchCount;
    }

}

