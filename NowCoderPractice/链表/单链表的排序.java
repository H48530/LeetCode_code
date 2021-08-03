import java.util.*;

/*https://www.nowcoder.com/practice/f23604257af94d939848729b1a5cda08
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 * }
 */

public class Solution {
    /**
     * 
     * @param head ListNode类 the head node
     * @return ListNode类
     */
    public ListNode sortInList (ListNode head) {
        // write code here
        if(head == null){
            return head;
        }
        List<Integer> list = new ArrayList<>();
        ListNode cur = head;
        while(cur != null){
            list.add(cur.val);
            cur = cur.next;
        }
        list.sort((a,b)->{return a - b;});
        cur = head;
        int i = 0;
        while(cur != null){
            cur.val = list.get(i++);
            cur = cur.next;
        }
        return head;
    }
}