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
    public static void sort2(int[] arr){
        doSort2(arr);
    }
    private static void doSort(int[] arr){
        if(null==arr||arr.length<2)return;
        int len=arr.length;
        int left=0;
        int right=len-1;
        int temp[]=new int[len];
        realSort(arr,temp,left,right);
    }
    private static void realSort(int[] arr,int[] temp,int left,int right){
        if(left>=right)return;
        int mid=left+(right-left)/2;
        realSort(arr,temp,left,mid);
        realSort(arr,temp,mid+1,right);
        merge(arr,temp,left,mid,right);
    }
    private static void merge(int[] arr,int[] temp,int left,int mid,int right){
        int l=left;
        int r=mid+1;
        int idx=0;
        while(l<=mid&&r<=right){
            if(arr[l]<=arr[r]){
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

    private static void doSort2(int[] arr){
        if(null==arr||arr.length<2)return;
        int len=arr.length;
        int[] temp=new int[len];
        int left=0;
        int right=len-1;
        doRealSort2(arr,temp,left,right);

    }

    private static void doRealSort2(int[] arr, int[] temp, int left, int right) {
        if(left>=right)return;
        int mid=left+(right-left)/2;
        doRealSort2(arr,temp,left,mid);
        doRealSort2(arr,temp,mid+1,right);
        doMerge2(arr,temp,left,mid,right);
    }

    private static void doMerge2(int[] arr, int[] temp, int left, int mid, int right) {
        int start=left;
        int end=mid+1;
        int idx=0;
        while(start<=mid&&end<=right){
            if(arr[start]<arr[end]){
                temp[idx++]=arr[start++];
            }else{
                temp[idx++]=arr[end++];
            }
        }
        while (start<=mid){
            temp[idx++]=arr[start++];
        }

        while(end<=right){
            temp[idx++]=arr[end++];
        }
        idx=0;
        while(left<=right){
            arr[left++]=temp[idx++];
        }
    }
}
