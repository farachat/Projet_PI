/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.entities;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Fahmi
 */
public class Reclamation {
    private int idReclamation;
    private Membre idMembre;
    private Administrateur idAdmin;
    private String libelle;
    private Date dateSys;

    public Reclamation() {
    }

    public Reclamation(int idReclamation, Membre idMembre, Administrateur idAdmin, String libelle, Date dateSys) {
        this.idReclamation = idReclamation;
        this.idMembre = idMembre;
        this.idAdmin = idAdmin;
        this.libelle = libelle;
        this.dateSys = dateSys;
    }

    public int getIdReclamation() {
        return idReclamation;
    }

    public void setIdReclamation(int idReclamation) {
        this.idReclamation = idReclamation;
    }

    public Membre getIdMembre() {
        return idMembre;
    }

    public void setIdMembre(Membre idMembre) {
        this.idMembre = idMembre;
    }

    public Administrateur getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(Administrateur idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Date getDateSys() {
        return dateSys;
    }

    public void setDateSys(Date dateSys) {
        this.dateSys = dateSys;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + this.idReclamation;
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
        final Reclamation other = (Reclamation) obj;
        if (this.idReclamation != other.idReclamation) {
            return false;
        }
        return true;
    }

  

    @Override
    public String toString() {
        return "Reclamation{" + "idReclamation=" + idReclamation + ", idMembre=" + idMembre + ", idAdmin=" + idAdmin + ", libelle=" + libelle + ", dateSys=" + dateSys + '}';
    }

    
    
    
}
