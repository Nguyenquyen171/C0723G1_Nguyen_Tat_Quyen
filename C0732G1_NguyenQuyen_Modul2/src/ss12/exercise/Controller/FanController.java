package ss12.exercise.Controller;

import ss12.exercise.model.Fan;
import ss12.exercise.service.ServiceFan;

import java.util.ArrayList;

public class FanController {
    private final ServiceFan serviceFan = new ServiceFan();

    public ArrayList<Fan> getFan() {
        return serviceFan.getFan();
    }

    public void createFan(Fan fan) {
        serviceFan.createFan(fan);
    }

    public void removeFan(int idFan) {
        serviceFan.removeFan(idFan);
    }

    public void editProduct(int id, Fan fan) {
        serviceFan.editProduct(id, fan);
    }

    public void sortByPriceProductUp() {
        serviceFan.sortByPriceProductUp();
    }

    public void sortByPriceProductDown() {
        serviceFan.sortByPriceProductDown();
    }
}
