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
     *
     * @param pHead ListNode类
     * @param k int整型
     * @return ListNode类
     */
    public ListNode FindKthToTail (ListNode pHead, int k) {
        // write code here
         
        int count = 0;
        for (ListNode cur = pHead; cur != null; cur = cur.next) {
            count++;
        }
        if (count < k) {
            return null;
        } else if (count == k) {
            return pHead;
        }
        int n = count - k + 1;  // 正着数第 n 个结点      
        int step = n - 1; // count - k  // 向后跳 step 步     
        ListNode ans = pHead;
        for (int i = 0; i < step; i++) {
            ans = ans.next;
        }
        return ans;
    }
}