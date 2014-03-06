/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.controllers;

import bestdeal.esprit.dao.EvaluationDAO;
import bestdeal.esprit.entities.Evaluation;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author user
 */
public class statistiquesTable  extends AbstractTableModel{
    
    
    List <Evaluation> evaluations=new ArrayList <Evaluation>();
    String [] entete = {"id_deal","id_membre","note"};
    
    
    public statistiquesTable()
     {
       // evaluations = new EvaluationDAO().DisplayAllEvaluation();
     }

    @Override
    public int getRowCount() {
        
               return evaluations.size();

        
        
        
    }
     public String getColumnName(int column) {
        return entete[column];
    }
    
    

    @Override
    public int getColumnCount() {
       return entete.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
         switch (columnIndex) {
            case 0:
                return evaluations.get(rowIndex).getIdDeal();
            case 1:
                return evaluations.get(rowIndex).getIdMembre();
            case 2:
                return evaluations.get(rowIndex).getNote();
          
           
            default:
                 throw new IllegalArgumentException();
        }
         
         
         
         
        
        
    }
    
}
