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
    public static void sortTest2(int[] arr){
        doSortTest2(arr);
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
        realSortTest(arr,left,right);
    }
    private static int partionTest(int[] arr,int left,int right){
        int end=right;
        int start=left;
        int mid=left+(right-left)/2;
        int pivot=arr[left];
        if(arr[left]>arr[right]&&arr[right]>arr[mid]){
            pivot=arr[right];
        }
        if(arr[left]>arr[mid]&&arr[right]<arr[mid]){
            pivot=arr[mid];
        }
        while(start<end){
            while(start<end&&pivot<=arr[end]){
                end--;
            }
            SortUtil.swap(arr,start,end);
            while(start<end&&pivot>=arr[start]){
                start++;
            }
            SortUtil.swap(arr,start,end);
        }
        return start;
    }
    private static void realSortTest(int[] arr,int left,int right){
        if(left>=right)return;
        int mid=partionTest(arr,left,right);
        realSortTest(arr,left,mid-1);
        realSortTest(arr,mid+1,right);
    }

    private static void doSortTest2(int[] arr){
        if(null==arr||arr.length<2)return;
        int len=arr.length;
        int left=0;
        int right=len-1;
        //
        realSortTest2(arr,left,right);
    }

    private static void realSortTest2(int[] arr, int left, int right) {
        if(left>=right)return;
        int mid=partionTest2(arr,left,right);
        realSortTest2(arr,left,mid-1);
        realSortTest2(arr,mid+1,right);
    }

    private static int partionTest2(int[] arr, int left, int right) {
        int pivot=arr[left];
        int mid=left+(right-left)/2;
        int start=left;
        int end=right;
        while(start<end){
            while(start<end&&pivot<=arr[end]){
                end--;
            }
            SortUtil.swap(arr,start,end);
            while(start<end&&pivot>=arr[start]){
                start++;
            }
            SortUtil.swap(arr,start,end);
        }
        return start;

    }


}
