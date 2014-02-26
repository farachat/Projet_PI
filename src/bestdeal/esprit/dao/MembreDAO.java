/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.dao;
import bestdeal.esprit.entities.Administrateur;
import  bestdeal.esprit.entities.Membre;
import bestdeal.esprit.util.MyConnexion;
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
        PreparedStatement ps = MyConnexion.getInstance().prepareStatement(requete);
        //Date date=Date.valueOf(a.getDateNaissMembre().toString());
        ps.setInt(1, a.getCinMembre());
        ps.setString(2, a.getLoginMembre());
        ps.setString(3, a.getPwdMembre());
        ps.setString(4, a.getNomMembre());
        ps.setString(5, a.getPrenomMembre());
       // ps.setDate(6, date);
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
        String requete = "select login_membre,pwd_membre from membre";
        try {
            Statement statement = (Statement) MyConnexion.getInstance().createStatement();
        ResultSet resultat = statement.executeQuery(requete);
        while(resultat.next())
        { 
            Membre membre =new Membre(); 
        membre.setLoginMembre(resultat.getString(1)); 
        
        membre.setPwdMembre(resultat.getString(2));
        listeMembre.add(membre); }
        return listeMembre;
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
    
    
    public Membre findByPseudo(String pseudo) {
        String requete = "select * from membre where pseudo=?";
        try {
            PreparedStatement ps = MyConnexion.getInstance().prepareStatement(requete);
            ps.setString(1, pseudo);
            ResultSet resultat = ps.executeQuery();
            Membre membre =new Membre(); 
        while(resultat.next())
        { 
            
        
         
        membre.setCinMembre(resultat.getInt(1));
        membre.setLoginMembre(resultat.getString(2));
        membre.setPwdMembre(resultat.getString(3));
        membre.setNomMembre(resultat.getString(4));
        membre.setPrenomMembre(resultat.getString(5));
       // membre.setDateNaissMembre(resultat.getDate(6));
        membre.setMailMembre(resultat.getString(7));
        membre.setTelMembre(resultat.getString(8));
        membre.setAdressMembre(resultat.getString(9));
        membre.setType(resultat.getString(10));
        
        }
        
        return membre;
        
        } 
        catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex); 
        System.out.println("erreur lors du chargement des admin "+ex.getMessage()); return null; 
        } 
    }


    @Override
    public boolean delete(Membre a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
