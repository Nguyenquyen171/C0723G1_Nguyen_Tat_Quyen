package ss12.exercise.controller;

import ss12.exercise.model.Fan;
import ss12.exercise.service.FanService;

import java.util.ArrayList;

public class FanController {
    private final FanService serviceFan = new FanService();

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
