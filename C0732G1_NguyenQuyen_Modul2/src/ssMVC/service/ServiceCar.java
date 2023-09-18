package ssMVC.service;

import ssMVC.model.Cars;
import ssMVC.repo.interface_repovehicle.IRepoCar;
import ssMVC.repo.RepoCar;
import ssMVC.service.interface_vehicle.ICarService;

import java.util.List;


public class ServiceCar implements ICarService  {
    private final IRepoCar carRepo= new RepoCar();


    @Override
    public List<Cars> showCar() {
        return this.carRepo.showCar();
    }

    @Override
    public void createCar(Cars cars) {
        this.carRepo.createCar(cars);

    }

    @Override
    public void removeCar(int idCar) {
        this.carRepo.removeCar(idCar);
    }
}
