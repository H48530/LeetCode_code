import java.util.Stack;
//https://www.nowcoder.com/practice/54275ddae22f475981afa2244dd448c6
public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack2.push(node);
    }
    
    public int pop() {
        if(stack1.isEmpty()){
            
            while(!stack2.isEmpty()){
                int a = stack2.pop();
                stack1.push(a);
            }
        }
    return stack1.pop();
    }
}