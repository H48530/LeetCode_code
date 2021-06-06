package Day0529;

import Day0525.ListNode;

/**
 *
 */
public class 删除链表的倒数第n个结点 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        ListNode f = head;
        ListNode s = head;
        ListNode p = head;
        for (int i = 1; i < n; i++) {
            f = f.next;
        }
        if (f.next==null){
            return head.next;
        }
        while (f.next != null) {
            p = s;
            f = f.next;
            s = s.next;
        }
        p.next = s.next;
        return head;
    }
}


