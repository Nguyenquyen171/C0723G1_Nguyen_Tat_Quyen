package ssMVC.controller;

import ssMVC.interface_vehicle.ICarService;
import ssMVC.interface_vehicle.ITruckService;
import ssMVC.model.Trucks;
import ssMVC.service.ServiceTruck;

import java.util.List;

public class TruckController {
    private final ITruckService truckService= new ServiceTruck();

    public List<Trucks> showTruck() {
        return truckService.showTruck();
    }

    public void createTruck(Trucks trucks) {
        truckService.createTruck(trucks);
    }

    public void removeTruck(int idTruck) {
        truckService.removeTruck(idTruck);
    }
}
