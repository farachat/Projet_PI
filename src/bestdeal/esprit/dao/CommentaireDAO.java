/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.dao;
import bestdeal.esprit.entities.Commentaire;
import bestdeal.esprit.util.MyConnexion;
import java.sql.Connection;
import java.util.List;
/**
 *
 * @author Fahmi
 */
public class CommentaireDAO implements DAO<Commentaire>
{
    Connection con;

    public CommentaireDAO() {
        con= MyConnexion.getInstance();
    }

    @Override
    public void create(Commentaire a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void update(Commentaire a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Commentaire> findAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Commentaire findById(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete(int a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
