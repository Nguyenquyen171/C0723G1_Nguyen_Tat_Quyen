package case_study.service.impl;

import case_study.model.person.Customer;
import case_study.model.person.Employee;
import case_study.repository.ICustomerRepository;
import case_study.repository.impl.CustomerRepository;
import case_study.service.ICustomerService;
import case_study.service.IService;

import java.util.List;

public class CustomerService implements ICustomerService {
    private final ICustomerRepository customerRepository= new CustomerRepository();
    @Override
    public void add(Customer customer) {
        this.customerRepository.add(customer);
    }

    @Override
    public void remove(String id) {
        this.customerRepository.remove(id);
    }

    @Override
    public List<Customer> display() {
        return this.customerRepository.display();
    }

    @Override
    public List<Customer> searchCustomer(String nameCustomer) {
        return customerRepository.searchCustomer(nameCustomer);

    }

    @Override
    public void editCustomer(String idCustomer, Customer customer) {
        customerRepository.editCustomer(idCustomer,customer);
    }
}