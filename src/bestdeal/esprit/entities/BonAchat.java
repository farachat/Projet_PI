/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.entities;

import java.util.Date;

/**
 *
 * @author Fahmi
 */
public class BonAchat {
    
    private int idAchat;
    private int idFournisseur;    
    private int idAdmin;    
    private Date dateBonAchat;

    public BonAchat(int idAchat, int idFournisseur, int idAdmin, Date dateBonAchat) {
        this.idAchat = idAchat;
        this.idFournisseur = idFournisseur;
        this.idAdmin = idAdmin;
        this.dateBonAchat = dateBonAchat;
    }

    public BonAchat() {
    }

    public int getIdAchat() {
        return idAchat;
    }

    public void setIdAchat(int idAchat) {
        this.idAchat = idAchat;
    }

    public int getIdFournisseur() {
        return idFournisseur;
    }

    public void setIdFournisseur(int idFournisseur) {
        this.idFournisseur = idFournisseur;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public Date getDateBonAchat() {
        return dateBonAchat;
    }

    public void setDateBonAchat(Date dateBonAchat) {
        this.dateBonAchat = dateBonAchat;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.idAchat;
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
        final BonAchat other = (BonAchat) obj;
        if (this.idAchat != other.idAchat) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BonAchat{" + "idAchat=" + idAchat + ", idFournisseur=" + idFournisseur + ", idAdmin=" + idAdmin + ", dateBonAchat=" + dateBonAchat + '}';
    }
    
    


}
