/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.dao;
import bestdeal.esprit.entities.Administrateur;
import bestdeal.esprit.util.Connexion;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author Fahmi
 */
public class AdministrateurDAO implements DAO<Administrateur> {

   
    
    @Override
    public void create(Administrateur admin) {
        String requete = "insert into administrateur (login_admin,pwd_admin) values (?,?)";
        try{
        PreparedStatement ps = Connexion.getInstance().prepareStatement(requete);
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
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Administrateur> findAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Administrateur findById(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean delete(Administrateur a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
