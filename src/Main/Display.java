
package Main;
import java.awt.Image;
import java.awt.MediaTracker;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author Kurt Pascua
 */
public class Display extends javax.swing.JFrame {
    
    int count;
    
    public Display() {
        initComponents();
        showTableData();
    }
    private void showTableData() {
        try {
            Connection myConn = ConDB.getConnection();

            String sqlSign = "SELECT id as 'No.', Artist_name as 'Artist Name', School_year as 'School Year', "
                    + "Email_address as 'Email Address', User_Art as 'Art Title', User_Art_Desc as 'Art Description', `image_name` as 'Image Name' FROM users";

            PreparedStatement ps = myConn.prepareStatement(sqlSign);

            ResultSet rs = ps.executeQuery();

            Table.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            System.out.println(e);
        }

    }
    //Instantiate lblImageView


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        id = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        lbl_imgview = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        btnBack = new javax.swing.JLabel();
        labelWrapper = new javax.swing.JLabel();

        id.setOpaque(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(29, 113, 81));
        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("View Art");
        jButton2.setBorder(null);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 640, 90, 40));

        lbl_imgview.setBackground(new java.awt.Color(51, 80, 49));
        lbl_imgview.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_imgviewMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_imgview, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 103, 495, 507));

        Table.setBackground(new java.awt.Color(29, 113, 81));
        Table.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 0, 0, new java.awt.Color(255, 255, 255)));
        Table.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Table.setForeground(new java.awt.Color(255, 255, 255));
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "Artist Name", "School Year", "Email Address", "Art Title", "Art Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table.setRowHeight(50);
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TableMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(Table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, 500, 460));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(29, 113, 81));
        jLabel3.setText("Search:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, 80, 40));

        search.setBackground(new java.awt.Color(29, 113, 81));
        search.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchKeyTyped(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 100, 360, 40));

        btnBack.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBack.setText("Back");
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 110, 40));

        labelWrapper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/4.png"))); // NOI18N
        jPanel1.add(labelWrapper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(1280, 720));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        try {
            int i = Table.getSelectedRow();
            TableModel model = Table.getModel();
            String idValue = model.getValueAt(i, 0).toString(); // Assuming the id column is the first column
            id.setText(idValue);

            // Get the ID from the clicked table data
            String clickedId = model.getValueAt(i, 0).toString();

            //DATABASE CONNECTION
            Connection myConn = ConDB.getConnection();
            Statement st = myConn.createStatement();

            // Retrieve the image_file from the database based on the clicked ID
            ResultSet rs = st.executeQuery("SELECT image_file FROM users WHERE id='" + clickedId + "'");

            if (rs.next()) {
                byte[] img = rs.getBytes("image_file");

                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(495, 507, Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);

                lbl_imgview.setIcon(newImage);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
 
    }//GEN-LAST:event_TableMouseClicked

    private void TableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_TableMouseEntered
int x = 300;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        byte[] img = null;
        try {
            Connection myConn = ConDB.getConnection();
            Statement st = myConn.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM users WHERE id='" + id.getText() + "'");
            if (rs.next()) {
                img = rs.getBytes("image_file");
                if (img != null) {
                    ImageViewer view = new ImageViewer();
                    view.setTitle("Image View");
                    view.setVisible(true);
                    view.pack();
                    view.setLocationRelativeTo(null);
                    view.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                    ImageIcon image = new ImageIcon(img);
                    Image im = image.getImage();
                    Image myImg = im.getScaledInstance(475, 487, Image.SCALE_SMOOTH);
                    ImageIcon newImage = new ImageIcon(myImg);

                    ImageViewer.lblImageView.setIcon(newImage);
                    ImageViewer.lblArtistname.setText(rs.getString("Artist_name"));
                    ImageViewer.lblSchoolyear.setText(rs.getString("School_year"));
                    ImageViewer.lblEmail.setText(rs.getString("Email_address"));
                    ImageViewer.lblArt.setText(rs.getString("User_Art"));
                    ImageViewer.txtArtDesc.setText(rs.getString("User_Art_Desc"));

                    // Close the current frame
                    this.dispose();
                } else {
                    System.out.println("No image found");
                }
            } else {
                System.out.println("No user found with the specified ID");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void lbl_imgviewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_imgviewMouseClicked
        byte[] img = null;
        try {
            Connection myConn = ConDB.getConnection();
            Statement st = myConn.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM users WHERE id='" + id.getText() + "'");
            if (rs.next()) {
                img = rs.getBytes("image_file");
                if (img != null) {
                    ImageViewer view = new ImageViewer();
                    view.setTitle("Image View");
                    view.setVisible(true);
                    view.pack();
                    view.setLocationRelativeTo(null);
                    view.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                    ImageIcon image = new ImageIcon(img);
                    Image im = image.getImage();
                    Image myImg = im.getScaledInstance(475, 487, Image.SCALE_SMOOTH);
                    ImageIcon newImage = new ImageIcon(myImg);

                    ImageViewer.lblImageView.setIcon(newImage);
                    ImageViewer.lblArtistname.setText(rs.getString("Artist_name"));
                    ImageViewer.lblSchoolyear.setText(rs.getString("School_year"));
                    ImageViewer.lblEmail.setText(rs.getString("Email_address"));
                    ImageViewer.lblArt.setText(rs.getString("User_Art"));
                    ImageViewer.txtArtDesc.setText(rs.getString("User_Art_Desc"));

                    // Close the current frame
                    this.dispose();
                } else {
                    System.out.println("No image found");
                }
            } else {
                System.out.println("No user found with the specified ID");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_lbl_imgviewMouseClicked

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed

    }//GEN-LAST:event_searchActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        // TODO add your handling code here:
        String searchTerm = search.getText(); // Assuming you have a text field for entering the search term

        try {
            Connection myConn = ConDB.getConnection();

            String sqlSearch = "SELECT id as 'No.', Artist_name as 'Artist Name', School_year as 'School Year', "
            + "Email_address as 'Email Address', User_Art as 'Art Title', User_Art_Desc as 'Art Description', `image_name` as 'Image Name' "
            + "FROM users "
            + "WHERE Artist_name LIKE ? OR User_Art LIKE ? OR School_year LIKE ?";

            PreparedStatement ps = myConn.prepareStatement(sqlSearch);
            ps.setString(1, "%" + searchTerm + "%"); // Use % wildcard to search for partial matches
            ps.setString(2, "%" + searchTerm + "%");
            ps.setString(3, "%" + searchTerm + "%");

            ResultSet rs = ps.executeQuery();

            Table.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_searchKeyReleased

    private void searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_searchKeyTyped

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        Landing_Page LP = new Landing_Page();
        LP.show();
        
        dispose();
    }//GEN-LAST:event_btnBackMouseClicked

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
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Display().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JLabel btnBack;
    private javax.swing.JLabel id;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelWrapper;
    private javax.swing.JLabel lbl_imgview;
    private javax.swing.JTextField search;
    // End of variables declaration//GEN-END:variables

}
