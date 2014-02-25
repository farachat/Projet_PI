/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.entities;

import java.util.Objects;

/**
 *
 * @author Fahmi
 */
public class Parrainage {
    
    private Deal idDeal;
    private Membre idNembre;
    private String emailParrain;

    public Parrainage() {
    }

    public Deal getIdDeal() {
        return idDeal;
    }

    public void setIdDeal(Deal idDeal) {
        this.idDeal = idDeal;
    }

    public Membre getIdNembre() {
        return idNembre;
    }

    public void setIdNembre(Membre idNembre) {
        this.idNembre = idNembre;
    }

    public String getEmailParrain() {
        return emailParrain;
    }

    public void setEmailParrain(String emailParrain) {
        this.emailParrain = emailParrain;
    }

    @Override
    public String toString() {
        return "Parrainage{" + "idDeal=" + idDeal + ", idNembre=" + idNembre + ", emailParrain=" + emailParrain + '}';
    }

 
   
    
    
}
