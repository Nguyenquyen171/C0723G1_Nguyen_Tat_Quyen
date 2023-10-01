package case_study.view;

import case_study.controller.CustomerController;
import case_study.model.person.Customer;
import case_study.model.person.Employee;
import case_study.utils.RegexFile;

import java.security.PublicKey;
import java.util.List;
import java.util.Scanner;

public class CustomerView {
    Scanner scanner = new Scanner(System.in);
    CustomerController customerController = new CustomerController();

    public void customerManagement() {
        System.out.println("-----Customer Management------");
        System.out.println("1: Display list customers");
        System.out.println("2: Add new customer");
        System.out.println("3: Edit customer");
        System.out.println("4: Detele customer");
        System.out.println("5: Search by name customer");
        System.out.println("6: Return main menu");
    }

    public void inputCustomer() {
        int customerChoice = -1;
        do {
            try {
                this.customerManagement();
                customerChoice = Integer.parseInt(scanner.nextLine());
                switch (customerChoice) {
                    case 1:
                        this.customerController.display();
                        break;
                    case 2:
                        this.customerController.add(inputNewCustomer());
                        break;
                    case 3:
                        this.customerController.editCustomer(this.inputIdCustomer(), inputNewCustomer());
                        break;
                    case 4:
                        this.customerController.remove(inputIdCustomer());
                        break;
                    case 5:
                        this.customerController.searchCustomer(inputNameCustomer());
                        break;
                    case 6:
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter your choice again!");
            }

        } while (customerChoice != 6);
    }

    public Customer inputNewCustomer() {
        RegexFile regexFile = new RegexFile();
        String addName;
        do {
            System.out.println("Please enter the name Customer");
            addName = scanner.nextLine();

        } while (regexFile.validateName(addName));
        String addId;
        do {
            System.out.println("Please enter the id customer");
            addId = scanner.nextLine();
        } while (!regexFile.validateId(addId));
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
        String addLevel;
        do {
            System.out.println("Please enter your level");
            addLevel = scanner.nextLine();

        } while (!regexFile.validateLever(addLevel));
        String addLocation;
        do {
            System.out.println("Please enter the location");
            addLocation = scanner.nextLine();
        } while (!regexFile.validateLocation(addLocation));
        return new Customer(addId, addName, addAge, addGender, addIdentificationCard, addPhoneNumber, addEmail, addLevel, addLocation);
    }

    public String inputIdCustomer() {
        List<Customer> customerList = customerController.display();
        String id;
        do {
            System.out.println("Please enter the id  ");
            id = scanner.nextLine();
            for (Customer customer : customerList) {
                if (customer.getId().equals(id)) {
                    break;
                } else {
                    System.out.println("Id not found");
                }
            }
        } while (true);
    }

    public String inputNameCustomer() {
        List<Customer> customerList = customerController.display();
        String name;
        do {
            System.out.println("Enter the name you want to find");
            name = scanner.nextLine();
            for (Customer customer : customerList) {
                if (customer.getName().equals(name)) {
                    break;
                } else {
                    System.out.println("Dont find the Name");
                }
            }
        } while (true);

    }
}
