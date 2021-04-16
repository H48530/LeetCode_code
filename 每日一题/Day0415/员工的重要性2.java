package Day0415;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * p690
 *https://leetcode-cn.com/problems/employee-importance/submissions/
 */
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};

public class 员工的重要性2 {
    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> map = new HashMap<>();
        for (Employee employee : employees) {
            map.put(employee.id, employee);
        }
        Stack<Integer> stack = new Stack<>();
        stack.addAll(map.get(id).subordinates);
        int sum = 0;
        sum += map.get(id).importance;
        while (!stack.isEmpty()) {
            int pop = stack.pop();
            stack.addAll(map.get(pop).subordinates);
            sum += map.get(pop).importance;
        }
        return sum;
    }



}
