/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.controllers;

import bestdeal.esprit.dao.FournisseurDAO;
import bestdeal.esprit.entities.Fournisseur;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author nesrin
 */
public class ListeFourinisseurControllers extends AbstractTableModel{
    String[] headers = {"Id  ", "Nom", "Mail", "Telephone", "Adresse"};
    List<Fournisseur> listeDetail = new ArrayList<Fournisseur>();
    

    public ListeFourinisseurControllers() {
        FournisseurDAO fourniDAO = new FournisseurDAO();
        listeDetail = fourniDAO.findAll();
    }
    @Override
    public int getRowCount() {
       return listeDetail.size();
    }

    @Override
    public int getColumnCount() {
        return headers.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         switch (columnIndex) {
            case 0:
              
                return listeDetail.get(rowIndex).getIdFournisseur();
            case 1:
                return listeDetail.get(rowIndex).getNomFournisseur();
            case 2:
                return listeDetail.get(rowIndex).getMailFournisseur();
            case 3:
                return listeDetail.get(rowIndex).getTelFournisseur();
            case 4:
                return listeDetail.get(rowIndex).getAdresseFournisseur();
            default:
                return null;
        }
    }
       @Override
    public String getColumnName(int column) {
      return headers[column];
    }
    
    
}
