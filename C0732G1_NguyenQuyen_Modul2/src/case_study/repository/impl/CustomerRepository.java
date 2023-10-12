package case_study.repository.impl;

import case_study.model.person.Customer;
import case_study.repository.ICustomerRepository;
import case_study.utils.FileUtils;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private final String PATH_FILE = "/Users/nguyentatquyen/Documents/GitHub/C0723G1_Nguyen_Tat_Quyen/C0732G1_NguyenQuyen_Modul2/src/case_study/data/data_customer";
    private final String COMMA = ",";

    @Override
    public void add(Customer customer) {
        List<Customer> customerList = display();
        customerList.add(customer);
        FileUtils.writeFile(PATH_FILE, this.convertToString(customerList));
    }

    @Override
    public void remove(String id) {
        List<Customer> customerList = display();
        for (Customer customer : customerList) {
            if (customer.getId().equals(id)) {
                customerList.remove(customer);
                break;
            }
        }
        FileUtils.writeFile(PATH_FILE, this.convertToString(customerList));
    }

    @Override
    public List<Customer> display() {

//        return convert(FileUtils.readFile(PATH_FILE));
        return convert(FileUtils.readFile(PATH_FILE));

    }

    @Override
    public List<Customer> convert(List<String> strings) {
        List<Customer> customerList = new ArrayList<>();
        for (String string : strings) {
            String[] data = string.split(COMMA);
            customerList.add(new Customer(
                    data[0],
                    data[1],
                    data[2],
                    data[3],
                    data[4],
                    data[5],
                    data[6],
                    data[7],
                    data[8]
            ));
        }
        return customerList;
    }

    @Override
    public List<String> convertToString(List<Customer> customerList) {
        List<String> strings = new ArrayList<>();
        for (Customer customer : customerList) {
            strings.add(
                    customer.getId() + COMMA +
                            customer.getName() + COMMA +
                            customer.getIdentificationCard() + COMMA +
                            customer.getPhoneNumber() + COMMA +
                            customer.getEmail() + COMMA +
                            customer.getLevel() + COMMA +
                            customer.getLocation() + COMMA +
                            customer.getGender() + COMMA +
                            customer.getAge() + COMMA
            );
        }
        return strings;
    }

    @Override
    public List<Customer> searchCustomer(String nameCustomer) {
        List<Customer> customerList = display();
        List<Customer> searchCustomer = new ArrayList<>();
        for (Customer customer : customerList) {
            if (customer.getName().contains(nameCustomer)) {
                searchCustomer.add(customer);
            }
        }
        return searchCustomer;

    }

    @Override
    public void editCustomer(String idCustomer, Customer customer) {
        List<Customer> customerList = display();
        for (Customer customer1 : customerList) {
            if (customer1.getId().contains(idCustomer)) {
                customer1.setId(customer.getId());
                customer1.setName(customer.getName());
                customer1.setAge(customer.getAge());
                customer1.setGender(customer.getGender());
                customer1.setIdentificationCard(customer.getIdentificationCard());
                customer1.setPhoneNumber(customer.getPhoneNumber());
                customer1.setEmail(customer.getEmail());
                customer1.setLevel(customer.getLevel());
                customer1.setLocation(customer.getLocation());
            }
        }
    }
}
