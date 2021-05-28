package Day0525;

/**
 *
 */
public class 反转链表2 {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode node = new ListNode(-1);
        node.next = head;
        ListNode pre = node;
        for (int i = 0; i < left - 1; i++) {
            pre = pre.next;
        }
        ListNode cur = pre.next;
        ListNode next;
        for (int i = 0; i < right - left; i++) {
            next = cur.next;
            cur.next = next.next;
            next.next = cur;
            pre.next = next;
        }
        return node.next;
    }
}
