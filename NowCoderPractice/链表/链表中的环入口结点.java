/*https://www.nowcoder.com/practice/253d2c59ec3e4bc68da16833f79a38e4
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if(pHead == null){
            return pHead;
        }
        ListNode fast = pHead;
        ListNode slow = pHead;
        while(fast != null){
            fast = fast.next;
            if(fast == null){
                return null;
            }
            fast = fast.next;
            slow = slow.next;
            
            if(fast == slow){
                break;
            }
        }
        if(fast == null){
            return null;
        }
        fast = pHead;
        while(fast != null){
            if(fast == slow){
                return fast;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return null;
    }
}