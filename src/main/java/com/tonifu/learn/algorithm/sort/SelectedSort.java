package com.tonifu.learn.algorithm.sort;

/**
 * 选择排序
 * 选择数组中余下最小或者最大数字 放到前面已经排序好的数字后面 如：2，1，2，4，3 ->1,2,2,4,3 ->1,2,2,3,4
 */
public class SelectedSort {
    public static int[] sort(int[] arr){
        if(null==arr||arr.length==0)return new int[0];
        if(arr.length==0)return arr;
        int len=arr.length;
        for(int i=0;i<len;i++){
            int minIdx=i;
            for(int j=i+1;j<len;j++){
                minIdx=arr[j]<arr[minIdx]?j:minIdx;
            }
            if(minIdx!=i)SortUtil.swap(arr,i,minIdx);
        }
        return arr;
    }

}
