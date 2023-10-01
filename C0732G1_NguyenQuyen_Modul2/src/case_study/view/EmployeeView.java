package case_study.view;

import case_study.controller.EmployeeController;
import case_study.model.person.Employee;
import case_study.utils.RegexFile;

import java.util.List;
import java.util.Scanner;

public class EmployeeView {
    private final Scanner scanner = new Scanner(System.in);
    private final EmployeeController employeeController = new EmployeeController();
    private final RegexFile regexFile = new RegexFile();


    public void employeeManagement() {
        System.out.println("Employee Management");
        System.out.println("1: Display list employees");
        System.out.println("2:Add new employee");
        System.out.println("3: Edit employee");
        System.out.println("4: Delete employee");
        System.out.println("5:Search by name employee");
        System.out.println("6:Return main menu");
    }

    public void employeeManager() {
        int employeeChoice = -1;
        do {
            try {
                this.employeeManagement();
                employeeChoice = Integer.parseInt(scanner.nextLine());
                switch (employeeChoice) {
                    case 1:
                        List<Employee> employeeList = employeeController.display();
                        for (Employee employee : employeeList) {
                            System.out.println(employee);
                        }
                        break;
                    case 2:
                        this.employeeController.add(inputNewEmployee());
                        break;
                    case 3:
                        this.employeeController.editEmployee(this.inputIdEmployee(),inputNewEmployee());
                        break;
                    case 4:
                        this.employeeController.remove(inputIdEmployee());
                        break;
                    case 5:
                        this.employeeController.searchEmployee(inputNameEmployee());
                        break;
                    case 6:
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter your choice again!");

            }

        } while (employeeChoice!=6);
    }

    public Employee inputNewEmployee() {
        String addId;
        do {
            System.out.println("Please enter the  Id (NV-YYYY) ");
            addId = scanner.nextLine();
        } while (!regexFile.validateId(addId));
        String addName;
        do {
            System.out.println("Please enter the name");
            addName = scanner.nextLine();

        } while (regexFile.validateName(addName));
        String addGender;
        do {
            System.out.println("Please enter the gender");
            addGender = scanner.nextLine();
        } while (!regexFile.validateGender(addGender));
        String addAge;
        do {
            System.out.println("Please enter your birth day");
            addAge = scanner.nextLine();

        } while (regexFile.validateAge(addAge));
        String addIdentificationCard;
        do {
            System.out.println("Please enter the identification card");
            addIdentificationCard = scanner.nextLine();

        } while (!regexFile.validateIdentificationCard(addIdentificationCard));
        String addPhoneNumber;
        do {
            System.out.println("Please enter your phone number");
            addPhoneNumber = scanner.nextLine();

        } while (!regexFile.validatePhoneNumber(addPhoneNumber));
        String addEmail;
        do {
            System.out.println("Please enter your email");
            addEmail = scanner.nextLine();
        } while (!regexFile.validateEmail(addEmail));
        String addGuestType;
        do {
            System.out.println("Please enter your guest type");
            addGuestType = scanner.nextLine();
        } while (!regexFile.validateGuestType(addGuestType));
        System.out.println("Please enter your address");
        String addAddress = scanner.nextLine();
        String salary;
        do {
            System.out.println("Please enter your salary");
            salary=scanner.nextLine();
            if (Integer.parseInt(salary)>0){
                break;
            }else {
                System.out.println("Salary > 0");
            }
        }while (true);
        return new Employee(addId,addAddress,addAge,addGender,addEmail,addGuestType,addName,salary,addIdentificationCard,addPhoneNumber);
    }
    public String inputIdEmployee(){
        List<Employee> employeeList=employeeController.display();
        String id;
        do {
            System.out.println("Please enter the id  ");
            id=scanner.nextLine();
            for (Employee employee: employeeList){
                if (employee.getId().equals(id)){
                    break;
                }else {
                    System.out.println("Id not found");
                }
            }
        }while (true);
    }
    public String inputNameEmployee(){
        List<Employee> employeeList= employeeController.display();
        String name;
        do {
            System.out.println("Enter the name you want to find");
            name=scanner.nextLine();
            for (Employee employee: employeeList){
                if (employee.getName().equals(name)){
                    break;
                }else {
                    System.out.println("Dont find the Name");
                }
            }
        }while (true);
    }

}
