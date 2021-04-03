package Day0403;

import java.util.*;

/**
 * 373. 查找和最小的K对数字    https://leetcode-cn.com/problems/find-k-pairs-with-smallest-sums/
 * 给定两个以升序排列的整形数组 nums1 和 nums2, 以及一个整数 k。
 * 定义一对值 (u,v)，其中第一个元素来自 nums1，第二个元素来自 nums2。
 * 找到和最小的 k 对数字 (u1,v1), (u2,v2) ... (uk,vk)。
 */

class Solution1 {
    static class com implements Comparator<ArrayList<Integer>> {

        @Override
        public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
            int x = o1.get(0) + o1.get(1);
            int y = o2.get(0) + o2.get(1);
            return x - y;
        }
    }

    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i : nums1) {
            for (int e : nums2) {
                List<Integer> row = new ArrayList<>();
                row.add(i);
                row.add(e);
                list.add(row);
            }
        }
        Comparator comparator = new com();
        Queue<List<Integer>> queue = new PriorityQueue<>(comparator);

        for (int i = 0; i < list.size(); i++) {
            queue.add(list.get(i));
        }
        list.clear();
        while (k > 0 && !queue.isEmpty()) {
            list.add(queue.remove());
            k--;
        }
        return list;
    }
}
public class 查找和最小的k对数字 {
}
