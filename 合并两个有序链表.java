package leetcode_p21;

import leetcode_p203.ListNode;

/**
 * 21. 合并两个有序链表
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head1=l1;
        ListNode head2=l2;
        ListNode newHead=new ListNode(-1);
        ListNode cur=newHead;
        while (head1!=null&&head2!=null){
            if (head1.val<=head2.val){
                cur.next=head1;
                head1=head1.next;
                cur=cur.next;
            }else {
                cur.next=head2;
                head2=head2.next;
                cur=cur.next;
            }
        }
        if (head1==null){
            cur.next=head2;
        }else {
            cur.next=head1;
        }
        return newHead.next;
    }
    public ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        ListNode head1 = l1;
        ListNode head2 = l2;

        ListNode newHead = new ListNode(-1);
        ListNode last = newHead;
        while (head1 != null && head2 != null) {
            if (head1.val <= head2.val) {
                last.next = head1;
                head1 = head1.next;
                last = last.next;
            } else {
                last.next = head2;
                head2 = head2.next;
                last = last.next;
            }
        }
        if (head1 != null) {
            last.next = head1;
        } else {
            last.next = head2;
        }
        return newHead.next;
    }
}

public class 合并两个有序链表 {
}
