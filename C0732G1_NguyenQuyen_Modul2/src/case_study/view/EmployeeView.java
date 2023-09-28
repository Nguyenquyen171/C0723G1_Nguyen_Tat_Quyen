package case_study.view;

import java.util.Scanner;

public class EmployeeView {
    Scanner scanner = new Scanner(System.in);

    public void employeeManagement() {
        System.out.println("Employee Management");
        System.out.println("1: Display list employees");
        System.out.println("2:Add new employee");
        System.out.println("3: Edit employee");
        System.out.println("4: Delete employee");
        System.out.println("5:Search by name employee");
        System.out.println("6:Return main menu");
    }

    public void inputEmployee() {
        int employeeChoice = -1;
        do {
            try {
                this.employeeManagement();
                employeeChoice = Integer.parseInt(scanner.nextLine());
                switch (employeeChoice) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        return;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter your choice again!");

            }

        } while (employeeChoice < 0 || employeeChoice > 6);
    }


}
