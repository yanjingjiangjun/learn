package com.tonifu.learn.algorithm.sort;

/**
 * 练习归并排序
 * @Author fuj
 * @Date 2022-05-25 15:43
 * @PackageName:com.tonifu.learn.algorithm.sort
 * @ClassName: PracticeMergeSort
 * @Description: TODO
 * @Version 1.0
 */
public class PracticeMergeSort {
    public static void sort(int[] arr){
        doSort(arr);
    }
    private static void doSort(int[] arr) {
        if(null==arr||arr.length<2)return;
        int len=arr.length;
        int left=0;
        int right=len-1;
        int[] temp=new int[len];
        doRealSort(arr,temp,left,right);
    }

    private static void doRealSort(int[] arr, int[] temp, int left, int right) {
        if(left>=right)return;
        int mid=left+(right-left)/2;
        doRealSort(arr,temp,left,mid);
        doRealSort(arr,temp,mid+1,right);
        merge(arr,temp,left,mid,right);
    }

    private static void merge(int[] arr, int[] temp, int left, int mid, int right) {
        int l=left;
        int r=mid+1;
        int idx=0;
        while(l<=mid&&r<=right){
            if(arr[l]<arr[r]){
                temp[idx++]=arr[l++];
            }else{
                temp[idx++]=arr[r++];
            }
        }
        while(l<=mid){
            temp[idx++]=arr[l++];
        }
        while(r<=right){
            temp[idx++]=arr[r++];
        }
        idx=0;
        while(left<=right){
            arr[left++]=temp[idx++];
        }
    }
}
