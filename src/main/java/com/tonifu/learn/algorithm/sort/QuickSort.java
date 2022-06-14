package com.tonifu.learn.algorithm.sort;

/**
 *
 * @Author fuj
 * @Date 2022-06-01 16:55
 * @PackageName:com.tonifu.learn.algorithm.sort
 * @ClassName: QuickSort
 * @Description: TODO
 * @Version 1.0
 */
public class QuickSort {
    public static void sort(int[] arr){
        doSort(arr);
    }
    public static void sortTest(int[] arr){
        doSortTest(arr);
    }

    private static void doSort(int[] arr) {
        if(null==arr||arr.length<2)return;
        int len=arr.length;
        int left=0;
        int right=len-1;
        int mid=left+(right-left)/2;
        int pivot=arr[left];
        int idx=0;
        //dealPivot();
        /*if(arr[left]<arr[mid]&&arr[mid]<arr[right]){
            idx=mid;
            pivot=arr[mid];
        }
        if(arr[right]<arr[mid]&&arr[left]>arr[mid]){
            idx=mid;
            pivot=arr[mid];
        }
        if(arr[right]<arr[mid]&&arr[right]>arr[left]){
            idx=right;
            pivot=arr[right];
        }
        if(arr[right]>arr[mid]&&arr[right]<arr[left]){
            idx=right;
            pivot=arr[right];
        }*/
        realSort(arr,left,right);


        /*if(arr[mid]<arr[right]){
                pivot=arr[mid];
                idx=mid;
            }else{
                pivot=arr[right];
                idx=right;
            }*/
        /*if(arr[left]>arr[right]){

            SortUtil.swap(arr,left,right);
        }
        if(arr[mid]<arr[left]){

            SortUtil.swap(arr,left,mid);
        }
        if(arr[mid]>arr[right]){

            SortUtil.swap(arr,mid,right);
        }*/
    }
    private static void realSort(int[] arr,int left,int right){
        if(left>=right)return;
        int start=left;
        int end=right;
        int pivot=arr[left];
        while(start<end){
            while(start<end&&pivot<=arr[end]){
                end--;
            }
            SortUtil.swap(arr,start,end);
            //arr[start]=arr[end];
            while(start<end&&pivot>=arr[start]){
                start++;
            }
            SortUtil.swap(arr,start,end);
            //arr[end]=arr[start];

        }
        //arr[start]=pivot;
        realSort(arr,left,start-1);
        realSort(arr,end+1,right);
    }

    private static void doSortTest(int[] arr){
        if(null==arr||arr.length<2)return;
        int len=arr.length;
        int left=0;
        int right=len-1;
        doRealSortTest(arr,left,right);
    }

    private static void doRealSortTest(int[] arr, int left, int right) {
        if(left>=right)return;//the condition to stop recurse

        int start=left;
        int pivot=arr[start];
        int end=right;
        while(start<end){
            while(start<end&&pivot<=arr[end]){
                end--;
            }
            if(start<end)SortUtil.swap(arr,start,end);
            while(start<end&&pivot>=arr[start]){
                start++;
            }
            if(start<end)SortUtil.swap(arr,start,end);
        }
        doRealSortTest(arr,left,start-1);
        doRealSortTest(arr,end+1,right);
    }


}
