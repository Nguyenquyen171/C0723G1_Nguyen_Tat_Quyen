package ssMVC.Main;

import ssMVC.controller.CarController;
import ssMVC.controller.MotorController;
import ssMVC.controller.TruckController;
import ssMVC.model.Cars;
import ssMVC.model.Motors;
import ssMVC.model.Trucks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    private final CarController carController = new CarController();
    private final MotorController motorController = new MotorController();
    private final TruckController truckController = new TruckController();

    public void showVehicle() {
        System.out.println("-----------Traffic management program------------");
        System.out.println("1: Create new vehicle");
        System.out.println("2: Show vehicle");
        System.out.println("3: Remove vehicle");
        System.out.println("4: Find vehicle");
        System.out.println("5: Exit");
    }

    public void showObjectVehicle() {
        System.out.println("1: Cars");
        System.out.println("2: Motors");
        System.out.println("3: Trucks");
    }

    public int choose() {
        int choiceOption = 0;
        this.showVehicle();
        do {
            try {
                System.out.println("Please choose the traffic management program");
                choiceOption = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid option!!!");
            }
        } while (choiceOption < 0 || choiceOption > 4);
        if (choiceOption == 5) {
            System.exit(5);

        }
        return choiceOption;
    }

    public int chooseObject() {
        int choiceObject = 0;
        this.showObjectVehicle();
        do {
            try {
                System.out.println("Please choose vehicle: ");
                choiceObject = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid vehicle");
            }
        } while (choiceObject < 1 || choiceObject > 3);
        return choiceObject;
    }
    public Cars inputCar(){
        Cars cars= new Cars();
        System.out.println("Enter the car id: ");
        cars.setVehicleId(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter the company name: ");
        cars.setCompanyName(scanner.nextLine());
        System.out.println("Enter the year of manufacture: ");
        cars.setYear(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter the owner name: ");
        cars.setOwnerName(scanner.nextLine());
        System.out.println("Enter the number seats");
        cars.setNumberSeats(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter the car type: ");
        cars.setCarType(scanner.nextLine());
        return cars;
    }
    public Motors inputMotor(){
        Motors motors= new Motors();
        System.out.println("Enter the motor id: ");
        motors.setVehicleId(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter the company name: ");
        motors.setCompanyName(scanner.nextLine());
        System.out.println("Enter the year: ");
        motors.setYear(scanner.nextInt());
        System.out.println("Enter the owner name: ");
        motors.setOwnerName(scanner.nextLine());
        System.out.println("Enter the motorbike capacity ");
        System.out.println(Integer.parseInt(scanner.nextLine()));
        return motors;
    }
    public Trucks inputTruck(){
        Trucks trucks= new Trucks();
        System.out.println("Enter the truck id: ");
        trucks.setVehicleId(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter the company name: ");
        trucks.setCompanyName(scanner.nextLine());
        System.out.println("Enter the year: ");
        trucks.setYear(scanner.nextInt());
        System.out.println("Enter the owner name: ");
        trucks.setOwnerName(scanner.nextLine());
        System.out.println("Enter the truck load ");
        trucks.setLoad(Integer.parseInt(scanner.nextLine()));
        return trucks;
    }
    

}


