/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.dao;
import java.util.List;

/**
 *
 * @author DELL
 */
public interface DealProposéInterface <T> {
     void create(T d);   
    List<T> findAll(int i);  
    T findById(int id);
    void delete(int id);
    
  
    
}
