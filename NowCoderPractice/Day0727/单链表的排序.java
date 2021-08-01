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
        ListNode cur = head;
        List<Integer> list = new ArrayList<>();
        while(cur != null)
        {
            list.add(cur.val);
            cur = cur.next;
        }
		//Lambda表达式
        list.sort((a,b)->{return a-b;});
        cur = head;
        while(cur != null)
        {
            cur.val = list.remove(0);
            cur = cur.next;
        }
        return head;
    }
}