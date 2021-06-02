package Day0528;

import Day0525.ListNode;

/**
 *
 */
public class 删除排序链表中的重复元素 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head==null){
            return null;
        }
        if (head.next==null){
            return head;
        }

        ListNode cur =head;
        ListNode next = head.next;
        while (next!=null){
            if (cur.val==next.val){
                cur.next = next.next;
                next = next.next;
            }else {
                cur = cur.next;
                next = next.next;
            }
        }
        return head;
    }
}
