package day11;

/**
 * 125. 验证回文串    https://leetcode-cn.com/problems/valid-palindrome/
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 * 示例 1:
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 示例 2:
 * 输入: "race a car"
 * 输出: false
 */

//将字符串剔除其余的，然后判断和逆置后的字符串的结果
class Solution {
    public boolean isPalindrome(String s) {
        if (s == null) {
            return true;
        }
        s = s.toLowerCase();
        int l = s.length();
        StringBuilder str = new StringBuilder(l);
        for (char c : s.toCharArray()) {
            if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z')) {
                str.append(c);
            }
        }
        return str.toString().equals(str.reverse().toString());
    }
}

public class 验证回文串 {
}
