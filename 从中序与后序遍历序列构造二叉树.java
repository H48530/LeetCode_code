

import java.util.Arrays;

/**
 * p106 https://leetcode-cn.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/
 */
class Solution1 {
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

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (postorder.length == 0) {
            return null;
        }
        int rootVal = postorder[postorder.length - 1];
        TreeNode root = new TreeNode(rootVal);
        int size = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == rootVal) {
                size = i;
            }
        }

        int[] leftPostorder = Arrays.copyOfRange(postorder, 0, size);
        int[] leftInorder = Arrays.copyOfRange(inorder, 0, size);
        root.left = buildTree(leftInorder, leftPostorder);

        int[] rightPostorder = Arrays.copyOfRange(postorder, size, postorder.length - 1);
        int[] rightInorder = Arrays.copyOfRange(inorder, size + 1, inorder.length);
        root.right = buildTree(rightInorder, rightPostorder);

        return root;
    }
}

public class 从中序与后序遍历序列构造二叉树 {
}
