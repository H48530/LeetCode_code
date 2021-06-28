package Day0628;

/**
 *
 */
public class 判断子序列 {
    public static boolean isSubsequence(String s, String t) {
        char[] array = s.toCharArray();
        int index = 0;
        for (char c : array) {
            int i = t.indexOf(c, index);
            if (i < 0) {
                return false;
            } else {
                index = i + 1;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "twn";
        String t = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxtxxxxxxxxxxxxxxxxxxxxwxxxxxxxxxxxxxxxxxxxxxxxxxn";
        boolean subsequence = isSubsequence(s, t);
        System.out.println(subsequence);

    }
}
