package ssMVC.repo;

import ssMVC.model.Motors;
import ssMVC.repo.interface_repovehicle.IRepoMotor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepoMotor implements IRepoMotor {
    Scanner scanner = new Scanner(System.in);
    boolean exist = true;
    private final List<Motors> motorsList = new ArrayList<>();

    @Override
    public List<Motors> showMotor() {
        return this.motorsList;
    }

    @Override
    public void createMotor(Motors motors) {
        this.motorsList.add(motors);

    }

    @Override
    public void removeMotor(int idMotor) {
        for (Motors motors : this.motorsList) {
            if (motors.getVehicleId() == idMotor) {
//                exist = true;
                if (exist) {
                    System.out.println("Motor with license plates" + idMotor);
                    System.out.println("Are you sure you want to delete it? (Yes/No)");
                    String confirm = scanner.nextLine();
                    if (confirm.equalsIgnoreCase("Yes")) {
                        this.motorsList.remove(motors);
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
