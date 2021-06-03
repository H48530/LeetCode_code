package Day0528;

import Day0525.ListNode;

/**
 *
 */
public class 移除链表元素 {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode node = new ListNode(-1, head);
        ListNode cur = head;
        ListNode pre = node;

        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
                cur = cur.next;
            }else {
                pre = pre.next;
                cur = cur.next;
            }
        }
        return node.next;
    }
}
