
package Main;


public class APImageViewer extends javax.swing.JFrame {

    /**
     * Creates new form SearchDisplayPage
     */
    public APImageViewer() {
        initComponents();
    }
    
    public void instantiateLblImageView() {
        lblImage = new javax.swing.JLabel(); // Instantiate the lblImageView object
        panelWrapper.add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 530, 280)); // Add lblImageView to jPanel1

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelWrapper = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pop up Window");
        setAlwaysOnTop(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelWrapper.setBackground(new java.awt.Color(29, 113, 81));
        panelWrapper.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImage.setForeground(new java.awt.Color(255, 255, 255));
        panelWrapper.add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 660, 550));
        panelWrapper.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 570));

        getContentPane().add(panelWrapper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 570));

        setSize(new java.awt.Dimension(680, 569));
        setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(APImageViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(APImageViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(APImageViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(APImageViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new APImageViewer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel lblImage;
    private javax.swing.JPanel panelWrapper;
    // End of variables declaration//GEN-END:variables
}
