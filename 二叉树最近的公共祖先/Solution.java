package 二叉树最近的公共祖先;

import leetcode.TreeNode;

/**
 * p236       https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == p || root == q) {
            return root;
        }
        boolean pindex = contains(root.left, p);
        boolean qindex = contains(root.left, q);
        if (pindex && !qindex) {
            //p在左子树，q不在
            return root;
        }
        if (qindex && !pindex) {
            //q在左子树，p不在
            return root;
        }
        if (pindex) {
            //p、q在左子树，
            return lowestCommonAncestor(root.left, p, q);
        } else {
            return lowestCommonAncestor(root.right, p, q);
        }
    }

    public boolean contains(TreeNode root, TreeNode node) {
        if (root == null) {
            return false;
        }
        if (root == node) {
            return true;
        }
        if (contains(root.left, node)) {
            return true;
        }
        return contains(root.right, node);
    }
}