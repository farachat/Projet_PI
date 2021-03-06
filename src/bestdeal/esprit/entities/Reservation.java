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
public class Reservation {
    
    private int idReservation;
    private Membre idMembre;
    private String categorie;
    private Date dateReservation;

    public Reservation() {
    }

    public Reservation(int idReservation, Membre idMembre, String categorie, Date dateReservation) {
        this.idReservation = idReservation;
        this.idMembre = idMembre;
        this.categorie = categorie;
        this.dateReservation = dateReservation;
    }

    public int getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(int idReservation) {
        this.idReservation = idReservation;
    }

    public Membre getIdMembre() {
        return idMembre;
    }

    public void setIdMembre(Membre idMembre) {
        this.idMembre = idMembre;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public Date getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(Date dateReservation) {
        this.dateReservation = dateReservation;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.idReservation;
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
        final Reservation other = (Reservation) obj;
        if (this.idReservation != other.idReservation) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Reservation{" + "idReservation=" + idReservation + ", idMembre=" + idMembre + ", categorie=" + categorie + ", dateReservation=" + dateReservation + '}';
    }

    
    
    
}
