/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.gui;

/**
 *
 * @author Oussama
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import  bestdeal.esprit.dao.DealDAO;
import bestdeal.esprit.entities.Deal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Oussama
 */
public class ListeDetailDeal extends AbstractTableModel{
String[] headers = {"ID deal", "nom deal", "Catégorie", "Date début","Date fin","Prix unitaire"};
 List<Deal> listeDetail = new ArrayList<Deal>();
  public ListeDetailDeal(){
  DealDAO dealDAO = new DealDAO();
        listeDetail = dealDAO.findAll();
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
                
              return listeDetail.get(rowIndex).getIdDeal();
                
             case 1:
                 return  listeDetail.get(rowIndex).getNomDeal();
               
            case 2:
                 return listeDetail.get(rowIndex).getCategorie();
               
            case 3:
                return listeDetail.get(rowIndex).getDateDebutDeal();
                 
            case 4:
                return listeDetail.get(rowIndex).getDateFinDeal();
                
            case 5:
                return listeDetail.get(rowIndex).getPrix();
                  
                
            default:
                return null;
        }
        
        
      
       
       }
  public String getColumnName(int column){
        return headers[column]; 
}
}