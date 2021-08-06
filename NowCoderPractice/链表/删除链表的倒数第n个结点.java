import java.util.*;

/*https://www.nowcoder.com/practice/f95dcdafbde44b22a6d741baf71653f6
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 * }
 */

public class Solution {
    /**
     * 
     * @param head ListNode类 
     * @param n int整型 
     * @return ListNode类
     */
    public ListNode removeNthFromEnd (ListNode head, int n) {
        // write code here
        if(head == null){
            return head;
        }
        ListNode fast = head;
        ListNode slow = head;
        for(int i = 0; i <= n; i++){
            if(fast == null){
                return head.next;
            }
            fast = fast.next;
        }
        
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}