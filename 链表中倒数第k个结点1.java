package nowcode;

import leetcode_p203.ListNode;

/**
 * 题目描述
 * 输入一个链表，输出该链表中倒数第k个结点。
 * 示例1
 * 输入
 * 复制
 * 1,{1,2,3,4,5}
 * 返回值
 * 复制
 * {5}
 */
class Solution {
    public ListNode FindKthToTail(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;

        for (int i = 0; i < k; i++) {
            if (fast==null){
                return null;
            }
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;

    }

    public ListNode FindKthToTail1(ListNode head, int k) {
        //先向后跳k步，
        ListNode fast = head;
        ListNode slow = head;

        for (int i = 0; i < k; i++) {
            if (fast == null) {
                return null;
            }
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
//    public ListNode FindKthToTail(ListNode head, int k) {
//        //求长度
//        ListNode cur = head;
//        int count = 0;
//        while (cur != null) {
//            count++;
//            cur=cur.next;
//        }
//        int n = count - k + 1;
//        if (n < 1) {
//            return null;
//        } else if (n == 1) {
//            return head;
//        } else {
//            cur = head;
//            for (int i = 0; i < n - 1; i++) {
//                cur = cur.next;
//            }
//            return cur;
//        }
//    }
}

public class 链表中倒数第k个结点 {
}
