package 平衡二叉树;

import leetcode.TreeNode;

/**
 * p110     https://leetcode-cn.com/problems/balanced-binary-tree/
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        //求绝对值
        int diff = Math.abs(left - right);
        if (diff > 1) {
            return false;
        }
        if (!isBalanced(root.left)) {
            return false;
        }
        return isBalanced(root.right);

    }

    private int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        return Integer.max(left, right) + 1;
    }
}