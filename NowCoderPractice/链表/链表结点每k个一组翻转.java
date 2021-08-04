import java.util.*;

/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 * }
 */

public class Solution {
    /**
     * https://www.nowcoder.com/practice/b49c3dc907814e9bbfa8437c251b028e?
     * @param head ListNode类 
     * @param k int整型 
     * @return ListNode类
     */
    public ListNode reverseKGroup (ListNode head, int k) {
        // write code here
        ListNode newHead = new ListNode(-1);
        ListNode cur = newHead;
        Stack<ListNode> stack = new Stack<>();
        while(true){
            int count = 0;
            ListNode tmp = head;
            while(tmp != null && count < k){
                stack.push(tmp);
                tmp = tmp.next;
                count++;
            }
            if(count != k){
                cur.next = head;
                break;
            }
            
            while(!stack.isEmpty()){
                cur.next = stack.pop();
                cur = cur.next;
            }
            cur.next = tmp;
            head = tmp;
        }
        return newHead.next;
    }
}