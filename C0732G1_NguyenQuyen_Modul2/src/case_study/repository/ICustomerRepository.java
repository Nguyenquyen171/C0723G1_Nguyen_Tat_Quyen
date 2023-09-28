package case_study.repository;

import case_study.model.person.Customer;

import java.util.List;

public interface ICustomerRepository extends  IRepository<Customer> {
    @Override
    void add(Customer customer);

    @Override
    void remove(String id);

    @Override
    List<Customer> display();

    @Override
    List<Customer> convert(List<String> strings);

    @Override
    List<String> convertToString(List<Customer> e);
    void searchCustomer(String nameCustomer);
    void editCustomer(String idCustomer, Customer customer);
}