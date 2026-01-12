package com.hackerpalm.hashmap.HighestPaidPerDepartmentPkg;

public class Employee {

    String empName;
    Double salary;
    String department;

     Employee(String y, Double z, String dept){
        super();
        this.empName = y;
        this.salary = z;
        this.department=dept;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
