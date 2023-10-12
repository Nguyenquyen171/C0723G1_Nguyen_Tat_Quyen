package mvc.service;

import mvc.model.Fruits;

import java.util.List;

public interface IServiceFruits {
    void add(Fruits fruits);
    void remove(String id);
    List<Fruits> display();
    List<Fruits> searchFruits(String nameFruits);
    void editFruits(String idFruits, Fruits fruits);

}
