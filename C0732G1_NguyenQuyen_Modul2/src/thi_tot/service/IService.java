package thi_tot.service;

import thi_tot.model.Iphone;

import java.util.List;

public interface IService {
    void add(Iphone iphone);
    void remove(String idIphone);
    List<Iphone> searchIphone(String nameIphone);
    List<Iphone> display();
}
