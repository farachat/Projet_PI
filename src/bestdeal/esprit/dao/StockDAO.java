/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.dao;
import bestdeal.esprit.entities.Stock;
import bestdeal.esprit.util.Connexion;
import java.sql.Connection;
import java.util.List;
/**
 *
 * @author Fahmi
 */
public class StockDAO implements DAO<Stock>{

    Connection con;

    public StockDAO() {
        con= Connexion.getInstance();
    }
    @Override
    public void create(Stock a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void update(Stock a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Stock> findAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Stock findById(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean delete(Stock a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
