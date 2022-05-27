package com.tonifu.learn.algorithm.sort;

/**
 * 归并排序
 * @Author fuj
 * @Date 2022-05-25 09:27
 * @PackageName:com.tonifu.learn.algorithm.sort
 * @ClassName: MergeSort
 * @Description: TODO
 * @Version 1.0
 */
public class MergeSort {

    public static int[] sort(int[] arr){

        return doSort(arr);


    }
    private static int[] doSort(int[] arr){
        if(null==arr)return new int[0];
        if(arr.length<2)return arr;
        int len=arr.length;
        int[] temp=new int[len];//在排序前，先建好一个长度等于原数组长度的临时数组，避免递归中频繁开辟空间
        int left=0;
        int right=len-1;
        return realSort(arr,temp,left,right);
    }
    private static int[] realSort(int[] arr,int[] temp,int left,int right){
        if(left>=right)return temp;//递归结束条件
        int mid=left+(right-left)/2;
        realSort(arr,temp,left,mid);//左边归并排序，使得左子序列有序
        realSort(arr,temp,mid+1,right);//右边归并排序，使得右子序列有序
        return merge(arr,temp,left,mid,right);//将两个有序子数组合并操作
    }
    private static int[] merge(int[] arr,int[] temp,int left,int mid,int right){
        int l=left;
        int r=mid+1;
        int idx=0;
        while(l<=mid&&r<=right){//左边最远到mid 这个是关键 别忘了
            if(arr[l]<arr[r]){
                temp[idx++]=arr[l++];
            }else{
                temp[idx++]=arr[r++];
            }
        }
        //由于上面的while条件是l<=mid&&r<=right 所以l和r只有一个 会剩余 没有读取完
        //所以下面2个while只会执行一个
        while(l<=mid){//如果左边有剩余 将左边剩余元素填充进temp中
            temp[idx++]=arr[l++];
        }
        while(r<=right){////如果右边有剩余 将右边剩余元素填充进temp中
            temp[idx++]=arr[r++];
        }
        //将所有临时数组中元素拷贝到原数组中去
        idx=0;
        while(left<=right){
            arr[left++]=temp[idx++];
        }
        return temp;
    }
}
