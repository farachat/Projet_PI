/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.dao;
import bestdeal.esprit.entities.Deal;
import bestdeal.esprit.entities.Stock;
import bestdeal.esprit.util.Connexion;
import bestdeal.esprit.util.MyConnexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import bestdeal.esprit.gui.AjoutDeal;
/**
 *
 * @author Fahmi
 */
public class StockDAO implements DAO<Stock>{

    Connection con;

    public StockDAO() {
        con= MyConnexion.getInstance();
    }
    @Override
    public void create(Stock a) {
        String requete = "insert into stock(id_stock,id_deal,qte_stock_disponible,qte_stock_initial) values (?,?,?,?)";
        try {
            
            PreparedStatement ps = Connexion.getInstance().prepareStatement(requete);
            ps.setInt(2, a.getIdDeal().getIdDeal());
            ps.setInt(1, a.getIdStock());
            ps.setInt(3, a.getQteStockDisponible());
            ps.setInt(4, a.getQteStockInitial());
            
            ps.executeUpdate();
            System.out.println("Ajout effectuÃ©e avec succÃ¨s");
        } catch (SQLException ex) {
           
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
    
 public void create2(Stock a , int id) 
 {String requete = "insert into stock(id_stock,id_deal,qte_stock_disponible,qte_stock_initial) values (?,?,?,?)";
        try {
            
            PreparedStatement ps = Connexion.getInstance().prepareStatement(requete);
            ps.setInt(2, id);
            ps.setInt(1, a.getIdStock());
            ps.setInt(3, a.getQteStockDisponible());
            ps.setInt(4, a.getQteStockInitial());
            
            ps.executeUpdate();
            System.out.println("Ajout effectuÃ©e avec succÃ¨s");
        } catch (SQLException ex) {
           
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }}
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
    public void delete(int a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
