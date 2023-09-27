package case_study.controller;

import java.util.Scanner;

public class FuramaController {
    Scanner scanner = new Scanner(System.in);

    public void displayMainMenu() {
        System.out.println("Menu Manager");
        System.out.println("1: Employee Management");
        System.out.println("2: Customer Management");
        System.out.println("3: Facility Management");
        System.out.println("4: Booking Management");
        System.out.println("5: Promotion Management");
        System.out.println("6: Exit");
    }

    public void employeeManagement() {
        System.out.println("Employee Management");
        System.out.println("1: Display list employees");
        System.out.println("2:Add new employee");
        System.out.println("3: Edit employee");
        System.out.println("4: Delete employee");
        System.out.println("5:Search by name employee");
        System.out.println("6:Return main menu");
    }

    public void customerManagement() {
        System.out.println("Customer Management");
        System.out.println("1: Display list customers");
        System.out.println("2: Add new customer");
        System.out.println("3: Edit customer");
        System.out.println("4: Edit customer");
        System.out.println("5: Search by name customer");
        System.out.println("6: Return main menu");
    }

    public void facilityManagement() {
        System.out.println("Facility Management");
        System.out.println("1: Display list facility");
        System.out.println("2: Add new facility");
        System.out.println("3: Display list facility maintenance");
        System.out.println("4: Delete facility");
        System.out.println("5: Return main menu");
    }

    public void bookingManagement() {
        System.out.println("Booking Managerment");
        System.out.println("1: Add new booking");
        System.out.println("2: Display list booking");
        System.out.println("3: Create new contracts");
        System.out.println("4: Display list contracts");
        System.out.println("5: Edit contracts");
        System.out.println("6: Return main menu");
    }

    public void promotionManagement() {
        System.out.println("Promotion Managerment");
        System.out.println("1:Display list customers use service");
        System.out.println("2: Display list customers get voucher");
        System.out.println("3: Return main menu");
    }

    public int choose() {
        int choiceOption = 0;
        this.displayMainMenu();
        do {
            try {
                System.out.println("Please choose the Furama management program:");
                choiceOption = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid option!!");

            }
        } while (choiceOption < 1 || choiceOption > 6);
        if (choiceOption == 6) {
            System.exit(6);
        }
        return choiceOption;
    }

    public int chooseManagement() {
        int choiceManagement = 0;
        this.displayMainMenu();
        do {
            try {
                System.out.println("Please choose the Furama management program:");
                choiceManagement = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid option!!");

            }
        } while (choiceManagement < 1 || choiceManagement > 6);
        if (choiceManagement == 6) {
            System.exit(6);
        }
        return choiceManagement;

    }
    public void managementProgram(){
        int chooseObject;
        int chooseOption;
        do {
            chooseObject= this.choose();
            chooseOption=this.chooseManagement();
            switch (chooseObject){
                case 1:
                    this.employeeManagement();
                case 2:
                    this.customerManagement();
                case 3:
                    this.facilityManagement();
                case 4:
                    this.bookingManagement();
                case 5:
                    this.promotionManagement();
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }while (chooseObject!=6);
    }

}