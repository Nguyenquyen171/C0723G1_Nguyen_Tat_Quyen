package case_study.repository.impl;

import case_study.model.facility.AbstractFacility;
import case_study.model.person.Customer;
import case_study.model.person.Employee;
import case_study.repository.IEmployeeRepository;
import case_study.utils.FileUtils;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private final String PATH_FILE = "/Users/nguyentatquyen/Documents/GitHub/C0723G1_Nguyen_Tat_Quyen/C0732G1_NguyenQuyen_Modul2/src/case_study/data/data_employee";
    private final String COMMA = ",";

    @Override
    public void editEmployee(String id, Employee employee) {
        List<Employee> employeeList = display();
        for (Employee employee1 : employeeList) {
            if (employee1.getId().contains(id)) {
                employee1.setId(employee.getId());
                employee1.setName(employee.getName());
                employee1.setAge(employee.getAge());
                employee1.setGender(employee.getGender());
                employee1.setIdentificationCard(employee.getIdentificationCard());
                employee1.setPhoneNumber(employee.getPhoneNumber());
                employee1.setEmail(employee.getEmail());
                employee1.setGuestType(employee.getGuestType());
                employee1.setAddress(employee.getAddress());

                return;
            }
        }
        FileUtils.writeFile(PATH_FILE, convertToString(employeeList));
    }

    @Override
    public List<Employee> searchEmployee(String name) {
        List<Employee> employeeList = display();
        List<Employee> searchEmployee = new ArrayList<>();
        for (Employee employee : employeeList) {
            if (employee.getName().contains(name)) {
                searchEmployee.add(employee);
            }
        }
        return searchEmployee;
    }

    @Override
    public void add(Employee employee) {
        List<Employee> employeeList = display();
        employeeList.add(employee);
        FileUtils.writeFile(PATH_FILE, this.convertToString(employeeList));
    }

    @Override
    public List<Employee> display() {
        return convert(FileUtils.readFile(PATH_FILE));
    }

    @Override
    public List<Employee> convert(List<String> strings) {
        List<Employee> employeeList = new ArrayList<>();
        for (String string : strings) {
            String[] data = string.split(COMMA);
            employeeList.add(new Employee(
                    data[0],
                    data[1],
                    data[2],
                    data[3],
                    data[4],
                    data[5],
                    data[6],
                    data[7],
                    data[8],
                    data[9]
            ));
        }

        return employeeList;
    }

    @Override
    public List<String> convertToString(List<Employee> employeeList) {
        List<String> strings = new ArrayList<>();
        for (Employee employee : employeeList) {
            strings.add(
                    employee.getId() + COMMA +
                            employee.getName() + COMMA +
                            employee.getGender() + COMMA +
                            employee.getAmount() + COMMA +
                            employee.getIdentificationCard() + COMMA +
                            employee.getPhoneNumber() + COMMA +
                            employee.getEmail() + COMMA +
                            employee.getAddress() + COMMA +
                            employee.getGuestType() + COMMA
            );
        }
        return strings;
    }

    @Override
    public void remove(String id) {
        List<Employee> employeeList = display();
        for (Employee employee : employeeList) {
            if (employee.getId().equals(id)) {
                employeeList.remove(employee);
                return;
            }
        }
        FileUtils.writeFile(PATH_FILE, this.convertToString(employeeList));
    }


}
