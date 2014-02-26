/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.dao;
import bestdeal.esprit.entities.BonAchat;
import bestdeal.esprit.util.MyConnexion;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Fahmi
 */
public class BonAchatDAO implements DAO<BonAchat>
{
    Connection con;

    public BonAchatDAO() {
        con= MyConnexion.getInstance();
    }

    @Override
    public void create(BonAchat a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void update(BonAchat a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<BonAchat> findAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public BonAchat findById(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete(int a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
