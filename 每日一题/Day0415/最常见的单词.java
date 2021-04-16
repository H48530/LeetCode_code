package Day0415;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * p819
 * https://leetcode-cn.com/problems/most-common-word/
 */
public class 最常见的单词 {
    public String mostCommonWord(String paragraph, String[] banned) {
        char[] array = paragraph.toLowerCase().toCharArray();

        StringBuilder sb = new StringBuilder();
        for (char c : array) {
            if (c >= 'a' && c <= 'z' || c == ' ') {
                sb.append(c);
            }
        }
        String s = sb.toString();
        String[] split = s.split(" ");
        Map<String, Integer> map = new TreeMap<>();
        for (String s1 : split) {
            int count = map.getOrDefault(s1, 0);
            map.put(s1, count + 1);
        }
        for (String s2 : banned) {
            map.remove(s2);
        }
        Set<Map.Entry<String, Integer>> entries = map.entrySet();

        int max = 0;
        String ret = "";
        for (Map.Entry<String, Integer> entry : entries) {
            int a = entry.getValue();
            String b = entry.getKey();
            if (max < a) {
                max = a;
                ret = b;
            }
        }
        return ret;
    }

}


