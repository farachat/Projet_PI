/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.dao;
import bestdeal.esprit.entities.DetailReservation;
import bestdeal.esprit.util.MyConnexion;
import java.sql.Connection;
import java.util.List;
/**
 *
 * @author Fahmi
 */
public class DetailReservationDAO implements DAO<DetailReservation>{

    
    Connection con;

    public DetailReservationDAO() {
        con= MyConnexion.getInstance();
    }
    
    @Override
    public void create(DetailReservation a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void update(DetailReservation a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<DetailReservation> findAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public DetailReservation findById(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean delete(DetailReservation a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
