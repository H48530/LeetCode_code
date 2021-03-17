package nowcode2;

import leetcode_p203.ListNode;

/**
 * 题目描述
 * 现有一链表的头指针 ListNode* pHead，给一定值x，编写一段代码将所有小于x的结点排在其余结点之前，
 * 且不能改变原来的数据顺序，返回重新排列后的链表的头指针。
 */
class Partition {
    public ListNode partition(ListNode pHead, int x) {
        ListNode l1=new ListNode(-1);
        ListNode l2=new ListNode(-1);
        ListNode last1=l1;
        ListNode last2=l2;
        while (pHead!=null){
            if (pHead.val<x){
                last1.next=pHead;
                last1=last1.next;
                pHead=pHead.next;
            }else {
                last2.next=pHead;
                last2=last2.next;
                pHead=pHead.next;
            }
        }
        last2.next=null;
        last1.next=l2.next;
        return l1.next;
    }
    public ListNode partition1(ListNode pHead, int x) {
        ListNode last1 = new ListNode(-1);
        ListNode head1 = last1;
        ListNode last2 = new ListNode(-1);
        ListNode head2 = last2;


        ListNode cur = pHead;
        while (cur != null) {
            if (cur.val < x) {
                last1.next = cur;
                last1 = cur;
                cur = cur.next;
            } else {
                last2.next = cur;
                last2 = cur;
                cur = cur.next;
            }
        }
        last1.next = head2.next;
        last2.next = null;
        return head1.next;
    }
}

public class 链表分割 {
}
