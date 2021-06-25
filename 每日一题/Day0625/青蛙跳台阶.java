package Day0625;

/**
 *
 */
public class 青蛙跳台阶 {

    public int jumpFloorII(int target) {
        if (target == 0) {
            return 0;
        }
//        return 1<<(target-1);
        int ret = 1;
        for (int i = 2; i <= target; i++) {
            ret *= 2;
        }
        return ret;
    }
}
