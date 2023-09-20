package ss12.exercise.service;


import ss12.exercise.repository.RepoFan;
import ss12.exercise.model.Fan;
import ss12.exercise.service.iservice.IServiceFan;

import java.util.ArrayList;

public class ServiceFan implements IServiceFan {
    private RepoFan repoFan = new RepoFan();

    @Override
    public ArrayList<Fan> getFan() {
        return repoFan.getFan();
    }

    @Override
    public void createFan(Fan fan) {
        repoFan.createFan(fan);

    }

    @Override
    public void removeFan(int idFan) {
        repoFan.removeFan(idFan);

    }

    @Override
    public void editProduct(int id, Fan fan) {
        repoFan.editProduct(id, fan);

    }

    @Override
    public void sortByPriceProductUp() {
        repoFan.sortByPriceProductUp();
    }

    @Override
    public void sortByPriceProductDown() {
        repoFan.sortByPriceProductDown();

    }
}
