import java.util.*;

/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 * }
 */

public class Solution {
    /**
     * https://www.nowcoder.com/practice/1dc1036be38f45f19000e48abe00b12f
     * @param head ListNode类 
     * @param x int整型 
     * @return ListNode类
     */
    public ListNode partition (ListNode head, int x) {
        // write code here
        if(head == null){
            return head;
        }
        ListNode l1 = new ListNode(-1);
        ListNode l2 = new ListNode(-1);
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        ListNode cur = head;
        
        while(cur != null){
            if(cur.val < x){
                cur1.next = cur;
                cur1 = cur1.next;
                cur = cur.next;
            }else{
                cur2.next = cur;
                cur2 = cur2.next;
                cur = cur.next;
            }
        }
        cur1.next = l2.next;
        cur2.next = null;
        return l1.next;
    }
}