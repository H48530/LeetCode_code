package Day0528;

import Day0525.ListNode;

/**
 *
 */
public class 相交链表 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode cur1 = headA;
        ListNode cur2 = headB;
        int count1 = 0;
        int count2 = 0;
        while (cur1 != null) {
            count1++;
            cur1 = cur1.next;
        }
        while (cur2 != null) {
            count2++;
            cur2 = cur2.next;
        }
        cur1 = headA;
        cur2 = headB;
        int k = count1 - count2;
        if (k >= 0) {

            for (int i = 0; i < k; i++) {
                cur1 = cur1.next;
            }
        } else {

            for (int i = 0; i < -k; i++) {
                cur2 = cur2.next;
            }
        }

        while (cur1 != null) {
            if (cur1 == cur2) {
                return cur1;
            } else {
                cur1 = cur1.next;
                cur2 = cur2.next;
            }
        }
        return null;
    }
}
