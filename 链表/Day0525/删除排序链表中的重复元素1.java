package Day0525;

/**
 *
 */
public class 删除排序链表中的重复元素1 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode node = new ListNode(-1);
        node.next = head;
        ListNode cur = head;
        ListNode next = head.next;

        while (next != null) {
            if (next.val == cur.val) {
                cur.next = next.next;
                next = next.next;
            } else {
                cur = next;
                next = next.next;
            }
        }
        return node.next;
    }
}
