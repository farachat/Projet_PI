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
public class Reclamation {
    private int idReclamation;
    private int idMembre;
    private int idAdmin;
    private String libelle;
    private Date dateSys;

    public Reclamation(int idReclamation, int idMembre, int idAdmin, String libelle, Date dateSys) {
        this.idReclamation = idReclamation;
        this.idMembre = idMembre;
        this.idAdmin = idAdmin;
        this.libelle = libelle;
        this.dateSys = dateSys;
    }

    public Reclamation() {
    }

    public int getIdReclamation() {
        return idReclamation;
    }

    public void setIdReclamation(int idReclamation) {
        this.idReclamation = idReclamation;
    }

    public int getIdMembre() {
        return idMembre;
    }

    public void setIdMembre(int idMembre) {
        this.idMembre = idMembre;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
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
    public String toString() {
        return "Reclamation{" + "idReclamation=" + idReclamation + ", idMembre=" + idMembre + ", idAdmin=" + idAdmin + ", libelle=" + libelle + ", dateSys=" + dateSys + '}';
    }
    
    
    
}
