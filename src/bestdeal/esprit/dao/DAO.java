/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.dao;

import java.util.List;

/**
 *
 * @author Fahmi
 */
public interface DAO <T> {
    
    void create(T a);
    void update(T a);
    List<T> findAll();
    T findById(int id);
    void delete(int id);
    
}
