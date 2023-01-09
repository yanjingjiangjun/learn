package com.tonifu.learn.algorithm.sort;

/**
 * 堆排
 * @Author fuj
 * @Date 2022-06-07 10:56
 * @PackageName:com.tonifu.learn.algorithm.sort
 * @ClassName: HeapSort
 * @Description: TODO
 * @Version 1.0
 */
public class HeapSort {
    public static void sort(int[] arr){
        if(null==arr||arr.length<2)return;
        doSortTest(arr);
    }

    private static void doSort(int[] arr) {
        int len=arr.length;
        //构建大顶堆
        //从第一个非叶子结点从下至上，从右至左调整结构
        for(int i=(len)/2-1;i>=0;i--){
            adjustHeapNode(arr,i,len-1);
        }
        //调整堆 交换元素 达成排序目的
        for(int i=len-1;i>0;i--){//将大顶堆的最大元素放在最后面 调整剩余堆 形成新的大顶堆 继续交换 直至完成排序
            SortUtil.swap(arr,0,i);
            adjustHeapNode(arr,0,i-1);//调整剩下的堆
        }


    }

    private static void adjustHeapNode(int[] arr,int start,int end){
        int temp=arr[start];
        for(int k=start*2+1;k<=end;k=k*2+1){
            if(k<end&&arr[k]<arr[k+1]){//如果右子树存在并且左子树小于右子树
                k++;//k指向右子树
            }
            if(arr[k]>temp){
                arr[start]=arr[k];
                start=k;
            }else {
                break;
            }
        }
        arr[start]=temp;
    }


    private static void doSortTest(int[] arr){
        if(null==arr||arr.length<2)return;
        int len=arr.length;
        for(int i=(len)/2;i>=0;i--){
            adjustNodeTest(arr,i,len-1);
        }
        //sort
        for(int i=len-1;i>=0;i--){
            SortUtil.swap(arr,0,i);
            adjustNodeTest(arr,0,i-1);
        }
    }
    private static void adjustNodeTest(int[] arr,int start,int end){
        int temp=arr[start];
        for(int i=start*2+1;i<=end;i=i*2+1){
            if(i<end&&arr[i]<arr[i+1]){//如果右子树存在并且左子树小于右子树
                i++;//k指向右子树
            }
            if(arr[i]>temp){
                arr[start]=arr[i];
                start=i;
            }else{
                break;
            }

        }
        arr[start]=temp;//交换最大值和开始值temp 此时的start 是比temp大大数据下标 不是传进来大那个了
    }


}
