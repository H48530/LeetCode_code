package Day0528;

import Day0525.ListNode;

/**
 *
 */
public class 二进制链表转整数 {
    public int getDecimalValue(ListNode head) {
        if (head == null) {
            return -1;
        }

        ListNode cur = head;
        StringBuilder sb = new StringBuilder();
        while (cur != null) {
            sb.append(cur.val);
            cur = cur.next;
        }
        return Integer.parseInt(sb.toString(), 2);
    }
}
