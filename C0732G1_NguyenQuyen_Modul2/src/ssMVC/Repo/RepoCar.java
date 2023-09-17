package ssMVC.Repo;

import ssMVC.model.Cars;
import ssMVC.interface_repovehicle.IRepoCar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepoCar implements IRepoCar {
    Scanner scanner = new Scanner(System.in);
    boolean exist = true;
    private final List<Cars> carsList = new ArrayList<>();


    @Override
    public List<Cars> showCar() {
        return this.carsList;
    }

    @Override
    public void createCar(Cars cars) {
        this.carsList.add(cars);
    }

    @Override
    public void removeCar(int idCar) {
        for (Cars cars1 : this.carsList) {
            if (cars1.getVehicleId() == idCar) {
                if (exist) {
                    System.out.println("Motor with license plates" + idCar);
                    System.out.println("Are you sure you want to delete it? (Yes/No)");
                    String confirm = scanner.nextLine();
                    if (confirm.equalsIgnoreCase("Yes")) {
                        this.carsList.remove(cars1);
                        System.out.println("deleted successfully");
                        return;
                    }
                    if (confirm.equalsIgnoreCase("No")) {
                        System.out.println("Cancel deletion");
                        return;
                    }
                }
            }else {
                System.out.println("The media id to be deleted could not be found");
            }

        }
    }
}