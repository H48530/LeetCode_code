package Day0525;

/**
 *
 */
public class 旋转链表 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        ListNode cur = head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }

        ListNode c1 = head;
        ListNode c2 = head;
        for (int i = 0; i < (k % count); i++) {
            c1 = c1.next;
        }
        while (c1.next != null) {
            c1 = c1.next;
            c2 = c2.next;
        }
        c1.next = head;
        head = c2.next;
        c2.next = null;
        return head;
    }
}
