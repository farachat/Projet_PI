/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Fahmi
 */

public class Deal implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_deal")
    private Integer idDeal;
    @Basic(optional = false)
    @Column(name = "nom_deal")
    private String nomDeal;
    @Column(name = "date_debut_deal")
    @Temporal(TemporalType.DATE)
    private Date dateDebutDeal;
    @Column(name = "date_fin_deal")
    @Temporal(TemporalType.DATE)
    private Date dateFinDeal;
    @Column(name = "categorie")
    private String categorie;
    @Column(name = "ville")
    private String ville;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "prix")
    private Float prix;
    @Lob
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @Lob
    @Column(name = "image")
    private String image;
    @Column(name = "pourcentage")
    private Integer pourcentage;
    @Column(name = "details")
    private String details;
    @JoinColumn(name = "id_fournisseur", referencedColumnName = "id_fournisseur")
    @ManyToOne
    private Fournisseur idFournisseur;
   

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
  

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

    public Deal(Integer idDeal) {
        this.idDeal = idDeal;
    }

    public Deal(Integer idDeal, String nomDeal, String image) {
        this.idDeal = idDeal;
        this.nomDeal = nomDeal;
        this.image = image;
    }

    

    public void setIdDeal(Integer idDeal) {
        this.idDeal = idDeal;
    }

    

    public void setPrix(Float prix) {
        this.prix = prix;
    }

   

    public Integer getPourcentage() {
        return pourcentage;
    }

    public void setPourcentage(Integer pourcentage) {
        this.pourcentage = pourcentage;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Fournisseur getIdFournisseur() {
        return idFournisseur;
    }

    public void setIdFournisseur(Fournisseur idFournisseur) {
        this.idFournisseur = idFournisseur;
    }

    
    

   

    
    
}
