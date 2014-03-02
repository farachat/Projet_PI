/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.dao;
import bestdeal.esprit.entities.Commentaire;
import bestdeal.esprit.entities.Deal;
import bestdeal.esprit.entities.Membre;
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
public class CommentaireDAO implements DAO<Commentaire>
{
    Connection con;

    public CommentaireDAO() {
        con= MyConnexion.getInstance();
    }

    @Override
    public void create(Commentaire a) {
        String requete = "insert into commentaire(id_deal,id_membre,commentaire,datesystem) values (?,?,?,?)";
        try {
            PreparedStatement ps = Connexion.getInstance().prepareStatement(requete);
            ps.setInt(1, a.getDeal().getIdDeal());
            ps.setInt(2, a.getMembre().getIdMembre());
            ps.setString(3, a.getCommentaire());
            ps.setDate(4, (new java.sql.Date(a.getDateSys().getTime())));
            ps.executeUpdate();
            System.out.println("Ajout effectuÃ©e avec succÃ¨s");
        } catch (SQLException ex) {
           
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }

    @Override
    public void update(Commentaire a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Commentaire> DisplayAllCommentaires()
    {
        List<Commentaire> listecommentaires = new ArrayList<Commentaire>();

        String requete = "select * from commentaire";
        try {
           Statement statement = Connexion.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Commentaire comm =new Commentaire();
                Deal deal = new Deal();
                Membre membre = new Membre();
                DealDAO dealDao=new DealDAO();
                deal=dealDao.findById(resultat.getInt(1));
                MembreDAO membreDao=new MembreDAO();
                membre=membreDao.findById(resultat.getInt(1));
                comm.setDeal(deal);
                comm.setMembre(membre);
                comm.setCommentaire(resultat.getString(3));
                comm.setDateSys(resultat.getDate(4));
                comm.setIdCommentaire(resultat.getInt(5));
                listecommentaires.add(comm);
            }
            return listecommentaires;
        } catch (SQLException ex) {
           
            System.out.println("erreur lors du chargement des depots "+ex.getMessage());
            return null;
            
        }
        
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
       String requete = "delete from commentaire where id_commentaire=?";
        try {
            PreparedStatement ps = Connexion.getInstance().prepareStatement(requete);
            ps.setInt(1, a);
            ps.executeUpdate();
            System.out.println("Commentaire supprimÃ©");
        } catch (SQLException ex) {
       
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }
    
}
