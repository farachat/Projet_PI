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
public class DetailBonAchat {
    
    private DetailBonAchat idBonAchat;
    private BonAchat idAchat;
    private Deal idDeal;
    private int quantite;
    private float prix;

    public DetailBonAchat(DetailBonAchat idBonAchat, BonAchat idAchat, Deal idDeal, int quantite, float prix) {
        this.idBonAchat = idBonAchat;
        this.idAchat = idAchat;
        this.idDeal = idDeal;
        this.quantite = quantite;
        this.prix = prix;
    }

    public DetailBonAchat() {
    }

    public DetailBonAchat getIdBonAchat() {
        return idBonAchat;
    }

    public void setIdBonAchat(DetailBonAchat idBonAchat) {
        this.idBonAchat = idBonAchat;
    }

    public BonAchat getIdAchat() {
        return idAchat;
    }

    public void setIdAchat(BonAchat idAchat) {
        this.idAchat = idAchat;
    }

    public Deal getIdDeal() {
        return idDeal;
    }

    public void setIdDeal(Deal idDeal) {
        this.idDeal = idDeal;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.idBonAchat);
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
        final DetailBonAchat other = (DetailBonAchat) obj;
        if (!Objects.equals(this.idBonAchat, other.idBonAchat)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DetailBonAchat{" + "idBonAchat=" + idBonAchat + ", idAchat=" + idAchat + ", idDeal=" + idDeal + ", quantite=" + quantite + ", prix=" + prix + '}';
    }

    
    
    
    
}
