package Day0625;

import java.util.Set;

/**
 *
 */
public class 字符串分割 {
    public boolean wordBreak(String s, Set<String> dict) {
        if (s.length() == 0) {
            return false;
        }
        boolean[] canBreak = new boolean[s.length() + 1];
        canBreak[0] = true;
        for (int i = 1; i <= s.length(); i++) {

            if (dict.contains(s.substring(0, i))) {
                canBreak[i] = true;
                continue;
            }

            for (int j = i - 1; j > 0; j--) {
                if (canBreak[j] && dict.contains(s.substring(j, i))) {
                    canBreak[i] = true;
                    break;
                }
            }
        }
        return canBreak[s.length()];
    }
}
