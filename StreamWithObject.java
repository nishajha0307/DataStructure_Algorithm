package com.example.VaccinationService.DataStructure_Algorithm;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamWithObject {
    public static void main(String[] args) {
        // find out no of times names field has occurred in employee object
        Employee emp = new Employee(1,"nisha",89765553);
        Employee emp3 = new Employee(1,"nisha",12345);
        Employee emp1 = new Employee(2, "neha",345667);
        Employee emp2 = new Employee(3, "sneha",12345);
        List<Employee> employees = new ArrayList<>();
        employees.add(emp);
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        List<Employee> sorted = employees.stream().sorted((o1,o2)->o2.getSalary() - o1.getSalary()).limit(3).collect(Collectors.toList());
        System.out.println(sorted);

        Map<String,Long> fre =employees.stream().collect(Collectors.groupingBy(ob->ob.getName(),Collectors.counting()));
        System.out.println(fre);

        Map<String,Long> freqword =employees.stream().map(employee -> employee.getName()).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(freqword);
    }
}
