package Day0529;

import Day0525.ListNode;

/**
 *
 */
public class 两两交换链表中的结点 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode node = new ListNode(-1, head);
        ListNode pre = node;
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            ListNode f = cur;
            ListNode s = cur.next;
            ListNode t = cur.next.next;
            s.next = f;
            f.next = t;
            pre.next = s;

            pre = f;
            cur = f.next;
        }
        return node.next;
    }
}
