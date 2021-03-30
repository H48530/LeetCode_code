package 对称二叉树;

import leetcode.TreeNode;

/**
 *
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSame(root.left, root.right);
    }

    public boolean isSame(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        if (!isSame(p.left, q.right)) {
            return false;
        }
        return isSame(p.right, q.left);
    }
}
