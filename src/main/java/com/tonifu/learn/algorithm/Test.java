package com.tonifu.learn.algorithm;

import com.tonifu.learn.algorithm.sort.BubbleSort;
import com.tonifu.learn.algorithm.sort.InsertSort;
import com.tonifu.learn.algorithm.sort.SelectedSort;
import com.tonifu.learn.algorithm.sort.SortUtil;

public class Test {
    public static void main(String[] args) {
        //KMP kmp=new KMP("ABABC");
        //int idx=kmp.search("ABABABABC");
        //System.out.println(idx);
        for(int i=0;i<10000;i++){
            test();
        }
    }
    private static void test(){
        int[] arr=CaseGenerate.lenRandomValueRandom(9,9);
        int[] tmp = CaseGenerate.copyArray(arr);
        //SelectedSort.sort(tmp);
        //tmp=new int[]{1,5, 6, 1, 1, 7};
        //tmp=new int[]{2 ,7 ,3, 2 };
        //InsertSort.sort(tmp);
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println("");
        System.out.println("=============");
        //SelectedSort.sort(tmp);
        InsertSort.sort(tmp);
        //BubbleSort.sort(tmp);
        //BubbleSort.sortNormal(tmp);
        //BubbleSort.sortMoreBetter(tmp);
        //BubbleSort.sortMoreBetter2(tmp);
        SortUtil.check(tmp,arr);
        for(int i:tmp){
            System.out.print(i+" ");
        }
        System.out.println("");
    }
    /*public static int[] generateCase(int maxLen,int maxValue){
        int len=(int)(Math.random()*maxLen);
        int[] ans=new int[len];
        for(int i=0;i<len;i++){
            ans[i]=(int)(Math.random()*maxValue);
        }
        for(int i:ans){
            System.out.println(i);
        }
        return ans;
    }*/
}
