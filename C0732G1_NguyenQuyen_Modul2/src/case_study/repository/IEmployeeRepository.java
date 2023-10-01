package case_study.repository;

import case_study.model.facility.AbstractFacility;
import case_study.model.person.Employee;

import java.util.List;

public interface IEmployeeRepository extends IRepository<Employee> {

    void editEmployee(String id, case_study.model.person.Employee employee);
    List<case_study.model.person.Employee> searchEmployee(String name);
}
