/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.gui;

/**
 *
 * @author nesrin
 */
public class Apropos extends javax.swing.JFrame {

    /**
     * Creates new form Apropos
     */
    public Apropos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("A propos de Best Deal");
        setPreferredSize(new java.awt.Dimension(650, 430));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setText("Développé par: ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 220, 130, 16);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bestdeal/esprit/image/logo.jpg"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(200, 80));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(190, 30, 200, 40);

        jLabel3.setText("BestDeal est une application de l’achat groupé. ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 90, 340, 20);

        jLabel5.setText("Nous proposons un bon plan à s’offrir ou à offrir : sport,beauté,bien-être,restos,shopping ... ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 130, 550, 20);

        jLabel7.setText("Uniquement des bons plans négociés au meilleur prix chez les commerçants de votre ville.");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 170, 560, 16);

        jLabel6.setText("Maryem Ben Ammar,Fahmi Jomâa, Riahi Oussema, Saidane Nesrine, Souissi Salma, Torkhani Arbi ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 250, 570, 16);

        jLabel8.setText("3A17");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(380, 280, 90, 16);

        jLabel9.setText("Esprit");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(380, 310, 90, 16);

        jLabel10.setText("2013-2014");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(380, 330, 90, 20);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bestdeal/esprit/image/CodeSecret.PNG"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(470, 270, 80, 80);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bestdeal/esprit/image/bkg-8.jpg"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel4.setMaximumSize(new java.awt.Dimension(600, 320));
        jLabel4.setMinimumSize(new java.awt.Dimension(600, 320));
        jLabel4.setPreferredSize(new java.awt.Dimension(600, 320));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 690, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Apropos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Apropos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Apropos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Apropos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Apropos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}