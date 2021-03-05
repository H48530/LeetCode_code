package day06;

/**
 * 917. 仅仅反转字母   https://leetcode-cn.com/problems/reverse-only-letters/
 * 给定一个字符串 S，返回 “反转后的” 字符串，其中不是字母的字符都保留在原地，而所有字母的位置发生反转。
 * 示例 1：
 * 输入："ab-cd"
 * 输出："dc-ba"
 * 示例 2：
 * 输入："a-bC-dEf-ghIj"
 * 输出："j-Ih-gfE-dCba"
 * 示例 3：
 * 输入："Test1ng-Leet=code-Q!"
 * 输出："Qedo1ct-eeLg=ntse-T!"
 */
class Solution1 {
    public String reverseOnlyLetters(String S) {
        char[] array = S.toCharArray();
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            if (!(array[left] >= 'A' && array[left] <= 'Z' || array[left] >= 'a' && array[left] <= 'z')) {
                left++;
                continue;
            }
            if (!(array[right] >= 'A' && array[right] <= 'Z' || array[right] >= 'a' && array[right] <= 'z')) {
                right--;
                continue;
            }
            char c = array[left];
            array[left] = array[right];
            array[right] = c;
            left++;
            right--;
        }
        return String.valueOf(array);
    }
}

public class 仅仅翻转字母 {
}
