/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.controllers;

/**
 *
 * @author user
 */
import bestdeal.esprit.dao.CommentaireDAO;
import bestdeal.esprit.dao.DealDAO;
import bestdeal.esprit.entities.Commentaire;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author user
 */
public class commentaireController extends AbstractTableModel {
    
     String[] headers = {"Nom du deal", "Nom du membre", "Date du commentaire", "Commentaire","id commentaire"};
    List<Commentaire> ListComm = new ArrayList<Commentaire>();

    public commentaireController() {
        CommentaireDAO commDAO = new CommentaireDAO();
        ListComm = commDAO.DisplayAllCommentaires();
        System.out.println(ListComm);
    }

    public int getRowCount() {
        return ListComm.size();
    }

    public int getColumnCount() {

        return headers.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                DealDAO deDAO=new DealDAO();
                System.out.println();
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

    @Override
    public String getColumnName(int column) {
        return headers[column];
    }
    
}