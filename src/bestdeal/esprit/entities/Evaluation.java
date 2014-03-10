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
public class Evaluation {

    public int getIdEvaluation() {
        return idEvaluation;
    }

    public void setIdEvaluation(int idEvaluation) {
        this.idEvaluation = idEvaluation;
    }
    
    private int idEvaluation;
    private Deal idDeal;
    private Membre idMembre;
    private int note;

    public float getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(float moyenne) {
        this.moyenne = moyenne;
    }
    private float moyenne;

    public Evaluation() {
    }

    public Evaluation(Deal idDeal, Membre idMembre, int note) {
        this.idDeal = idDeal;
        this.idMembre = idMembre;
        this.note = note;
    }

    public Deal getIdDeal() {
        return idDeal;
    }

    public void setIdDeal(Deal idDeal) {
        this.idDeal = idDeal;
    }

    public Membre getIdMembre() {
        return idMembre;
    }

    public void setIdMembre(Membre idMembre) {
        this.idMembre = idMembre;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + Objects.hashCode(this.idMembre);
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
        if (!Objects.equals(this.idMembre, other.idMembre)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Evaluation{" + "idDeal=" + idDeal + ", idMembre=" + idMembre + ", note=" + note + '}';
    }

    
   
}
