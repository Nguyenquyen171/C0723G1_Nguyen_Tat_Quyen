package mvc.repository.impl;

import mvc.model.Fruits;
import mvc.repository.IRepositoryFruits;
import mvc.utils.FileUtils;

import java.util.ArrayList;
import java.util.List;

public class RepositoryFruits implements IRepositoryFruits {
    private final String COMMA = ",";
    private final String PATH_FILE = "/Users/nguyentatquyen/Documents/GitHub/C0723G1_Nguyen_Tat_Quyen/C0732G1_NguyenQuyen_Modul2/src/mvc/data /data_fruits.csv";

    @Override
    public List<String> convertToString(List<Fruits> fruitsList) {
        List<String> strings = new ArrayList<>();
        for (Fruits fruits : fruitsList) {
            strings.add(
                    fruits.getId() + COMMA +
                            fruits.getName() + COMMA +
                            fruits.getFrom() + COMMA +
                            fruits.getQuantity() + COMMA +
                            fruits.getPrice() + COMMA

            );
        }
        return strings;
    }

    @Override
    public void add(Fruits fruits) {
        List<Fruits> fruitsList = display();
        fruitsList.add(fruits);
        FileUtils.writeFile(PATH_FILE, this.convertToString(fruitsList));

    }

    @Override
    public void remove(String id) {
        List<Fruits> fruitsList = display();
        for (Fruits fruits : fruitsList) {
            if (fruits.getId().equals(id)) {
                fruitsList.remove(fruits);
                break;
            }
        }
        FileUtils.writeFile(PATH_FILE, this.convertToString(fruitsList));

    }

    @Override
    public List<Fruits> display() {
        List<Fruits> fruitsList = convert(FileUtils.readFile(PATH_FILE));
        fruitsList.sort((o1, o2) -> {
                    if (o1.getPrice() > o2.getPrice()) {
                        return 1;
                    } else if (o1.getPrice() == o2.getPrice()) {
                        return 0;
                    } else {
                        return -1;
                    }
                }
        );
        return fruitsList;
    }

    @Override
    public void editFruits(String idFruits, Fruits fruits) {
        List<Fruits> fruitsList = display();
        for (Fruits fruits1 : fruitsList) {
            if (fruits1.getId().equals(idFruits)) {
                fruits1.setId(fruits.getId());
                fruits1.setName(fruits.getName());
                fruits1.setFrom(fruits.getFrom());
                fruits1.setQuantity(fruits.getQuantity());
                fruits1.setPrice(fruits.getPrice());
                return;
            }
        }
        FileUtils.writeFile(PATH_FILE,this.convertToString(fruitsList));
    }

    @Override
    public List<Fruits> searchFruits(String nameFruits) {
        List<Fruits> fruitsList = display();
        List<Fruits> searchFruit = new ArrayList<>();
        for (Fruits fruits : fruitsList) {
            if (fruits.getName().contains(nameFruits)) {
                searchFruit.add(fruits);
            }
        }
        return searchFruit;
    }

    @Override
    public List<Fruits> convert(List<String> strings) {
        List<Fruits> fruitsList = new ArrayList<>();
        for (String string : strings) {
            String[] data = string.split(COMMA);
            fruitsList.add(new Fruits(
                    data[0],
                    data[1],
                    data[2],
                    Integer.parseInt(data[3]),
                    Double.parseDouble(data[4])

            ));
        }
        return fruitsList;
    }
}