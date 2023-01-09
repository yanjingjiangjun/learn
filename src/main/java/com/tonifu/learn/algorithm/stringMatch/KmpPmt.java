package com.tonifu.learn.algorithm.stringMatch;

import java.util.Arrays;

/**
 *
 * 核心核心核心记住：
 * KMP的PMT模式匹配法 就是计算模式串的下一次比较开始位置是从第一个字符开始还是其他字符，getNext匹配表就是计算开始位置的。
 * 匹配的时候已经有一部分匹配到了 就是模式串有一部分和目标字符串匹配到了 那么这一部分就是和模式串一部分相同的，所以我们可以利用这一思想，
 * 去利用模式串自身去计算部分匹配表（getNext方法原理）
 * 取出匹配的这一部分，查找部门匹配表（getNext获取的next数组的值）
 *
 *
 * https://juejin.cn/post/6856374004421722125#heading-5
 * https://juejin.cn/post/6854573206896918542
 * https://www.zhihu.com/question/21923021/answer/281346746 海纳的回答
 * https://juejin.cn/post/6854573206896918542 最简单易懂的讲解
 * KMP基于部分匹配表PMT(Partial Match Table)
 * PMT更容易理解
 * PMT就是部分匹配表 其代表的意义就是模式匹配串patten中前面部分和后面 部分具有相同的部分，称之为相同前后缀；如aabbaa中
 * 前后缀不包含起始位置
 * 前缀(最后一个字符前面的所有子串) ：    a,aa,aab,aabb,aabba    a,aa,aab,aabb,aabba
 * 后缀(第一个字符后面的所有子串)   ：    abbaa,bbaa,baa,aa,a    a,aa,baa,bbaa,abbaa
 * 前缀和后缀具有相同字符的最大长度字符是aa，长度是2
 * 相同前后缀可以提供匹配失败后下次匹配时，patten字符串的起始位置j=最大相同前后缀字符长度
 * 等同于patten向右偏移:已经匹配的长度-最大相同前后缀长度
 * 它的前2位前缀和后2位后缀是相同的，所以我们推知主字符串i之前的2位和模式字符串开头的2位是相同的aa，那这部分就不用再比较了
 *
 * 所以aabbaa的next部分匹配表填表如下
 * 0,1,0,0,1,2
 * 加上-1偏移方便处理或者哨兵""空格去处理 最后一个字符不加入
 * -1,0,1,0,0,1
 *
 * aabbacaabbaa
 * aabbaa
 * 匹配成功部分的模式串[0到j-1] aabba
 * 前缀：a,aa,aab,aabb
 * 后缀：a,ba,bba,abba
 * 相同前后缀 a 长度为1
 * 它的前1位前缀和后1位后缀是相同的，所以我们推知主字符串i之前的1位和模式字符串开头的1位是相同的a，那这部分就不用再比较了
 * aabbacaabbaa
 *     aabbaa
 *
 * aabbacaabbaa
 *      aabbaa
 *
 * aabbacaabbaa
 *       aabbaa
 *
 *其实就是找到匹配字符串的开始下标位置，
 * 匹配在i处失败了 就是i位置前面的都成功了 i之前的共同前后缀，匹配字符串的公共前缀放在相同后缀位置 就避免了重复匹配，
 *
 *
 * @Author fuj
 * @Date 2022-05-30 15:09
 * @PackageName:com.tonifu.learn.algorithm.stringMatch
 * @ClassName: KmpPmt
 * @Description: TODO
 * @Version 1.0
 */
public class KmpPmt {
    private int[] next;
    public int match(String text,String patten){
        if(null==patten||null==text)return -1;
        if(patten.length()==0)return 0;
        int len=patten.length();
        int ans=-1;
        getNext(patten);
        ans=doMatch(text,patten);
        return ans;
    }
    private int doMatch(String text,String patten){
        if(null==patten||null==text)return -1;
        if(patten.length()==0)return 0;
        int len=text.length();
        int i=0;

        int j=0;
        int ans=-1;
        while(i<len&&j<patten.length()){
            if(j==-1||patten.charAt(j)==text.charAt(i)){
                j++;
                i++;
            }else{
                j=next[j];
            }
        }
        if(j==patten.length())ans= i-j;
        System.out.println(ans);
        return  ans;
    }

    /**
     * "ABABC"
     * @param patten
     */
    private void getNext(String patten){
        if(null==patten||patten.length()==0)return;
        int len=patten.length();
        int i=0;
        int j=-1;
        if(null==next)next=new int[len+1];
        next[0]=-1;
        while(i<len){
            if(j==-1||patten.charAt(i)==patten.charAt(j)){
                j++;
                i++;
                next[i]=j;//下标为i的字符的共同前后缀长度
                //System.out.print(i+","+j);
            }else{
                j=next[j];
                //System.out.print("j="+j);
            }
            //System.out.println();
        }

    }


    private void getNext2(String patten){
        if(null==patten||patten.length()==0){
            if(null==next)next=new int[0];
            return;
        }
        int len=patten.length();
        int i=0;
        int j=-1;
        if(null==next)next=new int[len+1];
        next[0]=-1;
        while(i<len){
            if(j==-1||patten.charAt(i)==patten.charAt(j)){
                i++;
                j++;
                next[i]=j;
            }else{
                j=next[j];
            }
        }
    }

    public int match2(String text,String patten){
        if(null==text||null==patten)return -1;
        if(patten.length()==0)return 0;
        int len=text.length();
        int i=0;
        int j=0;
        getNext2(patten);
        System.out.println(Arrays.toString(next));
        while(i<len&&j<patten.length()){
            if(j==-1||text.charAt(i)==patten.charAt(j)){
                i++;
                j++;
            }else{
                j=next[j];
               // System.out.println(j);
            }

        }
        System.out.println(j);
        if(j==patten.length()){
            System.out.println(i-j);
            return i-j;
        }
        return -1;
    }

    public void getNext3(String patten){
        if(null==patten||patten.length()==0){
            return ;
        }
        int len=patten.length();
        int i=0;
        int j=-1;
        if(null==next)next=new int[len+1];
        while(i<len){
            if(j==-1||patten.charAt(i)==patten.charAt(j)){
                i++;
                j++;
                next[i]=j;
            }else{
                j=next[j];
            }
        }
    }

    public int match3(String text,String patten){
        if(null==text||null==patten)return -1;
        if(patten.length()==0)return 0;
        int len=text.length();
        int i=0;
        int j=0;
        getNext3(patten);
        while(i<len){
            if(j==-1||text.charAt(i)==patten.charAt(j)){
                i++;
                j++;
            }else{
                j=next[j];
            }
        }
        if(j==len){
            return i-j;
        }
        return -1;
    }

}
