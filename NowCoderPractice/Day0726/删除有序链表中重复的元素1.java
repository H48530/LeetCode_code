import java.util.*;

/*https://www.nowcoder.com/practice/c087914fae584da886a0091e877f2c79
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
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
        if(head == null){
            return head;
        }
        ListNode l1 = head;
        ListNode l2 = l1.next;
        while(l2 != null){
            while(l2 !=null && l1.val == l2.val){
                l2 = l2.next;
            }
            l1.next = l2;
            l1 = l2;
        }
        return head;
    }
}