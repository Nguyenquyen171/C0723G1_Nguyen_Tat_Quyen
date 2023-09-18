package ssMVC.repo;

import ssMVC.model.Trucks;
import ssMVC.repo.interface_repovehicle.IRepoTruck;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepoTruck implements IRepoTruck {
    Scanner scanner = new Scanner(System.in);
    private final List<Trucks> trucksList = new ArrayList<>();
    boolean exist = true;

    @Override
    public List<Trucks> showTruck() {
        return this.trucksList;
    }

    @Override
    public void createTruck(Trucks trucks) {
        this.trucksList.add(trucks);

    }

    @Override
    public void removeTruck(int idTruck) {
        for (Trucks trucks : this.trucksList) {
            if (trucks.getVehicleId() == idTruck) {
                if (exist) {
                    System.out.println("Truck with license plates" + idTruck);
                    System.out.println("Are you sure you want to delete it? (Yes/No)");
                    String confirm = scanner.nextLine();
                    if (confirm.equalsIgnoreCase("Yes")) {
                        this.trucksList.remove(trucks);
                        System.out.println("deleted successfully");
                        return;
                    }
                    if (confirm.equalsIgnoreCase("No")) {
                        System.out.println("Cancel deletion");
                        return;
                    }
                }else {
                    System.out.println("The media id to be deleted could not be found");
                }
            }
        }

    }
}
