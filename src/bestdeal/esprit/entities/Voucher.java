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
public class Voucher {
    
    private int idVoucher;
    private int idDetRes;
    private String detail;
    private Date dateVoucher;

    public Voucher(int idVoucher, int idDetRes, String detail, Date dateVoucher) {
        this.idVoucher = idVoucher;
        this.idDetRes = idDetRes;
        this.detail = detail;
        this.dateVoucher = dateVoucher;
    }

    public Voucher() {
    }

    public int getIdVoucher() {
        return idVoucher;
    }

    public void setIdVoucher(int idVoucher) {
        this.idVoucher = idVoucher;
    }

    public int getIdDetRes() {
        return idDetRes;
    }

    public void setIdDetRes(int idDetRes) {
        this.idDetRes = idDetRes;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Date getDateVoucher() {
        return dateVoucher;
    }

    public void setDateVoucher(Date dateVoucher) {
        this.dateVoucher = dateVoucher;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + this.idVoucher;
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
        final Voucher other = (Voucher) obj;
        if (this.idVoucher != other.idVoucher) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Voucher{" + "idVoucher=" + idVoucher + ", idDetRes=" + idDetRes + ", detail=" + detail + ", dateVoucher=" + dateVoucher + '}';
    }
    
    
    
}
