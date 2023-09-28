package case_study.repository;

import case_study.model.facility.Facility;

import java.util.List;

public interface IEmployeeRepository extends IRepository<Facility> {
    @Override
    void add(Facility facility);

    @Override
    void remove(String id);

    @Override
    List<Facility> display();

    @Override
    List<Facility> convert(List<String> strings);

    @Override
    List<String> convertToString(List<Facility> e);
    void editEmployee(String id, case_study.model.person.Employee employee);
    List<case_study.model.person.Employee> searchEmployee(String name);
}
