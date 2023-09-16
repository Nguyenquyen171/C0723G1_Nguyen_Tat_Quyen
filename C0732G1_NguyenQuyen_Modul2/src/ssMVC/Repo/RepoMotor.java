package ssMVC.Repo;

import ssMVC.model.Motors;
import ssMVC.interface_repovehicle.IRepoMotor;

import java.util.ArrayList;
import java.util.List;

public class RepoMotor implements IRepoMotor {
    private final List<Motors> motorsList= new ArrayList<>();

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
        for (Motors motors: this.motorsList){
            if (motors.getVehicleId()==idMotor){
                this.motorsList.remove(motors);
                return;
            }
        }

    }
}
