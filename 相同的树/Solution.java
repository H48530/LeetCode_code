package 相同的树;

import leetcode.TreeNode;

/**
 * p100,    https://leetcode-cn.com/problems/same-tree/
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val!=q.val){
            return false;
        }

        if (!isSameTree(p.left, q.left)) {
            return false;
        }
        return isSameTree(p.right, q.right);
    }
}