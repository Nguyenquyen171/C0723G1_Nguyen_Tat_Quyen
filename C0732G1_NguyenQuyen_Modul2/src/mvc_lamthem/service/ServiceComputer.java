package mvc_lamthem.service;

import mvc_lamthem.model.Computer;
import mvc_lamthem.repository.IRepositoryComputer;
import mvc_lamthem.repository.RepositoryComputer;

import java.util.List;

public class ServiceComputer implements IServiceComputer {
    private final IRepositoryComputer repositoryComputer = new RepositoryComputer();

    @Override
    public void add(Computer computer) {
        repositoryComputer.add(computer);
    }

    @Override
    public List<Computer> search(String nameComputer) {
        return repositoryComputer.search(nameComputer);
    }

    @Override
    public void remove(String idComputer) {
        repositoryComputer.remove(idComputer);
    }

    @Override
    public List<Computer> display() {
        return repositoryComputer.display();
    }


}
