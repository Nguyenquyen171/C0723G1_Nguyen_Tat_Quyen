package service.impl;

import model.User;
import repository.IRepositoryUser;
import repository.impl.RepositoryUser;
import service.IServiceUser;

import java.util.List;

public class ServiceUser implements IServiceUser {
private final IRepositoryUser repositoryUser= new RepositoryUser();
    @Override
    public List<User> selectAllUsers() {
        return repositoryUser.selectAllUsers();
    }

    @Override
    public User selectUser(int id) {
        return repositoryUser.selectUser(id);
    }

    @Override
    public void insertUser(User user) {
        repositoryUser.insertUser(user);
    }

    @Override
    public boolean deleteUser(int id) {
        return repositoryUser.deleteUser(id);
    }

    @Override
    public boolean updateUser(User user) {
        return repositoryUser.updateUser(user);
    }

    @Override
    public List<User> findByCountry(String country) {
        return repositoryUser.findByCountry(country);
    }


}