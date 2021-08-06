import java.util.*;

/*https://www.nowcoder.com/practice/c087914fae584da886a0091e877f2c79?
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
        ListNode cur = head;
        while(cur != null && cur.next != null){
            if(cur.val == cur.next.val){
                ListNode tmp = cur.next;
                while(tmp != null && tmp.val == cur.val){
                    tmp = tmp.next;
                }
                cur.next = tmp;
                cur = tmp;
            }else{
                cur = cur.next;
            }
        }
        return head;
    }
}