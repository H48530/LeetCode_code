package leetcode_p876;

import leetcode_p203.ListNode;

/**
 * 876. 链表的中间结点
 * 给定一个头结点为 head 的非空单链表，返回链表的中间结点。
 * 如果有两个中间结点，则返回第二个中间结点。
 */

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null) {
            fast = fast.next;
            if (fast == null) {
                break;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode middleNode1(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null) {
            fast = fast.next;
            if (fast == null) {
                break;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
//    public ListNode middleNode1(ListNode head) {
//        ListNode cur = head;
//        int count = 0;
//        while (cur != null) {
//            count++;
//            cur = cur.next;
//        }
//        int n = count / 2 + 1;
//        cur = head;
//        for (int i = 0; i < n - 2; i++) {
//            cur = cur.next;
//        }
//        return cur;
//    }
}

public class 链表的中间节点 {
}
