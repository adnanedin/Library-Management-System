import java.sql.*;
import javax.swing.JOptionPane;
import project.ConnectionProvider;
 
/**
 *
 * @author Adnan
 */
public class NewStudent extends javax.swing.JFrame {

    /**
     * Creates new form Signup
     */
    public NewStudent() {
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

        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library-login-page-background.png"))); // NOI18N
        jLabel6.setText("jLabel6");

        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library-login-page-background.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Student id background (1).jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        setLocation(new java.awt.Point(325, 125));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Student ID");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Name");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Course Name");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Branch Name");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Father's Name");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        jTextField2.setBackground(new java.awt.Color(255, 255, 102));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 196, -1));

        jTextField5.setBackground(new java.awt.Color(255, 255, 102));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 196, -1));

        jTextField6.setBackground(new java.awt.Color(255, 255, 102));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 196, -1));

        jComboBox3.setBackground(new java.awt.Color(255, 255, 102));
        jComboBox3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Science" }));
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 196, -1));

        jComboBox4.setBackground(new java.awt.Color(255, 255, 102));
        jComboBox4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chemistry", "Biology", "Physics", "Psychology", "Applied Sciences" }));
        getContentPane().add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 196, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save icon.png"))); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, -1, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cancel icon.png"))); // NOI18N
        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Student id background (1).jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here

    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String StudentID = jTextField2.getText();
        String Name = jTextField5.getText();
        String Father = jTextField6.getText ();
        String CourseName= (String)jComboBox3.getSelectedItem();
        String BranchName= (String) jComboBox4.getSelectedItem();
        
        try {
              Connection con=ConnectionProvider.getCon () ;
              Statement st=con.createStatement ();
             st.executeUpdate("INSERT INTO student VALUES('" + StudentID + "', '" + Name + "', '" + Father + "', '" + CourseName + "', '" + BranchName + "')");
             JOptionPane.showMessageDialog(null,"Successfully updated");
             setVisible(false);
             new NewStudent().setVisible(true);



        }
            
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null,"Student ID already exist");
                setVisible(false);
                new NewStudent().setVisible(true);
                
            }
                
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
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
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables

    
}

