/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.gui;

import bestdeal.esprit.dao.MembreDAO;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author nesrin
 */
public class RecuperationMP extends javax.swing.JFrame {

    /**
     * Creates new form RecuperationMP
     */
    public RecuperationMP() {
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
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(350, 320));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bestdeal/esprit/image/email_encrypted64.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 30, 64, 64);

        jLabel2.setText("Récupération du mot de passe");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 50, 200, 14);

        jLabel5.setText("Adresse Electronique :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 130, 160, 14);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(50, 160, 210, 20);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bestdeal/esprit/image/email.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(80, 210, 60, 60);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bestdeal/esprit/image/quiiter.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(190, 210, 60, 60);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bestdeal/esprit/image/bkg-7.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 380, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                 String From ="saidane.nesrine@gmail.com" ;
                       String To = jTextField2.getText();
                      

                       MembreDAO membre= new  MembreDAO(); 
        
       for (int i = 0; i < membre.DisplayAllMembre().size(); i++)
       { 
           if( membre.DisplayAllMembre().get(i).getMailMembre().equals(jTextField2.getText())) { 
               
                     Properties pros = new Properties();
                       pros.put("mail.smtp.host", "smtp.gmail.com");
                       pros.put("mail.smtp.socketFactory.port", "465");
                       pros.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
                       pros.put("mail.smtp.auth", "true");
                       pros.put("mail.smtp.port", "465");
                       
                       
                       Session session = Session.getDefaultInstance(pros, 
                               
                               
                               new javax.mail.Authenticator() {
                               
                                   @Override
                               protected PasswordAuthentication getPasswordAuthentication()
                               {
                               
                               return new PasswordAuthentication("saidane.nesrine@gmail.com", "sn08742785sn91");
                               
                               }
                               
                               }
                               
                               );
                                              
                       try {
                       
                            Message message = new MimeMessage(session);
                            message.setFrom(new InternetAddress(From));
                            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(To));
                            message.setSubject("Récupération de mot de passe");
                            message.setText("Bienvenue " +membre.DisplayAllMembre().get(i).getNomMembre() +" "+membre.DisplayAllMembre().get(i).getPrenomMembre()+
",\n"+
" Votre demande de récupération de votre mot de passe a été approuvée par notre équipe d'administration."+
"\n Voici les informations de votre compte : "+
"\n Adresse e-mail :"+membre.DisplayAllMembre().get(i).getMailMembre()+
"\n Identifiant :"+membre.DisplayAllMembre().get(i).getLoginMembre()+
"\n Mot de passe :"+membre.DisplayAllMembre().get(i).getPwdMembre()+
"\n Nous sommes heureux de vous accueillir parmi nous."+
"\n Profitez de l'expérience! "+
"\n Cordialement, "+
"\n Équipe d'administration de l’application BEST DEAL .");  
             

                            Transport.send(message);
                              
                       JOptionPane.showMessageDialog(null, "Votre message de récupération a été envoyé avec succès ");

                       }
                       
                       catch(Exception e )
                       {
                          
                       JOptionPane.showMessageDialog(null, "Verifier les emails saisis");
                       jTextField2.setText("");
                       }                       

                              } 

 }       
               
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        AuthentificationMembre  a=new AuthentificationMembre();
        a.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(RecuperationMP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecuperationMP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecuperationMP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecuperationMP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecuperationMP().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
