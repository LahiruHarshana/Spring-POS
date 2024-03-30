package lk.ijse.gdse66.spring.service;

import java.util.ArrayList;

/**
 * @author : L.H.J
 * @File: CrudService
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-03-30, Saturday
 **/
public interface CrudService<T> {
    void save(T t);
    void update(T t);
    void delete(T t);
    T search(T t);
    ArrayList<T> getAll();
}
