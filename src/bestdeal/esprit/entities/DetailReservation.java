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
    private Reservation Reservation;
    private Deal idDeal;
    private int quantite;
    private float prixUnitaire;

    public DetailReservation(int idDetRes, Reservation Reservation, Deal idDeal, int quantite, float prixUnitaire) {
        this.idDetRes = idDetRes;
        this.Reservation = Reservation;
        this.idDeal = idDeal;
        this.quantite = quantite;
        this.prixUnitaire = prixUnitaire;
    }

    public DetailReservation() {
    }

    public int getIdDetRes() {
        return idDetRes;
    }

    public void setIdDetRes(int idDetRes) {
        this.idDetRes = idDetRes;
    }

    public Reservation getReservation() {
        return Reservation;
    }

    public void setReservation(Reservation Reservation) {
        this.Reservation = Reservation;
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

    public float getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(float prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.idDetRes;
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
        final DetailReservation other = (DetailReservation) obj;
        if (this.idDetRes != other.idDetRes) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DetailReservation{" + "idDetRes=" + idDetRes + ", idReservation=" + Reservation + ", idDeal=" + idDeal + ", quantite=" + quantite + ", prixUnitaire=" + prixUnitaire + '}';
    }

    
    
    
}
