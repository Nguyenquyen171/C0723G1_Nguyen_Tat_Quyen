package case_study.view;

import case_study.Main;

import java.util.Scanner;

public class PromotionView {
    private final  Scanner scanner= new Scanner(System.in);

    public void promotionManagement() {
        System.out.println("Promotion Managerment");
        System.out.println("1:Display list customers use service");
        System.out.println("2: Display list customers get voucher");
        System.out.println("3: Return main menu");
    }
    public void inputPromotion(){
        int promotionChoice=-1;
        do {
            try{
                this.promotionManagement();
                promotionChoice= Integer.parseInt(scanner.nextLine());
                switch (promotionChoice){
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                      return;
                }
            }catch (NumberFormatException e){
                System.out.println("Please enter your choice again!");

            }

        }while (promotionChoice>0 &&promotionChoice<=3);
    }

}
