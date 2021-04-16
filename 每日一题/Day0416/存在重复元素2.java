package Day0416;

import java.util.Map;
import java.util.TreeMap;

/**
 * p219
 * https://leetcode-cn.com/problems/contains-duplicate-ii/
 */
public class 存在重复元素2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                Integer orDefault = map.getOrDefault(nums[i], i);
                if (i - orDefault <= k) {
                    return true;
                }else {
                    continue;
                }
            } else {
                map.put(nums[i], i);
            }
        }
        return false;
    }
}
