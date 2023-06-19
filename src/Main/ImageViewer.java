/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
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
        jPanel1 = new javax.swing.JPanel();
        lblImageView = new javax.swing.JLabel();
        lblArtistname = new javax.swing.JLabel();
        lblSchoolyear = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblArt = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArtDesc = new javax.swing.JTextArea();
        btnBack = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Image Viewer");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 80, 49));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImageView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImageViewMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblImageViewMouseEntered(evt);
            }
        });
        jPanel1.add(lblImageView, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 122, 477, 489));

        lblArtistname.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        lblArtistname.setForeground(new java.awt.Color(193, 216, 191));
        jPanel1.add(lblArtistname, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 120, 340, 40));

        lblSchoolyear.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        lblSchoolyear.setForeground(new java.awt.Color(193, 216, 191));
        jPanel1.add(lblSchoolyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 180, 340, 40));

        lblEmail.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(193, 216, 191));
        jPanel1.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 250, 340, 40));

        lblArt.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        lblArt.setForeground(new java.awt.Color(193, 216, 191));
        jPanel1.add(lblArt, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 310, 340, 40));

        txtArtDesc.setEditable(false);
        txtArtDesc.setBackground(new java.awt.Color(29, 113, 81));
        txtArtDesc.setColumns(20);
        txtArtDesc.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        txtArtDesc.setForeground(new java.awt.Color(255, 255, 255));
        txtArtDesc.setLineWrap(true);
        txtArtDesc.setRows(5);
        txtArtDesc.setWrapStyleWord(true);
        txtArtDesc.setBorder(null);
        jScrollPane2.setViewportView(txtArtDesc);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 370, -1, 170));

        btnBack.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBack.setText("Back");
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 23, 90, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Image Viewer.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        setSize(new java.awt.Dimension(1280, 720));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 
    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        Display DP = new Display();
        DP.show();
        
        dispose();
    }//GEN-LAST:event_btnBackMouseClicked

    private boolean frameOpened = false;

    private void lblImageViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImageViewMouseClicked
        // TODO add your handling code here
        if (!frameOpened) {
            ImageIcon imageIcon = (ImageIcon) lblImageView.getIcon();
            if (imageIcon != null) {
                Image image = imageIcon.getImage();
                Image scaledImage = image.getScaledInstance(660, 550, Image.SCALE_SMOOTH);
                ImageIcon newImageIcon = new ImageIcon(scaledImage);

                APImageViewer newFrame = new APImageViewer();
                APImageViewer.lblImage.setIcon(newImageIcon); // Set the image icon on the existing label

                newFrame.setTitle("Image View");
                newFrame.setLocationRelativeTo(null);
                newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                newFrame.setAlwaysOnTop(true);
                newFrame.setVisible(true);
                newFrame.toFront();

                // Add mouse click listener to close the frame when clicked
                APImageViewer.lblImage.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        newFrame.dispose(); // Close the new frame
                        frameOpened = false; // Reset the flag
                    }
                });

                frameOpened = true; // Set the flag to indicate that the frame has been opened
            } else {
                System.out.println("No image found in the label");
            }
        }
    }//GEN-LAST:event_lblImageViewMouseClicked

    private void lblImageViewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImageViewMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblImageViewMouseEntered

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
    private javax.swing.JLabel btnBack;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JLabel lblArt;
    public static javax.swing.JLabel lblArtistname;
    public static javax.swing.JLabel lblEmail;
    public static javax.swing.JLabel lblImageView;
    public static javax.swing.JLabel lblSchoolyear;
    public static javax.swing.JTextArea txtArtDesc;
    // End of variables declaration//GEN-END:variables
}
