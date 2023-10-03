package mvc_lamthem.repository;

import mvc_lamthem.model.Employee;

import java.util.List;

public interface IRepositoryEmployee {
    void editEmployee(String id, Employee employee);
    List<Employee> display();
    void add(Employee employee);
    void remove(String idEmployee);
    List<Employee> searchEmployee(String nameEmployee);
}
