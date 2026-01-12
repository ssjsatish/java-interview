package com.hackerpalm.hashmap.HighestPaidPerDepartmentPkg;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeTest {
    public static void main(String[] args) {


    Employee e1 = new Employee("Sanjiban", 85000.00, "ADM");
    Employee e2 = new Employee("Jayanta", 350000.00, "R&D");
    Employee e3 = new Employee("Tony", 500000.00, "R&D");
    Employee e4 = new Employee("Snowden", 120000.00, "ADM");
    Employee e5 = new Employee("Richard", 150000.00, "Physics");
    Employee e6 = new Employee("Robert", 175000.00, "Physics");

    List<Employee> employeeList = new ArrayList<>();
    employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);
        employeeList.add(e6);

        System.out.println(employeeList);
        System.out.println("----------------------------------");

        Map<String, Optional<Employee>> departmentMap = employeeList.stream()
                .collect(Collectors.groupingBy(e->e.getDepartment(),
                        Collectors.maxBy((emp1,emp2)->emp1.getSalary().compareTo(emp2.getSalary()))));

        for (Map.Entry<String,Optional<Employee>> x : departmentMap.entrySet()){
            System.out.println("Department : "+x.getKey());
            System.out.println("Employee with highest salary : "+x.getValue());
        }

    }
}
