/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.entities;
import bestdeal.esprit.entities.Administrateur;
import bestdeal.esprit.entities.Fournisseur;
import bestdeal.esprit.entities.BonAchat;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Fahmi
 */
public class BonAchat {
    
    private BonAchat achat;
    private Fournisseur fournisseur;    
    private Administrateur admin;    
    private Date dateBonAchat;

    public BonAchat(BonAchat achat, Fournisseur fournisseur, Administrateur admin, Date dateBonAchat) {
        this.achat = achat;
        this.fournisseur = fournisseur;
        this.admin = admin;
        this.dateBonAchat = dateBonAchat;
    }

    public BonAchat() {
    }

    public BonAchat getAchat() {
        return achat;
    }

    public void setAchat(BonAchat achat) {
        this.achat = achat;
    }

    public Fournisseur getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }

    public Administrateur getAdmin() {
        return admin;
    }

    public void setAdmin(Administrateur admin) {
        this.admin = admin;
    }

    public Date getDateBonAchat() {
        return dateBonAchat;
    }

    public void setDateBonAchat(Date dateBonAchat) {
        this.dateBonAchat = dateBonAchat;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.achat);
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
        if (!Objects.equals(this.achat, other.achat)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BonAchat{" + "achat=" + achat + ", fournisseur=" + fournisseur + ", admin=" + admin + ", dateBonAchat=" + dateBonAchat + '}';
    }

    
    


}
