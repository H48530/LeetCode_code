package Day0528;

import Day0525.ListNode;

/**
 *
 */
public class 删除链表中的结点 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
