package Day0529;

import Day0525.ListNode;

/**
 *
 */
public class 奇偶链表 {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode l1 = new ListNode(-1);
        ListNode c1 = l1;
        ListNode l2 = new ListNode(-1);
        ListNode c2 = l2;

        ListNode cur = head;
        while (cur != null) {
            c1.next = cur;
            cur = cur.next;
            c1 = c1.next;

            if (cur == null) {
                break;
            }
            c2.next = cur;
            cur = cur.next;
            c2 = c2.next;
        }
        c1.next = l2.next;
        c2.next = null;
        return l1.next;
    }
}
