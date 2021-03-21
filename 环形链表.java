package Day0321;

import java.util.List;

/**
 * 141. 环形链表     https://leetcode-cn.com/problems/linked-list-cycle/description/
 * 给定一个链表，判断链表中是否有环。
 * 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。注意：pos 不作为参数进行传递，仅仅是为了标识链表的实际情况。
 * 如果链表中存在环，则返回 true 。 否则，返回 false 。
 */


class Solution {
    public boolean hasCycle(ListNode head) {
        if (head==null){
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;

        while (fast.next != null) {
            fast = fast.next;
            if (fast.next == null) {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
            if (fast.equals(slow)) {
                return true;
            }
        }
        return false;
    }
}

public class 环形链表 {
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}