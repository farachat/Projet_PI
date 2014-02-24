/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.dao;
import bestdeal.esprit.entities.Reservation;
import bestdeal.esprit.util.Connexion;
import java.sql.Connection;
import java.util.List;
/**
 *
 * @author Fahmi
 */
public class ReservationDAO implements DAO<Reservation>{

    Connection con;

    public ReservationDAO() {
        con= Connexion.getInstance();
    }
    
    @Override
    public void create(Reservation a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void update(Reservation a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Reservation> findAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Reservation findById(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean delete(Reservation a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
