/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.entities;

/**
 *
 * @author Fahmi
 */
public class DetailBonAchat {
    
    private int idBonAchat;
    private int idAchat;
    private int idDeal;
    private int quantite;
    private float prix;

    public DetailBonAchat(int idBonAchat, int idAchat, int idDeal, int quantite, float prix) {
        this.idBonAchat = idBonAchat;
        this.idAchat = idAchat;
        this.idDeal = idDeal;
        this.quantite = quantite;
        this.prix = prix;
    }

    public DetailBonAchat() {
    }

    public int getIdBonAchat() {
        return idBonAchat;
    }

    public void setIdBonAchat(int idBonAchat) {
        this.idBonAchat = idBonAchat;
    }

    public int getIdAchat() {
        return idAchat;
    }

    public void setIdAchat(int idAchat) {
        this.idAchat = idAchat;
    }

    public int getIdDeal() {
        return idDeal;
    }

    public void setIdDeal(int idDeal) {
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
        int hash = 3;
        hash = 37 * hash + this.idBonAchat;
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
        if (this.idBonAchat != other.idBonAchat) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DetailBonAchat{" + "idBonAchat=" + idBonAchat + ", idAchat=" + idAchat + ", idDeal=" + idDeal + ", quantite=" + quantite + ", prix=" + prix + '}';
    }

    
    
    
}
