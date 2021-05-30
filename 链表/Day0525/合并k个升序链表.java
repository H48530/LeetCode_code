package Day0525;

/**
 * 用合并两个升序链表的基础，然后计算
 */
public class 合并k个升序链表 {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode node = new ListNode();
        node = node.next;
        for (int i = 0; i < lists.length; i++) {
            node = margeList(node, lists[i]);
        }
        return node;
    }

    private ListNode margeList(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(-1);
        ListNode cur = node;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                cur.next = l1;
                l1 = l1.next;
                cur = cur.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
                cur = cur.next;
            }
        }
        if (l1 == null) {
            cur.next = l2;
        }
        if (l2 == null) {
            cur.next = l1;
        }
        return node.next;
    }
}
