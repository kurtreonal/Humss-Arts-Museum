/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ImageViewer extends javax.swing.JFrame {
    int count;
    public ImageViewer() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/assets/HUMSS_LOGO.png")));
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
        btnBack = new javax.swing.JLabel();
        jScrollPane5 = new raven.scroll.win11.ScrollPaneWin11();
        lblArtistname = new javax.swing.JTextArea();
        jScrollPane1 = new raven.scroll.win11.ScrollPaneWin11();
        lblSchoolyear = new javax.swing.JTextArea();
        jScrollPane6 = new raven.scroll.win11.ScrollPaneWin11();
        lblstSection = new javax.swing.JTextArea();
        jScrollPane3 = new raven.scroll.win11.ScrollPaneWin11();
        lblEmail = new javax.swing.JTextArea();
        jScrollPane4 = new raven.scroll.win11.ScrollPaneWin11();
        lblArt = new javax.swing.JTextArea();
        jScrollPane2 = new raven.scroll.win11.ScrollPaneWin11();
        txtArtDesc = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Page Image Viewer");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 80, 49));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImageView.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblImageView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImageViewMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblImageViewMouseEntered(evt);
            }
        });
        jPanel1.add(lblImageView, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 122, 477, 489));

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

        jScrollPane5.setBorder(null);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        lblArtistname.setEditable(false);
        lblArtistname.setBackground(new java.awt.Color(29, 113, 81));
        lblArtistname.setColumns(20);
        lblArtistname.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        lblArtistname.setForeground(new java.awt.Color(255, 255, 255));
        lblArtistname.setRows(5);
        lblArtistname.setBorder(null);
        jScrollPane5.setViewportView(lblArtistname);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 120, 340, 30));

        jScrollPane1.setBorder(null);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        lblSchoolyear.setEditable(false);
        lblSchoolyear.setBackground(new java.awt.Color(29, 113, 81));
        lblSchoolyear.setColumns(20);
        lblSchoolyear.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        lblSchoolyear.setForeground(new java.awt.Color(255, 255, 255));
        lblSchoolyear.setRows(5);
        lblSchoolyear.setBorder(null);
        jScrollPane1.setViewportView(lblSchoolyear);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 180, 340, 30));

        jScrollPane6.setBorder(null);
        jScrollPane6.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        lblstSection.setEditable(false);
        lblstSection.setBackground(new java.awt.Color(29, 113, 81));
        lblstSection.setColumns(20);
        lblstSection.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        lblstSection.setForeground(new java.awt.Color(255, 255, 255));
        lblstSection.setRows(5);
        lblstSection.setBorder(null);
        jScrollPane6.setViewportView(lblstSection);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 240, 340, 30));

        jScrollPane3.setBorder(null);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        lblEmail.setEditable(false);
        lblEmail.setBackground(new java.awt.Color(29, 113, 81));
        lblEmail.setColumns(20);
        lblEmail.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setRows(5);
        lblEmail.setBorder(null);
        jScrollPane3.setViewportView(lblEmail);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 300, 340, 30));

        jScrollPane4.setBorder(null);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        lblArt.setEditable(false);
        lblArt.setBackground(new java.awt.Color(29, 113, 81));
        lblArt.setColumns(20);
        lblArt.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        lblArt.setForeground(new java.awt.Color(255, 255, 255));
        lblArt.setRows(5);
        lblArt.setBorder(null);
        jScrollPane4.setViewportView(lblArt);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 360, 340, 30));

        jScrollPane2.setBorder(null);

        txtArtDesc.setEditable(false);
        txtArtDesc.setBackground(new java.awt.Color(29, 113, 81));
        txtArtDesc.setColumns(20);
        txtArtDesc.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        txtArtDesc.setForeground(new java.awt.Color(255, 255, 255));
        txtArtDesc.setLineWrap(true);
        txtArtDesc.setRows(5);
        txtArtDesc.setWrapStyleWord(true);
        txtArtDesc.setBorder(null);
        jScrollPane2.setViewportView(txtArtDesc);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 420, 340, 128));

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
                Image scaledImage = image.getScaledInstance(1014, 570, Image.SCALE_SMOOTH);
                ImageIcon newImageIcon = new ImageIcon(scaledImage);

                // Dialog box for frame selection
                String[] options = {"Landscape", "Portrait"};
                int selectedOption = JOptionPane.showOptionDialog(
                        null,
                        "Choose how to view the image:",
                        "Image View Options",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        options,
                        options[0]
                );

                if (selectedOption == 0) {
                    openFrame(APImageViewer.class, "Landscape Image View", newImageIcon);
                } else if (selectedOption == 1) {
                    openFrame(APImageViewerPortrait.class, "Portrait Image View", newImageIcon);
                }

            } else {
                System.out.println("No image found in the label");
            }
        }
    }

    private void openFrame(Class<?> frameClass, String frameTitle, ImageIcon imageIcon) {
        try {
            JFrame newFrame = (JFrame) frameClass.newInstance();
            JLabel lblImage = (JLabel) frameClass.getDeclaredField("lblImage").get(newFrame);

            // Adjust the image size based on the frame type
            int width = imageIcon.getIconWidth();
            int height = imageIcon.getIconHeight();
            if (frameClass == APImageViewerPortrait.class) {
                // Resize the image for portrait mode
                int newWidth = 510;
                int newHeight = 570;
                Image scaledImage = imageIcon.getImage().getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
                imageIcon = new ImageIcon(scaledImage);
                width = newWidth;
                height = newHeight;
            }

            lblImage.setIcon(imageIcon); // Set the image icon on the existing label

            newFrame.setTitle(frameTitle);
            newFrame.setLocationRelativeTo(null);
            newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            newFrame.setAlwaysOnTop(true);
            newFrame.setSize(width, height); // Set the frame size based on the image size
            newFrame.setVisible(true);
            newFrame.toFront();

            // Add mouse click listener to close the frame when clicked
            lblImage.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    newFrame.dispose(); // Close the new frame
                    frameOpened = false; // Reset the flag
                }
            });

            frameOpened = true; // Set the flag to indicate that the frame has been opened
        } catch (InstantiationException | IllegalAccessException | NoSuchFieldException | SecurityException | IllegalArgumentException ex) {
            System.out.println("Error creating new frame instance: " + ex.getMessage());
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
        //</editor-fold>
        //</editor-fold>
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    public static javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    public static javax.swing.JTextArea lblArt;
    public static javax.swing.JTextArea lblArtistname;
    public static javax.swing.JTextArea lblEmail;
    public static javax.swing.JLabel lblImageView;
    public static javax.swing.JTextArea lblSchoolyear;
    public static javax.swing.JTextArea lblstSection;
    public static javax.swing.JTextArea txtArtDesc;
    // End of variables declaration//GEN-END:variables
}
