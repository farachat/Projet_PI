/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.dao;
import bestdeal.esprit.entities.Deal;
import bestdeal.esprit.entities.DetailReservation;
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
public class DetailReservationDAO implements DAO<DetailReservation>{

    
    Connection con;

    public DetailReservationDAO() {
        con= MyConnexion.getInstance();
    }
    
    @Override
    public void create(DetailReservation a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void update(DetailReservation a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<DetailReservation> findAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public DetailReservation findById(int id) {
        ReservationDAO reserv=new ReservationDAO();
        DealDAO deal =new DealDAO();
        
       DetailReservation detailReser = new DetailReservation ();
     String requete = "select * from detail_reservation  where id_det_res=?";
        try {
            PreparedStatement ps = Connexion.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                detailReser.setIdDetRes(resultat.getInt(1));
                detailReser.setReservation(reserv.findById(resultat.getInt(2)));
                detailReser.setIdDeal(deal.findById(resultat.getInt(3)));
                detailReser.setQuantite(resultat.getInt(4));
                detailReser.setPrixUnitaire(resultat.getInt(5));
            
            }
            return detailReser;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche de l'administrateur "+ex.getMessage());
            return null;
        }
    }

    @Override
    public void delete(int a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
     public List<DetailReservation> DisplayAllDetailReservation (){

            List<DetailReservation> listedetails = new ArrayList<DetailReservation>();
            ReservationDAO reserv=new ReservationDAO();
            DealDAO deal =new DealDAO();
             String requete = "select * from detail_reservation";
             try {
                Statement statement = Connexion.getInstance()
                   .createStatement();
                 ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                DetailReservation detail =new DetailReservation();
                detail.setIdDetRes(resultat.getInt(1));
                detail.setReservation(reserv.findById(resultat.getInt(2)));
                detail.setIdDeal(deal.findById(resultat.getInt(3)));
                detail.setQuantite(resultat.getInt(4));
                detail.setPrixUnitaire(resultat.getFloat(5));
                  
               
                listedetails.add(detail);
            }
            return listedetails;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des administrateurs "+ex.getMessage());
            return null;
        }
    }
     public List<DetailReservation> findBestDeals() {
        List<DetailReservation> listedetails = new ArrayList<DetailReservation>();
 
        
        String requete = "SELECT d.id_deal,SUM(quantite)from deal d, detail_reservation r,voucher v where (d.id_deal=r.id_deal) and(r.id_det_res=v.id_det_res)group by d.id_deal";
        try {
           Statement statement = Connexion.getInstance()
                   .createStatement();
           
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                DetailReservation detailReservation = new DetailReservation();
                Deal d = new Deal();
                d.setIdDeal(resultat.getInt(1));
            detailReservation.setIdDeal(d);
            detailReservation.setQuantite(resultat.getInt(2));
                System.out.println("chbi baba  ");
                listedetails.add(detailReservation);
            }
            return listedetails;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des deals "+ex.getMessage());
            return null;
        }
    }
            
             public DetailReservation findDetailById(int id) {
        ReservationDAO reserv=new ReservationDAO();
        DealDAO deal =new DealDAO();
        
       DetailReservation detailReser = new DetailReservation ();
     String requete = "select * from detail_reservation  where id_deal=?";
        try {
            PreparedStatement ps = Connexion.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                detailReser.setIdDetRes(resultat.getInt(1));
                detailReser.setReservation(reserv.findById(resultat.getInt(2)));
                detailReser.setIdDeal(deal.findById(resultat.getInt(3)));
                detailReser.setQuantite(resultat.getInt(4));
                detailReser.setPrixUnitaire(resultat.getInt(5));
            
            }
            return detailReser;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche de l'administrateur "+ex.getMessage());
            return null;
        }
    }
    
    
}
