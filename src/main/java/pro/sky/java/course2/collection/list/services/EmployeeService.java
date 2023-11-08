package pro.sky.java.course2.collection.list.services;

import pro.sky.java.course2.collection.list.Employee;

import java.util.List;

public interface EmployeeService {
    Employee add(String firstName, String lastName);
    Employee remove(String firstName, String lastName);
    Employee find(String firstName, String lastName);
    List<Employee> getAll();
}
