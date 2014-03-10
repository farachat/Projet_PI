/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.gui;

import bestdeal.esprit.util.ImagePanel;
import bestdeal.esprit.util.TransparentPanel;
import bestdeal.esprit.controllers.CommentaireClientControllers;
import bestdeal.esprit.dao.CommentaireDAO;

import bestdeal.esprit.dao.DealDAO;
import bestdeal.esprit.dao.EvaluationDAO;
import bestdeal.esprit.dao.FournisseurDAO;
import bestdeal.esprit.entities.Commentaire;
import bestdeal.esprit.entities.Deal;
import bestdeal.esprit.entities.Evaluation;
import bestdeal.esprit.entities.Fournisseur;
import bestdeal.esprit.entities.Membre;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import bestdeal.esprit.map.StaticMaps;
import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaLookAndFeel;
import java.awt.Dimension;
import java.awt.Image;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author nesrin
 */
public class DetailDeal extends javax.swing.JFrame {
int id;
DealDAO DDAO = new DealDAO();
FournisseurDAO FDAO = new FournisseurDAO();
Fournisseur f = new Fournisseur();
ListesDeals d = new ListesDeals();
CommentaireDAO cmdDAO =new CommentaireDAO();
Commentaire c =new Commentaire();
Deal deal = new Deal();
private StaticMaps ObjStaticMaps=new StaticMaps();
private String n;
private int note;
    /**
     * Creates new form DetailDeal
     */
    public DetailDeal() {
        try {
            SyntheticaLookAndFeel.setWindowsDecorated(false);

        UIManager.put("Synthetica.dialog.icon.enabled", true);
      
         
      UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());
     
        
             initComponents();
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(addCommentaire.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(addCommentaire.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
         n=AuthentificationMembre.getNomloginmembre();
         jTable2.setVisible(false);
        id=d.getId(); 
        jlabelNomCompte.setText(n);
        deal  = DDAO.findByIddd(id);
        
        jLabel2.setText(deal.getDescription());
        jLabel3.setText(deal.getImage());
        jLabel6.setText(deal.getDetails());
        jLabel10.setText(String.valueOf(deal.getPrix()));
        jLabel11.setText(String.valueOf((((deal.getPrix())*(deal.getPourcentage())/100))));
        jLabel1.setText((String.valueOf((deal.getPrix())-((deal.getPrix())*(deal.getPourcentage())/100))));
        jLabel4.setText(deal.getDateDebutDeal().toString());
        f= FDAO.findById(deal.getIdFournisseur().getIdFournisseur());
        System.out.println(f);
       
        
        jLabel9.setText(f.getAdresseFournisseur());
        jLabel16.setText(f.getNomFournisseur());
        jLabel17.setText(f.getTelFournisseur());
        jLabel7.setText(String.valueOf(deal.getPourcentage()));
        try {
           
            this.creerMap(deal.getVille());
        } catch (MalformedURLException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
       
        jetoile1.setVisible(false);
        jetoile2.setVisible(false);
        jetoile3.setVisible(false);
        jetoile4.setVisible(false);
        jetoile5.setVisible(false);
                
    }
    
    private void creerMap(String ch) throws MalformedURLException, UnsupportedEncodingException{
        jSlider1.setVisible(true);
         if(!ch.isEmpty()){
             
             Image imageMap=ObjStaticMaps.getStaticMap(ch,
                     Integer.valueOf(jSlider1.getValue()),new Dimension(240,240),
                     10,this.SelectionerFormat(),
                     this.SelectionnerTypeMap());
            if(imageMap!=null){
                ImageIcon imgIcon=new ImageIcon(imageMap);
                Icon iconImage=(Icon)imgIcon;
                labelmap.setIcon(iconImage);
            }
         }
     }
    private StaticMaps.Maptype SelectionnerTypeMap(){
        StaticMaps.Maptype type= StaticMaps.Maptype.roadmap;
        switch(jCombo_type.getSelectedItem().toString()){
            case "roadmap":
                type= StaticMaps.Maptype.roadmap;
                break;
            case "satellite":
                type= StaticMaps.Maptype.satellite;
                break;
            case "hybrid":
                type= StaticMaps.Maptype.hybrid;
                break;
            case "terrain":
                type= StaticMaps.Maptype.terrain;
                break;
        }
        return type;
    } 
 private StaticMaps.Format SelectionerFormat(){
        StaticMaps.Format format= StaticMaps.Format.jpg;
        return format;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        labelmap = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jCombo_type = new javax.swing.JComboBox();
        jlabelNomCompte = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jetoile1 = new javax.swing.JLabel();
        jetoile2 = new javax.swing.JLabel();
        jetoile3 = new javax.swing.JLabel();
        jetoile4 = new javax.swing.JLabel();
        jetoile5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlabelbackground = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, -1, -1));

        jLabel3.setText("Image");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 60, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(214, 12, 12));
        jLabel7.setText("pourcentage");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 130, 50));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 190, 90, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 210, 30));

        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 540, 50, 38));

        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 540, 51, 35));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 0, 0));
        jLabel1.setText("jLabel1");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 140, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 0, 0));
        jLabel5.setText("DT");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setText("DT");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setText("DT");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(237, 15, 15));
        jLabel15.setText("%");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("jLabel16");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, 320, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("jLabel17");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 510, 250, 30));

        jTable2.setModel(new bestdeal.esprit.controllers.CommentaireClientControllers());
        jTable2.getColumnModel().getColumn(4).setMaxWidth(0);
        jTable2.getColumnModel().getColumn(4).setMinWidth(0);
        jTable2.getColumnModel().getColumn(4).setWidth(0);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 580, 480, 130));
        getContentPane().add(labelmap, new org.netbeans.lib.awtextra.AbsoluteConstraints(913, 438, 240, 240));

        jSlider1.setMaximum(20);
        jSlider1.setMinimum(10);
        jSlider1.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider1.setValue(15);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });
        getContentPane().add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 460, 10, 180));

        jCombo_type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "roadmap", "satellite", "hybrid", "terrain" }));
        getContentPane().add(jCombo_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 460, 100, -1));

        jlabelNomCompte.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlabelNomCompte.setForeground(new java.awt.Color(240, 240, 240));
        jlabelNomCompte.setText("fazet");
        getContentPane().add(jlabelNomCompte, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 10, 160, 30));

        jButton5.setText("note");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 590, -1, -1));

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });
        getContentPane().add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 540, 20, 30));

        jetoile1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bestdeal/esprit/image/starr.png"))); // NOI18N
        jetoile1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jetoile1MouseClicked(evt);
            }
        });
        getContentPane().add(jetoile1, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 535, 40, 50));

        jetoile2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bestdeal/esprit/image/starr.png"))); // NOI18N
        jetoile2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jetoile2MouseClicked(evt);
            }
        });
        getContentPane().add(jetoile2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 540, -1, -1));

        jetoile3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bestdeal/esprit/image/starr.png"))); // NOI18N
        jetoile3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jetoile3MouseClicked(evt);
            }
        });
        getContentPane().add(jetoile3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 540, -1, -1));

        jetoile4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bestdeal/esprit/image/starr.png"))); // NOI18N
        jetoile4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jetoile4MouseClicked(evt);
            }
        });
        getContentPane().add(jetoile4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 540, -1, -1));

        jetoile5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bestdeal/esprit/image/starr.png"))); // NOI18N
        jetoile5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jetoile5MouseClicked(evt);
            }
        });
        getContentPane().add(jetoile5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 540, -1, -1));

        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 220, 40));

        jlabelbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bestdeal/esprit/image/slider-background-4.jpg"))); // NOI18N
        jlabelbackground.setText("sfsffddf");
        jlabelbackground.setToolTipText("");
        jlabelbackground.setAutoscrolls(true);
        getContentPane().add(jlabelbackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 710));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1189)/2, (screenSize.height-747)/2, 1189, 747);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTable2.getColumnModel().getColumn(4).setMaxWidth(0);
        jTable2.getColumnModel().getColumn(4).setMinWidth(0);
        jTable2.getColumnModel().getColumn(4).setWidth(0);
        jTable2.setVisible(true);
       
      


       jTable2.setModel(new CommentaireClientControllers());
     //  c= cmdDAO.findById(c.getDeal().getIdDeal());
       
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       //jTable2.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        try {
            this.creerMap(deal.getVille());
        } catch (MalformedURLException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jSlider1StateChanged

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

        EvaluationDAO evaluationDAO = new EvaluationDAO();
        Evaluation ev= new Evaluation();
        int mm=AuthentificationMembre.getIdmembreint();
        Membre x=new Membre();
        x.setIdMembre(mm);
        int note = Integer.parseInt( jSpinner1.getValue().toString());
         ev.setIdDeal(deal);
         ev.setIdMembre(x);
        ev.setNote(note);
        evaluationDAO.create(ev);

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        // TODO add your handling code here:
        note =  Integer.parseInt(jSpinner1.getValue().toString());
        //t.setText(note+"");
        List listlabel= new ArrayList();
        listlabel.add(jetoile1);
        listlabel.add(jetoile2);
        listlabel.add(jetoile3);
        listlabel.add(jetoile4);
        listlabel.add(jetoile5);
        for(int i=0;i<note;i++)
        {
            if (note ==1) {jetoile1.setVisible(true);}
            if (note ==2) {jetoile2.setVisible(true);}
            if (note ==3) {jetoile3.setVisible(true);}
            if (note ==4) {jetoile4.setVisible(true);}
            if (note ==5) {jetoile5.setVisible(true);}
        }
        for(int j=0;j<=note;j++)
        {

            if (note ==4) {jetoile5.setVisible(false);}
            if (note ==3) {jetoile4.setVisible(false);}
            if (note ==2) {jetoile3.setVisible(false);}
            if (note ==1) {jetoile2.setVisible(false);}
            if (note ==0) {jetoile1.setVisible(false);}

        }

    }//GEN-LAST:event_jSpinner1StateChanged

    private void jetoile1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jetoile1MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jetoile1MouseClicked

    private void jetoile2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jetoile2MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jetoile2MouseClicked

    private void jetoile3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jetoile3MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jetoile3MouseClicked

    private void jetoile4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jetoile4MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jetoile4MouseClicked

    private void jetoile5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jetoile5MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jetoile5MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DetailDeal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetailDeal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetailDeal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetailDeal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetailDeal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jCombo_type;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel jetoile1;
    private javax.swing.JLabel jetoile2;
    private javax.swing.JLabel jetoile3;
    private javax.swing.JLabel jetoile4;
    private javax.swing.JLabel jetoile5;
    private javax.swing.JLabel jlabelNomCompte;
    private javax.swing.JLabel jlabelbackground;
    private javax.swing.JLabel labelmap;
    // End of variables declaration//GEN-END:variables

    
}
