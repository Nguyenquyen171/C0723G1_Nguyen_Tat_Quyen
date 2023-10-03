package mvc_lamthem.service;

import mvc_lamthem.model.Employee;

import java.util.List;

public interface IServiceEmployee {
    List<Employee> display();
    void add (Employee employee);
    void remove(String id);
     void  editEmployee(String id, Employee employee);
     List <Employee> searchEmployee(String nameEmployee );
}
