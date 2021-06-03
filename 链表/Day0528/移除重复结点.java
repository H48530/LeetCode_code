package Day0528;

import Day0525.ListNode;


import java.util.HashSet;
import java.util.Set;

/**
 *
 */
public class 移除重复结点 {
    public ListNode removeDuplicateNodes(ListNode head) {
        if (head == null) {
            return head;
        }
        Set<Integer> set = new HashSet<>();
        set.add(head.val);
        ListNode pre = head;
        // 枚举前驱节点
        while (pre.next != null) {
            // 当前待删除节点
            ListNode cur = pre.next;
            if (set.add(cur.val)) {
                pre = pre.next;
            } else {
                pre.next = cur.next;
            }
        }
        pre.next = null;
        return head;
    }
}




