package com.tonifu.learn.algorithm.sort;

/**
 * 插入排序
 * 相邻的数据对比 如果右边比左边数据小，则将小的放在前面已经排好的数据列中 循环比对，放到比其大的数据前面或者小的数据后面
 * 2,1,0,3->1,2,0,3->[1,0,2,3],[0,1,2,3]->end
 */
public class InsertSort {
    public static int[] sort(int[] arr){
        if(null==arr||arr.length==0)return new int[0];
        if(arr.length==1)return arr;
        int len=arr.length;
        for(int i=1;i<len;i++){
            if(arr[i]<arr[i-1]){
                for(int j=i;j>0;j--){//循环查找i之前的数据 发现比arr[i]大的就交换
                    if(arr[j]<arr[j-1]){
                        SortUtil.swap(arr,j,j-1);
                    }
                }
            }
        }
        return arr;
    }

    public static int[] sortBetter(int[] arr){
        if(null==arr||arr.length==0)return new int[0];
        if(arr.length==1)return arr;
        int len=arr.length;
        for(int i=1;i<len;i++){
            int temp=arr[i];
            int j=i-1;
            for(;j>=0&&temp<arr[j];j--){
                arr[j+1]=arr[j];//将前面的后移直到找到比目标数字小的或者相等的数据位置，同时后移一位给目标值腾个位置
            }
            arr[j+1]=temp;

        }
        return arr;
    }

    public static void testInsertSort(int[] arr){
        if(null==arr||arr.length<2)return;
        for(int i=1;i<arr.length;i++){
            int j=i-1;
            int temp=arr[i];
            for(;j>=0&&arr[j]>temp;j--){
                arr[j+1]=arr[j];
            }
            arr[j+1]=temp;
        }
    }
    public static void test2(int[] arr){
        if(null==arr||arr.length<2)return;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                for(int j=i-1;j>=0;j--){
                    if(arr[j]>arr[j+1]){
                        SortUtil.swap(arr,j,j+1);
                    }
                }
            }
        }
    }

    public static void test3(int[] arr){
        if(null==arr||arr.length<2)return;
        int len=arr.length;
        for(int i=1;i<len;i++){
            if(arr[i]<arr[i-1]){
                for(int j=i-1;j>=0;j--){
                    if(arr[j+1]<arr[j]){
                        SortUtil.swap(arr,j+1,j);
                    }
                }
            }
        }
    }

    public static void test4(int[] arr){
        if(null==arr||arr.length<2)return;
        for(int i=1;i<arr.length;i++){
            for(int j=i-1;j>=0&&arr[j+1]<arr[j];j--){
                SortUtil.swap(arr,j,j+1);
            }
        }
    }
    public static void test5(int[] arr){
        if(null==arr||arr.length<2)return;
        int idx=0;
        for(int i=1;i<arr.length;i++){
            idx=i;
            for(int j=i-1;j>=0&&arr[j]>arr[j+1];j--){
                SortUtil.swap(arr,j,j+1);
            }
            //if(i!=idx)SortUtil.swap(arr,i,idx);
        }
    }

    public static void test6(int[] arr){
        if(null==arr||arr.length<2)return;
        for(int i=1;i<arr.length;i++){
            for (int j=i-1;j>=0&&arr[j]>arr[j+1];j--){
                SortUtil.swap(arr,j,j+1);
            }
        }
    }
    public static void test7(int[] arr){
        if(null==arr||arr.length<2)return;
        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>temp){
                SortUtil.swap(arr,j,j+1);
                j--;
            }
        }
    }
}
