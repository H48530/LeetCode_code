package day0304;

/**
 * 7. 整数反转
 * 给你一个 32 位的有符号整数 x ，返回 x 中每位上的数字反转后的结果。
 * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 * 示例 1：
 * 输入：x = 123
 * 输出：321
 * 示例 2：
 * 输入：x = -123
 * 输出：-321
 * 示例 3：
 * 输入：x = 120
 * 输出：21
 * 示例 4：
 * 输入：x = 0
 * 输出：0
 */
class Solution1 {
    public int reverse(int x) {
        String s = Integer.toString(x);
        String str = s;
        int flag = 1;
        if (x < 0) {
            flag = -1;
            str = s.substring(1);
        }
        try {
            return Integer.valueOf((new StringBuilder(str)).reverse().toString()) * flag;
        }catch (Exception e){
            return 0;
        }
    }
}


public class 整数反转 {
}
