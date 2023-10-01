package case_study.service;

import case_study.model.person.Customer;
import case_study.model.person.Employee;

import java.util.List;

public interface ICustomerService extends IService<Customer> {
    @Override
    void add(Customer customer);

    @Override
    void remove(String id);

    @Override
    List<Customer> display();


    void searchCustomer(String nameCustomer);
    void editCustomer(String idCustomer, Customer customer);
}
