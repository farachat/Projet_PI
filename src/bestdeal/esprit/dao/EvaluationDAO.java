/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.dao;
import bestdeal.esprit.entities.Evaluation;
import bestdeal.esprit.util.Connexion;
import bestdeal.esprit.util.MyConnexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author Fahmi
 */
public class EvaluationDAO implements DAO<Evaluation>{

    
    Connection con;

    public EvaluationDAO() {
        con= MyConnexion.getInstance();
    }
    
    @Override
    public void create(Evaluation a) {
        String requete ="insert into evaluation (id_membre,id_deal,note) values (?,?,?)";
         try {
            PreparedStatement ps = Connexion.getInstance().prepareStatement(requete);
          ps.setInt(2, a.getIdDeal().getIdDeal());
          ps.setInt(1, a.getIdMembre().getIdMembre());
            ps.setInt(3, a.getNote());
            
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
         
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }

    @Override
    public void update(Evaluation a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Evaluation> findAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Evaluation findById(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete(int a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
