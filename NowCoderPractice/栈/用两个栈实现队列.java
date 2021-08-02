import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack2.push(node);
    }
    
    public int pop() {
        if(stack1.isEmpty()){
            while(!stack2.isEmpty()){
                stack1.add(stack2.pop());
            }
        }
        
        return stack1.pop();
    }
}