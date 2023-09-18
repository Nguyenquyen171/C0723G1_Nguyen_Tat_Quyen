package ssMVC.service.interface_vehicle;

import ssMVC.model.Motors;

import java.util.List;

public interface IMotoService {
    List<Motors> showMotor();
    void createMotor(Motors motors);
    void removeMotor(int idMotor);
}
