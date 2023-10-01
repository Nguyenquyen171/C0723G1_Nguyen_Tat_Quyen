package case_study.service;

import case_study.model.facility.AbstractFacility;
import case_study.model.person.Employee;

import java.util.List;

public interface IEmployeeService extends  IService<Employee> {
  void  editEmployee(String id, Employee employee);
  List<Employee> searchEmployee(String nameEmployee);


}
