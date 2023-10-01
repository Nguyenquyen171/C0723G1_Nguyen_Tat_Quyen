package case_study.service.impl;

import case_study.model.facility.AbstractFacility;
import case_study.model.person.Employee;
import case_study.repository.impl.EmployeeRepository;
import case_study.service.IEmployeeService;

import java.util.List;

public class EmployeeService implements IEmployeeService {
//    private  final String PATH_FILE= "/Users/nguyentatquyen/Documents/GitHub/C0723G1_Nguyen_Tat_Quyen/C0732G1_NguyenQuyen_Modul2/src/case_study/data/data_employee";
//    private final String COMMA=",";
    private final EmployeeRepository employeeRepository=new EmployeeRepository();

    @Override
    public void add(Employee employee) {
        employeeRepository.add(employee);

    }

    @Override
    public void remove(String id) {
        employeeRepository.remove(id);
    }

    @Override
    public List<Employee> display() {

        return null;
    }

    @Override
    public void editEmployee(String id, Employee employee) {

    }

    @Override
    public List<Employee> searchEmployee(String nameEmployee) {
        return null;
    }
}
