/**https://www.nowcoder.com/practice/3d281dc0b3704347846a110bf561ef6b?
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public void reorderList(ListNode head) {
        if(head == null){
            return;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null){
            fast = fast.next;
            if(fast == null){
                break;
            }
            fast = fast.next;
            slow = slow.next;
        }
        ListNode l2 = resver(slow);
        ListNode l1 = head;
        ListNode newHead = new ListNode(-1);
        ListNode cur = newHead;
        while(l1 != null && l2 != null){
            cur.next = l1;
            cur = cur.next;
            l1 = l1.next;
            cur.next = l2;
            cur = cur.next;
            l2 = l2.next;
        }
        if(l1!=null){
            cur.next = l1;
            cur = cur.next;
            l1 = l1.next;
        }
        cur.next = null;
        head = newHead.next;
    }
    
    public ListNode resver(ListNode head){
        if(head == null)
        {
            return head;
        }
        ListNode pre = null;
        ListNode cur = head;
        while(cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}