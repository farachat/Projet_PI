/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.controllers;

import bestdeal.esprit.dao.DealDAO;
import bestdeal.esprit.dao.DetailReservationDAO;
import bestdeal.esprit.dao.MembreDAO;
import bestdeal.esprit.entities.Deal;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author nesrin
 */
public class ListeDealControllers extends AbstractTableModel{
    String[] headers = {"Id deal ","Nom deal ", "Catégorie", "Ville","Prix"};
    List<Deal> listeDeal = new ArrayList<Deal>();
    

    public ListeDealControllers() {
        DealDAO dealDAO = new DealDAO();
        listeDeal = dealDAO.findAll();
    }
    @Override
    public int getRowCount() {
        return listeDeal.size();

    }

    @Override
    public int getColumnCount() {
        return headers.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
         switch (columnIndex) {
            case 0:   
                return listeDeal.get(rowIndex).getIdDeal();
            case 1:   
                return listeDeal.get(rowIndex).getNomDeal();
            case 2:
                return listeDeal.get(rowIndex).getCategorie();
            case 3:
                return listeDeal.get(rowIndex).getVille();
            case 4:
                return listeDeal.get(rowIndex).getPrix();
            default:
                return null;
        }
    }
       @Override
    public String getColumnName(int column) {
      return headers[column];
    }
    
    
}
