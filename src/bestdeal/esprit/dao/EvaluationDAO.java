/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.dao;
import bestdeal.esprit.entities.Evaluation;
import bestdeal.esprit.util.Connexion;
import java.sql.Connection;
import java.util.List;
/**
 *
 * @author Fahmi
 */
public class EvaluationDAO implements DAO<Evaluation>{

    
    Connection con;

    public EvaluationDAO() {
        con= Connexion.getInstance();
    }
    
    @Override
    public void create(Evaluation a) {
        throw new UnsupportedOperationException("Not supported yet.");
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
    public boolean delete(Evaluation a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
