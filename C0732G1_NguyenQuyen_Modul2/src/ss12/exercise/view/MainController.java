package ss12.exercise.view;

import ss12.exercise.Controller.FanController;
import ss12.exercise.model.Fan;

import java.util.List;
import java.util.Scanner;

public class MainController {
    Scanner scanner = new Scanner(System.in);
    private final FanController fanController= new FanController();

    public void showFan() {
        System.out.println("-----------Fan management program------------");
        System.out.println("1: Create new fan");
        System.out.println("2: Edit Fan");
        System.out.println("3: Remove Fan");
        System.out.println("4: Show Fan");
        System.out.println("5: Find name Fan");
        System.out.println("6: sort by ascending value");
        System.out.println("7: sort by descending value");
        System.out.println("8: Exit");
    }

    public int choose() {
        int choiceOption = 0;
        this.showFan();
        do {
            try {
                System.out.println("Please choose the fan management program");
                choiceOption = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid option!!!");
            }
        } while (choiceOption < 1 || choiceOption > 8);
        if (choiceOption == 8) {
            System.exit(8);

        }
        return choiceOption;
    }

    public Fan inputFan() {
        Fan fan = new Fan();
        System.out.println("Enter the Fan id: ");
        fan.setId(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter the fan name: ");
        fan.setName(scanner.nextLine());
        System.out.println("Enter the value of fan: ");
        fan.setValue(scanner.nextDouble());
        System.out.println("Enter the wattage of fan ");
        fan.setWattage(Integer.parseInt(scanner.nextLine()));
        return fan;
    }

    public int inputID() {
        System.out.println("Please enter the ID Fan: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public String inputName() {
        System.out.println("Please enter the name Fan");
        return scanner.nextLine();
    }

    public Fan inputNewInfor() {
        System.out.println("Enter new ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter new name: ");
        String name = scanner.nextLine();
        System.out.println("Enter new price: ");
        double price = scanner.nextDouble();
        System.out.println("Enter new wattage: ");
        int wattage = scanner.nextInt();
        return new Fan(id, name, price, wattage);
    }

    public void managementFan() {
        int choice = this.choose();
        this.showFan();
        do {
            switch (choice) {
                case 1:
                    this.fanController.createFan(inputFan());
                    break;
                case 2:
                    this.fanController.editProduct(this.inputID(), this.inputNewInfor());
                    break;
                case 3:
                    this.fanController.removeFan(this.inputID());
                    break;
                case 4:
                    List<Fan> products = this.fanController.getFan();
                    for (Fan product : products) {
                        System.out.println(product);
                    }
                    break;
                case 5:
                    List<Fan> fan=this.fanController.getFan();
                    for (Fan fan1: fan){
                        if (fan1.getName()==inputName()){
                            System.out.println(fan1);
                        }else {
                            System.out.println("Not found Fan");
                        }
                    }
                    break;
                case 6:
                    this.fanController.sortByPriceProductUp();
                    break;
                case 7:
                    this.fanController.sortByPriceProductDown();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }while (choice!=8);
    }
}

