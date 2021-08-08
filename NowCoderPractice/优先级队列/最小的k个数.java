//https://www.nowcoder.com/practice/6a296eb82cf844ca8539b57c23e6e9bf
import java.util.ArrayList;
import java.util.*;
public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if(input == null){
            return list;
        }
        Queue<Integer> queue = new PriorityQueue<>();
        for(int c : input){
            queue.add(c);
        }
        while(!queue.isEmpty() && k > 0){
            list.add(queue.remove());
            k--;
        }
        return list;
    }
}