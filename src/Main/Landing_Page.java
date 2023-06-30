package Main;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class Landing_Page extends javax.swing.JFrame {
    int count;
    private APImageViewer displayPage; // Declare as a class member variable
    
    public Landing_Page() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/assets/HUMSS_LOGO.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnContact1 = new javax.swing.JLabel();
        btnContact = new javax.swing.JLabel();
        labelHeading1 = new javax.swing.JLabel();
        btnDisplay = new javax.swing.JLabel();
        btnDisplayPage = new javax.swing.JLabel();
        btnAdminPage = new javax.swing.JLabel();
        btnLogout = new javax.swing.JLabel();
        labelWrapper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Landing Page");
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(758, 394));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(580, 170));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnContact1.setBackground(new java.awt.Color(254, 251, 234));
        btnContact1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnContact1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnContact1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/abou.png"))); // NOI18N
        btnContact1.setText("About Us");
        btnContact1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnContact1MouseClicked(evt);
            }
        });
        jPanel1.add(btnContact1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 650, 150, 30));

        btnContact.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnContact.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnContact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cont.png"))); // NOI18N
        btnContact.setText("Contact Us");
        btnContact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnContactMouseClicked(evt);
            }
        });
        jPanel1.add(btnContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 650, 140, 30));

        labelHeading1.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        labelHeading1.setForeground(new java.awt.Color(254, 251, 234));
        labelHeading1.setText("\"Every artist was first an amateur\"");
        jPanel1.add(labelHeading1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 550, -1, -1));

        btnDisplay.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnDisplay.setForeground(new java.awt.Color(255, 255, 255));
        btnDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDisplay.setText("GETS STARTED");
        btnDisplay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDisplayMouseClicked(evt);
            }
        });
        jPanel1.add(btnDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 392, 200, 30));

        btnDisplayPage.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnDisplayPage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDisplayPage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/admin.png"))); // NOI18N
        btnDisplayPage.setText("Admin");
        btnDisplayPage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDisplayPageMouseClicked(evt);
            }
        });
        jPanel1.add(btnDisplayPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 650, 140, 30));

        btnAdminPage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdminPageMouseClicked(evt);
            }
        });
        jPanel1.add(btnAdminPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 540, 120, 110));

        btnLogout.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logout.png"))); // NOI18N
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
        });
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 20, 60, 50));

        labelWrapper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/LANDING PAGE.png"))); // NOI18N
        jPanel1.add(labelWrapper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1280, 720));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
int x = 300;

    
    private void btnDisplayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDisplayMouseClicked
        // TODO add your handling code here:
        Display display = new Display();
        display.show();

        dispose();
    }//GEN-LAST:event_btnDisplayMouseClicked

    private void btnDisplayPageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDisplayPageMouseClicked
        // TODO add your handling code here:
        AdminLogin AL = new AdminLogin();
        AL.show();

        dispose();
    }//GEN-LAST:event_btnDisplayPageMouseClicked

    private void btnContactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContactMouseClicked
        // TODO add your handling code here:
        ContactPage CP = new ContactPage();
        CP.show();

        dispose();
    }//GEN-LAST:event_btnContactMouseClicked

    private void btnContact1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContact1MouseClicked
        // TODO add your handling code here:
        AboutPage AP = new AboutPage();
        AP.show();
        
        dispose();
    }//GEN-LAST:event_btnContact1MouseClicked

    private void btnAdminPageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminPageMouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here

        count++;
        if (count == 10) {
            AdminLogin jf2 = new AdminLogin();
            jf2.show();

            dispose();
        }
    }//GEN-LAST:event_btnAdminPageMouseClicked

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        // TODO add your handling code here:
        // Display a confirmation dialog box
        int confirmed = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?", "Exit Confirmation", JOptionPane.YES_NO_OPTION);

        if (confirmed == JOptionPane.YES_OPTION) {
            // Exit the program
            System.exit(0);
        }
        // If the user selects "No" or closes the dialog box, the program will continue running
    }//GEN-LAST:event_btnLogoutMouseClicked

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
            java.util.logging.Logger.getLogger(Landing_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Landing_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Landing_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Landing_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Landing_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAdminPage;
    private javax.swing.JLabel btnContact;
    private javax.swing.JLabel btnContact1;
    private javax.swing.JLabel btnDisplay;
    private javax.swing.JLabel btnDisplayPage;
    private javax.swing.JLabel btnLogout;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelHeading1;
    private javax.swing.JLabel labelWrapper;
    // End of variables declaration//GEN-END:variables
}
