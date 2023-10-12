package thi_tot.view;

import mvc_lamthem.ultils.Regex;
import thi_tot.controller.IphoneController;
import thi_tot.file_utils.RegexFile;
import thi_tot.model.Iphone;

import java.util.Scanner;

public class IphoneView {
    private final RegexFile regexFile= new RegexFile();
    private final Scanner scanner=new Scanner(System.in);
    private final IphoneController iphoneController=new IphoneController();

    public void displayIphone() {
        System.out.println("------Iphone Manager");
        System.out.println("1: Display Iphone  ");
        System.out.println("2: Add Iphone  ");
        System.out.println("3: Remove Iphone  ");
        System.out.println("4: Find Iphone  ");
        System.out.println("5:Exit  ");
    }

    public Iphone inputIphone() {
        String id;
        do {
            System.out.println("Please enter the id");
            id=scanner.nextLine();
        }while (!regexFile.validateId(id));
        String name;
        do {
            System.out.println("Please enter your name ");
            name=scanner.nextLine();
        }while (!regexFile.validateName(name));
        int year;
        do {
            System.out.println("Please enter when you buy your phone (1900-2023)");
            year=Integer.parseInt(scanner.nextLine());
            if (year>1900&& year<2023){
                break;
            }else {
                System.out.println("Not a year");
            }
        }while (true);
        System.out.println("Please enter your iphone from");
        String from= scanner.nextLine();
        double price;
        do {
            System.out.println("Please enter your iphone price");
            price=scanner.nextDouble();
            if (price>1000000&&price<1000000000){
                break;
            }else {
                System.out.println("Price need  > 1000");
            }
        }while (true);

        return new Iphone(id,name,year,from,price);
    }
    public String inputId(){
        String id;
        do {
            System.out.println("Please enter your id you want to find ");
            id=scanner.nextLine();
        }while (!regexFile.validateId(id));
        return id;
    }
    public String inputName(){
        String name;
        do {
            System.out.println("Please enter your name you want to find ");
            name=scanner.nextLine();
        }while (!regexFile.validateName(name));
        return name;
    }
    public void manageIphone(){
        int choice=-1;
        do {
            try {
                this.displayIphone();
                System.out.println("Please enter your choice");
                choice=Integer.parseInt(scanner.nextLine());
                switch (choice){
                    case 1:
                        System.out.println( this.iphoneController.display());
                        break;
                    case 2:
                        this.iphoneController.add(inputIphone());
                        break;
                    case 3:
                        this.iphoneController.remove(inputId());
                        break;
                    case 4:
                        System.out.println(this.iphoneController.searchIphone(inputName()));;
                        break;

                }

            }catch (Exception e){
                System.out.println("Please out ");
            }
        }while (choice!=6);
    }
}
