/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.dao;
import bestdeal.esprit.entities.Deal;
import bestdeal.esprit.entities.Reclamation;
import bestdeal.esprit.util.Connexion;
import bestdeal.esprit.util.MyConnexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Fahmi
 */
public class ReclamationDAO implements DAO<Reclamation>{

    Connection con;

    public ReclamationDAO() {
        con= MyConnexion.getInstance();
    }
    
    @Override
    public void create(Reclamation a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void update(Reclamation a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Reclamation> findAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Reclamation findById(int id) {throw new UnsupportedOperationException("Not supported yet.");}
 

    
    
    public Reclamation findByIdd(int id) {
        Reclamation rec = new Reclamation();
     String requete = "select id_reclamation from deal where id_reclamation=?";
        try {
            PreparedStatement ps = Connexion.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                rec.setIdReclamation(resultat.getInt(1));
                
            }
            return rec;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du deal "+ex.getMessage());
            return null;
        }
    }
    

    @Override
    public void delete(int a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
     public List<Reclamation> DiplayAllReclamations() {
        List<Reclamation> listrec = new ArrayList<Reclamation>();
        String requete = "select * from reclamation";
        try {
            Statement statement = Connexion.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            AdministrateurDAO administrateurDAO = new AdministrateurDAO();
            MembreDAO membreDAO = new MembreDAO();
            while (resultat.next()) {
                Reclamation reclamation = new Reclamation();
                reclamation.setIdReclamation(resultat.getInt(1));
                reclamation.setIdMembre(membreDAO.findById(resultat.getInt(2)));
                reclamation.setIdAdmin(administrateurDAO.findById(resultat.getInt(3)));
                reclamation.setLibelle(resultat.getString(4));
                reclamation.setDateSys(resultat.getDate(5));
                listrec.add(reclamation);
            }
            return listrec;
        } catch (SQLException ex) {
            System.out.println("probleme d'affichage" + ex.getMessage());
            return null;
        }
    }
    
}
