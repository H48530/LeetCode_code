import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * https://www.nowcoder.com/practice/ae25fb47d34144a08a0f8ff67e8e7fb5
     * @param nums int一维数组 
     * @return int二维数组
     */
    public int[][] foundMonotoneStack (int[] nums) {
        // write code here
        int len = nums.length;
        int[][] arr = new int[len][2];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0;i < len; i++){
            while(!stack.isEmpty() && nums[stack.peek()] > nums[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                arr[i][0] = -1;
            }else{
                arr[i][0] = stack.peek();
            }
            stack.push(i);
        }
        stack.clear();
        for(int i = len - 1; i >= 0; i--){
            while(!stack.isEmpty() && nums[stack.peek()] > nums[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                arr[i][1] = -1;
            }else{
                arr[i][1] = stack.peek();
            }
            stack.push(i);
        }
        return arr;
    }
}