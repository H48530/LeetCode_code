package Day0628;

import javax.jnlp.ClipboardService;
import java.util.ArrayList;
import java.util.List;

/**
 * 利用递推公式
 * 前一个数乘以（n-m+1)/m
 */
public class 杨辉三角2 {
    public List<Integer> getRow(int rowIndex) {

        List<Integer> list = new ArrayList<>();
        list.add(1);

        for (int i = 1; i <= rowIndex; i++) {
            list.add((list.get(i - 1) * (rowIndex - i + 1) / i));
        }
        return list;
    }
}




