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
        doSortTest2(arr);
    }
    private static void doSort(int[] arr){
        if(null==arr||arr.length<2)return;
        int len=arr.length;
        int[] temp=new int[len];
        int left=0;
        int right=len-1;
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
        int i=left;
        int j=mid+1;
        int idx=0;
        while(i<=mid&&j<=right){
            if(arr[i]<arr[j])temp[idx++]=arr[i++];
            else temp[idx++]=arr[j++];
        }
        while(i<=mid){
            temp[idx++]=arr[i++];
        }
        while(j<=right){
            temp[idx++]=arr[j++];
        }
        idx=0;
        while(left<=right){
            arr[left++]=temp[idx++];
        }
    }

    private static void doSortTest2(int[] arr){
        if(null==arr||arr.length<2)return;
        int len=arr.length;
        int left=0;
        int right=len-1;
        int[] temp=new int[len];
        realSortTest2(arr,temp,left,right);
    }

    private static void realSortTest2(int[] arr, int[] temp, int left, int right) {
        if(left>=right)return;
        int mid=left+(right-left)/2;
        realSortTest2(arr,temp,left,mid);
        realSortTest2(arr,temp,mid+1,right);
        mergeTest2(arr,temp,left,mid,right);
    }

    private static void mergeTest2(int[] arr, int[] temp, int left, int mid, int right) {
        int l=left;
        int r=mid+1;
        int idx=0;
        while(l<=mid&&r<=right){
            temp[idx++]=arr[l]<arr[r]?arr[l++]:arr[r++];
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

    public static void sortTest3(int[] arr){
        doSort3(arr);

    }
    private static void doSort3(int[] arr){
        if(arr==null||arr.length<2)return;
        int len=arr.length;
        int temp[]=new int[len];
        int left=0;
        int right=len-1;
        realSort3(arr,temp,left,right);
    }
    private static void realSort3(int[] arr,int[] temp,int left,int right){
        if(left>=right)return;
        int mid=left+(right-left)/2;
        realSort3(arr,temp,left,mid);
        realSort3(arr,temp,mid+1,right);
        merge3(arr,temp,left,mid,right);
    }
    private static void merge3(int[] arr,int[] temp,int left,int mid,int right){
        int l=left;
        int r=mid+1;
        int idx=0;
        while(l<=mid&&r<=right){
            if(arr[l]<arr[r]){
                temp[idx++]= arr[l++];
            }else{
                temp[idx++]= arr[r++];
            }
        }
        while(l<=mid){
            temp[idx++]=arr[l++];
        }
        while (r<=right){
            temp[idx++]=arr[r++];
        }
        idx=0;
        while(left<=right){
            arr[left++]=temp[idx++];
        }
    }

}
