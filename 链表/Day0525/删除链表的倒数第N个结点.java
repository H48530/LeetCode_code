package Day0525;

/**
 * p19 https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/
 */
public class 删除链表的倒数第N个结点 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode f = head;
        ListNode s = head;
        ListNode p = head;

        for (int i = 0; i < n - 1; i++) {
            f = f.next;
        }
        if (f.next == null) {
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
