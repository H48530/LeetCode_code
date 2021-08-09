/**https://leetcode-cn.com/problems/symmetric-tree/
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
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return isSame(root.left,root.right);
    }
    private boolean isSame(TreeNode s , TreeNode t){
        if(s == null && t == null){
            return true;
        }
        if(s == null || t == null){
            return false;
        }

        return s.val == t.val && isSame(s.left , t.right) && isSame(s.right, t.left);
    }
}