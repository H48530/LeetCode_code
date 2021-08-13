/**https://leetcode-cn.com/problems/construct-string-from-binary-tree/
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public String tree2str(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        doTree2Str(root,sb);
        return sb.toString();
    }
    private void doTree2Str(TreeNode root,StringBuilder sb){
        if(root != null){
            sb.append(root.val);
            if(root.left != null || root.right != null){
                sb.append("(");
                doTree2Str(root.left,sb);
                sb.append(")");
                if(root.right != null){
                    sb.append("(");
                    doTree2Str(root.right,sb);
                    sb.append(")");
                }
            }
        }
    }
}