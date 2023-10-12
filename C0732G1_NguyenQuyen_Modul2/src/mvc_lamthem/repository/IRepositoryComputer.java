package mvc_lamthem.repository;

import mvc_lamthem.model.Computer;

import java.util.List;

public interface IRepositoryComputer {
    void add(Computer computer);

    List<Computer> search(String nameComputer);

    void remove(String idComputer);

    List<Computer> display();

    List<String> convertToString(List<Computer> computerList);

    List<Computer> convert(List<String> strings);

}
