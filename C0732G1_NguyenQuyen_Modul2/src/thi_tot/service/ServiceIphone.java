package thi_tot.service;

import thi_tot.model.Iphone;
import thi_tot.repository.IRepository;
import thi_tot.repository.RepositoryIphone;

import java.util.List;

public class ServiceIphone implements IService {
    private  final IRepository repository= new RepositoryIphone();

    @Override
    public void add(Iphone iphone) {
        repository.add(iphone);
    }

    @Override
    public void remove(String idIphone) {
        repository.remove(idIphone);
    }

    @Override
    public List<Iphone> searchIphone(String nameIphone) {
        return repository.searchIphone(nameIphone);
    }

    @Override
    public List<Iphone> display() {
        return repository.display();
    }


}
