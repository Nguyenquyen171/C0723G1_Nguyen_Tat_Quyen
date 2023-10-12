package case_study.view;

import case_study.controller.CustomerController;
import case_study.model.person.Customer;


import case_study.utils.RegexFile;

import java.security.PublicKey;
import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class CustomerView {
    private final  Scanner scanner = new Scanner(System.in);
    private final CustomerController customerController = new CustomerController();
    private final RegexFile regexFile= new RegexFile();

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
                        List<Customer> customerList=customerController.display();
                        for (Customer customer: customerList){
                            System.out.println(customer);
                        }
                        System.out.println("Successfully");
                        break;
                    case 2:
                        this.customerController.add(inputNewCustomer());
                        break;
                    case 3:
                        this.customerController.editCustomer(inputIdCustomer(), inputNewCustomer());
                        System.out.println("Successfully");
                        break;
                    case 4:
                        this.customerController.remove(inputIdCustomer());
                        System.out.println("Successfully");

                        break;
                    case 5:
                        List<Customer> customers = this.customerController.searchCustomer(inputNameCustomer());
                        if(customers.isEmpty()){
                            System.out.println("Name not find in List");
                        }else {
                            System.out.println(customers);
                            System.out.println("Successfully");
                        }
                        break;
                    case 6:
                       break;
                    default:
                        System.out.println("Can't find the option you're looking for");
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
            System.out.println("Please enter the name Customer ( Nguyen Quyen )");
            addName = scanner.nextLine();

        } while (regexFile.validateName(addName));
        String addId;
        do {
            System.out.println("Please enter the id customer KH-YYYY");
            addId = scanner.nextLine();
        } while (!regexFile.validateIdCustomer(addId));
        String addGender;
        do {
            System.out.println("Please enter the gender (Male- Female - Gay)");
            addGender = scanner.nextLine();
        } while (!regexFile.validateGender(addGender));
        String addAge;
        do {
            System.out.println("Please enter your birth day (17-01-2002)");
            addAge = scanner.nextLine();

        } while (regexFile.validateAge(addAge));
        String addIdentificationCard;
        do {
            System.out.println("Please enter the identification card (9-12 Number)");
            addIdentificationCard = scanner.nextLine();

        } while (!regexFile.validateIdentificationCard(addIdentificationCard));
        String addPhoneNumber;
        do {
            System.out.println("Please enter your phone number (10 numbers)");
            addPhoneNumber = scanner.nextLine();

        } while (!regexFile.validatePhoneNumber(addPhoneNumber));
        String addEmail;
        do {
            System.out.println("Please enter your email (nguyenquyen171202@gmail.com)");
            addEmail = scanner.nextLine();
        } while (!regexFile.validateEmail(addEmail));
        String addLevel;
        do {
            System.out.println("Please enter your level (Diamond|Platinum|Gold|Silver|Member)");
            addLevel = scanner.nextLine();

        } while (!regexFile.validateLever(addLevel));
        String addLocation;
        do {
            System.out.println("Please enter the location");
            addLocation = scanner.nextLine();
        } while (!regexFile.validateLocation(addLocation));
        return new Customer(addId, addName, addAge, addGender, addIdentificationCard, addPhoneNumber, addEmail, addLevel, addLocation);
    }

    public String inputIdCustomer(){
        String string;
        do {
            System.out.println("Nhap ID");
            string = scanner.nextLine();
        } while (!regexFile.validateIdCustomer(string));
        return string;
    }

    public String inputNameCustomer() {
      String string;
          System.out.println("Enter the name you want to find");
          string=scanner.nextLine();
      return string;
    }
}
