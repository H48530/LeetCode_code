package m6.Day0615;

/**
 *
 */
public class 将所有数字用字符替换 {
    public String replaceDigits(String s) {
        char[] arr = s.toCharArray();
        char a = ' ';
        for (int i = 1; i < arr.length; i += 2) {
            a = arr[i - 1];
            int c = arr[i] - '0';

            arr[i] = (char) (a + c);
        }
        StringBuilder sb = new StringBuilder();

        for (char c : arr) {
            sb.append(c);
        }
        return sb.toString();
    }
}
