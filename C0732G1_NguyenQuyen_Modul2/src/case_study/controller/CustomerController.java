package case_study.controller;

import case_study.model.person.Customer;
import case_study.model.person.Employee;
import case_study.repository.impl.CustomerRepository;
import case_study.service.impl.CustomerService;

import java.util.List;

public class CustomerController {
   CustomerService customerService= new CustomerService();

    public void add(Customer customer) {
        customerService.add(customer);
    }

    public void remove(String id) {
        customerService.remove(id);
    }

    public List<Customer> display() {
        return customerService.display();
    }

    public List<Customer> searchCustomer(String nameCustomer) {
        return customerService.searchCustomer(nameCustomer);
    }

    public void editCustomer(String idCustomer, Customer customer) {
        customerService.editCustomer(idCustomer, customer);
    }
}
