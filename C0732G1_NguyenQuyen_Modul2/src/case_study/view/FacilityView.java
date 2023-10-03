package case_study.view;

import java.util.Scanner;

public class FacilityView {
    private final Scanner scanner = new Scanner(System.in);

    public void facilityManagement() {
        System.out.println("Facility Management");
        System.out.println("1: Display list facility");
        System.out.println("2: Add new facility");
        System.out.println("3: Display list facility maintenance");
        System.out.println("4: Delete facility");
        System.out.println("5: Return main menu");
    }

    public void inputFacility() {
        int facilityChoice = -1;
        do {
            try {
                this.facilityManagement();
                facilityChoice = Integer.parseInt(scanner.nextLine());
                switch (facilityChoice) {
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
                    default:
                        System.out.println("Can't find the option you're looking for");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter your choice again!");

            }

        } while (facilityChoice > 0 && facilityChoice <= 5);
    }
}