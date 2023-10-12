package mvc.controller;

import mvc.model.Fruits;
import mvc.service.IServiceFruits;
import mvc.service.impl.ServiceFruits;

import java.util.List;

public class FruitsController {
    private final IServiceFruits serviceFruits=  new ServiceFruits();

    public void add(Fruits fruits) {
        serviceFruits.add(fruits);
    }

    public void remove(String id) {
        serviceFruits.remove(id);
    }

    public List<Fruits> display() {
        return serviceFruits.display();
    }

    public List<Fruits> searchFruits(String nameFruits) {
        return serviceFruits.searchFruits(nameFruits);
    }

    public void editFruits(String idFruits, Fruits fruits) {
        serviceFruits.editFruits(idFruits, fruits);
    }
}
