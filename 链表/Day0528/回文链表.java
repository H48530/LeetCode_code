package Day0528;

import Day0525.ListNode;

/**
 *
 */
public class 回文链表 {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode cur = head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        int k = 0;
        if (count % 2 == 0) {
            k = count / 2;
        } else {
            k = count / 2 + 1;
        }
        cur = head;
        for (int i = 0; i <= k; i++) {
            cur = cur.next;
        }
        ListNode cur2 = reverseList(cur);
        cur = head;

        while (cur2 != null) {
            if (cur.val != cur2.val) {
                return false;
            } else {
                cur = cur.next;
                cur2 = cur2.next;
            }
        }
        return true;
    }

    private ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }


}
