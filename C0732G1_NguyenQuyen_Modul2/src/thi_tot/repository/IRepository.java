package thi_tot.repository;

import thi_tot.model.Iphone;

import java.util.List;

public interface IRepository {
    void add(Iphone iphone);
    void remove(String idIphone);
    List<Iphone> searchIphone(String nameIphone);
    List<Iphone> display();
    List<String> convertToString(List<Iphone> iphoneList);
    List<Iphone> convert(List<String> strings);
}
