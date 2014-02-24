/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.entities;

import java.util.Objects;

/**
 *
 * @author Fahmi
 */
public class Administrateur {
    
    private int idAdmin;
    private String loginAdmin;
    private String pwdAdmin;

   
    public int getId_admin() {
        return idAdmin;
    }

    public void setId_admin(int id_admin) {
        this.idAdmin = id_admin;
    }

    public String getLogin_admin() {
        return loginAdmin;
    }

    public void setLogin_admin(String login_admin) {
        this.loginAdmin = login_admin;
    }

    public String getPwd_admin() {
        return pwdAdmin;
    }

    public void setPwd_admin(String pwd_admin) {
        this.pwdAdmin = pwd_admin;
    }
    
     @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.idAdmin;
        hash = 97 * hash + Objects.hashCode(this.loginAdmin);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Administrateur other = (Administrateur) obj;
        if (this.idAdmin != other.idAdmin) {
            return false;
        }
        if (!Objects.equals(this.loginAdmin, other.loginAdmin)) {
            return false;
        }
        return true;
    }

    public Administrateur() {
    }

    
    public Administrateur(String login_admin, String pwd_admin) {
        this.loginAdmin = login_admin;
        this.pwdAdmin = pwd_admin;
    }

    @Override
    public String toString() {
        return "Administrateur{" + "id_admin=" + idAdmin + ", login_admin=" + loginAdmin + ", pwd_admin=" + pwdAdmin + '}';
    }

    
}
