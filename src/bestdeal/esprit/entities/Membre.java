/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.entities;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Fahmi
 */
public class Membre {
    
    private int idMembre;
    private int cinMembre;
    private String loginMembre;
    private String pwdMembre;
    private String nomMembre;
    private String prenomMembre;
    private Date dateNaissMembre;
    private String mailMembre;
    private String telMembre;
    private String adressMembre;
    private String type;

    public Membre(int cinMembre, String loginMembre, String pwdMembre, String nomMembre, String prenomMembre, Date dateNaissMembre, String mailMembre, String telMembre, String adressMembre, String type) {
        this.cinMembre = cinMembre;
        this.loginMembre = loginMembre;
        this.pwdMembre = pwdMembre;
        this.nomMembre = nomMembre;
        this.prenomMembre = prenomMembre;
        this.dateNaissMembre = dateNaissMembre;
        this.mailMembre = mailMembre;
        this.telMembre = telMembre;
        this.adressMembre = adressMembre;
        this.type = type;
    }

    public Membre() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + this.idMembre;
        hash = 19 * hash + Objects.hashCode(this.loginMembre);
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
        final Membre other = (Membre) obj;
        if (this.idMembre != other.idMembre) {
            return false;
        }
        if (!Objects.equals(this.loginMembre, other.loginMembre)) {
            return false;
        }
        return true;
    }

    public int getIdMembre() {
        return idMembre;
    }

    public void setIdMembre(int idMembre) {
        this.idMembre = idMembre;
    }

    public int getCinMembre() {
        return cinMembre;
    }

    public void setCinMembre(int cinMembre) {
        this.cinMembre = cinMembre;
    }

    public String getLoginMembre() {
        return loginMembre;
    }

    public void setLoginMembre(String loginMembre) {
        this.loginMembre = loginMembre;
    }

    public String getPwdMembre() {
        return pwdMembre;
    }

    public void setPwdMembre(String pwdMembre) {
        this.pwdMembre = pwdMembre;
    }

    public String getNomMembre() {
        return nomMembre;
    }

    public void setNomMembre(String nomMembre) {
        this.nomMembre = nomMembre;
    }

    public String getPrenomMembre() {
        return prenomMembre;
    }

    public void setPrenomMembre(String prenomMembre) {
        this.prenomMembre = prenomMembre;
    }

    public Date getDateNaissMembre() {
        return dateNaissMembre;
    }

    public void setDateNaissMembre(Date dateNaissMembre) {
        this.dateNaissMembre = dateNaissMembre;
    }

    public String getMailMembre() {
        return mailMembre;
    }

    public void setMailMembre(String mailMembre) {
        this.mailMembre = mailMembre;
    }

    public String getTelMembre() {
        return telMembre;
    }

    public void setTelMembre(String telMembre) {
        this.telMembre = telMembre;
    }

    public String getAdressMembre() {
        return adressMembre;
    }

    public void setAdressMembre(String adressMembre) {
        this.adressMembre = adressMembre;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Membre{" + "idMembre=" + idMembre + ", cinMembre=" + cinMembre + ", loginMembre=" + loginMembre + ", pwdMembre=" + pwdMembre + ", nomMembre=" + nomMembre + ", prenomMembre=" + prenomMembre + ", dateNaissMembre=" + dateNaissMembre + ", mailMembre=" + mailMembre + ", telMembre=" + telMembre + ", adressMembre=" + adressMembre + ", type=" + type + '}';
    }
    
    
    
    
    
}
