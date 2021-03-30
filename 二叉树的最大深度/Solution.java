package 二叉树的最大深度;

import leetcode.TreeNode;

/**
 *  p.104    https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/submissions/
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Integer.max(left, right) + 1;
    }
}
