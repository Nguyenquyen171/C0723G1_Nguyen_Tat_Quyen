package ssMVC.service.interface_vehicle;

import ssMVC.model.Trucks;

import java.util.List;

public interface ITruckService {
    List<Trucks> showTruck();
    void createTruck(Trucks trucks);
    void removeTruck(int idTruck);
}
