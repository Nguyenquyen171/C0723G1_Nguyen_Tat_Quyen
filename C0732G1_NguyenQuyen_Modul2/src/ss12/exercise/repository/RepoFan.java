package ss12.exercise.repository;

import ss12.exercise.repository.irepository.IRepositoryFan;
import ss12.exercise.model.Fan;

import java.util.ArrayList;
import java.util.List;


public class RepoFan implements IRepositoryFan {
    private final List<Fan> fans = new ArrayList<>();

    @Override
    public ArrayList<Fan> getFan() {

        return (ArrayList<Fan>) fans;
    }

    @Override
    public void editProduct(int id, Fan fan) {
        for (int i = 0; i < fans.size(); i++) {
            if (fans.get(i).getId() == id) {
                fans.get(i).setName(fan.getName());
                fans.get(i).setId(fan.getId());
                fans.get(i).setValue(fan.getValue());
                return;
            }
        }
    }
    @Override
    public void createFan(Fan fan) {
        fans.add(fan);

    }

    @Override
    public void removeFan(int idFan) {
        for (int i = 0; i < fans.size(); i++) {
            if (fans.get(i).getId() == idFan) {
                fans.remove(i);
                return;
            }
        }
        System.out.println("Invalid ID");
    }
    @Override
    public void sortByPriceProductUp() {
        fans.sort((o1, o2) -> {
            if (o1.getValue() > o2.getValue()) {
                return 1;
            } else if (o1.getValue() == o2.getValue()) {
                return 0;
            } else {
                return -1;
            }
        });

    }
    @Override
    public void sortByPriceProductDown() {
        fans.sort((o1, o2) -> {
            if (o1.getValue() < o2.getValue()) {
                return 1;
            } else if (o1.getValue() == o2.getValue()) {
                return 0;
            } else {
                return -1;
            }
        });
    }

}
