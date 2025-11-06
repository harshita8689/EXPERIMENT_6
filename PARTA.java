package Experiment_6;

import java.util.*;

class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return String.format("Employee{name='%s', age=%d, salary=%.2f}", name, age, salary);
    }
}

public class PartA {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Ankesh", 28, 70000));
        employees.add(new Employee("Aaditya", 35, 50000));
        employees.add(new Employee("Ankit", 25, 80000));
        employees.add(new Employee("Yuvraj", 30, 60000));

        System.out.println("Original List:");
        employees.forEach(System.out::println);

        employees.sort((e1, e2) -> e1.getName().compareToIgnoreCase(e2.getName()));
        System.out.println("\nSorted by Name (Alphabetically):");
        employees.forEach(System.out::println);

        employees.sort((e1, e2) -> Integer.compare(e1.getAge(), e2.getAge()));
        System.out.println("\nSorted by Age (Ascending):");
        employees.forEach(System.out::println);

        employees.sort((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()));
        System.out.println("\nSorted by Salary (Descending):");
        employees.forEach(System.out::println);
    }
}
