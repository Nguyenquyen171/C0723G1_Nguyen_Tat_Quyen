package case_study.service;

import case_study.model.person.Employee;

import java.util.List;

public interface IService <E> {
    void add (E e);
    void remove(String id);
    List<E> display();

}
