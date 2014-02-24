/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.dao;
import  bestdeal.esprit.entities.Membre;
import bestdeal.esprit.util.Connexion;
import java.sql.Connection;
import java.util.List;
  /***
 *
 * @author Fahmi
 */
public class MembreDAO implements DAO<Membre>{

    
    Connection con;

    public MembreDAO() {
        con= Connexion.getInstance();
    }
    @Override
    public void create(Membre a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void update(Membre a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Membre> findAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Membre findById(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean delete(Membre a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
