/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.dao;
import bestdeal.esprit.entities.Administrateur;
import  bestdeal.esprit.entities.Membre;
import bestdeal.esprit.util.Connexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
  /***
 *
 * @author Fahmi
 */
public class MembreDAO implements DAO<Membre>{

    
    
    @Override
    public void create(Membre a) {
        String requete = "insert into membre (CIN_membre,login_membre,pwd_membre,nom_membre,prenom_membre,mail_membre,tel_membre,adresse,type) values (?,?,?,?,?,?,?,?,?)";
        try{
        PreparedStatement ps = Connexion.getInstance().prepareStatement(requete);
        ps.setInt(1, a.getCinMembre());
        ps.setString(2, a.getLoginMembre());
        ps.setString(3, a.getPwdMembre());
        ps.setString(4, a.getNomMembre());
        ps.setString(5, a.getPrenomMembre());
        //ps.setDate(6, a.getDateNaissMembre());
        ps.setString(6, a.getMailMembre());
        ps.setString(7, a.getTelMembre());
        ps.setString(8, a.getAdressMembre());
        ps.setString(9, a.getType());
        ps.executeUpdate();
        System.out.println("Ajouté efféctué dans la table administrateur avec succès");     
          }
    catch(SQLException ex){
    System.out.println("Problème d'insertion dans la base Administrateur"+ex.getMessage());   
                          }
    }

    @Override
    public void update(Membre a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Membre> findAll() {
        
        List<Membre> listeMembre = new ArrayList<Membre>(); 
        String requete = "select * from membre";
        try {
            Statement statement = (Statement) Connexion.getInstance().createStatement();
        ResultSet resultat = statement.executeQuery(requete);
        while(resultat.next())
        { 
            Membre membre =new Membre(); 
        membre.setLoginMembre(resultat.getString(1)); 
        
        membre.setPwdMembre(resultat.getString(2));
        listeMembre.add(membre); } return listeMembre;
        } 
        catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex); 
        System.out.println("erreur lors du chargement des admin "+ex.getMessage()); return null; 
        } 
    }

    @Override
    public Membre findById(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean delete(Membre a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
