package ssMVC.view;

import ssMVC.controller.CarController;
import ssMVC.controller.MotorController;
import ssMVC.controller.TruckController;
import ssMVC.model.Cars;
import ssMVC.model.Motors;
import ssMVC.model.Trucks;

import java.util.List;
import java.util.Scanner;

public class MainController {
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
        } while (choiceOption < 1 || choiceOption > 5);
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
        motors.setYear(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter the owner name: ");
        motors.setOwnerName(scanner.nextLine());
        System.out.println("Enter the motorbike capacity ");
        motors.setCapacity(Integer.parseInt(scanner.nextLine()));
        return motors;
    }

    public Trucks inputTruck(){
        Trucks trucks= new Trucks();
        System.out.println("Enter the truck id: ");
        trucks.setVehicleId(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter the company name: ");
        trucks.setCompanyName(scanner.nextLine());
        System.out.println("Enter the year: ");
        trucks.setYear(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter the owner name: ");
        trucks.setOwnerName(scanner.nextLine());
        System.out.println("Enter the truck load ");
        trucks.setLoad(Integer.parseInt(scanner.nextLine()));
        return trucks;
    }

    public int inputID(){
        System.out.println("Please enter the ID vehicle: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public void managementProgram(){
        int option;
        int chooseObject;
        do {
            option= this.choose();
            chooseObject= this.chooseObject();
            switch (option){
                case 1:
                    if (chooseObject==1){
                        this.carController.createCar(inputCar());
                    }else if (chooseObject==2) {
                        this.motorController.createMotor(inputMotor());
                    }else {
                        this.truckController.createTruck(inputTruck());
                    }
                    break;
                case 2:
                    if (chooseObject==1){
                        List<Cars> cars=this.carController.showCar();
                        for(Cars car: cars){
                            System.out.println(car);
                        }
                    } else if (chooseObject==2) {
                        List<Motors> motors=this.motorController.showMotor();
                        for (Motors motor:motors){
                            System.out.println(motor);
                        }
                    }else {
                        List<Trucks> trucks= this.truckController.showTruck();
                        for (Trucks truck:trucks){
                            System.out.println(truck);
                        }
                    }
                    break;
                case 3:
                    if (chooseObject==1){
                       this.carController.removeCar(inputID());
                    } else if (chooseObject==2) {
                        this.motorController.removeMotor(inputID());
                    }else {
                        this.truckController.removeTruck(inputID());
                    }
                    break;
                case 4:
                    if (chooseObject==1) {

                        List<Cars> cars = this.carController.showCar();
                        for (Cars car : cars) {
                            if (car.getVehicleId()== inputID()){
                                System.out.println(car);
                            }else {
                                System.out.println("Not found Car");
                            }
                        }
                    }else if (chooseObject==2) {
                    List<Motors> motors=this.motorController.showMotor();
                    for (Motors motor : motors) {
                        if (motor.getVehicleId()== inputID()){
                            System.out.println(motor);
                        }else {
                            System.out.println("Not found motor");
                        }
                    }
                }else {
                        List<Trucks>trucks=this.truckController.showTruck();
                        for (Trucks truck: trucks){
                            if (truck.getVehicleId()==inputID()){
                                System.out.println(truck);
                            }else {
                                System.out.println("Not found Truck");
                            }
                        }
                    }
                default:
                    System.out.println("Invalid choice!");
                    break;
            }

        }while (option!=5);
    }


}


