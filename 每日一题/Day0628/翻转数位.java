package Day0628;

/**
 *
 */
public class 翻转数位 {
    public int reverseBits(int num) {
        String s = Integer.toBinaryString(num);
        String[] split = s.split("0");
        int[] arr = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            arr[i] = split[i].length();
        }
        int max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int ret = arr[i] + arr[i + 1];

            if (ret > max) {
                max = ret;
            }
        }
        return max + 1;
    }
}
