/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.controllers;
import  bestdeal.esprit.dao.DealDAO;
import bestdeal.esprit.dao.DetailReservationDAO;
import bestdeal.esprit.dao.MembreDAO;
import bestdeal.esprit.entities.Deal;
import bestdeal.esprit.entities.DetailReservation;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Oussama
 */
public class ListeDetailReservControllers extends AbstractTableModel{
     DealDAO dealDAO = new  DealDAO ();
    
    
    public void delete (int a){
        dealDAO.delete(a);
    }
    
    public void selectOneCommentaire(int id){
        Deal deal = new Deal();
        deal=dealDAO.findById(id);
        System.out.println("le : "+deal.getIdDeal());
    }
    
     String[] headers = {"Nom Membre ", "CatÃ©gorie", "Date", "QuantitÃ©", "Prix unitaire"};
    List<DetailReservation> listeDetail = new ArrayList<DetailReservation>();
    MembreDAO membreDAO=new MembreDAO();

    public ListeDetailReservControllers() {
        DetailReservationDAO detailDAO = new DetailReservationDAO();
        listeDetail = detailDAO.DisplayAllDetailReservation();
    }

    public int getRowCount() {
        return listeDetail.size();

    }

    public int getColumnCount() {
        return headers.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
              
                return  membreDAO.findById(1).getNomMembre();
            case 1:
                return listeDetail.get(rowIndex).getReservation().getCategorie();
            case 2:
                return listeDetail.get(rowIndex).getReservation().getDateReservation();
            case 3:
                return listeDetail.get(rowIndex).getQuantite();
            case 4:
                return listeDetail.get(rowIndex).getPrixUnitaire();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
      return headers[column];
    }

    
    }

   

