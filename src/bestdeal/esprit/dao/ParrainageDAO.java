/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.dao;
import bestdeal.esprit.entities.Parrainage;
import bestdeal.esprit.util.MyConnexion;
import java.sql.Connection;
import java.util.List;
/**
 *
 * @author Fahmi
 */
public class ParrainageDAO implements DAO<Parrainage>{

    Connection con;

    public ParrainageDAO() {
        con= MyConnexion.getInstance();
    }
    @Override
    public void create(Parrainage a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void update(Parrainage a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Parrainage> findAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Parrainage findById(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean delete(Parrainage a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
