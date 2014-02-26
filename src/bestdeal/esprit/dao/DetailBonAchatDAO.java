/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.dao;
import bestdeal.esprit.entities.DetailBonAchat;
import bestdeal.esprit.util.MyConnexion;
import java.sql.Connection;
import java.util.List;
/**
 *
 * @author Fahmi
 */
public class DetailBonAchatDAO implements DAO<DetailBonAchat>{

    Connection con;

    public DetailBonAchatDAO() {
        con= MyConnexion.getInstance();
    }
    @Override
    public void create(DetailBonAchat a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void update(DetailBonAchat a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<DetailBonAchat> findAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public DetailBonAchat findById(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete(int a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
