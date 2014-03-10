/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Fahmi
 */

public class Fournisseur {
    private int idFournisseur;
    private String nomFournisseur;
    private String mailFournisseur;
    private String telFournisseur;
    private String adresseFournisseur;
    private Membre Membre;
   

    public Fournisseur() {
    }

    public Fournisseur(int idFournisseur, String nomFournisseur, String mailFournisseur, String telFournisseur, String adresseFournisseur, bestdeal.esprit.entities.Membre Membre) {
        this.idFournisseur = idFournisseur;
        this.nomFournisseur = nomFournisseur;
        this.mailFournisseur = mailFournisseur;
        this.telFournisseur = telFournisseur;
        this.adresseFournisseur = adresseFournisseur;
        this.Membre = Membre;
    }

 


    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + this.idFournisseur;
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
        final Fournisseur other = (Fournisseur) obj;
        if (this.idFournisseur != other.idFournisseur) {
            return false;
        }
        return true;
    }

    public int getIdFournisseur() {
        return idFournisseur;
    }

    public void setIdFournisseur(int idFournisseur) {
        this.idFournisseur = idFournisseur;
    }

    public String getNomFournisseur() {
        return nomFournisseur;
    }

    public void setNomFournisseur(String nomFournisseur) {
        this.nomFournisseur = nomFournisseur;
    }

    public String getMailFournisseur() {
        return mailFournisseur;
    }

    public void setMailFournisseur(String mailFournisseur) {
        this.mailFournisseur = mailFournisseur;
    }

    public String getTelFournisseur() {
        return telFournisseur;
    }

    public void setTelFournisseur(String telFournisseur) {
        this.telFournisseur = telFournisseur;
    }

    public String getAdresseFournisseur() {
        return adresseFournisseur;
    }

    public void setAdresseFournisseur(String adresseFournisseur) {
        this.adresseFournisseur = adresseFournisseur;
    }

    public bestdeal.esprit.entities.Membre getMembre() {
        return Membre;
    }

    public void setMembre(bestdeal.esprit.entities.Membre Membre) {
        this.Membre = Membre;
    }

    @Override
    public String toString() {
        return "Fournisseur{" + "idFournisseur=" + idFournisseur + ", nomFournisseur=" + nomFournisseur + ", mailFournisseur=" + mailFournisseur + ", telFournisseur=" + telFournisseur + ", adresseFournisseur=" + adresseFournisseur + ", Membre=" + Membre + '}';
    }

   
    
}
