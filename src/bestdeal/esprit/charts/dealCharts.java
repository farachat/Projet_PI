/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.charts;

import bestdeal.esprit.dao.DealDAO;
import bestdeal.esprit.dao.DetailReservationDAO;
import bestdeal.esprit.entities.DetailReservation;
import java.util.List;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author nesrin
 */
public class dealCharts extends JFrame {
    DefaultPieDataset dataset;//Dataset qui va contenir les Données
    JFreeChart graphe;        //Graphe
    ChartPanel cp;        

    public dealCharts() {
        
        DetailReservationDAO detailReservationDAO = new DetailReservationDAO();
        
        List<DetailReservation> listDet = detailReservationDAO.findBestDeals();
        
        DetailReservation DetailResmax1  = listDet.get(0);
        DetailReservation DetailResmax2  = listDet.get(1);
        DetailReservation DetailResmax3 = listDet.get(2);
        
        if(listDet.size()>3){
        for(int i=3;i<listDet.size();i++){
            if(listDet.get(i).getQuantite()>DetailResmax1.getQuantite()){
                DetailResmax1 = listDet.get(i);
            }
            if((listDet.get(i).getQuantite()<DetailResmax1.getQuantite())&&(listDet.get(i).getQuantite()>DetailResmax2.getQuantite())){
                DetailResmax2 = listDet.get(i);
            }
             if((listDet.get(i).getQuantite()<DetailResmax1.getQuantite())&&(listDet.get(i).getQuantite()<DetailResmax2.getQuantite())&&(listDet.get(i).getQuantite()>DetailResmax3.getQuantite())){
                DetailResmax3 = listDet.get(i);
            }   
            
        }
        }
        System.out.println(listDet);
        dataset = new DefaultPieDataset();
        DetailReservation d1 = detailReservationDAO.findDetailById(DetailResmax1.getIdDeal().getIdDeal());
        DetailReservation d2 = detailReservationDAO.findDetailById(DetailResmax2.getIdDeal().getIdDeal());
        DetailReservation d3 = detailReservationDAO.findDetailById(DetailResmax3.getIdDeal().getIdDeal());
//Statique
        
        DealDAO dealDAO = new DealDAO();
        
        String dnom1 = dealDAO.findById(d1.getIdDeal().getIdDeal()).getNomDeal();
        String dnom2 = dealDAO.findById(d2.getIdDeal().getIdDeal()).getNomDeal();
        String dnom3 = dealDAO.findById(d3.getIdDeal().getIdDeal()).getNomDeal();
        
        dataset.setValue(dnom1,(DetailResmax1.getQuantite()) );
        dataset.setValue(dnom2,(DetailResmax2.getQuantite()) );
     dataset.setValue(dnom3,(DetailResmax3.getQuantite()) );
        
        
        graphe = ChartFactory.createPieChart3D("Best deal", dataset,true ,true ,false);
        cp = new ChartPanel(graphe);
        this.add(cp);
    }
    
    public static void main(String[] args){
        dealCharts dc =  new dealCharts();
        dc.setVisible(true);
        dc.setSize(500, 500);
        
    }
}
