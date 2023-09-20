package ss12.exercise.repository.irepository;

import ss12.exercise.model.Fan;

import java.util.ArrayList;

public interface IRepositoryFan {
    ArrayList<Fan> getFan();

    void createFan(Fan fan);

    void removeFan(int idFan);


    void editProduct(int id,Fan fan);


    void sortByPriceProductUp();

    void sortByPriceProductDown();
}
