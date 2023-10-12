package mvc.service.impl;

import case_study.repository.ICustomerRepository;
import mvc.model.Fruits;
import mvc.repository.IRepositoryFruits;
import mvc.repository.impl.RepositoryFruits;
import mvc.service.IServiceFruits;

import java.util.List;

public class ServiceFruits implements IServiceFruits {
    private final IRepositoryFruits repositoryFruits= new RepositoryFruits();

    @Override
    public void add(Fruits fruits) {
        repositoryFruits.add(fruits);
    }

    @Override
    public void remove(String id) {
        repositoryFruits.remove(id);
    }

    @Override
    public List<Fruits> display() {
        return repositoryFruits.display();
    }

    @Override
    public void editFruits(String idFruits, Fruits fruits) {
        repositoryFruits.editFruits(idFruits, fruits);
    }

    @Override
    public List<Fruits> searchFruits(String nameFruits) {
        return repositoryFruits.searchFruits(nameFruits);
    }


}
