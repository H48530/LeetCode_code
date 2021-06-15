package m6.Day0615;

/**
 *
 */
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1] && arr[i + 1] > arr[i + 2]) {
                return i + 1;
            }
        }
        return -1;
    }
}

public class 山脉数组 {
}
