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
public class Commentaire {
    
    private int idDeal;
    private int idMembre;
    private String commentaire;
    private Date dateSys;

    public Commentaire() {
    }

    public Commentaire(int idDeal, int idMembre, String commentaire, Date dateSys) {
        this.idDeal = idDeal;
        this.idMembre = idMembre;
        this.commentaire = commentaire;
        this.dateSys = dateSys;
    }

    public int getIdDeal() {
        return idDeal;
    }

    public void setIdDeal(int idDeal) {
        this.idDeal = idDeal;
    }

    public int getIdMembre() {
        return idMembre;
    }

    public void setIdMembre(int idMembre) {
        this.idMembre = idMembre;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Date getDateSys() {
        return dateSys;
    }

    public void setDateSys(Date dateSys) {
        this.dateSys = dateSys;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.idMembre;
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
        final Commentaire other = (Commentaire) obj;
        if (this.idMembre != other.idMembre) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Commentaire{" + "idDeal=" + idDeal + ", idMembre=" + idMembre + ", commentaire=" + commentaire + ", dateSys=" + dateSys + '}';
    }
    
    
    
}
