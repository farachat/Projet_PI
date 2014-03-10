/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.dao;
import bestdeal.esprit.entities.Fournisseur;
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
public class FournisseurDAO implements DAO<Fournisseur> {

    Connection con;

    public FournisseurDAO() {
        con= MyConnexion.getInstance();
    }
    
    @Override
    public void create(Fournisseur a) {
         String requete = "insert into fournisseur (id_fournisseur,nom_fournisseur,mail_fournisseur,tel_fournisseur,adresse_fournisseur,id_membre)values(?,?,?,?,?,?)"; 
       try{ 
           PreparedStatement ps = Connexion.getInstance().prepareStatement(requete); 
           ps.setInt(1,a.getIdFournisseur() );
           ps.setString(2,a.getNomFournisseur());
           ps.setString(3,a.getMailFournisseur()); 
           ps.setString(4,a.getTelFournisseur()); 
           ps.setString(5,a.getAdresseFournisseur()); 
          ps.setInt(6,a.getMembre().getIdMembre());          
           
           ps.executeUpdate(); System.out.println("Ajout effectuÃ© avec succÃ©s!"); 
       } 
       catch(SQLException ex)
       { 
           System.out.println("ProblÃ¨me d'insertion dans la table Fournisseur"+ex.getMessage()); 
       }
    }

    @Override
    public void update(Fournisseur a) {
        String requete ="update fournisseur set nom_fournisseur=?,mail_fournisseur=?,tel_fournisseur=?,adresse_fournisseur=? where id_fournisseur='"+a.getIdFournisseur()+"'" ;
        try{
        PreparedStatement ps = Connexion.getInstance().prepareStatement(requete);
          
           ps.setString(1,a.getNomFournisseur());
           ps.setString(2,a.getMailFournisseur()); 
           ps.setString(3,a.getTelFournisseur()); 
           ps.setString(4,a.getAdresseFournisseur()); 
            
        ps.executeUpdate();
        System.out.println("Mise Ã  jour reussit");
        
    }
    catch(SQLException ex){
    System.out.println("probleme de mise Ã  jour"+ex.getMessage());
    }
    }

    @Override
    public List<Fournisseur> findAll() {
        List<Fournisseur> listedetails = new ArrayList<Fournisseur>();
        String requete = "select * from fournisseur";
        try {
           Statement statement = Connexion.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            MembreDAO m=new MembreDAO();

            while(resultat.next()){
                Fournisseur f =new Fournisseur();
               
                f.setIdFournisseur(resultat.getInt(1));
                f.setNomFournisseur(resultat.getString(2));
                f.setMailFournisseur(resultat.getString(3));
                f.setTelFournisseur(resultat.getString(4));
                f.setAdresseFournisseur(resultat.getString(5));
                f.setMembre(m.findById(resultat.getInt(6)));
               
                listedetails.add(f);
            }
            return listedetails;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des administrateurs "+ex.getMessage());
            return null;
        }
    }

    @Override
    public Fournisseur findById(int id) {
       String requete = "select * from fournisseur where id_fournisseur=?";
        try{
        PreparedStatement ps = Connexion.getInstance().prepareStatement(requete);
                ps.setInt(1,id);

        ResultSet resultat = ps.executeQuery();
        MembreDAO m=new MembreDAO();
        Fournisseur f= new Fournisseur();
        while (resultat.next()){
                f.setIdFournisseur(resultat.getInt(1));
                f.setNomFournisseur(resultat.getString(2));
                f.setMailFournisseur(resultat.getString(3));
                f.setTelFournisseur(resultat.getString(4));
                f.setAdresseFournisseur(resultat.getString(5));
                f.setMembre(m.findByIdd(String.valueOf(resultat.getInt(6))));
        }
        return f;
        }
        catch(SQLException ex){
            System.out.println("erreur lors du chargement"+ex.getMessage());
            return null;
        }
    }

    @Override
    public void delete(int a) {
        String requete = "delete from fournisseur where id_fournisseur=?";
        try {
            PreparedStatement ps = Connexion.getInstance().prepareStatement(requete);
            ps.setInt(1, a);
            ps.executeUpdate();
            System.out.println("Fournisseur supprimÃ©e");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }
    
}
