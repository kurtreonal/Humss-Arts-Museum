/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ImageViewer extends javax.swing.JFrame {
    int count;
    public ImageViewer() {
        initComponents();
    }

    public void instantiateLblImageView() {
        lblImageView = new javax.swing.JLabel(); // Instantiate the lblImageView object
        jPanel1.add(lblImageView, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 530, 280)); // Add lblImageView to jPanel1

    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        panelMenu = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        btnAbout = new javax.swing.JButton();
        btnDisplay = new javax.swing.JButton();
        btnDisplayPage = new javax.swing.JButton();
        btnContact = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        labelTitle3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnHome1 = new javax.swing.JButton();
        burgerMenu2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        LabelArtistname = new javax.swing.JLabel();
        LabelSchoolyear = new javax.swing.JLabel();
        LabelEmailaddress = new javax.swing.JLabel();
        LabelArtTitle = new javax.swing.JLabel();
        LabelDescription = new javax.swing.JLabel();
        lblImageView = new javax.swing.JLabel();
        lblArtistname = new javax.swing.JLabel();
        lblSchoolyear = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblArt = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArtDesc = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelMenu.setBackground(new java.awt.Color(51, 80, 49));
        panelMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMenuMouseClicked(evt);
            }
        });
        panelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome.setBackground(new java.awt.Color(51, 80, 49));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/HUMSS (2).png"))); // NOI18N
        btnHome.setBorder(null);
        btnHome.setBorderPainted(false);
        btnHome.setContentAreaFilled(false);
        btnHome.setOpaque(false);
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHomeMouseEntered(evt);
            }
        });
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        panelMenu.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 160, 140));

        btnAbout.setBackground(new java.awt.Color(51, 80, 49));
        btnAbout.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAbout.setForeground(new java.awt.Color(255, 255, 255));
        btnAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ABOUT.png"))); // NOI18N
        btnAbout.setText("About Us");
        btnAbout.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutActionPerformed(evt);
            }
        });
        panelMenu.add(btnAbout, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 190, 65));

        btnDisplay.setBackground(new java.awt.Color(51, 80, 49));
        btnDisplay.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnDisplay.setForeground(new java.awt.Color(255, 255, 255));
        btnDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/art.png"))); // NOI18N
        btnDisplay.setText("Humss Arts");
        btnDisplay.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayActionPerformed(evt);
            }
        });
        panelMenu.add(btnDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 190, 65));

        btnDisplayPage.setBackground(new java.awt.Color(51, 80, 49));
        btnDisplayPage.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnDisplayPage.setForeground(new java.awt.Color(255, 255, 255));
        btnDisplayPage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/art.png"))); // NOI18N
        btnDisplayPage.setText("Art List");
        btnDisplayPage.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDisplayPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayPageActionPerformed(evt);
            }
        });
        panelMenu.add(btnDisplayPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 190, 65));

        btnContact.setBackground(new java.awt.Color(51, 80, 49));
        btnContact.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnContact.setForeground(new java.awt.Color(255, 255, 255));
        btnContact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-phone-30.png"))); // NOI18N
        btnContact.setText("Contact Us");
        btnContact.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContactActionPerformed(evt);
            }
        });
        panelMenu.add(btnContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 190, 65));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/instagram.png"))); // NOI18N
        jLabel2.setFocusable(false);
        panelMenu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 600, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/youtube.png"))); // NOI18N
        jLabel3.setFocusable(false);
        panelMenu.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 600, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/facebook.png"))); // NOI18N
        jLabel4.setFocusable(false);
        panelMenu.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 600, -1, -1));

        btnExit.setBackground(new java.awt.Color(41, 65, 40));
        btnExit.setForeground(new java.awt.Color(193, 216, 191));
        btnExit.setText("BACK");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        panelMenu.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 60, 20));

        getContentPane().add(panelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 760));

        jPanel2.setBackground(new java.awt.Color(51, 80, 49));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitle3.setBackground(new java.awt.Color(254, 251, 234));
        labelTitle3.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        labelTitle3.setForeground(new java.awt.Color(242, 242, 242));
        labelTitle3.setText("HUMSS ART CATALOG");
        jPanel2.add(labelTitle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, -1));

        jButton1.setBackground(new java.awt.Color(51, 80, 49));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(254, 251, 234));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/exit.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 40, 50, -1));

        btnHome1.setBackground(new java.awt.Color(51, 80, 49));
        btnHome1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/SHS_logo.png"))); // NOI18N
        btnHome1.setBorder(null);
        btnHome1.setBorderPainted(false);
        btnHome1.setContentAreaFilled(false);
        btnHome1.setOpaque(false);
        btnHome1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHome1MouseClicked(evt);
            }
        });
        btnHome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHome1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnHome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 120, 120));

        burgerMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menuW2.png"))); // NOI18N
        burgerMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                burgerMenu2MouseClicked(evt);
            }
        });
        jPanel2.add(burgerMenu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("LOGOUT |");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 40, -1, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 140));

        jPanel1.setBackground(new java.awt.Color(51, 80, 49));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelArtistname.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        LabelArtistname.setForeground(new java.awt.Color(255, 255, 255));
        LabelArtistname.setText("Artist Name:");
        jPanel1.add(LabelArtistname, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, 150, 30));

        LabelSchoolyear.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        LabelSchoolyear.setForeground(new java.awt.Color(255, 255, 255));
        LabelSchoolyear.setText("School Year:");
        jPanel1.add(LabelSchoolyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 520, 150, 30));

        LabelEmailaddress.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        LabelEmailaddress.setForeground(new java.awt.Color(255, 255, 255));
        LabelEmailaddress.setText("Artist Email:");
        jPanel1.add(LabelEmailaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 570, 150, 30));

        LabelArtTitle.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        LabelArtTitle.setForeground(new java.awt.Color(255, 255, 255));
        LabelArtTitle.setText("Art Title:");
        jPanel1.add(LabelArtTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 620, 110, 30));

        LabelDescription.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        LabelDescription.setForeground(new java.awt.Color(255, 255, 255));
        LabelDescription.setText("Description:");
        jPanel1.add(LabelDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 470, 120, 30));

        lblImageView.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(lblImageView, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, 530, 280));

        lblArtistname.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblArtistname.setForeground(new java.awt.Color(193, 216, 191));
        jPanel1.add(lblArtistname, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 470, 270, 30));

        lblSchoolyear.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        lblSchoolyear.setForeground(new java.awt.Color(193, 216, 191));
        jPanel1.add(lblSchoolyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 520, 270, 30));

        lblEmail.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(193, 216, 191));
        jPanel1.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 570, 270, 30));

        lblArt.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        lblArt.setForeground(new java.awt.Color(193, 216, 191));
        jPanel1.add(lblArt, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 620, 270, 30));

        txtArtDesc.setEditable(false);
        txtArtDesc.setBackground(new java.awt.Color(51, 80, 49));
        txtArtDesc.setColumns(20);
        txtArtDesc.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        txtArtDesc.setForeground(new java.awt.Color(255, 255, 255));
        txtArtDesc.setLineWrap(true);
        txtArtDesc.setRows(5);
        txtArtDesc.setWrapStyleWord(true);
        txtArtDesc.setOpaque(false);
        jScrollPane2.setViewportView(txtArtDesc);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 510, 390, 150));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/ggg.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        setSize(new java.awt.Dimension(1280, 720));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHome1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome1MouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here

        count++;
        if (count == 10) {
            AdminLogin jf2 = new AdminLogin();
            jf2.show();

            dispose();
        }
    }//GEN-LAST:event_btnHome1MouseClicked

    private void btnHome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome1ActionPerformed
int x = 300;
    private void burgerMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_burgerMenu2MouseClicked
        // TODO add your handling code here:
        if (x == 0) {
            panelMenu.show();
            panelMenu.setSize(x, 760);
            Thread th = new Thread() {
                @Override
                public void run() {
                    try {
                        for (int i = 0; i <= x; i++) {
                            Thread.sleep(1);
                            panelMenu.setSize(i, 760);
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            };
            th.start();
            x = 300;
        }
    }//GEN-LAST:event_burgerMenu2MouseClicked

    private void panelMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMenuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_panelMenuMouseClicked

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        Display display = new Display();
        display.show();

        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContactActionPerformed
        // TODO add your handling code here:
        ContactPage AP = new ContactPage();
        AP.show();

        dispose();
    }//GEN-LAST:event_btnContactActionPerformed

    private void btnDisplayPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayPageActionPerformed
        // TODO add your handling code here:
        DisplayPage DP = new DisplayPage();
        DP.show();

        dispose();
    }//GEN-LAST:event_btnDisplayPageActionPerformed

    private void btnDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayActionPerformed
        // TODO add your handling code here:
        Display display = new Display();
        display.show();

        dispose();
    }//GEN-LAST:event_btnDisplayActionPerformed

    private void btnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutActionPerformed
        // TODO add your handling code here:
        AboutPage AP = new AboutPage();
        AP.show();

        dispose();
    }//GEN-LAST:event_btnAboutActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHomeMouseEntered

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked

    }//GEN-LAST:event_btnHomeMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Display a confirmation dialog box
        int confirmed = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?", "Exit Confirmation", JOptionPane.YES_NO_OPTION);

        if (confirmed == JOptionPane.YES_OPTION) {
            // Exit the program
            System.exit(0);
        }
        // If the user selects "No" or closes the dialog box, the program will continue running
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ImageViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImageViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImageViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImageViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImageViewer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelArtTitle;
    private javax.swing.JLabel LabelArtistname;
    private javax.swing.JLabel LabelDescription;
    private javax.swing.JLabel LabelEmailaddress;
    private javax.swing.JLabel LabelSchoolyear;
    private javax.swing.JButton btnAbout;
    private javax.swing.JButton btnContact;
    private javax.swing.JButton btnDisplay;
    private javax.swing.JButton btnDisplayPage;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnHome1;
    private javax.swing.JLabel burgerMenu2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelTitle3;
    public static javax.swing.JLabel lblArt;
    public static javax.swing.JLabel lblArtistname;
    public static javax.swing.JLabel lblEmail;
    public static javax.swing.JLabel lblImageView;
    public static javax.swing.JLabel lblSchoolyear;
    private javax.swing.JPanel panelMenu;
    public static javax.swing.JTextArea txtArtDesc;
    // End of variables declaration//GEN-END:variables
}
