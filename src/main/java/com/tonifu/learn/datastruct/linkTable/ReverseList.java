package com.tonifu.learn.datastruct.linkTable;

import java.util.List;

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
        while(null!=head){
            ListNode node=head.next;
            head.next=pre;
            pre=head;
            head=node;

        }
        return pre;
    }
    public ListNode reverseList2(ListNode head){
        if(null==head)return null;
        ListNode pre=null;
        while(head!=null){
            ListNode node=head.next;
            head.next=pre;//将第一个节点断开并放在最后链表后
            pre=head;//pre指向新到链表节点
            head=node;//指针向后移动到下一个节点

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
