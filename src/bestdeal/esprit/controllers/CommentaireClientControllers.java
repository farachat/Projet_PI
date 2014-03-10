/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.controllers;

import bestdeal.esprit.dao.CommentaireDAO;
import bestdeal.esprit.entities.Commentaire;
import bestdeal.esprit.gui.ListesDeals;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author nesrin
 */
public class CommentaireClientControllers extends AbstractTableModel{
String[] headers = {"Nom du deal", "Nom du membre", "Date du commentaire", "Commentaire","Id commentaire"};
    List<Commentaire> ListComm = new ArrayList<Commentaire>();
    
    ListesDeals ld=new ListesDeals();
    int d=ld.getId();
    
     public CommentaireClientControllers() {
        CommentaireDAO commDAO = new CommentaireDAO();
        ListComm = commDAO.DisplayAllCommentaires(d);
        System.out.println(ListComm);
    }
    
    @Override
    public int getRowCount() {
       return ListComm.size();
    
    }

    @Override
    public int getColumnCount() {
       return headers.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
//                DealDAO deDAO=new DealDAO();
//                System.out.println();
               return ListComm.get(rowIndex).getDeal().getNomDeal();
            case 1:
                return ListComm.get(rowIndex).getMembre().getNomMembre();
            case 2:
                return ListComm.get(rowIndex).getDateSys();
            case 3:
                return ListComm.get(rowIndex).getCommentaire();
            case 4:
                return ListComm.get(rowIndex).getIdCommentaire();
            default:
                return null;
        }}
    public String getColumnName (int index)
    {
       return headers[index]; 
    }
}
