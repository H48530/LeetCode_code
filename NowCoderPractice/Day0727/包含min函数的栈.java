import java.util.Stack;
//https://www.nowcoder.com/practice/4c776177d2c04c2494f2555c9fcc1e49
public class Solution {

    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();
    
    public void push(int node) {
        stack1.push(node);
        if(stack2.isEmpty()){
            stack2.push(node);
        } else {
            int a = stack2.peek();
            if(a < node){
                stack2.push(a);
            }else{
                stack2.push(node);
            }
        }
        
    }
    
    public void pop() {
        stack1.pop();
        stack2.pop();
    }
    
    public int top() {
        return stack1.peek();
    }
    
    public int min() {
        return stack2.peek();
    }
}