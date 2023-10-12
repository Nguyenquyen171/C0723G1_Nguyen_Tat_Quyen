package thi_tot.controller;

import thi_tot.model.Iphone;
import thi_tot.service.IService;
import thi_tot.service.ServiceIphone;

import java.util.List;

public class IphoneController {
    private final IService iService=new ServiceIphone();

    public void add(Iphone iphone) {
        iService.add(iphone);
    }

    public void remove(String idIphone) {
        iService.remove(idIphone);
    }

    public List<Iphone> searchIphone(String nameIphone) {
        return iService.searchIphone(nameIphone);
    }

    public List<Iphone> display() {
        return iService.display();
    }
}
