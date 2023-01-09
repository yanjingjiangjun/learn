package com.tonifu.learn.algorithm;

import com.tonifu.learn.algorithm.sort.*;
import com.tonifu.learn.algorithm.stringMatch.KmpPmt;
import com.tonifu.learn.algorithm.util.AESUtil;

import java.util.regex.Pattern;

public class Test {
    private static final Pattern KH_PATTERN = Pattern.compile("[\n(){}【】「」（）\\[\\]]");
    public static void main(String[] args) {
        /*try {
            String str=AESUtil.decrypt("JbyLsXNEdoW2f6Z7cTHOXrlrXz/u7nFlbdD/rX4iib0z8NC1s4QGcGgF4iE5kQDaw0Y7BqoGYLJ4" +
                    "T8EKBzMFnQinJOY6Qv0JxFFYxeDp+piXqBdUIENDToaNSXMhe1GPU6xytPPrpGM8XUAlG7G0cz/s" +
                    "TexsxGTOKUwJnG1ccNSC0diQiC6Wn7pU2KGL2MTO5iq14Py8tzsxJImxB0pr9pU6EazVW3YXhDGY" +
                    "vwk18vxeUvG2dqUN0qrpC/MhgnXy/WyprnUmSOFiF5jrY3IGLjh170PKYhnu0BCKojaus7zpfmAH" +
                    "fr9z0WfG2KxqfHlfCZbKoni5YI25I6MSRsqv43ho//A23YQgA1/BwAPEpAQw2Zd+Rll0RkfW1oTt" +
                    "9qvw6kx2gZIVNw71fxfEGAnNSVszunPPr5+AJtIE32mOs+lntXq/nnffPCQ7M1A0Z95HxlKLJint" +
                    "J6Lff41TJwY3xizQFixmVhrjmSy2wA4R7Rbqo4pAJ8WQh58fd3Sq7Q3hC6DLSARUCrv7eSpvJZ2z" +
                    "d75ZRepIftVfBQlC37wqbKsbYCMZEYQqfLj430ARgU7lZqeZzkLzpF+NRTlNtv7TSQ==","zjzs88921360zjzs");
            System.out.println(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
*/
        //KMP kmp=new KMP("ABABC");
        //int idx=kmp.search("ABABABABC");
        //System.out.println(idx);
        //KmpPmt kmpPmt=new KmpPmt();
        //kmpPmt.match2("abc","c");
        for(int i=0;i<10000;i++){
            test();
        }
        /*String str="浙江省杭州市西湖区华星路97-2号靠近新东方素质成长中心·编程·机器人·美术(文三路星光城校区)";
        char[] chars=str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            String s = String.valueOf(chars[i]);
            boolean f=isKh(s);
            System.out.println(f);
        }*/
    }
    private static boolean isKh(String s) {
        return KH_PATTERN.matcher(s).matches();
    }
    private static void test(){
        int[] arr=CaseGenerate.lenRandomValueRandom(9,9);
        int[] tmp = CaseGenerate.copyArray(arr);
        //SelectedSort.sort(tmp);
        //tmp=new int[]{1,5, 6, 1, 1, 7};
        //tmp=new int[]{2 ,7 ,3, 2 };
        //tmp=new int[]{8 ,6, 4, 4, 0};
        //tmp=new int[]{2,1, 1, 7, 2 };
        //InsertSort.sort(tmp);
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println("");
        System.out.println("=============");
        //SelectedSort.test(tmp);
        //InsertSort.sort(tmp);
        //InsertSort.sortBetter(tmp);
        //InsertSort.test6(tmp);
        //BubbleSort.sort(tmp);
        //BubbleSort.test4(tmp);
        //BubbleSort.sortNormal(tmp);
        //BubbleSort.sortMoreBetter(tmp);
        //BubbleSort.sortMoreBetter2(tmp);
        //ShellSort.test6(tmp);
        //ShellSort.test(tmp);
        //PracticeMergeSort.sort2(tmp);
        //QuickSort.sortTest2(tmp);
        HeapSort.sort(tmp);
        SortUtil.check(tmp,arr);
        for(int i:tmp){
            System.out.print(i+" ");
        }
        System.out.println("");
        //TestP tp=new TestS();
        //TestS ts=(TestS)tp;
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
    public static void rotate(int[][] matrix) {
        int length = matrix.length;
        //先上下交换
        for (int i = 0; i < length / 2; i++) {
            int temp[] = matrix[i];
            matrix[i] = matrix[length - i - 1];
            matrix[length - i - 1] = temp;
        }
        //在按照对角线交换
        for (int i = 0; i < length; ++i) {
            for (int j = i + 1; j < length; ++j) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
