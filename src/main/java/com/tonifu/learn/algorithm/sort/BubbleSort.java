package com.tonifu.learn.algorithm.sort;

/**
 * 冒泡排序
 * 循环数组，将为排序列中最大的数字 放在后面的已排序的队列中
 * 2,1,4,6,3->2,1,4,3,6->2,1,3,4,6->1,2,3,4,6
 * @Author fuj
 * @Date 2022-05-23 10:42
 * @PackageName:com.tonifu.learn.algorithm.sort
 * @ClassName: BubbleSort
 * @Description: TODO
 * @Version 1.0
 */
public class BubbleSort {
    public static void test(int[] arr){
        for(int i=arr.length-1;i>=0;i--){
            boolean swap=false;
            for(int j=0;j<i;j++){
               /* if(arr[j]>arr[j+1]){//小到大正序排列
                    swap=true;
                    SortUtil.swap(arr,j,j+1);
                }*/
                if(arr[j]<arr[j+1]){//大到小倒序排列
                    swap=true;
                    SortUtil.swap(arr,j,j+1);
                }
            }
            if(!swap)break;
        }
    }
    public static int[] sort(int[] arr){
        if(null==arr||arr.length==0)return new int[0];
        if(arr.length==1)return arr;
        int len=arr.length;

        for(int i=len-1;i>=0;i--){
            boolean swap=false;
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    SortUtil.swap(arr,j,j+1);
                    swap=true;
                }
            }
            if(!swap)break;
        }
        return arr;
    }
    public static int[] sortNormal(int[] arr){
        if(null==arr||arr.length==0)return new int[0];
        if(arr.length==1)return arr;
        int len=arr.length;
        //len-1 是最后一个位置的索引
        //取小于 是为了方便取值比较arr[j+1]
        for(int i=0;i<len-1;i++){
            for(int j=0;j<len-1-i;j++){
                if(arr[j]>arr[j+1]){
                    SortUtil.swap(arr,j,j+1);
                }
            }
        }
        return arr;
    }
    public static int[] sortBetter(int[] arr){
        if(null==arr||arr.length==0)return new int[0];
        if(arr.length==1)return arr;
        int len=arr.length;
        //len-1 是最后一个位置的索引
        //取小于 是为了方便取值比较arr[j+1]

        for(int i=0;i<len-1;i++){
            boolean swap=false;
            for(int j=0;j<len-1-i;j++){
                if(arr[j]>arr[j+1]){
                    SortUtil.swap(arr,j,j+1);
                    swap=true;
                }

            }
            if(!swap)break;
        }
        return arr;
    }

    public static int[] sortBetter2(int[] arr){
        if(null==arr||arr.length==0)return new int[0];
        if(arr.length==1)return arr;
        int len=arr.length;
        //len-1 是最后一个位置的索引
        //取小于 是为了方便取值比较arr[j+1]
        int sortable=len-1;//可以遍历的长度边界
        for(int i=0;i<len-1;i++){
            boolean swap=false;
            for(int j=0;j<sortable;j++){
                if(arr[j]>arr[j+1]){
                    SortUtil.swap(arr,j,j+1);
                    swap=true;
                }

            }
            sortable=sortable-i;//可排序范围一步步缩小
            if(!swap)break;
        }
        return arr;
    }

    public static int[] sortMoreBetter(int[] arr){
        if(null==arr||arr.length==0)return new int[0];
        if(arr.length==1)return arr;
        int len=arr.length;
        //len-1 是最后一个位置的索引
        //取小于 是为了方便取值比较arr[j+1]
        int sortable=len-1;//可以遍历的长度边界
        int lastSwapIndex=0;
        for(int i=0;i<len-1;i++){
            boolean swap=false;
            for(int j=0;j<sortable;j++){
                if(arr[j]>arr[j+1]){
                    SortUtil.swap(arr,j,j+1);
                    swap=true;
                    lastSwapIndex=j;
                }

            }
            sortable=lastSwapIndex;//可排序范围一步步缩小
            if(!swap)break;
        }
        return arr;
    }

    public static int[] sortMoreBetter2(int[] arr){
        if(null==arr||arr.length==0)return new int[0];
        if(arr.length==1)return arr;
        int len=arr.length;
        //len-1 是最后一个位置的索引
        //取小于 是为了方便取值比较arr[j+1]
        int lastSwapIndex=0;
        for(int i=len-1;i>=0;i--){//为什么这样写？因为之前的轮询时后面倒序位置已经排序好了，不需要再去遍历了
            boolean swap=false;
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    SortUtil.swap(arr,j,j+1);
                    swap=true;
                    lastSwapIndex=j;
                }

            }
            i=lastSwapIndex+1;//可排序范围一步步缩小
            if(!swap)break;
        }
        return arr;
    }

    public static void test2(int[] arr){
        if(null==arr||arr.length<2)return;
        int len=arr.length;
        for(int i=len-1;i>=0;i--){
            boolean swap=false;
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    SortUtil.swap(arr,j,j+1);
                    swap=true;
                }
            }
            if(!swap)break;
        }
    }

    public static void test3(int[] arr){
        if(null==arr||arr.length<2)return;
        int len=arr.length;
        int lastSwapIndex=0;
        for(int i=len-1;i>=0;i--){
            boolean swap=false;

            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    SortUtil.swap(arr,j,j+1);
                    swap=true;
                    lastSwapIndex=j;
                }
            }
            i=lastSwapIndex+1;
            if(!swap)break;
        }
    }

    public static void test4(int[] arr){
        if(null==arr||arr.length<2)return;
        int len=arr.length;
        for(int i=len-1;i>=0;i--){
            boolean swap=false;
            for(int j=0;j<i;j++){
                if(arr[j]>=arr[j+1]){
                    SortUtil.swap(arr,j,j+1);
                    swap=true;
                }

            }
            if(!swap)break;
        }
    }
    public static void test5(int[] arr){
        if(null==arr||arr.length<2)return;
        int len=arr.length;
        for(int i=len-1;i>=0;i--){
            boolean swap=false;
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    SortUtil.swap(arr,j,j+1);
                    swap=true;
                }
            }
            if(!swap)break;
        }
    }
}
