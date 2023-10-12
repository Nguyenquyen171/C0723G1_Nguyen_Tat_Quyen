package mvc.view;

import case_study.utils.RegexFile;
import mvc.controller.FruitsController;
import mvc.model.Fruits;
import mvc.service.IServiceFruits;

import java.util.List;
import java.util.Scanner;

public class FruitsView {
    private final Scanner scanner = new Scanner(System.in);
    private final FruitsController fruitsController = new FruitsController();

    public void menuFruits() {
        System.out.println("---Menu Fruits-----");
        System.out.println("1: Display Fruits");
        System.out.println("2: Add Fruits");
        System.out.println("3: Remove Fruits");
        System.out.println("4: Search Fruits");
        System.out.println("5: Edit Fruits");
        System.out.println("6: Exit");
    }

    public void managementFruits() {
        int choice = 0;
        do {
            try {
                this.menuFruits();
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println(fruitsController.display());
                        break;
                    case 2:
                        fruitsController.add(inputNewFruits());
                        break;
                    case 3:
                        fruitsController.remove(inputId());
                        break;
                    case 4:
                        List<Fruits> fruitsList=this.fruitsController.searchFruits(inputName());
                        if(fruitsList.isEmpty()){
                            System.out.println("Name not find in List");
                        }else {
                            System.out.println(fruitsList);
                            System.out.println("Successfully");
                        }
                        break;
                    case 5:
                        fruitsController.editFruits(inputId(),inputNewFruits());
                        System.out.println("Thanh cong ");
                        break;
                    case 6:
                        break;
                    default:
                        System.out.println("Dont find");
                }
            } catch (NumberFormatException e){
            }
        } while (choice != 6);
    }

    public Fruits inputNewFruits() {
        mvc.utils.RegexFile regexFile= new mvc.utils.RegexFile();
        String id;
        do {
            System.out.println("Please input id");
            id = scanner.nextLine();

        } while (!regexFile.validateId(id));
        String name;
        do {
            System.out.println("Please input name");
            name = scanner.nextLine();
        } while (!regexFile.validateName(name));
        System.out.println("Please input from");
        String from = scanner.nextLine();
        int quantity;
        do {
            System.out.println("Please input quantity");
            quantity = Integer.parseInt(scanner.nextLine());
            if (quantity > 1 && quantity < 10000) {
                break;
            } else {
                System.out.println("The quantity needs to be greater than 1and less than 1000");

            }
            break;
        } while (true);

        double price;
        do {
            System.out.println("Please input price");
            price = scanner.nextDouble();
            if (price > 1000 && price < 1000000000) {
                break;
            } else {
                System.out.println("The price needs to be greater than 1000 and less than 100000000");
            }
        } while (true);
        return new Fruits(id,name,from,quantity,price);
    }
    public String inputId(){
        mvc.utils.RegexFile regexFile = new mvc.utils.RegexFile();
        String id;
        do {
            System.out.println("Please input the id you want to find ");
            id = scanner.nextLine();
        } while (!regexFile.validateId(id));
        return id;
    }
    public String inputName() {
        System.out.println("Please enter the name you want to find ");
        String name= scanner.nextLine();
        return name;
    }
}
