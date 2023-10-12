package mvc_lamthem.view;

import mvc_lamthem.controller.ComputerController;
import mvc_lamthem.model.Computer;
import mvc_lamthem.ultils.Regex;
import ss13.exercise.BinarySystem;

import java.util.Scanner;

public class ComputerView {
    private final Regex regex=new Regex();
    private final Scanner scanner=new Scanner(System.in);
    private final ComputerController computerController=new ComputerController();
    public void displayManager(){
        System.out.println("----Computer Manager");
        System.out.println("1: Display Computer ");
        System.out.println("2: Add Computer ");
        System.out.println("3: Remove Computer ");
        System.out.println("4: Find Computer ");
        System.out.println("5: exit ");
    }
    public Computer inputComputer() {
        String id;
        do {
            System.out.println("Please enter the id");
            id = scanner.nextLine();
        } while (!regex.validateId(id));
        String name;
        do {
            System.out.println("Please enter the name");
            name = scanner.nextLine();
        } while (!regex.validateName(name));
        System.out.println("Please enter the size");
        String size = scanner.nextLine();
        System.out.println("Please enter the type");
        String type = scanner.nextLine();
        double price;
        do {
            System.out.println("Please enter your price you want to buy");
            price = scanner.nextDouble();
        } while (price < 1000 && price > 1000000000);
        return new Computer(id, name, size, type, price);
    }
    public void management(){
        int choice=-1;
        do {
            this.displayManager();
            try{
                System.out.println("Enter your option");
                choice=Integer.parseInt(scanner.nextLine());
                switch (choice){
                    case 1:
                        System.out.println(this.computerController.display());
                        System.out.println("OKE");
                        break;
                    case 2:
                        this.computerController.add(inputComputer());
                        break;
                    case 3:
                        this.computerController.remove(inputId());
                        break;
                    case 4:
                        System.out.println(this.computerController.search(inputName()));
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("Lua chon tu 1 den 5 ");
                }
            }catch (Exception e){
                System.out.println("Chiu chet ");
            }
        }while (choice!=5);
    }
    public String inputId(){
        String id;
        do {
            System.out.println("Enter the id you want to find");
            id=scanner.nextLine();
        }while (!regex.validateId(id));
        return id;
    }
    public String inputName(){
        String name;
        do {
            System.out.println("Enter the name you want to find");
            name=scanner.nextLine();
        }while (!regex.validateName(name));
        return name;
    }
}
