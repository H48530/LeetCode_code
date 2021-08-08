//https://www.nowcoder.com/practice/e016ad9b7f0b45048c58a9f27ba618bf
import java.util.*;

public class Solution {
    public int findKth(int[] a, int n, int K) {
        // write code here
        
        Queue<Integer> queue = new PriorityQueue<>();
        for(int i = 0; i < K; i++){
            queue.add(a[i]);
        }
        for(int i = K; i < n; i++){
            if(a[i] > queue.peek()){
                queue.remove();
                queue.add(a[i]);
            }
        }
        return queue.peek();
    }
}