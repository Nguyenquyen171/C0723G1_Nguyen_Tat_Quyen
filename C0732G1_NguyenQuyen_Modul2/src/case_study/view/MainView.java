package case_study.view;

import java.util.Scanner;

public class MainView {
    private final Scanner scanner = new Scanner(System.in);

    private final PromotionView promotionView = new PromotionView();

    public static void main(String[] args) {

    }
    public void displayMainMenu() {
        System.out.println("Menu Manager");
        System.out.println("1: Employee Management");
        System.out.println("2: Customer Management");
        System.out.println("3: Facility Management");
        System.out.println("4: Booking Management");
        System.out.println("5: Promotion Management");
        System.out.println("6: Exit");
    }
    public int managementFuruma() {
        int choiceManagementFuruma = -1;

        do {
            this.displayMainMenu();
            try {
                choiceManagementFuruma = Integer.parseInt(scanner.nextLine());
                switch (choiceManagementFuruma) {
                    case 1:
                        EmployeeView employeeView = new EmployeeView();
                        employeeView.employeeManager();
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
                    case 6:
                        System.exit(0);
                    default:
                        System.out.println("Can't find the option you're looking for");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter your choice again!");
            }
        } while (choiceManagementFuruma != 6);

        return choiceManagementFuruma;
    }
}
