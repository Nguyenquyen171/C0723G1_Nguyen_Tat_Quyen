package ssMVC.service;

import ssMVC.model.Motors;
import ssMVC.interface_repovehicle.IRepoMotor;
import ssMVC.repo.RepoMotor;
import ssMVC.interface_vehicle.IMotoService;

import java.util.List;

public class ServiceMotor implements IMotoService {
    private final IRepoMotor motorRepo= new RepoMotor();

    @Override
    public List<Motors> showMotor() {
        return this.motorRepo.showMotor();
    }

    @Override
    public void createMotor(Motors motors) {
        this.motorRepo.createMotor(motors);

    }

    @Override
    public void removeMotor(int idMotor) {
        this.motorRepo.removeMotor(idMotor);

    }
}
