package ssMVC.Repo;

import ssMVC.model.Trucks;
import ssMVC.interface_repovehicle.IRepoTruck;

import java.util.ArrayList;
import java.util.List;

public class RepoTruck implements IRepoTruck {
    private final List<Trucks> trucksList= new ArrayList<>();

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
        for (Trucks trucks: this.trucksList){
            if (trucks.getVehicleId()== idTruck){
                this.trucksList.remove(trucks);
                return;
            }
        }

    }
}
