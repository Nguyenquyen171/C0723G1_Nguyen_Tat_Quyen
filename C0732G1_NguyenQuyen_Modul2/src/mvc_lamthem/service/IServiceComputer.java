package mvc_lamthem.service;

import mvc_lamthem.model.Computer;

import java.util.List;

public interface IServiceComputer {
    void add(Computer computer);

    List<Computer> search(String nameComputer);

    void remove(String idComputer);

    List<Computer> display();
}
