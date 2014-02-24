/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.dao;
import bestdeal.esprit.entities.Reclamation;
import bestdeal.esprit.util.Connexion;
import java.sql.Connection;
import java.util.List;
/**
 *
 * @author Fahmi
 */
public class ReclamationDAO implements DAO<Reclamation>{

    Connection con;

    public ReclamationDAO() {
        con= Connexion.getInstance();
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
    public boolean delete(Reclamation a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
