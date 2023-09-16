package ssMVC.interface_repovehicle;

import ssMVC.model.Trucks;

import java.util.List;

public interface IRepoTruck {
    List<Trucks> showTruck();
    void createTruck(Trucks trucks);
    void removeTruck(int idTruck);
}
