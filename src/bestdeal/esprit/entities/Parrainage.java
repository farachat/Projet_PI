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
    
    private int idDeal;
    private int idNembre;
    private String emailParrain;

    public Parrainage(int idDeal, int idNembre, String emailParrain) {
        this.idDeal = idDeal;
        this.idNembre = idNembre;
        this.emailParrain = emailParrain;
    }

    public Parrainage() {
    }

    public int getIdDeal() {
        return idDeal;
    }

    public void setIdDeal(int idDeal) {
        this.idDeal = idDeal;
    }

    public int getIdNembre() {
        return idNembre;
    }

    public void setIdNembre(int idNembre) {
        this.idNembre = idNembre;
    }

    public String getEmailParrain() {
        return emailParrain;
    }

    public void setEmailParrain(String emailParrain) {
        this.emailParrain = emailParrain;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.emailParrain);
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
        final Parrainage other = (Parrainage) obj;
        if (!Objects.equals(this.emailParrain, other.emailParrain)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Parrainage{" + "idDeal=" + idDeal + ", idNembre=" + idNembre + ", emailParrain=" + emailParrain + '}';
    }
    
    
    
}
