import java.util.*;

/**
 * p373
 * 给定两个以升序排列的整形数组 nums1 和 nums2, 以及一个整数 k。
 * 定义一对值 (u,v)，其中第一个元素来自 nums1，第二个元素来自
 * * 找到和最小的 k 对数字 (u1,v1), (u2,v2) ... (uk,vk)。
 * * 来源：力扣（LeetCode）nums2。
 * <p>
 * 链接：https://leetcode-cn.com/problems/find-k-pairs-with-smallest-sums
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */


class Solution {

    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> list = new ArrayList<>();

        List<List<Integer>> l = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                List<Integer> row = new ArrayList<>();
                row.add(nums1[i]);
                row.add(nums2[j]);
                l.add(row);
            }
        }
        Queue<List<Integer>> queue = new PriorityQueue();
        while (!l.isEmpty()){
            queue.add(l.remove(0));
        }
        while (k>0){
            List<Integer> remove = queue.remove();
            list.add(remove);
            k--;
        }
        return list;
    }
}

public class 查找和最小的k对数字 {
}
