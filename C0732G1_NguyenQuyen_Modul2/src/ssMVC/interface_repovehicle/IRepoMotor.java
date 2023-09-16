package ssMVC.interface_repovehicle;

import ssMVC.model.Motors;

import java.util.List;

public interface IRepoMotor {
    List<Motors> showMotor();
    void createMotor(Motors motors);
    void removeMotor(int idMotor);
}
