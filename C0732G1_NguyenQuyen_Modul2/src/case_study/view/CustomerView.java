package case_study.view;

import java.util.Scanner;

public class CustomerView {
    Scanner scanner= new Scanner(System.in);
    MainView mainView= new MainView();
    public void customerManagement() {
        System.out.println("-----Customer Management------");
        System.out.println("1: Display list customers");
        System.out.println("2: Add new customer");
        System.out.println("3: Edit customer");
        System.out.println("4: Edit customer");
        System.out.println("5: Search by name customer");
        System.out.println("6: Return main menu");
    }
    public void inputCustomer(){
        int customerChoice=-1;
        do {
            try{
                this.customerManagement();
                customerChoice= Integer.parseInt(scanner.nextLine());
                switch (customerChoice){
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
            }catch (NumberFormatException e){
                System.out.println("Please enter your choice again!");

            }

        }while (customerChoice<0||customerChoice>6);
    }

}
