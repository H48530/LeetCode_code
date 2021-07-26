/*https://www.nowcoder.com/practice/6ab1d9a29e88450685099d45c9e31e46
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1 == null || pHead2 == null){
            return null;
        }
        int count1 = 0;
        int count2 = 0;
        ListNode cur1 = pHead1;
        ListNode cur2 = pHead2;
        while(cur1 != null){
            count1++;
            cur1 = cur1.next;
        }
        while(cur2 != null){
            count2++;
            cur2 = cur2.next;
        }
        int k = Math.abs(count1-count2);
        cur1 = pHead1;
        cur2 = pHead2;
        if(count1 > count2){
            for(int i = 0;i < k;i++){
                cur1 = cur1.next;
            }
        }else{
            for(int i = 0;i < k;i++){
                cur2 = cur2.next;
            }
        }
        while(cur1 != null){
            if(cur1.equals(cur2)){
                return cur1;
            }else{
                cur1 = cur1.next;
                cur2 = cur2.next;
            }
        }
        return null;
    }
}