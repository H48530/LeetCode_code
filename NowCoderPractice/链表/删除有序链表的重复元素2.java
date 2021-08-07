import java.util.*;

/*https://www.nowcoder.com/practice/71cef9f8b5564579bf7ed93fbe0b2024
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    /**
     * 
     * @param head ListNode类 
     * @return ListNode类
     */
    public ListNode deleteDuplicates (ListNode head) {
        // write code here
        ListNode newHead = new ListNode(-1);
        newHead.next = head;
        
        ListNode pre = newHead;
        ListNode cur = head;
        while(cur != null && cur.next != null){
            if(cur.val == cur.next.val){
                ListNode tmp = cur.next;
                while(tmp != null && tmp.val == cur.val){
                    tmp = tmp.next;
                }
                pre.next = tmp;
                cur = tmp;
            }else{
                pre = pre.next;
                cur = cur.next;
            }
        }
        return newHead.next;
    }
}