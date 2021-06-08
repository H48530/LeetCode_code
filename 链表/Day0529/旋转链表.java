package Day0529;

import Day0525.ListNode;

/**
 *
 */
public class 旋转链表 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        int count = 0;
        ListNode cur = head;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        ListNode f = head;
        cur = head;

        for (int i = 0; i < (k % count); i++) {
            f = f.next;
        }
        while (f.next != null) {
            f = f.next;
            cur = cur.next;
        }
        f.next = head;
        head = cur.next;
        cur.next = null;

        return head;
    }
}
