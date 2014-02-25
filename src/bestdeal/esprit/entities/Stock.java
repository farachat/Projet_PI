/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.entities;

/**
 *
 * @author Fahmi
 */
public class Stock {
    
  private int idStock;
  private Deal idDeal;
  private int qteStockDisponible;
  private int qteStockInitial;

    public Stock(int idStock, Deal idDeal, int qteStockDisponible, int qteStockInitial) {
        this.idStock = idStock;
        this.idDeal = idDeal;
        this.qteStockDisponible = qteStockDisponible;
        this.qteStockInitial = qteStockInitial;
    }

    public Stock() {
    }

    public int getIdStock() {
        return idStock;
    }

    public void setIdStock(int idStock) {
        this.idStock = idStock;
    }

    public Deal getIdDeal() {
        return idDeal;
    }

    public void setIdDeal(Deal idDeal) {
        this.idDeal = idDeal;
    }

    public int getQteStockDisponible() {
        return qteStockDisponible;
    }

    public void setQteStockDisponible(int qteStockDisponible) {
        this.qteStockDisponible = qteStockDisponible;
    }

    public int getQteStockInitial() {
        return qteStockInitial;
    }

    public void setQteStockInitial(int qteStockInitial) {
        this.qteStockInitial = qteStockInitial;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.idStock;
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
        final Stock other = (Stock) obj;
        if (this.idStock != other.idStock) {
            return false;
        }
        return true;
    }

    

    @Override
    public String toString() {
        return "Stock{" + "idStock=" + idStock + ", idDeal=" + idDeal + ", qteStockDisponible=" + qteStockDisponible + ", qteStockInitial=" + qteStockInitial + '}';
    }
  
  
    
}
