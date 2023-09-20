package ss12.exercise.service.iservice;

import ss12.exercise.model.Fan;

import java.util.ArrayList;

import java.util.List;

public interface IServiceFan {
    ArrayList<Fan> getFan();

    void createFan(Fan fan);

    void removeFan(int idFan);


    void editProduct(int id,Fan fan);


    void sortByPriceProductUp();

    void sortByPriceProductDown();
}
