/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.dao;
import bestdeal.esprit.entities.Voucher;
import bestdeal.esprit.util.Connexion;
import java.sql.Connection;
import java.util.List;
/**
 *
 * @author Fahmi
 */
public class VoucherDAO implements DAO<Voucher>{

    Connection con;

    public VoucherDAO() {
        con= Connexion.getInstance();
    }
    @Override
    public void create(Voucher a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void update(Voucher a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Voucher> findAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Voucher findById(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean delete(Voucher a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
