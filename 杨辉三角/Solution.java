package 杨辉三角;

import java.util.ArrayList;
import java.util.List;

/**
 * p 118    https://leetcode-cn.com/problems/pascals-triangle/
 */
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> row = new ArrayList<>();

        row.add(1);
        list.add(row);

        if (numRows == 1) {
            return list;
        }
        row = new ArrayList<>();
        row.add(1);
        row.add(1);
        list.add(row);
        if (numRows == 2) {
            return list;
        }

        for (int i = 3; i <= numRows; i++) {
            row = new ArrayList<>();
            row.add(1);
            for (int j = 2; j < i; j++) {
                List<Integer> prevRow = list.get(i - 2);
                int a = prevRow.get(j - 2);
                int b = prevRow.get(j - 1);
                row.add(a + b);
            }
            row.add(1);
            list.add(row);
        }
        return list;
    }
}