/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.dao;
import bestdeal.esprit.entities.Deal;
import bestdeal.esprit.util.MyConnexion;
import java.sql.Connection;
import java.util.List;
/**
 *
 * @author Fahmi
 */
public class DealDAO implements DAO<Deal>{

    Connection con;

    public DealDAO() {
        con= MyConnexion.getInstance();
    }
    @Override
    public void create(Deal a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void update(Deal a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Deal> findAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Deal findById(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean delete(Deal a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
