/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.dao;

import bestdeal.esprit.entities.DealPropose;
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
 * @author DELL
 */
public class DealProposéDAO implements DealProposéInterface<DealPropose> {
     Connection con;

    public DealProposéDAO() {
        con= Connexion.getInstance();
    }
      

  
    @Override
    public void create(DealPropose d) {
        String requete = "insert into dealpropose (nom_deal_propose,date_deb_deal_propose, date_fin_deal_propose, categorie_deal_propose,ville_deal_propose,prix_deal_propose,description_deal_propose,id_membre) values (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = Connexion.getInstance().prepareStatement(requete);
            ps.setString(1, d.getNomDeal());
           ps.setDate(2,(new java.sql.Date(d.getDateDebutDeal().getTime())));
            ps.setDate(3,(new java.sql.Date(d.getDateFinDeal().getTime())));            
            ps.setString(4, d.getCategorie());
            ps.setString(5, d.getVille());
            ps.setFloat(6, d.getPrix());
            ps.setString(7, d.getDescription());  
            ps.setInt(8, d.getIdMembrev());

            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }

    
    @Override
    public List findAll(int i) {
       List<DealPropose> listedeals = new ArrayList<DealPropose>();
       
        String requete = "select * from dealpropose where id_membre=?";
        try {
            PreparedStatement ps = MyConnexion.getInstance().prepareStatement(requete);
            ps.setInt(1, i);
            ResultSet resultat = ps.executeQuery();
           
            while(resultat.next()){
                DealPropose deal =new DealPropose();
                deal.setIdDeal(resultat.getInt(1));
                deal.setNomDeal(resultat.getString(2));
                deal.setDateDebutDeal(resultat.getDate(3));
               deal.setDateFinDeal(resultat.getDate(4));               
                deal.setCategorie(resultat.getString(5));
                 deal.setVille(resultat.getString(6));
                 deal.setPrix(resultat.getFloat(7));
               deal.setDescription(resultat.getString(8));
               deal.setIdMembrev(resultat.getInt(9));

                listedeals.add(deal);
            }
            return listedeals;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des deals "+ex.getMessage());
            return null;
        }
    }



    @Override
    public void delete(int id) {
        String requete = "delete from dealpropose where id_deal_propose=?";
        try {
           
           PreparedStatement ps = Connexion.getInstance().prepareStatement(requete);
           ps.setInt(1, id);
          
            ps.executeUpdate();
            System.out.println("Suppression effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
       
    }

    @Override
    public DealPropose findById(int id) {
      DealPropose deal = new DealPropose();
      String requete = "select * from dealpropose where id_deal_propose=?";
        try {
             
           PreparedStatement ps = Connexion.getInstance().prepareStatement(requete);
           ps.setInt(1, id);
           
            ResultSet resultat = ps.executeQuery(requete);
            while(resultat.next()){
                
                deal.setIdDeal(resultat.getInt(1));
               
                
            }
            return deal;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des deals "+ex.getMessage());
            return null;
        }
    }

  
 
    }

   

