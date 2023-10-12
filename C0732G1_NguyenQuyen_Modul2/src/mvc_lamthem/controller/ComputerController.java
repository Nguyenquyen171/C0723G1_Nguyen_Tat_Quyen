package mvc_lamthem.controller;

import mvc_lamthem.model.Computer;
import mvc_lamthem.service.IServiceComputer;
import mvc_lamthem.service.ServiceComputer;

import java.util.List;

public class ComputerController {
    private final IServiceComputer serviceComputer= new ServiceComputer();

    public void add(Computer computer) {
        serviceComputer.add(computer);
    }

    public List<Computer> search(String nameComputer) {
        return serviceComputer.search(nameComputer);
    }

    public void remove(String idComputer) {
        serviceComputer.remove(idComputer);
    }

    public List<Computer> display() {
        return serviceComputer.display();
    }
}
