package nowcode3;

import leetcode_p203.ListNode;

/**
 * 题目描述
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 * 输入
 * {1,2,3,3,4,4,5}
 * 返回值
 * {1,2,5}
 */
class Solution {
    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null) {
            return null;
        }
        ListNode newHead = new ListNode(-1);
        newHead.next = pHead;
        ListNode prev = newHead;
        ListNode cur = pHead;
        ListNode next = cur.next;

        while (next != null) {
            if (cur.val != next.val) {
                prev = prev.next;
                cur = cur.next;
                next = next.next;
            } else {
                while (next != null && cur.val == next.val) {
                    next = next.next;
                }
                prev.next = next;
                cur = next;
                if (next != null) {
                    next = next.next;
                }
            }
        }
        return newHead.next;


    }

    public ListNode deleteDuplication1(ListNode pHead) {
        if (pHead == null) {
            return null;
        }
        ListNode newHead = new ListNode(-1);
        newHead.next = pHead;

        ListNode prev = newHead;
        ListNode cur = pHead;
        ListNode next = cur.next;

        while (next != null) {

            if (cur.val != next.val) {
                prev = prev.next;
                cur = cur.next;
                next = next.next;
            } else {
                while (next != null && cur.val == next.val) {
                    next = next.next;
                }
                prev.next = next;
                cur = next;

                if (next != null) {
                    next = next.next;
                }
            }
        }
        return newHead.next;
    }
}

public class 删除链表中的重复结点 {
}
