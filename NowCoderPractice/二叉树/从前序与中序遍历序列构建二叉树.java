/**https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0){
            return null;
        }
        int val = preorder[0];
        TreeNode root = new TreeNode(val);
        int size = 0;
        for(int i = 0; i < inorder.length; i++){
            if(inorder[i] == val){
                size = i;
            }
        }

        //构建左子树
        int[] leftpre = Arrays.copyOfRange(preorder,1,size+1);
        int[] leftin = Arrays.copyOfRange(inorder,0,size);
        root.left = buildTree(leftpre,leftin);
        //构建右子树
        int[] rightpre = Arrays.copyOfRange(preorder,size+1,preorder.length);
        int[] rightin = Arrays.copyOfRange(inorder,size+1,inorder.length);
        root.right = buildTree(rightpre,rightin);
        
        return root;
    }
}