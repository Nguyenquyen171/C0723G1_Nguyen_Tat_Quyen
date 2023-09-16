package ssMVC.controller;

import ssMVC.interface_vehicle.IMotoService;
import ssMVC.interface_vehicle.ITruckService;
import ssMVC.model.Motors;
import ssMVC.service.ServiceMotor;

import java.util.List;

public class MotorController {
    private final IMotoService motoService= new ServiceMotor();

    public List<Motors> showMotor() {
        return motoService.showMotor();
    }

    public void createMotor(Motors motors) {
        motoService.createMotor(motors);
    }

    public void removeMotor(int idMotor) {
        motoService.removeMotor(idMotor);
    }
}
