package mvc_lamthem.repository;

import mvc_lamthem.model.Computer;
import mvc_lamthem.ultils.UtilsFile;

import java.util.ArrayList;
import java.util.List;

public class RepositoryComputer implements IRepositoryComputer {
    private final String PATH_FILE="/Users/nguyentatquyen/Documents/GitHub/C0723G1_Nguyen_Tat_Quyen/C0732G1_NguyenQuyen_Modul2/src/mvc_lamthem/data/computer_data.csv";
    private final String COMMA = ",";

    @Override
    public void add(Computer computer) {
        List<Computer> computerList= display();
        computerList.add(computer);
        UtilsFile.writeFile(PATH_FILE,this.convertToString(computerList));

    }

    @Override
    public List<Computer> search(String nameComputer) {
        List<Computer> computerList= display();
        List<Computer> searchComputer= new ArrayList<>();
        for (Computer computer: computerList){
            if (computer.getName().contains(nameComputer)){
                searchComputer.add(computer);
            }else {
                System.out.println("khong tim thay ten ");
            }
        }
        return searchComputer;
    }


    @Override
    public void remove(String idComputer) {
        List<Computer>computerList=display();
        for (Computer computer: computerList) {
            if (computer.getId().equals(idComputer)) {
                computerList.remove(computer);
                break;
            }else {
                System.out.println("Khong tim thay id ");
            }
        }
        UtilsFile.writeFile(PATH_FILE,this.convertToString(computerList));

    }

    @Override
    public List<Computer> display() {
        return convert(UtilsFile.readFile(PATH_FILE));
    }

    @Override
    public List<String> convertToString(List<Computer> computerList) {
        List<String> strings = new ArrayList<>();
        for (Computer computer : computerList) {
            strings.add(
                    computer.getId() + COMMA +
                            computer.getName() + COMMA +
                            computer.getSize() + COMMA +
                            computer.getType() + COMMA +
                            computer.getPrice()

            );
        }
        return strings;
    }

    @Override
    public List<Computer> convert(List<String> strings) {
        List<Computer> computerList = new ArrayList<>();
        for (String string : strings) {
            String[] data = string.split(COMMA);
            computerList.add(new Computer(
                    data[0],
                    data[1],
                    data[2],
                    data[3],
                    Double.parseDouble(data[4])
            ));
        }
        return computerList;
    }
}