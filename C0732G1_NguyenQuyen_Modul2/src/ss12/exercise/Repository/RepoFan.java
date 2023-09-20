package ss12.exercise.Repository;

import ss12.exercise.Repository.IRepository.IRepositoryFan;
import ss12.exercise.model.Fan;

import java.util.ArrayList;
import java.util.List;


public class RepoFan implements IRepositoryFan {
    private final ArrayList<Fan> fanRepo = new ArrayList<>();

    @Override
    public ArrayList<Fan> getFan() {
        return fanRepo;
    }

    @Override
    public void editProduct(int id, Fan fan) {
        for (int i = 0; i < fanRepo.size(); i++) {
            if (fanRepo.get(i).getId() == id) {
                fanRepo.get(i).setName(fan.getName());
                fanRepo.get(i).setId(fan.getId());
                fanRepo.get(i).setValue(fan.getValue());
                return;
            }
        }
    }

    @Override
    public void createFan(Fan fan) {
        fanRepo.add(fan);

    }

    @Override
    public void removeFan(int idFan) {
        for (int i = 0; i < fanRepo.size(); i++) {
            if (fanRepo.get(i).getId() == idFan) {
                fanRepo.remove(i);
                return;
            }
        }
        System.out.println("Invalid ID");
    }
    @Override
    public void sortByPriceProductUp() {
        fanRepo.sort((o1, o2) -> {
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
        fanRepo.sort((o1, o2) -> {
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
