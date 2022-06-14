package com.tonifu.learn.datastruct.linkTable;

/**
 * reverseList反转单链表
 * @Author fuj
 * @Date 2022-06-09 17:48
 * @PackageName:com.tonifu.learn.datastruct.linkTable
 * @ClassName: ReverseList
 * @Description: TODO
 * @Version 1.0
 */
public class ReverseList {
    public ListNode reverseList(ListNode head){
        if(null==head)return null;
        ListNode pre=null;
        while(null!=head.next){
            ListNode node=head.next;
            head.next=pre;
            pre=head;
            head=node;

        }
        return pre;
    }
    public static class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
