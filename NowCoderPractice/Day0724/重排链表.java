/**https://www.nowcoder.com/practice/3d281dc0b3704347846a110bf561ef6b
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
import java.util.*;
public class Solution {
    public void reorderList(ListNode head) {
        if(head == null){
            return;
                
        }
        ArrayList<ListNode> list = new ArrayList<>();
        ListNode cur = head;
        while(cur != null){
            list.add(cur);
            cur = cur.next;
        }
        int i = 0;
        int j = list.size()-1;
        while(i < j){
            list.get(i).next = list.get(j);
            i++;
            if(i == j){
                break;
            }
            list.get(j).next = list.get(i);
            j--;
            
        }
        list.get(i).next = null;
    }
}