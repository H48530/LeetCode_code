package Day0529;

import Day0525.ListNode;

/**
 *
 */
public class 分隔链表 {
    public ListNode partition(ListNode head, int x) {

        if (head == null) {
            return null;
        }
        ListNode c1 = new ListNode(-1);
        ListNode l1 = c1;
        ListNode c2 = new ListNode(-1);
        ListNode l2 = c2;
        ListNode cur = head;
        while (cur != null) {
            if (cur.val < x) {
                l1.next = cur;
                cur = cur.next;
                l1 = l1.next;
            } else {
                l2.next = cur;
                cur = cur.next;
                l2 = l2.next;
            }
        }
        l1.next = c2.next;
        l2.next = null;

        return c1.next;
    }
}

