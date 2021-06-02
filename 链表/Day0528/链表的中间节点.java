package Day0528;

import Day0525.ListNode;

/**
 *
 */
public class 链表的中间节点 {
    public ListNode middleNode(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        int count = 0;
        ListNode cur = head;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        int k = count / 2 + 1;
        cur = head;
        for (int i = 0; i < k; i++) {
            cur = cur.next;
        }
        return cur;
    }

    //快慢指针
    public ListNode middleNode2(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null) {
            fast = fast.next;
            if (fast == null) {
                break;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
