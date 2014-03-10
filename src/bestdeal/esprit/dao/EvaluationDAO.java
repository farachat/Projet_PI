/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.dao;
import bestdeal.esprit.entities.Evaluation;
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
public class EvaluationDAO implements DAO<Evaluation>{

    
    Connection con;

    public EvaluationDAO() {
        con= MyConnexion.getInstance();
    }
    
    @Override
    public void create(Evaluation a) {
        String requete ="insert into evaluation (id_membre,id_deal,note) values (?,?,?)";
         try {
            PreparedStatement ps = Connexion.getInstance().prepareStatement(requete);
          ps.setInt(2, a.getIdDeal().getIdDeal());
          ps.setInt(1, a.getIdMembre().getIdMembre());
            ps.setInt(3, a.getNote());
            
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
         
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }

    @Override
    public void update(Evaluation a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Evaluation> findAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Evaluation findById(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete(int a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public List<Evaluation> DisplayAllEvaluations (){

     
        List<Evaluation> listeva = new ArrayList<Evaluation>();
        EvaluationDAO evaluationDAO=new EvaluationDAO();
        String requete = "select * from evaluation";
        DealDAO dealDAO=new DealDAO();
        MembreDAO membreDAO=new MembreDAO();
        try {
           Statement statement = Connexion.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                
                Evaluation eva= new Evaluation();
                eva.setIdEvaluation(resultat.getInt(1));
                eva.setIdDeal(dealDAO.findById(resultat.getInt(3)));
                eva.setIdMembre(membreDAO.findByIddd(resultat.getInt(2)));
                eva.setNote(resultat.getInt(4));
                
                listeva.add(eva);
            }
            return listeva;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement de la liste "+ex.getMessage());
           return null;
            
        }
    }
        
     public float getMoyenneMembre(int id_deal)
    {
          String requete="select AVG (note) as moyenne from evaluation where id_deal="+id_deal;
          float moyenne =0;
         
          Evaluation evaluation =new Evaluation();
          try 
          {
             Statement statement =Connexion.getInstance().createStatement();
             ResultSet resultat = statement.executeQuery(requete);
             while(resultat.next())
             {
                 System.out.println("statistique ffffffffffffff");
             
             evaluation.setMoyenne(resultat.getFloat("moyenne"));
             System.out.println("statistique "+evaluation.getMoyenne());
             
             }
          moyenne=evaluation.getMoyenne();
          return moyenne;
          
          
          }
          
          
          
          catch(Exception e)
          { 
          
              System.out.println("erreur lors de l'evaluation"+e.getMessage());
            return 0;
          }          
    
    
    
    }
          
}
