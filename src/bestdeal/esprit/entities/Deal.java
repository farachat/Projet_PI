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
public class Deal {
    private int idDeal;
    private String nomDeal;
    private Date dateDebutDeal;
    private Date dateFinDeal;
    private String categorie;
    private String ville;
    private float prix;
    private String description;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    private String image;

    public Deal() {
    }

    public Deal(int idDeal, String nomDeal, Date dateDebutDeal, Date dateFinDeal, String categorie, String ville, float prix, String description) {
        this.idDeal = idDeal;
        this.nomDeal = nomDeal;
        this.dateDebutDeal = dateDebutDeal;
        this.dateFinDeal = dateFinDeal;
        this.categorie = categorie;
        this.ville = ville;
        this.prix = prix;
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.idDeal;
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
        final Deal other = (Deal) obj;
        if (this.idDeal != other.idDeal) {
            return false;
        }
        return true;
    }

    public int getIdDeal() {
        return idDeal;
    }

    public void setIdDeal(int idDeal) {
        this.idDeal = idDeal;
    }

    public String getNomDeal() {
        return nomDeal;
    }

    public void setNomDeal(String nomDeal) {
        this.nomDeal = nomDeal;
    }

    public Date getDateDebutDeal() {
        return dateDebutDeal;
    }

    public void setDateDebutDeal(Date dateDebutDeal) {
        this.dateDebutDeal = dateDebutDeal;
    }

    public Date getDateFinDeal() {
        return dateFinDeal;
    }

    public void setDateFinDeal(Date dateFinDeal) {
        this.dateFinDeal = dateFinDeal;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Deal{" + "idDeal=" + idDeal + ", nomDeal=" + nomDeal + ", dateDebutDeal=" + dateDebutDeal + ", dateFinDeal=" + dateFinDeal + ", categorie=" + categorie + ", ville=" + ville + ", prix=" + prix + ", description=" + description + '}';
    }

    
    
}
