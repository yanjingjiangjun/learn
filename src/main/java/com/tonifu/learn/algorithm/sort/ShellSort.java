package com.tonifu.learn.algorithm.sort;

/**
 * 希尔排序  是对插入排序对优化 将数组分组 插入排序 逐步缩小分组的变量step 直到step=1 所有子group 全部采用插入法排序
 *
 * 希尔排序是把记录按下标的一定增量分组，对每组使用直接插入排序算法排序；随着增量逐渐减少，每组包含的关键词越来越多，当增量减至1时，整个文件恰被分成一组，算法便终止。
 *
 * 简单插入排序很循规蹈矩，不管数组分布是怎么样的，依然一步一步的对元素进行比较，移动，插入，比如[5,4,3,2,1,0]这种倒序序列，数组末端的0要回到首位置很是费劲，
 * 比较和移动元素均需n-1次。而希尔排序在数组中采用跳跃式分组的策略，通过某个增量将数组元素划分为若干组，然后分组进行插入排序，随后逐步缩小增量，
 * 继续按组进行插入排序操作，直至增量为1。希尔排序通过这种策略使得整个数组在初始阶段达到从宏观上看基本有序，小的基本在前，大的基本在后。
 * 然后缩小增量，到增量为1时，其实多数情况下只需微调即可，不会涉及过多的数据移动。
 *
 * 我们来看下希尔排序的基本步骤，在此我们选择增量gap=length/2，缩小增量继续以gap = gap/2的方式，这种增量选择我们可以用一个序列来表示，
 * {n/2,(n/2)/2...1}，称为增量序列。希尔排序的增量序列的选择与证明是个数学难题，我们选择的这个增量序列是比较常用的，也是希尔建议的增量，
 * 称为希尔增量，但其实这个增量序列不是最优的。此处我们做示例使用希尔增量
 *
 * @Author fuj
 * @Date 2022-05-24 09:37
 * @PackageName:com.tonifu.learn.algorithm.sort
 * @ClassName: ShellSort
 * @Description: TODO
 * @Version 1.0
 */
public class ShellSort {
    /**
     * 希尔排序 针对有序序列在插入时采用移动元素法
     * @param arr
     * @return
     */
    public static int[] sort(int[] arr){
        if(null==arr||arr.length==0)return new int[0];
        if(arr.length==1)return arr;
        int len=arr.length;
        //增量step，并逐步缩小增量 子数组采用插入法排序
        for(int step=len/2;step>0;step=step/2){
            for(int i=step;i<len;i++){//step右边部分
                int j=i;//step左边部分
                int temp=arr[j];
                //移动法
                while (j-step>=0&&temp<arr[j-step]){
                    arr[j]=arr[j-step];//移动法
                    j-=step;
                }
                arr[j]=temp;

            }
        }
        return arr;
    }

    /**
     * 希尔排序 针对有序序列在插入时采用交换法
     * 元素互换大小位置，采用交换数组元素法
     * @param arr
     * @return
     */
    public static int[] sortSwap(int[] arr){
        if(null==arr||arr.length==0)return new int[0];
        if(arr.length==1)return arr;
        int len=arr.length;
        //增量step，并二分法逐步缩小增量
        for(int step=len/2;step>0;step=step/2){
            for(int i=step;i<len;i++){//step右边部分
                int j=i;//step左边部分
                int temp=arr[j];
                //交换法
                while (j-step>=0&&temp<arr[j-step]){
                    //arr[j]=arr[j-step];//移动法
                    SortUtil.swap(arr,j,j-step);//交换法
                    j-=step;
                }
            }
        }
        return arr;

    }

    public static int[] sortTest(int[] arr){
        if(null==arr)return new int[0];
        if(arr.length<2)return arr;
        int len=arr.length;
        for(int step=len/2;step>0;step/=2){
            for(int i=step;i<len;i++){
                int j=i;
                int temp=arr[j];
                while(j-step>=0&&temp<arr[j-step]){
                    SortUtil.swap(arr,j,j-step);
                    j-=step;
                }
            }
        }
        return arr;
    }

    public static void test2(int[] arr){
        if(null==arr)return;
        if(arr.length<2)return;
        int len=arr.length;
        for(int step=len/2;step>0;step/=2){
            for(int i=step;i<len;i++){
                int j=i;
                int temp=arr[j];
                while(j-step>=0&&temp<arr[j-step]){
                    arr[j]=arr[j-step];
                    j-=step;
                }
                arr[j]=temp;
            }
        }
    }

    public static void test3(int[] arr){
        if(null==arr||arr.length<2)return;
        int len=arr.length;
        for(int step=len/2;step>0;step=step/2){
            for(int i=step;i<len;i++){
                int j=i;
                int temp=arr[j];
                while(j-step>=0&&temp<arr[j-step]){
                    arr[j]=arr[j-step];
                    j-=step;
                }
                arr[j]=temp;
            }
        }
    }

    public static void sortTest4(int[] arr){
        if(null==arr||arr.length<2)return;
        int len=arr.length;
        for(int step=len/2;step>0;step/=2){
            for(int i=step;i<len;i++){
                int j=i;
                int temp=arr[j];
                for(;j-step>=0&&temp<arr[j-step];j-=step ){
                    arr[j]=arr[j-step];

                }
                arr[j]=temp;
            }
        }
    }
}
