//https://www.nowcoder.com/practice/9f3231a991af4f55b95579b44b7a01ba

import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        if(array.length == 0){
            return 0;
        }
        int left = 0;
        int right = array.length - 1;
        int mid = 0;
        while(left < right){
            if(array[left] < array[right]) {
                return array[left];
            }
            mid = left + (right - left) / 2;
            if(array[right] < array[mid]){
                left = mid + 1;
            } else if(array[right] > array[mid]){
                right = mid;
            } else {
                right--;
            }
        }
        return array[left];
    }
}