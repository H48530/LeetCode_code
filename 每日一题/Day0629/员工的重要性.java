package Day0629;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 */
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};

public class 员工的重要性 {
    public int DFS(Map<Integer, Employee> info, int id) {

        Employee employee = info.get(id);
        int curSum = employee.importance;
        for (int curId : employee.subordinates) {
            curSum += DFS(info, curId);
        }
        return curSum;
    }

    public int getImportance(List<Employee> employees, int id) {
        if (employees.isEmpty()) {
            return 0;
        }
        Map<Integer, Employee> info = new HashMap<>();
        for (Employee e : employees) {
            info.put(e.id, e);
        }

        return DFS(info, id);
    }
}
