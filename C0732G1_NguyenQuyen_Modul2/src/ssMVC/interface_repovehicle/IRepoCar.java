package ssMVC.interface_repovehicle;

import ssMVC.model.Cars;

import java.util.List;

public interface IRepoCar {
    List<Cars> showCar();
    void createCar(Cars cars);
    void removeCar(int idCar);
}
