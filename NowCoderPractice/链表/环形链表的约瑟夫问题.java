import java.util.*;


public class Solution {
    /**https://www.nowcoder.com/practice/41c399fdb6004b31a6cbb047c641ed8a
     * 利用队列解决
     * @param n int整型 
     * @param m int整型 
     * @return int整型
     */
    public int ysf (int n, int m) {
        // write code here
        List<Integer> list = new LinkedList<>();
        for(int i = 1;i <= n; i++){
            list.add(i);
        }
        int count = 1;
        while(!(list.size()==1)){
            if(count == m){
                list.remove(0);
                count = 1;
            }else{
                int i = list.remove(0);
                list.add(i);
                count++;
            }
        }
        return list.remove(0);
    }
}