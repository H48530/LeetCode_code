import java.util.*;

/*https://www.nowcoder.com/practice/b58434e200a648c589ca2063f1faf58c
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 * }
 */

public class Solution {
    /**
     * 
     * @param head ListNode类 
     * @param m int整型 
     * @param n int整型 
     * @return ListNode类
     */
    public ListNode reverseBetween (ListNode head, int m, int n) {
        // write code here
        if(head == null || m == n){
            return head;
        }
        ListNode newHead = new ListNode(-1);
        newHead.next = head;
        List<ListNode> list = new ArrayList<>();
        ListNode cur = newHead;
        while(cur != null){
            list.add(cur);
            cur = cur.next;
        }
        list.add(null);
        list.get(m - 1).next = list.get(n);
        for(int i = n; i > m; i--){
            list.get(i).next = list.get(i-1);
        }
        list.get(m).next = list.get(n + 1);
        return newHead.next;
    }
}