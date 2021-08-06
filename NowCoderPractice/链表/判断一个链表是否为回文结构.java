import java.util.*;

/*https://www.nowcoder.com/practice/3fed228444e740c8be66232ce8b87c2f
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 * }
 */

public class Solution {
    /**
     * 
     * @param head ListNode类 the head
     * @return bool布尔型
     */
    public boolean isPail (ListNode head) {
        // write code here
        if(head == null){
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        ListNode cur = head;
        while(cur != null){
            stack.add(cur.val);
            cur = cur.next;
        }
        cur = head;
        while(!stack.isEmpty()){
            if(cur.val == stack.pop()){
                cur = cur.next;
            }else{
                return false;
            }
        }
        return true;
    }
}