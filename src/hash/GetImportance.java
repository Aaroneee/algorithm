package hash;

import java.util.*;

public class GetImportance {
    static Map<Integer,Employee> map=new HashMap<>();
    public static void main(String[] args) {
        List<Employee> employees=new ArrayList<>();
        Employee employee1=new Employee();
        employee1.id=1;
        employee1.importance=5;
        List<Integer> subordinates1=new ArrayList<>();
        subordinates1.add(2);
        subordinates1.add(3);
        employee1.subordinates=subordinates1;

        Employee employee2=new Employee();
        employee2.id=2;
        employee2.importance=3;
        employee2.subordinates=new ArrayList<>();

        Employee employee3=new Employee();
        employee3.id=3;
        employee3.importance=3;
        employee3.subordinates=new ArrayList<>();

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        System.out.println("solution = " + solution(employees,1));
        
        
    }

    public static int solution(List<Employee> employees, int id){
        for (Employee employee:employees){
            map.put(employee.id,employee);
        }
        return getLevel(map.get(id).id);
    }

    public static int getLevel(int low){
        int level=0;
        Employee employee=map.get(low);
        level+=employee.importance;
        if (employee.subordinates.size() != 0){
            for (int children:employee.subordinates){
                level+=getLevel(children);
            }
        }
        return level;
    }
}

class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
