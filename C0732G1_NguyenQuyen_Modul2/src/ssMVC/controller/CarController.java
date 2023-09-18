package ssMVC.controller;

import ssMVC.service.interface_vehicle.ICarService;
import ssMVC.model.Cars;
import ssMVC.service.ServiceCar;

import java.util.List;

public class CarController {
    private final ICarService carService=new ServiceCar();

    public List<Cars> showCar() {
        return carService.showCar();
    }

    public void createCar(Cars cars) {
        carService.createCar(cars);
    }

    public void removeCar(int idCar) {
        carService.removeCar(idCar);
    }
}
