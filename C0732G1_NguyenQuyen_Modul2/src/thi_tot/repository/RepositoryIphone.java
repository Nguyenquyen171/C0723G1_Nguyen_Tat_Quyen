package thi_tot.repository;

import mvc.model.Fruits;
import mvc.utils.FileUtils;
import thi_tot.file_utils.UtilsFile;
import thi_tot.model.Iphone;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class RepositoryIphone implements  IRepository{
    private final String COMMA = ",";
    private final String PATH_FILE = "/Users/nguyentatquyen/Documents/GitHub/C0723G1_Nguyen_Tat_Quyen/C0732G1_NguyenQuyen_Modul2/src/thi_tot/data/iphone_data.cvs";

    @Override
    public void add(Iphone iphone) {
      List<Iphone> iphoneList= display();
        iphoneList.add(iphone);
        UtilsFile.writeFile(PATH_FILE,this.convertToString(iphoneList));


    }

    @Override
    public void remove(String idIphone) {
        List<Iphone> iphoneList= display();
        for (Iphone iphone:iphoneList){
            if (iphone.getId().equals(idIphone)){
                iphoneList.remove(iphone);
                break;
            }
        }
        FileUtils.writeFile(PATH_FILE,this.convertToString(iphoneList));

    }

    @Override
    public List<Iphone> searchIphone(String nameIphone) {
        List<Iphone> iphoneList= display();
        List<Iphone> searchIphone= new ArrayList<>() ;
        for (Iphone iphone: iphoneList){
            if (iphone.getName().contains(nameIphone)){
                searchIphone.add(iphone);
            }
        }
        return searchIphone;
    }

    @Override
    public List<Iphone> display() {
        List<Iphone> iphoneList = convert(FileUtils.readFile(PATH_FILE));
        iphoneList.sort((o1, o2) -> {
                    if (o1.getPrice() > o2.getPrice()) {
                        return 1;
                    } else if (o1.getPrice() == o2.getPrice()) {
                        return 0;
                    } else {
                        return -1;
                    }
                }
        );
        return iphoneList;
    }

    @Override
    public List<String> convertToString(List<Iphone> iphoneList) {
        List<String> strings = new ArrayList<>();
        for (Iphone customer : iphoneList) {
            strings.add(
                    customer.getId() + COMMA +
                            customer.getName() + COMMA +
                            customer.getYear() + COMMA +
                            customer.getFrom() + COMMA +
                            customer.getPrice()
            );
        }
        return strings;
    }

    @Override
    public List<Iphone> convert(List<String> strings) {
        List<Iphone> customerList = new ArrayList<>();
        for (String string : strings) {
            String[] data = string.split(COMMA);
            customerList.add(new Iphone(
                    data[0],
                    data[1],
                    Integer.parseInt(data[2]),
                    data[3],
                    Double.parseDouble(data[4])
            ));
        }
        return customerList;
    }



}