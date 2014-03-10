/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.controllers;

import bestdeal.esprit.dao.DealProposéDAO;
import bestdeal.esprit.entities.DealPropose;
import bestdeal.esprit.gui.AuthentificationMembre;
import bestdeal.esprit.gui.ProposerDeal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author DELL
 */
public class DealProposeControllers extends AbstractTableModel{
    
    String[] headers = {"id","Title du deal","Date Début deal","Date fin deal", "Catégorie" , "Ville" , "Prix" , "Description"};
    List<DealPropose> listdeal = new ArrayList<DealPropose>();
   

    ProposerDeal d=new ProposerDeal();
    int id = d.getIdv();
    
    public DealProposeControllers() {
       
        DealProposéDAO dealproposéDAO = new DealProposéDAO();
        
        listdeal = dealproposéDAO.findAll(id);
        System.out.println(listdeal);
    }
    @Override
    public int getRowCount() {
        return listdeal.size();
    }
    @Override
    public int getColumnCount() {
        return headers.length;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return listdeal.get(rowIndex).getIdDeal();
            case 1:
                return listdeal.get(rowIndex).getNomDeal();
            case 2:
                return listdeal.get(rowIndex).getDateDebutDeal();
            case 3:
                return listdeal.get(rowIndex).getDateFinDeal();
           
            case 4:
                return listdeal.get(rowIndex).getCategorie();
            case 5:
                return listdeal.get(rowIndex).getVille();
             case 6:
                return listdeal.get(rowIndex).getPrix();
            case 7:
                return listdeal.get(rowIndex).getDescription();
           
            
            default:
                return null;
        }}
    public String getColumnName (int index)
    {
       return headers[index]; 
    }
}
