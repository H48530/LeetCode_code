package m6.Day0615;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 */
public class 用栈操作构建数组 {

    public List<String> buildArray(int[] target, int n) {
        List<Integer> listTarget = toList(target);
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n && !listTarget.isEmpty(); i++) {
            if (listTarget.contains(i)) {
                listTarget.remove(listTarget.indexOf(i));
                list.add("Push");
            } else {
                list.add("Push");
                list.add("Pop");
            }
        }
        return list;
    }

    private List<Integer> toList(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }
        return list;
    }
}
