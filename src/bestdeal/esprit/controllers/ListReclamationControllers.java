/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.controllers;
import bestdeal.esprit.entities.Reclamation;
import bestdeal.esprit.dao.ReclamationDAO;
import bestdeal.esprit.dao.StockDAO;
import java.util.*;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Torkhani
 */
public class ListReclamationControllers extends AbstractTableModel{
   String[] headers = {"ID Reclamation ","Emetteur"," Administrateur","Message","Date "} ;
    List<Reclamation> listreReclamations = new ArrayList<Reclamation>();
    public ListReclamationControllers(){
        ReclamationDAO reclamationDAO= new ReclamationDAO();
        listreReclamations=reclamationDAO.DiplayAllReclamations();
        
    }

    @Override
    public int getRowCount() {
        return listreReclamations.size();
    }

    @Override
    public int getColumnCount() {
        return headers.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       switch(columnIndex){
           case 0:
               return listreReclamations.get(rowIndex).getIdReclamation();
           case 1:
               return listreReclamations.get(rowIndex).getIdMembre().getNomMembre();
           case 2:
               return listreReclamations.get(rowIndex).getIdAdmin().getId_admin();
           case 3:
               return listreReclamations.get(rowIndex).getLibelle();
           case 4:
               return listreReclamations.get(rowIndex).getDateSys();
           default:
               return null;
       }
           
    }
 public String getColumnName(int column) {
      return headers[column];
    }

}

