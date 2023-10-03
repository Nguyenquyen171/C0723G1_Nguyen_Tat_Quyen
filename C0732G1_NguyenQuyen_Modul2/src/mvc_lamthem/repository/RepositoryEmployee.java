package mvc_lamthem.repository;

import case_study.repository.IEmployeeRepository;
import mvc_lamthem.model.Employee;

import java.util.List;

public class RepositoryEmployee implements IRepositoryEmployee {
    private final String COMMA=",";
    @Override
    public void editEmployee(String id, Employee employee) {

    }

    @Override
    public List<Employee> display() {
        return null;
    }

    @Override
    public void add(Employee employee) {

    }

    @Override
    public void remove(String idEmployee) {

    }

    @Override
    public List<Employee> searchEmployee(String nameEmployee) {
        return null;
    }
}