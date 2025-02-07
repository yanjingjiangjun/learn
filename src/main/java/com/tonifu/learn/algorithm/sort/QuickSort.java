package com.tonifu.learn.algorithm.sort;

/**
 *快速排序算法分为两步：1）随便选一个“中间值”（一般是一堆数字里面的第一个数字），
 * 然后以这个数字为基准，把所有数字分成两堆，一堆是小于等于这个数字的，一堆是大于等于这个数字的。
 * 2）然后用递归调用快速排序算法，分别对这两堆数字进行排序
 *
 * 由于快排从 两端开始，所以会把 重复值原始位置顺序变掉 ，所以是不稳定的，
 * 例如当待排序元素类似[6,1,3,7,3]且基准元素为6时，经过分区，形成[1,3,3,6,7],两个3的相对位置发生了改变，所是快速排序是一种不稳定排序
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

    public static void doSortTest3(int[] arr){
        if(null==arr||arr.length<2)return;
        int len=arr.length;
        int left=0;
        int right=len-1;
        doRealSortTest3(arr,left,right);
    }

    private static void doRealSortTest3(int[] arr, int left, int right) {
        if(left>=right)return;
        int partionIndex=partionTest3(arr,left,right);
        doRealSortTest3(arr,left,partionIndex-1);
        doRealSortTest3(arr,partionIndex+1,right);
    }

    private static int partionTest3(int[] arr, int left, int right) {
        int start=left;
        int end=right;
        int pivot=arr[left];
        while(start<end){
            while(start<end&&pivot<arr[end]){
                end--;
            }
            arr[start]=arr[end];
            while(start<end&&pivot>=arr[start]){
                start++;
            }
            arr[end]=arr[start];

        }
        arr[start]=pivot;
        return start;

    }

    public static void dosortTest5(int[] arr){
        if(null==arr||arr.length<2){
            return;
        }
        int len=arr.length;
        int left=0;
        int right=len-1;
        doRealSortTest5(arr,left,right);
    }

    private static void doRealSortTest5(int[] arr, int left, int right) {
        if(left>=right)return;
        int mid=left+(right-left)/2;
        int partionIndex=partionTestSingle5(arr,left,right);
        doRealSortTest5(arr,left,partionIndex-1);
        doRealSortTest5(arr,partionIndex+1,right);
    }

    private static int partionTest5(int[] arr, int left, int right) {
        int pivote=arr[left];
        int start=left;
        int end=right;
        while(start<end){
            //因为默认的基准数是在最左边，所以首先从右边开始比较进入while循环的判断条件
            while(start<end&&arr[end]>=pivote){
                end--;
            }
            arr[start]=arr[end];//参考坐标轴pivote右边遇到了比参考值小的 交换,将这个值换到左边去
            while(start<end&&arr[start]<=pivote){
                start++;
            }
            arr[end]=arr[start];//参考坐标轴pivote左边遇到了比参考值大的 交换,将这个值换到右边去

        }
        arr[start]=pivote;//start 移动到了中间位置,将基准值放到中间位置,此时start位置值交换给了end，因此需要 将start赋值为参考轴
        return start;//start 移动到了中间位置
    }
    private static int partionTestSingle5(int[] arr, int left, int right) {
        int pivote=arr[left];
        int pivoteIndex=left;

        for(int i=left+1;i<=right;i++){
            if(arr[i]<pivote){
                pivoteIndex++;
                SortUtil.swap(arr,i,pivoteIndex);
            }
        }
        arr[left]=arr[pivoteIndex];
        arr[pivoteIndex]=pivote;
        return pivoteIndex;//start 移动到了中间位置
    }
    public static void doSortTest6(int[] arr){
        if(null==arr||arr.length<2){
            return;
        }
        int len=arr.length;
        int left=0;
        int right=len-1;
        doRealSortTest6(arr,left,right);
    }

    private static void doRealSortTest6(int[] arr, int left, int right) {
        //递归终止条件
        if(left>=right)return;
        int partionIndex=partionTest6(arr,left,right);
        doRealSortTest6(arr,left,partionIndex-1);
        doRealSortTest5(arr,partionIndex+1,right);
    }

    private static int partionTest6(int[] arr, int left, int right) {
        int start=left;
        int end=right;
        int pivot=arr[left];
        while(start!=end){
            while(start<end&&arr[end]>=pivot){
                end--;
            }
            arr[start]=arr[end];
            while(start<end&&arr[start]<=pivot){
                start++;
            }
            arr[end]=arr[start];
        }
        arr[start]=pivot;
        return start;
    }


}
