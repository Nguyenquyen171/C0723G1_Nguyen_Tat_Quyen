package case_study.service;

import java.util.List;

public interface IService <E> {
    void add (E e);
    void remove(String id);
    List<E> display();
    List<E> convert(List<String> strings);
    List<String> convertToString(List<E> e);
}
