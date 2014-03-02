/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.controllers;

import bestdeal.esprit.dao.MembreDAO;
import bestdeal.esprit.entities.Membre;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author user
 */

public class membreController extends AbstractTableModel {
    
   
     String[] headers={"Id", "Nom", "Prénom", "CIN", "Login", "Mot de passe", "Email", "Tél", "Adresse", "Type"};
     List<Membre> listMembre=new ArrayList<Membre>();
     
     
     public membreController() {
        MembreDAO MembreDao=new MembreDAO();
        listMembre=MembreDao.findAll();
  
        //System.out.println(listMembre);

    }

    public int getRowCount() {
        return listMembre.size();

    }

    public int getColumnCount() {
        return headers.length;

    }

    public Object getValueAt(int rowIndex, int columnIndex) {
         switch(columnIndex)
        {
            case 0:
                return listMembre.get(rowIndex).getIdMembre();
            case 1:
                return listMembre.get(rowIndex).getNomMembre();
            case 2 :
                 return listMembre.get(rowIndex).getPrenomMembre();
            case 3 :
                 return listMembre.get(rowIndex).getCinMembre();
            case 4:
                return listMembre.get(rowIndex).getLoginMembre();
            case 5 :
                 return listMembre.get(rowIndex).getPwdMembre();
           
            case 6:
                return listMembre.get(rowIndex).getMailMembre();
            case 7 :
                 return listMembre.get(rowIndex).getTelMembre();
            case 8 :
                 return listMembre.get(rowIndex).getAdressMembre();
            case 9 :
                 return listMembre.get(rowIndex).getType();
                    default:
                        return null;

        }




    }
    public String getColumnName(int column) {
        return headers[column];
    }

}