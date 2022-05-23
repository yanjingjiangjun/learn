package com.tonifu.learn.algorithm.sort;

public class SortUtil {
    // arr1和arr2一定等长
    public static boolean isSorted(int[] arr) {
        if (arr.length < 2) {
            return true;
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max > arr[i]) {
                return false;
            }
            max = Math.max(max, arr[i]);
        }
        return true;
    }

    public static void check(int[] arr1,int[] arr2){
        if (!isSorted(arr1)) {
            for (int j = 0; j < arr2.length; j++) {
                System.out.print(arr2[j] + " ");
            }
            System.out.println();
            System.out.println("排序错了！");
        }else{
            System.out.println("case and arr ok！");
        }
    }
    public static void swap(int[] arr,int target,int dest){
        int temp=arr[target];
        arr[target]=arr[dest];
        arr[dest]=temp;
    }
}
