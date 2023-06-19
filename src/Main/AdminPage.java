package Main;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class AdminPage extends javax.swing.JFrame {
    String path = null;
    
    public AdminPage() {
        initComponents();
        showTableData();
    }
    
    
    Connection myCon;
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
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        lbl_img = new javax.swing.JLabel();
        Artistname = new javax.swing.JTextField();
        Schoolyear = new javax.swing.JComboBox<String>();
        Emailaddress = new javax.swing.JTextField();
        UserArt = new javax.swing.JTextField();
        UserArtDesc = new javax.swing.JTextField();
        txt_name = new javax.swing.JLabel();
        btnImage = new javax.swing.JLabel();
        lblSave = new javax.swing.JLabel();
        lblUpdate = new javax.swing.JLabel();
        lblReset = new javax.swing.JLabel();
        lblDelete = new javax.swing.JLabel();
        lblJasper = new javax.swing.JLabel();
        btnBack = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        lblWrapper = new javax.swing.JLabel();
        id = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Page");
        setAlwaysOnTop(true);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(758, 0));

        jPanel1.setBackground(new java.awt.Color(51, 80, 49));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Table.setBackground(new java.awt.Color(29, 113, 81));
        Table.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 0, 0, new java.awt.Color(255, 255, 255)));
        Table.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Table.setForeground(new java.awt.Color(255, 255, 255));
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
        if (Table.getColumnModel().getColumnCount() > 0) {
            Table.getColumnModel().getColumn(5).setPreferredWidth(500);
        }
        Table.getAccessibleContext().setAccessibleParent(jPanel1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 540, 960, 150));

        lbl_img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_imgMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(673, 105, 423, 255));

        Artistname.setBackground(new java.awt.Color(29, 113, 81));
        Artistname.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Artistname.setForeground(new java.awt.Color(255, 255, 255));
        Artistname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Artistname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArtistnameActionPerformed(evt);
            }
        });
        jPanel1.add(Artistname, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 368, 50));

        Schoolyear.setBackground(new java.awt.Color(29, 113, 81));
        Schoolyear.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Schoolyear.setForeground(new java.awt.Color(255, 255, 255));
        Schoolyear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2016-2017", "2017-2018", "2018-2019", "2019-2020", "2020-2021", "2021-2022", "2022-2023", "2023-2024", "2024-2025", "2025-2026", "2026-2027", "2027-2028", "2028-2029", "2029-2030" }));
        Schoolyear.setBorder(null);
        jPanel1.add(Schoolyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 368, 50));

        Emailaddress.setBackground(new java.awt.Color(29, 113, 81));
        Emailaddress.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Emailaddress.setForeground(new java.awt.Color(255, 255, 255));
        Emailaddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Emailaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailaddressActionPerformed(evt);
            }
        });
        jPanel1.add(Emailaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 368, 50));

        UserArt.setBackground(new java.awt.Color(29, 113, 81));
        UserArt.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        UserArt.setForeground(new java.awt.Color(255, 255, 255));
        UserArt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(UserArt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 368, 50));

        UserArtDesc.setBackground(new java.awt.Color(29, 113, 81));
        UserArtDesc.setColumns(5);
        UserArtDesc.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        UserArtDesc.setForeground(new java.awt.Color(255, 255, 255));
        UserArtDesc.setAlignmentY(20.0F);
        UserArtDesc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        UserArtDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserArtDescActionPerformed(evt);
            }
        });
        jPanel1.add(UserArtDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 368, 150));

        txt_name.setForeground(new java.awt.Color(51, 80, 49));
        jPanel1.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        btnImage.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnImage.setForeground(new java.awt.Color(255, 255, 255));
        btnImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnImage.setText("ADD IMAGE");
        btnImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnImageMouseClicked(evt);
            }
        });
        jPanel1.add(btnImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 390, 90, 20));

        lblSave.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblSave.setForeground(new java.awt.Color(254, 251, 234));
        lblSave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSave.setText("SAVE");
        lblSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSaveMouseClicked(evt);
            }
        });
        jPanel1.add(lblSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 506, 90, 20));

        lblUpdate.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblUpdate.setForeground(new java.awt.Color(254, 251, 234));
        lblUpdate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUpdate.setText("UPDATE");
        lblUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUpdateMouseClicked(evt);
            }
        });
        jPanel1.add(lblUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 506, 90, 20));

        lblReset.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblReset.setForeground(new java.awt.Color(254, 251, 234));
        lblReset.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReset.setText("CLEAR");
        lblReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblResetMouseClicked(evt);
            }
        });
        jPanel1.add(lblReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 506, 80, 20));

        lblDelete.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblDelete.setForeground(new java.awt.Color(254, 251, 234));
        lblDelete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDelete.setText("DELETE");
        lblDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDeleteMouseClicked(evt);
            }
        });
        jPanel1.add(lblDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 507, 80, 20));

        lblJasper.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblJasper.setForeground(new java.awt.Color(254, 251, 234));
        lblJasper.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJasper.setText("REPORT");
        lblJasper.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblJasperMouseClicked(evt);
            }
        });
        jPanel1.add(lblJasper, new org.netbeans.lib.awtextra.AbsoluteConstraints(597, 506, 90, 20));

        btnBack.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBack.setText("Back");
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 33, 70, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(29, 113, 81));
        jLabel3.setText("Search:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 30, 60, 40));

        search.setBackground(new java.awt.Color(29, 113, 81));
        search.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setBorder(null);
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
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, 360, 40));

        lblWrapper.setForeground(new java.awt.Color(255, 255, 255));
        lblWrapper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Admin Page.png"))); // NOI18N
        jPanel1.add(lblWrapper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("");
        jPanel1.getAccessibleContext().setAccessibleParent(jPanel1);

        setSize(new java.awt.Dimension(1280, 720));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
       try {
           int i = Table.getSelectedRow();
           TableModel model = Table.getModel();
           String idValue = model.getValueAt(i, 0).toString(); // Assuming the id column is the first column
           id.setText(idValue);
        Artistname.setText(model.getValueAt(i, 1).toString());
        String School_year = model.getValueAt(i, 2).toString();
        switch (School_year) {
                           case "2016-2017":
                    Schoolyear.setSelectedIndex(0);
                    break;
                case "2017-2018":
                    Schoolyear.setSelectedIndex(1);
                    break;
                case "2018-2019":
                    Schoolyear.setSelectedIndex(2);
                    break;
                case "2019-2020":
                    Schoolyear.setSelectedIndex(3);
                    break;
                case "2020-2021":
                    Schoolyear.setSelectedIndex(4);
                    break;
                case "2021-2022":
                    Schoolyear.setSelectedIndex(5);
                    break;
                case "2022-2023":
                    Schoolyear.setSelectedIndex(6);
                    break;
                case "2023-2024":
                    Schoolyear.setSelectedIndex(7);
                    break;
                case "2024-2025":
                    Schoolyear.setSelectedIndex(8);
                    break;
                case "2025-2026":
                    Schoolyear.setSelectedIndex(9);
                    break;
                case "2026-2027":
                    Schoolyear.setSelectedIndex(10);
                    break;
                case "2027-2028":
                    Schoolyear.setSelectedIndex(11);
                    break;
                case "2028-2029":
                    Schoolyear.setSelectedIndex(12);
                    break;
                case "2029-2030":
                    Schoolyear.setSelectedIndex(13);
                    break;

        }
        Emailaddress.setText(model.getValueAt(i, 3).toString());
        UserArt.setText(model.getValueAt(i, 4).toString());
        UserArtDesc.setText(model.getValueAt(i, 5).toString());

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
            Image myImg = im.getScaledInstance(423, 255, Image.SCALE_SMOOTH);
            ImageIcon newImage = new ImageIcon(myImg);

            lbl_img.setIcon(newImage);
        }
    } catch (Exception e) {
        System.out.println(e);
    }
    }//GEN-LAST:event_TableMouseClicked

    private void UserArtDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserArtDescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserArtDescActionPerformed

    private void ArtistnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArtistnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ArtistnameActionPerformed

    private void EmailaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailaddressActionPerformed

    private void lbl_imgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_imgMouseClicked
        byte[] img = null;
        try {
            Connection myConn = ConDB.getConnection();
            Statement st = myConn.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM users WHERE id='" + id.getText() + "'");
            if (rs.next()) {
                img = rs.getBytes("image_file");
                if (img != null) {
                    AMImageViewer view = new AMImageViewer();
                    view.setTitle("Image View");
                    view.setVisible(true);
                    view.pack();
                    view.setLocationRelativeTo(null);
                    view.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                    ImageIcon image = new ImageIcon(img);
                    Image im = image.getImage();
                    Image myImg = im.getScaledInstance(477, 489, Image.SCALE_SMOOTH);
                    ImageIcon newImage = new ImageIcon(myImg);

                    AMImageViewer.lblImageView.setIcon(newImage);
                    AMImageViewer.lblArtistname.setText(rs.getString("Artist_name"));
                    AMImageViewer.lblSchoolyear.setText(rs.getString("School_year"));
                    AMImageViewer.lblEmail.setText(rs.getString("Email_address"));
                    AMImageViewer.lblArt.setText(rs.getString("User_Art"));
                    AMImageViewer.txtArtDesc.setText(rs.getString("User_Art_Desc"));

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

//this has an error mouseclicks wont work when there's two of them retrieving the image in the database the other jlabel display the image but the other jlabel won't display it 
    }//GEN-LAST:event_lbl_imgMouseClicked

    private void TableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_TableMouseEntered

    private void btnImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImageMouseClicked

        // TODO add your handling code here:

        JFileChooser fileChooser = new JFileChooser();

        //pang-filter ng file property we use jpg,jpeg and png
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("PNG JPG AND JPEG", "png", "jpg", "jpeg");

        //pagpili nung paglalagay nung mga file na yon ^
        fileChooser.addChoosableFileFilter(fnef);

        //para bumukas ung filechooser application
        int load = fileChooser.showOpenDialog(this);

        if (load == JFileChooser.APPROVE_OPTION) {
            File f = fileChooser.getSelectedFile();

            path = f.getAbsolutePath();

            ImageIcon ii = new ImageIcon(path);

            Image img = ii.getImage().getScaledInstance(423, 255, Image.SCALE_SMOOTH);

            lbl_img.setIcon(new ImageIcon(img));

        }
    }//GEN-LAST:event_btnImageMouseClicked

    private void lblSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSaveMouseClicked
        // TODO add your handling code here:
        
        String ArtistName = Artistname.getText();
        String emailAddress = Emailaddress.getText();
        String userArtDesc = UserArtDesc.getText();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/humss_db", "root", "");

            // Check if the data already exists
            String checkQuery = "SELECT COUNT(*) FROM users WHERE User_Art_Desc = ? OR Email_address = ?";
            PreparedStatement checkPst = con.prepareStatement(checkQuery);
            checkPst.setString(1, userArtDesc);
            checkPst.setString(2, emailAddress);
            ResultSet rs = checkPst.executeQuery();
            rs.next();
            int count = rs.getInt(1);
            checkPst.close();

            if (count > 0) {
                JOptionPane.showMessageDialog(this, "Data already exists!"); // Show an error message if the data already exists
            } else {
                // Insert data
                String insertQuery = "INSERT INTO users(Artist_name, School_year, Email_address, User_Art, User_Art_Desc, image_name, image_file) VALUES (?, ?, ?, ?, ?, ?, ?)";

                if (ArtistName.equals("")) {
                    JOptionPane.showMessageDialog(this, "Invalid Artist Name!");

                } else if (emailAddress.equals("")) {
                    JOptionPane.showMessageDialog(this, "Invalid Email Address");
                } else if (userArtDesc.equals("")) {
                    JOptionPane.showMessageDialog(this, "Invalid Art Description");
                } else if (path == null) {
                    JOptionPane.showMessageDialog(this, "No Image Found!");
                } else if (path != null) {
                    File f = new File(path);

                    PreparedStatement pst = con.prepareStatement(insertQuery);

                    try ( InputStream is = new FileInputStream(f)) {
                        pst.setString(1, Artistname.getText());
                        String School_year = Schoolyear.getSelectedItem().toString();
                        pst.setString(2, School_year);
                        pst.setString(3, emailAddress);
                        pst.setString(4, UserArt.getText());
                        pst.setString(5, userArtDesc);
                        pst.setString(6, f.getName());
                        pst.setBlob(7, is);
                        int rowInserted = pst.executeUpdate();
                        if (rowInserted > 0) {
                            JOptionPane.showMessageDialog(this, "Recorded!");
                            txt_name.setText(null);
                            lbl_img.setIcon(null);
                        }

                        // Refresh code block
                        DefaultTableModel model = (DefaultTableModel) Table.getModel();
                        model.setRowCount(0);
                        showTableData();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            }

            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_lblSaveMouseClicked

    private void lblUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUpdateMouseClicked
        // TODO add your handling code here:

        int lblId = Integer.parseInt(id.getText());
        String artistName = Artistname.getText();
        String schoolYear = Schoolyear.getSelectedItem().toString();
        String emailAddress = Emailaddress.getText();
        String userArt = UserArt.getText();
        String userArtDesc = UserArtDesc.getText();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/humss_db", "root", "");

            // Check if the id exists in the database
            String checkQuery = "SELECT COUNT(*) FROM users WHERE id = ?";
            PreparedStatement checkPst = con.prepareStatement(checkQuery);
            checkPst.setInt(1, lblId);
            ResultSet rs = checkPst.executeQuery();
            rs.next();
            int count = rs.getInt(1);
            checkPst.close();

            if (count > 0) {
                // Update data
                String updateQuery = "UPDATE users SET Artist_name = ?, School_year = ?, Email_address = ?, User_Art = ?, User_Art_Desc = ? WHERE id = ?";

                if (artistName.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Invalid Artist Name!");
                } else if (emailAddress.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Invalid Email Address");
                } else if (userArtDesc.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Invalid Art Description");
                } else {
                    PreparedStatement pst = con.prepareStatement(updateQuery);
                    pst.setString(1, artistName);
                    pst.setString(2, schoolYear);
                    pst.setString(3, emailAddress);
                    pst.setString(4, userArt);
                    pst.setString(5, userArtDesc);
                    pst.setInt(6, lblId);

                    int rowsUpdated = pst.executeUpdate();

                    if (rowsUpdated > 0) {
                        JOptionPane.showMessageDialog(this, "Record updated successfully!");

                        // Refresh code block
                        DefaultTableModel model = (DefaultTableModel) Table.getModel();
                        model.setRowCount(0);
                        showTableData();

                        JOptionPane.showMessageDialog(this, "Updated");
                    } else {
                        JOptionPane.showMessageDialog(this, "Failed to update the record!");
                    }

                    pst.close();
                }
            } else {
                JOptionPane.showMessageDialog(this, "ID not found in the database!");
            }

            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_lblUpdateMouseClicked

    private void lblResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblResetMouseClicked
        // TODO add your handling code here:
        Artistname.setText(""); // reset the artist name
        Emailaddress.setText(""); //Reset the email addre
        UserArt.setText(""); //reset the Title of the art
        UserArtDesc.setText(""); //reset the descrip
        lbl_img.setIcon(null); // Reset the lbl_img which is the label container
    }//GEN-LAST:event_lblResetMouseClicked

    private void lblDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDeleteMouseClicked
        // TODO add your handling code here:

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/humss_db", "root", "");

            // DELETE CONFIRMATION
            int confirmationResult = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this user?", "Delete Confirmation", JOptionPane.YES_NO_OPTION);
            if (confirmationResult == JOptionPane.YES_OPTION) {
                int row = Table.getSelectedRow();
                String value = (Table.getModel().getValueAt(row, 0).toString());
                String query = "DELETE FROM users WHERE id=" + value;

                PreparedStatement pst = con.prepareStatement(query);
                pst.executeUpdate();
                pst.close();

                // Reset the auto-increment value
                String resetQuery = "ALTER TABLE users AUTO_INCREMENT = 1";
                PreparedStatement resetPst = con.prepareStatement(resetQuery);
                resetPst.executeUpdate();
                resetPst.close();

                DefaultTableModel model = (DefaultTableModel) Table.getModel();
                model.setRowCount(0);
                showTableData();
                JOptionPane.showMessageDialog(this, "Art Deleted");
            } else {
                // User clicked "No" or closed the dialog
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_lblDeleteMouseClicked

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        Landing_Page LP = new Landing_Page();
        LP.show();

        dispose();
    }//GEN-LAST:event_btnBackMouseClicked

    private void lblJasperMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJasperMouseClicked
        try {
            Print_Report_Viewer jasrep = new Print_Report_Viewer();
            jasrep.setVisible(true);
                    this.dispose();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_lblJasperMouseClicked

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
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Artistname;
    private javax.swing.JTextField Emailaddress;
    private javax.swing.JComboBox<String> Schoolyear;
    private javax.swing.JTable Table;
    private javax.swing.JTextField UserArt;
    private javax.swing.JTextField UserArtDesc;
    private javax.swing.JLabel btnBack;
    private javax.swing.JLabel btnImage;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDelete;
    private javax.swing.JLabel lblJasper;
    private javax.swing.JLabel lblReset;
    private javax.swing.JLabel lblSave;
    private javax.swing.JLabel lblUpdate;
    private javax.swing.JLabel lblWrapper;
    private javax.swing.JLabel lbl_img;
    private javax.swing.JTextField search;
    private javax.swing.JLabel txt_name;
    // End of variables declaration//GEN-END:variables

}
