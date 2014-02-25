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
    
    private Deal deal;
    private Membre membre;
    private String commentaire;
    private Date dateSys;
    private int salma;

    public Commentaire(Deal deal, Membre membre, String commentaire, Date dateSys) {
        this.deal = deal;
        this.membre = membre;
        this.commentaire = commentaire;
        this.dateSys = dateSys;
    }

    public Commentaire() {
    }

    public Deal getDeal() {
        return deal;
    }

    public void setDeal(Deal deal) {
        this.deal = deal;
    }

    public Membre getMembre() {
        return membre;
    }

    public void setMembre(Membre membre) {
        this.membre = membre;
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
    public String toString() {
        return "Commentaire{" + "deal=" + deal + ", membre=" + membre + ", commentaire=" + commentaire + ", dateSys=" + dateSys + '}';
    }
    
    
}
