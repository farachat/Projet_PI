/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.entities;

/**
 *
 * @author Fahmi
 */
public class DetailReservation {
    
    private int idDetRes;
    private int idReservation;
    private int idDeal;
    private int quantite;
    private float prixUnitaire;

    public DetailReservation() {
    }

    public DetailReservation(int quantite, float prixUnitaire) {
        this.quantite = quantite;
        this.prixUnitaire = prixUnitaire;
    }

    public int getIdDetRes() {
        return idDetRes;
    }

    public void setIdDetRes(int idDetRes) {
        this.idDetRes = idDetRes;
    }

    public int getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(int idReservation) {
        this.idReservation = idReservation;
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

    public float getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(float prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    @Override
    public String toString() {
        return "Detail_reservation{" + "idDetRes=" + idDetRes + ", idReservation=" + idReservation + ", idDeal=" + idDeal + ", quantite=" + quantite + ", prixUnitaire=" + prixUnitaire + '}';
    }

    
    
}
