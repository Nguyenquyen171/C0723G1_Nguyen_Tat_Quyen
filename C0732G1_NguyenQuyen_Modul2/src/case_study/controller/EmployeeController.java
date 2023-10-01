package case_study.controller;

import case_study.model.person.Employee;
import case_study.service.impl.EmployeeService;

import java.util.List;

public class EmployeeController {
    EmployeeService employeeService= new EmployeeService();

    public void add(Employee employee) {
        employeeService.add(employee);
    }

    public void remove(String id) {
        employeeService.remove(id);
    }

    public List<Employee> display() {
        return employeeService.display();
    }

    public void editEmployee(String id, Employee employee) {
        employeeService.editEmployee(id, employee);
    }

    public void searchEmployee(String nameEmployee) {
        employeeService.searchEmployee(nameEmployee);
    }
}
