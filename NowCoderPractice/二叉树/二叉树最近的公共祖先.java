/**https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == q || root == p){
            return root;
        }
        boolean pindex = contains(root.left,p);
        boolean qindex = contains(root.left,q);

        if(pindex && !qindex){
            return root;
        }
        if(!pindex && qindex){
            return root;
        }

        if(pindex){
            return lowestCommonAncestor(root.left,p,q);
        }else{
            return lowestCommonAncestor(root.right,p,q);
        }

    }
    private boolean contains(TreeNode root,TreeNode node){
        if(root == null){
            return false;
        }
        if(root == node){
            return true;
        }
        if(contains(root.left,node)){
            return true;
        }
        return contains(root.right,node);
    }
}