package leetcode_p203;

/**
 * 203. 移除链表元素
 * 给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。
 */

class Solution {
    public ListNode removeElements3(ListNode head, int val) {
        ListNode newHead = new ListNode(-1);
        newHead.next = head;
        ListNode prev = newHead;
        ListNode cur = head;
        while (cur != null) {
            if (cur.val == val) {
                prev.next = cur.next;
                cur = cur.next;
            } else {
                cur = cur.next;
                prev = prev.next;
            }
        }
        return newHead.next;
    }

    public ListNode removeElements2(ListNode head, int val) {
        //头插一个哨兵结点
        ListNode newHead = new ListNode(-1);
        newHead.next = head;
        ListNode prev = newHead;
        while (prev.next != null) {
            if (prev.next.val == val) {
                prev.next = prev.next.next;
            } else {
                prev = prev.next;
            }
        }
        return newHead.next;
    }

    public ListNode removeElements(ListNode head, int val) {
        //正常操作
        if (head == null) {
            return null;
        }
        ListNode prev = head;

        while (prev.next != null) {
            if (prev.next.val == val) {
                prev.next = prev.next.next;
            } else {
                prev = prev.next;
            }
        }
        if (head.val == val) {
            return head.next;
        } else {
            return head;
        }
    }
}

public class 移除链表中的元素 {
}
