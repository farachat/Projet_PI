/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.dao;
import bestdeal.esprit.controllers.membreController;
import bestdeal.esprit.entities.Administrateur;
import  bestdeal.esprit.entities.Membre;
import bestdeal.esprit.util.Connexion;
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
        String requete = "insert into membre (CIN_membre,login_membre,pwd_membre,nom_membre,prenom_membre,date_naiss_membre,mail_membre,tel_membre,adresse,type) values (?,?,?,?,?,?,?,?,?,?)";
        try{
        PreparedStatement ps = MyConnexion.getInstance().prepareStatement(requete);
        Date x=(new java.sql.Date(a.getDateNaissMembre().getTime()));
        ps.setInt(1, a.getCinMembre());
        ps.setString(2, a.getLoginMembre());
        ps.setString(3, a.getPwdMembre());
        ps.setString(4, a.getNomMembre());
        ps.setString(5, a.getPrenomMembre());
        ps.setDate(6, x);
        ps.setString(7, a.getMailMembre());
        ps.setString(8, a.getTelMembre());
        ps.setString(9, a.getAdressMembre());
        ps.setString(10, a.getType());
        ps.executeUpdate();
        System.out.println("Ajouté efféctué dans la table membre avec succès");     
          }
    catch(SQLException ex){
    System.out.println("Problème d'insertion dans la table membre"+ex.getMessage());   
                          }
    }
    

    
    
    
    public void myCreate(Membre a) {
        String requete = "insert into membre (login_membre,mail_membre,pseudo,nom_membre,prenom_membre,date_naiss_membre) values (?,?,?,?,?,?)";
        try{
        PreparedStatement ps = MyConnexion.getInstance().prepareStatement(requete);
        Date x=(new java.sql.Date(a.getDateNaissMembre().getTime()));
        
        ps.setString(1, a.getPseudo());
        ps.setString(2, a.getMailMembre());
        ps.setString(3, a.getPseudo());
        ps.setString(4, a.getNomMembre());
        ps.setString(5, a.getPrenomMembre());
        ps.setDate(6, x);
        
         
        ps.executeUpdate();
        System.out.println("Ajouté efféctué dans la table membre avec succès");     
          }
    catch(SQLException ex){
    System.out.println("Problème d'insertion dans la table membre"+ex.getMessage());   
                          }
    }

    @Override
    public void update(Membre a) {
        String requete = "update membre set CIN_membre=?,login_membre=?,pwd_membre=?,nom_membre=?,prenom_membre=?,date_naiss_membre=?,mail_membre=?,tel_membre=?,adresse=?,type=?";
        try {
            PreparedStatement ps = MyConnexion.getInstance().prepareStatement(requete);
            
            ps.setInt(1, a.getCinMembre());
            ps.setString(2, a.getLoginMembre());
            ps.setString(3, a.getPwdMembre());
            ps.setString(4, a.getNomMembre());
            ps.setString(5, a.getPrenomMembre());
            ps.setDate(6, (new java.sql.Date(a.getDateNaissMembre().getTime())));
            ps.setString(7, a.getMailMembre());
            ps.setString(8, a.getTelMembre());
            ps.setString(9, a.getType());
            
         
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour " + ex.getMessage());
        }
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
        System.out.println("erreur lors du chargement des membres "+ex.getMessage()); return null; 
        } 
    }

    @Override
    public Membre findById(int id) {
        Membre membre =new Membre();
        String requete = "select * from membre where id_membre=?";
        try {
            PreparedStatement ps = MyConnexion.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
           
        while(resultat.next())
        {         
        
         
            
        membre.setIdMembre(resultat.getInt(1));
        membre.setCinMembre(resultat.getInt(2));
        membre.setLoginMembre(resultat.getString(3));
        membre.setPwdMembre(resultat.getString(4));
        membre.setNomMembre(resultat.getString(5));
        membre.setPrenomMembre(resultat.getString(6));
        membre.setDateNaissMembre(resultat.getDate(7));
        membre.setMailMembre(resultat.getString(8));
        membre.setTelMembre(resultat.getString(9));
        membre.setAdressMembre(resultat.getString(10));
        membre.setType(resultat.getString(11));
  
        
        }
        
        return membre;
        
        } 
        catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex); 
        System.out.println("erreur lors du chargement des membres "+ex.getMessage()); return null; 
        } 
    }
    public void desactiverCompte(int id_membre)
    {
        String requete="update membre set Etat_compte=1 where id_membre="+id_membre;
        try
        {
            PreparedStatement ps=Connexion.getInstance().prepareStatement(requete);
            ps.executeUpdate();
            System.out.println("Mise Ã  jour effectuÃ©e avec succes");
            
        }catch(SQLException ex)
        {
            System.out.println("erreur lors de la mise Ã  jour"+ex.getMessage());
        }
    }    
    
    public Membre findByIddd(int id) {
        Membre membre =new Membre();
        String requete = "select id_membre from membre where id_membre=?";
        try {
            PreparedStatement ps = MyConnexion.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
           
        while(resultat.next())
        {    
           
            
        membre.setIdMembre(resultat.getInt(1));
       
  
        
        }
        
        return membre;
        
        } 
        catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex); 
        System.out.println("erreur lors du chargement des membres "+ex.getMessage()); return null; 
        } 
    }
    
    public Membre findByIdd(String id) {
        String requete = "select id_membre from membre where login_membre=?";
        try {
            PreparedStatement ps = MyConnexion.getInstance().prepareStatement(requete);
            ps.setString(1, id);
            ResultSet resultat = ps.executeQuery();
            Membre membre =new Membre(); 
        while(resultat.next())
        {      
         membre.setIdMembre(resultat.getInt(1));        
        }
        
        return membre;
        
        } 
        catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex); 
        System.out.println("erreur lors du chargement des membres "+ex.getMessage()); return null; 
        } 
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
        membre.setPseudo(resultat.getString(12));
        }
        return membre;
        
        } 
        catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex); 
        System.out.println("erreur lors du chargement des membres "+ex.getMessage()); return null; 
        } 
    }
    
    public Membre findByNomType(String pseudo) {
        String requete = "select type from membre where login_membre=?";
        try {
            PreparedStatement ps = MyConnexion.getInstance().prepareStatement(requete);
            ps.setString(1, pseudo);
            ResultSet resultat = ps.executeQuery();
            Membre membre =new Membre(); 
        while(resultat.next())
        {                    
        membre.setType(resultat.getString(1));
        }
        return membre;
        
        } 
        catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex); 
        System.out.println("erreur lors du chargement des membres "+ex.getMessage()); return null; 
        } 
    }
    
     public List<Membre> DisplayAllMembre (){

List<Membre> listemembre = new ArrayList<Membre>();

        String requete = "select * from membre";
        try {
           Statement statement = Connexion.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Membre membre =new Membre();
                membre.setIdMembre(resultat.getInt(1));
        membre.setCinMembre(resultat.getInt(2));
        membre.setLoginMembre(resultat.getString(3));
        membre.setPwdMembre(resultat.getString(4));
        membre.setNomMembre(resultat.getString(5));
        membre.setPrenomMembre(resultat.getString(6));
        membre.setDateNaissMembre(resultat.getDate(7));
        membre.setMailMembre(resultat.getString(8));
        membre.setTelMembre(resultat.getString(9));
        membre.setAdressMembre(resultat.getString(10));
        membre.setType(resultat.getString(11));
                
                

                listemembre.add(membre);
            }
            return listemembre;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des membres "+ex.getMessage());
            return null;
        }
    }


    @Override
    public void delete(int a) {
        String requete = "delete from membre where id_membre=?";
        try {
            PreparedStatement ps = MyConnexion.getInstance().prepareStatement(requete);
            ps.setInt(1, a);
            ps.executeUpdate();
            System.out.println("Pays supprimée");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }

    
    
}
