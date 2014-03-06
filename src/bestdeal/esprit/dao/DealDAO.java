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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Fahmi
 */
public class DealDAO implements DAO<Deal>{


    @Override
    public void create(Deal a) {
       String requete ="insert into deal (nom_deal, date_debut_deal, date_fin_deal, categorie, ville, prix, description,image  ) values (?,?,?,?,?,?,?,?)";
         try {
            PreparedStatement ps = Connexion.getInstance().prepareStatement(requete);
            ps.setString(1, a.getNomDeal());
            ps.setDate(2,(new java.sql.Date(a.getDateDebutDeal().getTime())));
            ps.setDate(3,(new java.sql.Date(a.getDateFinDeal().getTime())));
            ps.setString(4, a.getCategorie());
             ps.setString(5, a.getVille());
              ps.setFloat(6, a.getPrix());
               ps.setString(7, a.getDescription());
               ps.setString(8, a.getImage());
            ps.executeUpdate();
            System.out.println("Ajout effectuÃ©e avec succÃ¨s");
        } catch (SQLException ex) {
         
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
        /* Stock b=null;
         String req ="insert into stock ( id_deal, qte_stock_disponible, qte_stock_initial) values (?,?,?)";
         try {
            PreparedStatement ps = Connexion.getInstance().prepareStatement(req);
            
            ps.setInt(1, b.getIdDeal().getIdDeal());
            ps.setInt(2,b.getQteStockDisponible());
            ps.setInt(3,b.getQteStockInitial());
            
            ps.executeUpdate();
            System.out.println("Ajout effectuÃ©e avec succÃ¨s");
        } catch (SQLException ex) {
         
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }*/
    }

    @Override
    public void update(Deal a) {
          String requete = "update deal set nom_deal=?, categorie=?, ville=?, prix=? where id_deal=?";
   try{
        PreparedStatement ps = Connexion.getInstance().prepareStatement(requete);
           
             ps.setString(1, a.getNomDeal());            
             ps.setString(2, a.getCategorie());
             ps.setString(3, a.getVille());
             ps.setFloat(4, a.getPrix());
             ps.setInt(5, a.getIdDeal()); 
            ps.executeUpdate();
            System.out.println("modification effectuÃ©e avec succÃ¨s");
        } 
   catch (SQLException ex) {
         System.out.println("erreur lors de modification "+ex.getMessage());
                           }
    }
    
    

    @Override
    public List<Deal> findAll() {
        List<Deal> listedeal = new ArrayList<Deal>();

        String requete = "select * from deal";
        try {
           Statement statement = Connexion.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Deal deal = new Deal();
                
               deal.setIdDeal(resultat.getInt(1));
               deal.setNomDeal(resultat.getString(2));
               deal.setDateDebutDeal(resultat.getDate(3));
               deal.setDateFinDeal(resultat.getDate(4));
               deal.setCategorie(resultat.getString(5));    
               deal.setVille(resultat.getString(6));
               deal.setPrix(resultat.getFloat(7));
               deal.setDescription(resultat.getString(8));
               deal.setImage(resultat.getString(9));

                listedeal.add(deal);
            }
            return listedeal;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des deal "+ex.getMessage());
            return null;
        }
    

    }
    
    public List<Deal> find_Deal_By_Nom(String nom) {
         List<Deal> listedeal = new ArrayList<Deal>();
                

        String requete = "select * from deal where nom_deal='"+nom+"' ";
        try {
           Statement statement = Connexion.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
               Deal deal = new Deal(); 
               deal.setIdDeal(resultat.getInt(1));
               deal.setNomDeal(resultat.getString(2));
              // deal.setDateDebutDeal(resultat.getDate(3));
             //  deal.setDateFinDeal(resultat.getDate(4));
               deal.setCategorie(resultat.getString(5));    
               deal.setVille(resultat.getString(6));
               deal.setPrix(resultat.getFloat(7));
            //   deal.setDescription(resultat.getString(8));
            //   deal.setImage(resultat.getString(9));
                listedeal.add(deal);
            }
            return listedeal;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des deal "+ex.getMessage());
            return null;
        }
    

    }

    @Override
    public Deal findById(int id) {
 Deal deal = new Deal();
     String requete = "select * from deal where id_deal=?";
        try {
            PreparedStatement ps = Connexion.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                deal.setIdDeal(resultat.getInt(1));
                
            }
            return deal;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du deal "+ex.getMessage());
            return null;
        }
    }

   

   
    public void delete(int id) {
        String requete = "delete from deal where id_deal=?";
        try {
           PreparedStatement ps = Connexion.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Suppression effectuÃ©e avec succÃ¨s");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }

    public List<Deal> DisplayAllDeals() {
         


        List<Deal> listedeals = new ArrayList<Deal>();

        String requete = "select * from deal";
        try {
           Statement statement = MyConnexion.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Deal deal =new Deal();
               
                deal.setIdDeal(resultat.getInt(1));
                deal.setNomDeal(resultat.getString(2));
                deal.setDateDebutDeal(resultat.getDate(3));
                deal.setDateFinDeal(resultat.getDate(4));
                deal.setCategorie(resultat.getString(5));
                deal.setVille(resultat.getString(6));
                deal.setPrix( resultat.getFloat(7));
                deal.setDescription(resultat.getString(8));
                deal.setImage(resultat.getString(9));

                listedeals.add(deal);
            }
            return listedeals;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots "+ex.getMessage());
            return null;
        }
    
    }
    
}
