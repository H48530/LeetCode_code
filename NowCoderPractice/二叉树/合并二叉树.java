import java.util.*;

/*https://www.nowcoder.com/practice/7298353c24cc42e3bd5f0e0bd3d1d759
 * public class TreeNode {
 *   int val = 0;
 *   TreeNode left = null;
 *   TreeNode right = null;
 * }
 */

public class Solution {
    /**
     * 
     * @param t1 TreeNode类 
     * @param t2 TreeNode类 
     * @return TreeNode类
     */
    public TreeNode mergeTrees (TreeNode t1, TreeNode t2) {
        // write code here
        if(t1 == null && t2 == null){
            return null;
        }else if(t1 == null && t2 != null){
            return t2;
        }else if(t1 != null && t2 == null){
            return t1;
        }else{
            t1.val += t2.val;
            t1.left = mergeTrees(t1.left,t2.left);
            t1.right = mergeTrees(t1.right,t2.right);
            return t1;
        }
    }
}