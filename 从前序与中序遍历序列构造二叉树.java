package leetcode;

import java.util.Arrays;

/**
 * p105 https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
 * 前序遍历和中序遍历构建二叉书
 */

class Solution {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) {
            return null;
        }
        int rootVal = preorder[0];
        TreeNode root = new TreeNode(rootVal);

        int size = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == rootVal) {
                size = i;
            }
        }

        //构建左子树
        int[] leftpreorder = Arrays.copyOfRange(preorder, 1, size + 1);
        int[] leftinorder = Arrays.copyOfRange(inorder, 0, size);
        root.left = buildTree(leftpreorder, leftinorder);

        //构建右子树
        int[] rightpreorder = Arrays.copyOfRange(preorder, size + 1, preorder.length);
        int[] rightinorder = Arrays.copyOfRange(inorder, size + 1, inorder.length);
        root.right = buildTree(rightpreorder, rightinorder);
        return root;
    }
}
class 从前序与中序遍历序列构造二叉树 {
}