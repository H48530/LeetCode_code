package Day0529;

import Day0525.ListNode;

/**
 *
 */
public class 对链表进行插入排序 {
    public ListNode insertionSortList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode node = new ListNode(-1, head);
        ListNode lastSorted = head;
        ListNode curr = head.next;

        while (curr != null) {
            if (lastSorted.val < curr.val) {
                lastSorted = lastSorted.next;
            } else {
                ListNode pre = node;
                while (pre.next.val <= curr.val) {
                    pre = pre.next;
                }
                lastSorted.next = curr.next;
                curr.next = pre.next;
                pre.next = curr;
            }
            curr = curr.next;
        }
        return node.next;
    }
}
