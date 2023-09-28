package case_study.view;

import java.util.Scanner;

public class MainView {
    Scanner scanner = new Scanner(System.in);

    PromotionView promotionView = new PromotionView();

    public void displayMainMenu() {
        System.out.println("Menu Manager");
        System.out.println("1: Employee Management");
        System.out.println("2: Customer Management");
        System.out.println("3: Facility Management");
        System.out.println("4: Booking Management");
        System.out.println("5: Promotion Management");
        System.out.println("6: Exit");
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

    public int managementFuruma() {
        int choiceManagementFuruma = -1;
        this.displayMainMenu();
        do {
            try {
                choiceManagementFuruma = Integer.parseInt(scanner.nextLine());
                switch (choiceManagementFuruma) {
                    case 1:
                        EmployeeView employeeView = new EmployeeView();
                        employeeView.inputEmployee();
                        break;
                    case 2:
                        CustomerView customerView = new CustomerView();
                        customerView.inputCustomer();
                        break;
                    case 3:
                        FacilityView facilityView = new FacilityView();
                      facilityView.inputFacility();
                        break;
                    case 4:
                        BookingView bookingView = new BookingView();
                        bookingView.inputBooking();
                        break;
                    case 5:
                        PromotionView promotionView = new PromotionView();
                        this.promotionView.inputPromotion();
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter your choice again!");
            }
        } while (choiceManagementFuruma < 0 || choiceManagementFuruma > 6);
        if (choiceManagementFuruma == 6) {
            System.exit(6);
        }
        return choiceManagementFuruma;

    }
}
