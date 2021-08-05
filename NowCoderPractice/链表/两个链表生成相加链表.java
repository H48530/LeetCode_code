import java.util.*;

/*https://www.nowcoder.com/practice/c56f6c70fb3f4849bc56e33ff2a50b6b
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 * }
 */

public class Solution {
    /**
     * 
     * @param head1 ListNode类 
     * @param head2 ListNode类 
     * @return ListNode类
     */
    public ListNode addInList (ListNode head1, ListNode head2) {
        // write code here
        head1 = resverse(head1);
        head2 = resverse(head2);
        
        int s = 0;
        ListNode newHead = new ListNode(-1);
        ListNode cur = newHead;
        while(head1 != null || head2 !=null || s != 0){
            int x = 0;
            int y = 0;
            if(head1 != null){
                x = head1.val;
                head1 = head1.next;
            }
            if(head2 != null){
                y = head2.val;
                head2 = head2.next;
            }
            int sum = x + y +s;
            s = sum / 10;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
        }
        return resverse(newHead.next);
    }
    public ListNode resverse(ListNode l1){
        if(l1 == null){
            return l1;
        }
        ListNode cur = l1;
        ListNode pre = null;
        while(cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}