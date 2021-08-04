import java.util.*;

/*https://www.nowcoder.com/practice/02bf49ea45cd486daa031614f9bd6fc3
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 *   public ListNode(int val) {
 *     this.val = val;
 *   }
 * }
 */

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param head ListNode类 
     * @return ListNode类
     */
    public ListNode oddEvenList (ListNode head) {
        // write code here
        ListNode l1 = new ListNode(-1);
        ListNode l2 = new ListNode(-1);
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        ListNode cur = head;
        
        while(cur != null){
            cur1.next = cur;
            cur1 = cur1.next;
            cur = cur.next;
            if(cur == null){
                break;
            }
            cur2.next = cur;
            cur2 = cur2.next;
            cur = cur.next;
        }
        cur1.next = l2.next;
        cur2.next = null;
        return l1.next;
    }
}