package ss12.exercise.Repository.IRepository;

import ss12.exercise.model.Fan;

import java.util.ArrayList;
import java.util.List;

public interface IRepositoryFan {
    ArrayList<Fan> getFan();

    void createFan(Fan fan);

    void removeFan(int idFan);


    void editProduct(int id,Fan fan);


    void sortByPriceProductUp();

    void sortByPriceProductDown();
}
