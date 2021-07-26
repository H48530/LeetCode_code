import java.util.*;

/*https://www.nowcoder.com/practice/1dc1036be38f45f19000e48abe00b12f
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 * }
 */

public class Solution {
    /**
     * 
     * @param head ListNode类 
     * @param x int整型 
     * @return ListNode类
     */
    public ListNode partition (ListNode head, int x) {
        // write code here
        ListNode l1 = new ListNode(-1);
        ListNode l2 = new ListNode(-1);
        ListNode cur = head;
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        while(cur != null){
            if(cur.val < x){
                cur1.next = cur;
                cur = cur.next;
                cur1 = cur1.next;
            }else{
                cur2.next = cur;
                cur = cur.next;
                cur2 = cur2.next;
            }
        }
        cur2.next = null;
        cur1.next = l2.next;
        return l1.next;
    }
}