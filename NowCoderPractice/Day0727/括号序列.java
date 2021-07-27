import java.util.*;


public class Solution {
    /**https://www.nowcoder.com/practice/37548e94a270412c8b9fb85643c8ccc2
     * 
     * @param s string字符串 
     * @return bool布尔型
     */
    public boolean isValid (String s) {
        // write code here
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char c : arr){
            if(c == '{'){
                stack.push('}');
                continue;
            }else if(c == '['){
                stack.push(']');
                continue;
            }else if(c == '('){
                stack.push(')');
                continue;
            }
            if(stack.isEmpty() || c != stack.pop()){
                return false;
            }
        }
        return stack.isEmpty();
    }
}