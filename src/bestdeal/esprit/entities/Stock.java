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
  private int idDeal;
  private int qteStockDisponible;
  private int qteStockInitial;

    public Stock(int idStock, int idDeal, int qteStockDisponible, int qteStockInitial) {
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

    public int getIdDeal() {
        return idDeal;
    }

    public void setIdDeal(int idDeal) {
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
        int hash = 7;
        hash = 53 * hash + this.idDeal;
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
        if (this.idDeal != other.idDeal) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Stock{" + "idStock=" + idStock + ", idDeal=" + idDeal + ", qteStockDisponible=" + qteStockDisponible + ", qteStockInitial=" + qteStockInitial + '}';
    }
  
  
    
}
