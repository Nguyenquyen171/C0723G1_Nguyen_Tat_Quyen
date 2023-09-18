package ssMVC.service.interface_vehicle;

import ssMVC.model.Cars;

import java.util.List;

public interface ICarService {
    List<Cars> showCar();
    void createCar(Cars cars);
    void removeCar(int idCar);
}
