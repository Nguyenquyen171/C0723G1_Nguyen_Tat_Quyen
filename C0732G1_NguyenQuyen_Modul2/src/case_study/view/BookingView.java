package case_study.view;

import java.util.Scanner;

public class BookingView {
    Scanner scanner=new Scanner(System.in);

    public void bookingManagement() {
        System.out.println("Booking Managerment");
        System.out.println("1: Add new booking");
        System.out.println("2: Display list booking");
        System.out.println("3: Create new contracts");
        System.out.println("4: Display list contracts");
        System.out.println("5: Edit contracts");
        System.out.println("6: Return main menu");
    }
    public void inputBooking(){
        int bookingChoice=-1;
        do {
            try{
                this.bookingManagement();
                bookingChoice= Integer.parseInt(scanner.nextLine());
                switch (bookingChoice){
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

        }while (bookingChoice>0&&bookingChoice<=6);
    }




}
