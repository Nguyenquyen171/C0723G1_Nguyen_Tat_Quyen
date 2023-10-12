package mvc.repository;

import mvc.model.Fruits;

import java.util.List;

public interface IRepositoryFruits {


    void add(Fruits fruits);

    void remove(String id);

    List<Fruits> display();

    void editFruits(String idFruits, Fruits fruits);

    List<Fruits> searchFruits(String nameFruits);

    List<Fruits> convert(List<String> strings);
    List<String> convertToString(List<Fruits> fruitsList);
}
