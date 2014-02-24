/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.entities;

/**
 *
 * @author Fahmi
 */
public class Evaluation {
    
    private int idDeal;
    private int idMembre;
    private int note;

    public Evaluation() {
    }

    public Evaluation(int note) {
        this.note = note;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.idDeal;
        hash = 29 * hash + this.idMembre;
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
        final Evaluation other = (Evaluation) obj;
        if (this.idDeal != other.idDeal) {
            return false;
        }
        if (this.idMembre != other.idMembre) {
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

    public int getIdMembre() {
        return idMembre;
    }

    public void setIdMembre(int idMembre) {
        this.idMembre = idMembre;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Evaluation{" + "idDeal=" + idDeal + ", idMembre=" + idMembre + ", note=" + note + '}';
    }

   
}
