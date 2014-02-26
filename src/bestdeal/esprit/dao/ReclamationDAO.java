/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.dao;
import bestdeal.esprit.entities.Reclamation;
import bestdeal.esprit.util.MyConnexion;
import java.sql.Connection;
import java.util.List;
/**
 *
 * @author Fahmi
 */
public class ReclamationDAO implements DAO<Reclamation>{

    Connection con;

    public ReclamationDAO() {
        con= MyConnexion.getInstance();
    }
    
    @Override
    public void create(Reclamation a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void update(Reclamation a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Reclamation> findAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Reclamation findById(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete(int a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
