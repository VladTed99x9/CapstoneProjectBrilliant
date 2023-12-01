
import ConnectionProvider.ConnectionProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;


public class StudentSignIn extends javax.swing.JFrame {

    
    public StudentSignIn() {
        initComponents();
         groupRadio();
    }

    
    public void groupRadio(){
        buttonGroup1.add(Return);
        buttonGroup1.add(Borrow);
        buttonGroup1.add(Research);
        buttonGroup1.add(Study);
    }
    
    public void handlelogin(String userId){
     DateTime now = DateTime.now();
       org.joda.time.format.DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
     String formattedDateTime = now.toString(formatter);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        StudentName = new javax.swing.JTextField();
        Major = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Department = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Section = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Study = new javax.swing.JRadioButton();
        Borrow = new javax.swing.JRadioButton();
        Research = new javax.swing.JRadioButton();
        Return = new javax.swing.JRadioButton();
        btnSignIn = new javax.swing.JButton();
        ShowTable = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        SchoolYear = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library_Digitalization");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204,50));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("High Tower Text", 1, 24)); // NOI18N
        jLabel2.setText("TALISAY CITY COLLEGE LIBRARY");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("High Tower Text", 1, 24)); // NOI18N
        jLabel3.setText("STUDENT SIGN IN");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\NetBeansProjects\\SignUpandLogin\\src\\signupandlogin\\LIBARYUWU (1).png")); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 180, 150));

        jLabel5.setFont(new java.awt.Font("High Tower Text", 1, 18)); // NOI18N
        jLabel5.setText("STUDENT NAME :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        StudentName.setBackground(new java.awt.Color(204, 204, 204));
        StudentName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(StudentName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 240, 30));

        Major.setBackground(new java.awt.Color(204, 204, 204));
        Major.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Major.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MajorActionPerformed(evt);
            }
        });
        jPanel1.add(Major, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 190, 30));

        jLabel6.setFont(new java.awt.Font("High Tower Text", 1, 18)); // NOI18N
        jLabel6.setText("DEPARTMENT :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        Department.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Department.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BSED", "BSINDTECH", "BSHM" }));
        Department.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepartmentActionPerformed(evt);
            }
        });
        jPanel1.add(Department, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 160, -1));

        jLabel7.setFont(new java.awt.Font("High Tower Text", 1, 18)); // NOI18N
        jLabel7.setText("SECTION :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        jLabel8.setFont(new java.awt.Font("High Tower Text", 1, 18)); // NOI18N
        jLabel8.setText("MAJOR :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        Section.setBackground(new java.awt.Color(204, 204, 204));
        Section.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(Section, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 190, 30));

        jLabel9.setFont(new java.awt.Font("High Tower Text", 1, 18)); // NOI18N
        jLabel9.setText("PURPOSE :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, -1, -1));

        Study.setFont(new java.awt.Font("High Tower Text", 1, 18)); // NOI18N
        Study.setText("STUDY");
        Study.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Study.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudyActionPerformed(evt);
            }
        });
        jPanel1.add(Study, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 100, -1));

        Borrow.setFont(new java.awt.Font("High Tower Text", 1, 18)); // NOI18N
        Borrow.setText("BORROW BOOKS");
        Borrow.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Borrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrowActionPerformed(evt);
            }
        });
        jPanel1.add(Borrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, -1, -1));

        Research.setFont(new java.awt.Font("High Tower Text", 1, 18)); // NOI18N
        Research.setText("RESEARCH");
        Research.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Research.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResearchActionPerformed(evt);
            }
        });
        jPanel1.add(Research, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, -1, -1));

        Return.setFont(new java.awt.Font("High Tower Text", 1, 18)); // NOI18N
        Return.setText("RETURN BOOKS");
        Return.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnActionPerformed(evt);
            }
        });
        jPanel1.add(Return, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, -1, -1));

        btnSignIn.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        btnSignIn.setText("SIGN IN");
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });
        jPanel1.add(btnSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 150, -1));

        ShowTable.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        ShowTable.setText("SHOW TABLE");
        ShowTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowTableActionPerformed(evt);
            }
        });
        jPanel1.add(ShowTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 160, -1));

        Exit.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        Exit.setText("EXIT");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel1.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 480, 100, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, 100, -1));

        jLabel10.setFont(new java.awt.Font("High Tower Text", 1, 18)); // NOI18N
        jLabel10.setText("SCHOOL YEAR");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        SchoolYear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SchoolYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1st Year", "2nd Year", "3rd Year", "4th Year" }));
        jPanel1.add(SchoolYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 670, 530));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\vlads\\OneDrive\\Pictures\\Saved Pictures\\StudentLib.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 670));

        setSize(new java.awt.Dimension(791, 680));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MajorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MajorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MajorActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Login log = new Login();
                 log.setVisible(true);
                 log.pack();
                 log.setLocationRelativeTo(null);
                 this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void StudyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudyActionPerformed
        // TODO add your handling code here:
        Purpose=Study.getText();
    }//GEN-LAST:event_StudyActionPerformed

    private void ResearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResearchActionPerformed
        // TODO add your handling code here:
        Purpose=Research.getText();
    }//GEN-LAST:event_ResearchActionPerformed

    private void BorrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrowActionPerformed
        // TODO add your handling code here:
        Purpose=Borrow.getText();
    }//GEN-LAST:event_BorrowActionPerformed

    private void ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnActionPerformed
        // TODO add your handling code here:
        Purpose=Return.getText();
    }//GEN-LAST:event_ReturnActionPerformed

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        // TODO add your handling code here:   
        int omit = 0;
        
         try {
    // Create the SQL query with placeholders
    String insertQuery = "INSERT INTO studentsign_in (idstudentSign_In, StudentName, Department, Major, Section, SchoolYear, Purpose) VALUES (?, ?, ?, ?, ?, ?, ?)";

    // Create a connection
    ConnectionProvider dbc = new ConnectionProvider();
    String jdbcDriver = dbc.getJdbcDriver();
    String dbConnectionURL = dbc.getDbConnectionURL();
    String dbUsername = dbc.getDbUsername();
    String dbPassword = dbc.getDbPassword();
    Class.forName(jdbcDriver);
    Connection connection = DriverManager.getConnection(dbConnectionURL, dbUsername, dbPassword);

    // Create the PreparedStatement
    PreparedStatement statement = connection.prepareStatement(insertQuery);

    // Assuming student_id_field represents a string student ID
    
    statement.setInt(1, omit);
    statement.setString(2, StudentName.getText());
    
    statement.setString(3, String.valueOf(Department.getSelectedItem()));
    statement.setString(4, String.valueOf(SchoolYear.getSelectedItem()));
    statement.setString(5, Major.getText());
    statement.setString(6, Section.getText());
    statement.setString(7, Purpose);
    
    
    
    statement.executeUpdate();
    
    System.out.println("Add Successfully!");
            JOptionPane.showMessageDialog(null, "Your Account has been Created ");

    
    connection.close();
    statement.close();

} catch (ClassNotFoundException | SQLException e) {
    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    e.printStackTrace();
    }
         
    }//GEN-LAST:event_btnSignInActionPerformed

    private void DepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepartmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DepartmentActionPerformed

    private void ShowTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowTableActionPerformed
        // TODO add your handling code here:
        table data = new table();
                 data.setVisible(true);
                 data.pack();
                 data.setLocationRelativeTo(null);
                 this.dispose();
        
    }//GEN-LAST:event_ShowTableActionPerformed

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
            java.util.logging.Logger.getLogger(StudentSignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentSignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentSignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentSignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentSignIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Borrow;
    private javax.swing.JComboBox<String> Department;
    private javax.swing.JButton Exit;
    private javax.swing.JTextField Major;
    private javax.swing.JRadioButton Research;
    private javax.swing.JRadioButton Return;
    private javax.swing.JComboBox<String> SchoolYear;
    private javax.swing.JTextField Section;
    private javax.swing.JButton ShowTable;
    private javax.swing.JTextField StudentName;
    private javax.swing.JRadioButton Study;
    private javax.swing.JButton btnSignIn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
private String Purpose;

}
