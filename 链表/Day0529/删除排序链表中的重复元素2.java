package Day0529;

import Day0525.ListNode;

/**
 *
 */
public class 删除排序链表中的重复元素2 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode node = new ListNode(-1, head);

        ListNode cur = node;
        while (cur.next != null && cur.next.next != null) {
            if (cur.next.val == cur.next.next.val) {
                int x = cur.next.val;
                while (cur.next != null && cur.next.val == x) {
                    cur.next = cur.next.next;
                }
            } else {
                cur = cur.next;
            }
        }
        return node.next;
    }
}
