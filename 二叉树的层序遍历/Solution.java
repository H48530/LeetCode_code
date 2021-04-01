package 二叉树的层序遍历;

import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * p102  https://leetcode-cn.com/problems/binary-tree-level-order-traversal/
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> level = new LinkedList<>();
        queue.add(root);
        level.add(0);
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            int le = level.remove();

            if (le >= list.size()) {
                List<Integer> row = new ArrayList<>();
                list.add(row);
            }
            list.get(le).add(node.val);
            if (node.left != null) {
                queue.add(node.left);
                level.add(le + 1);

            }
            if (node.right != null) {
                queue.add(node.right);
                level.add(le + 1);
            }
        }
        return list;
    }


//    public List<List<Integer>> levelOrder(TreeNode root) {
//        List<List<Integer>> list = new ArrayList<>();
//
//        if (root == null) {
//            return list;
//        }
//        Queue<TreeNode> queue = new LinkedList<>();
//        Queue<Integer> level = new LinkedList<>();
//        queue.add(root);
//        level.add(0);
//
//        while (!queue.isEmpty()) {
//            TreeNode node = queue.remove();
//            int le = level.remove();
//
//            if (le >= list.size()) {
//                List<Integer> row = new ArrayList<>();
//                list.add(row);
//            }
//            list.get(le).add(node.val);
//            if (node.left != null) {
//                queue.add(node.left);
//                level.add(le + 1);
//            }
//            if (node.right != null) {
//                queue.add(node.right);
//                level.add(le + 1);
//            }
//        }
//        return list;
//    }
}