import java.util.*;

/*
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
     * https://www.nowcoder.com/practice/886370fe658f41b498d40fb34ae76ff9
     * @param pHead ListNode类 
     * @param k int整型 
     * @return ListNode类
     */
    public ListNode FindKthToTail (ListNode pHead, int k) {
        // write code here
        if(pHead == null|| k == 0){
            return null;
        }
        ListNode fast = pHead;
        ListNode cur = pHead;
        for(int i = 0;i < k;i++){
            if(fast == null){
                return null;
            }
            fast = fast.next;
        }
        while(fast != null){
            fast = fast.next;
            cur = cur.next;
        }
        return cur;
    }
}