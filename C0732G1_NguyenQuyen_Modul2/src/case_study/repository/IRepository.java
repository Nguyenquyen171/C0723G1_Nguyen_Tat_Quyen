package case_study.repository;

import case_study.model.person.Customer;
import case_study.model.person.Employee;

import java.util.List;

public interface IRepository <E>{
        void add(E e);
    void remove(String id);
    List<E> display();
    List<E> convert(List<String> strings);
    List<String> convertToString(List<E> e);
}
