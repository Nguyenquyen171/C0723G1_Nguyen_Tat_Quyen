package ssMVC.Repo;

import ssMVC.model.Cars;
import ssMVC.interface_repovehicle.IRepoCar;

import java.util.ArrayList;
import java.util.List;

public class RepoCar implements IRepoCar {
    private final List<Cars> carsList= new ArrayList<>();

    @Override
    public List<Cars> showCar() {
        return this.carsList;
    }

    @Override
    public void createCar(Cars cars) {
        this.carsList.add(cars);
    }

    @Override
    public void removeCar(int idCar) {
        for (Cars cars1: this.carsList){
            if (cars1.getVehicleId()==idCar){
                this.carsList.remove(cars1);
                return;
            }
        }

    }
}
