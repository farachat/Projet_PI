/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.dao;
import bestdeal.esprit.entities.Administrateur;
import bestdeal.esprit.util.Connexion;
import bestdeal.esprit.util.MyConnexion;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author Fahmi
 */
public class AdministrateurDAO implements DAO<Administrateur> {

   
    
    @Override
    public void create(Administrateur admin) {
        String requete = "insert into administrateur (login_admin,pwd_admin) values (?,?)";
        try{
        PreparedStatement ps = MyConnexion.getInstance().prepareStatement(requete);
        //ps.setInt(1, admin.getId_admin());
        ps.setString(1, admin.getLogin_admin());
        ps.setString(2, admin.getPwd_admin());
        ps.executeUpdate();
        System.out.println("Ajouté efféctué dans la table administrateur avec succès");     
          }
    catch(SQLException ex){
    System.out.println("Problème d'insertion dans la base Administrateur"+ex.getMessage());   
                          }
    }

    @Override
    public void update(Administrateur a) {
        
    }

    @Override
    public List<Administrateur> findAll() {
        List<Administrateur> listeadmin = new ArrayList<Administrateur>(); 
        String requete = "select * from administrateur";
        try {
            Statement statement = (Statement) MyConnexion.getInstance().createStatement();
        ResultSet resultat = statement.executeQuery(requete);
        while(resultat.next())
        { 
            Administrateur admin =new Administrateur(); 
        admin.setLogin_admin(resultat.getString(1)); 
        
        admin.setPwd_admin(resultat.getString(2));
        listeadmin.add(admin); } return listeadmin;
        } 
        catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex); 
        System.out.println("erreur lors du chargement des admin "+ex.getMessage()); return null; 
        } 
    
    }
    public List<Administrateur> DisplayAllAdmins (){

                    List<Administrateur> listeadmins = new ArrayList<Administrateur>();

        String requete = "select * from administrateur";
        try {
           Statement statement = Connexion.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Administrateur admin =new Administrateur();
                admin.setLogin_admin(resultat.getString(2));
                admin.setPwd_admin(resultat.getString(3));
                

                listeadmins.add(admin);
            }
            return listeadmins;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des administrateurs "+ex.getMessage());
            return null;
        }
    }

    @Override
    public Administrateur findById(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete(int a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
