package Day0517;

/**
 *
 */
class Solution {
    public int jumpFloorII(int target) {
        if (target <= 0) {
            return 0;
        }
        return (int) Math.pow(2, (target - 1));
    }
}

public class 变态跳台阶 {
}
