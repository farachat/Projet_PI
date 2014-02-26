/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.dao;
import bestdeal.esprit.entities.Fournisseur;
import bestdeal.esprit.util.MyConnexion;
import java.sql.Connection;
import java.util.List;
/**
 *
 * @author Fahmi
 */
public class FournisseurDAO implements DAO<Fournisseur> {

    Connection con;

    public FournisseurDAO() {
        con= MyConnexion.getInstance();
    }
    
    @Override
    public void create(Fournisseur a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void update(Fournisseur a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Fournisseur> findAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Fournisseur findById(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete(int a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
