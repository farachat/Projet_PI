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
public class DealNoteControllers extends AbstractTableModel{
    
    List<Evaluation> evaluations=new ArrayList<Evaluation>();
    String[] entete={"nom du membre","Prenom du membre","id_deal","Nom du deal","note"};
            
    public DealNoteControllers()
    {
        evaluations=new EvaluationDAO().DisplayAllEvaluations();
    }
    
    @Override
    public int getRowCount() {
     
       return evaluations.size();
    }

    @Override
    public int getColumnCount() {
        
        return entete.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex)
        {
            case 0 :
                 return evaluations.get(rowIndex).getIdMembre().getNomMembre();
            case 1:
               return evaluations.get(rowIndex).getIdMembre().getPrenomMembre();
            case 2 :
                return evaluations.get(rowIndex).getIdDeal().getIdDeal();
            case 3:
                return evaluations.get(rowIndex).getIdDeal().getNomDeal();
            case 4:
                return evaluations.get(rowIndex).getNote();
           
                
                default:
                    throw new IllegalArgumentException();
                    
    }
    }
    
    
    @Override
    public String getColumnName(int column)
    {
        return entete[column];
    }
}
