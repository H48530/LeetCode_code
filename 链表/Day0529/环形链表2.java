package Day0529;

import Day0525.ListNode;

/**
 *
 */
public class 环形链表2 {
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode f = head;
        ListNode s = head;
        while (f != null) {
            f = f.next;
            if (f == null) {
                return null;
            }
            f = f.next;
            s = s.next;
            if (f == s) {
                s = head;
                while (f!=s){
                    f = f.next;
                    s = s.next;
                }
                return s;
            }
        }
        return null;
    }
}
