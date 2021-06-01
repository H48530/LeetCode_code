package Day0528;

import Day0525.ListNode;

/**
 *
 */
public class 环形链表 {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode f = head;
        ListNode s = head;
        while (f != null) {
            f = f.next;
            if (f == null) {
                return false;
            }
            f = f.next;
            s = s.next;

            if (f == s) {
                return true;
            }
        }
        return false;
    }
}
