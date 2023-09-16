package ssMVC.service;

import ssMVC.model.Trucks;
import ssMVC.interface_repovehicle.IRepoTruck;
import ssMVC.Repo.RepoTruck;
import ssMVC.interface_vehicle.ITruckService;

import java.util.List;

public class ServiceTruck implements ITruckService {
    private final IRepoTruck truckRepo = new RepoTruck();

    @Override
    public List<Trucks> showTruck() {
        return this.truckRepo.showTruck();
    }

    @Override
    public void createTruck(Trucks trucks) {
        this.truckRepo.createTruck(trucks);

    }

    @Override
    public void removeTruck(int idTruck) {
        this.truckRepo.removeTruck(idTruck);
    }


}
