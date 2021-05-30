package Day0525;

/**
 *
 */
public class 两两交换链表中的结点 {
    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode node = new ListNode(-1);
        node.next = head;
        ListNode cur = head;
        ListNode pre = node;
        while (cur != null && cur.next != null) {
            ListNode first = cur;
            ListNode second = cur.next;
            ListNode third = cur.next.next;
            //交换
            pre.next = second;
            second.next = first;
            first.next = third;
            //cur后移两位，pre后移两位
            pre = first;
            cur = third;
        }
        return node.next;
    }
}

