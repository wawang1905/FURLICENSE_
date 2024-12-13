/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pet_license;

import java.awt.Image;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
/*
 *
 * @author 63936
 */
public class Renewal extends javax.swing.JFrame {
    private int id;
    private String firstN;
    private String lastN;
    private String edad;
    private String cont;
    private String barang;
    private String muni;
    private String pro;
    private String accounts;
    private String passwords;
    private String selectedItem;
    private int pID;
    /**

    /**
     * Creates new form Renewal
     */
    public Renewal(int id, String firstN, String lastN, String edad, String cont, String barang, String muni, String pro, String accounts, String passwords, String selectedItem) throws IOException {
     initComponents();
        Image icon = ImageIO.read(getClass().getResource("/images/logo.png"));
        this.setIconImage(icon);
        this.setTitle("FURLICENSE");
        this.id = id;
    this.firstN =firstN;
    this.lastN=lastN;
    this.edad=edad;
    this.cont=cont;
    this.barang=barang;
    this.muni=muni;
    this.pro = pro;
    this.accounts = accounts;
    this.passwords = passwords;
    this.selectedItem = selectedItem;
       
        data();
    }
    
     private void data(){
        try {
        // Load the MySQL driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish connection
        String url = "jdbc:mysql://localhost:3306/pet_license";
        Connection con = DriverManager.getConnection(url, "root", "");

        // SQL query to select account based on account name and password
        String query = "SELECT * FROM approved where id = ?";
        PreparedStatement pst = con.prepareStatement(query);
        
        pst.setString(1, this.selectedItem);
        ResultSet rs = pst.executeQuery();
        
        if (rs.next()) {
            this.pID = rs.getInt("ID");
            String Name = rs.getString("name"); // Get First Name
            
            String type = rs.getString("type");    // Get Address
            String breed = rs.getString("breed");
            String gender = rs.getString("gender");          // Get City (or another field you might want to display)
            String birth_month = rs.getString("birth_month");
            String birth_date = rs.getString("birth_date");
            String birth_year = rs.getString("birth_year");
            float weight = rs.getFloat("pet_weight");
            float height = rs.getFloat("pet_height");
            String vacMonth = rs.getString("vaccine_month");
            String vacDate = rs.getString("vaccine_date");
            String vacYear = rs.getString("vaccine_year");
            String vacID = rs.getString("vaccine_id");
            String account = rs.getString("account");
            String request = "RENEWAL";
            
        
            petName.setText(Name);
           
            petType.setText(type);
            petBreed.setText(breed);
            petGender.setText(gender);
            pbMonth.setText(birth_month);
            petBDate.setText(birth_date);
            petBYear.setText(birth_year);
            
            
            
                    
       
        rs.close();
        pst.close();
        con.close();
         }
    }   catch (SQLException ex) {
            Logger.getLogger(Renewal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Renewal.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        petWeight = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        petHeight = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        petVacDate = new javax.swing.JTextField();
        petVacYear = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        VacId = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        petVacMonth = new javax.swing.JComboBox<>();
        petName = new javax.swing.JLabel();
        petType = new javax.swing.JLabel();
        petBreed = new javax.swing.JLabel();
        petGender = new javax.swing.JLabel();
        pbMonth = new javax.swing.JLabel();
        petBDate = new javax.swing.JLabel();
        petBYear = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(830, 530));

        jPanel1.setBackground(new java.awt.Color(199, 186, 158));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RENEWAL FORM");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel3.setBackground(new java.awt.Color(133, 112, 67));
        jPanel3.setForeground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name :");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 54, 36));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("PET'S INFORMATION");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 250, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Animal Type :");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Breed :");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Pet's Gender :");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Birthday :");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Month");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, -1, 30));

        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Day");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, -1, 30));

        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Year");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 30, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Updated Weight (in kl):");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        petWeight.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel3.add(petWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 380, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Updated Height (in cm):");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 190, -1));

        petHeight.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel3.add(petHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 380, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Recent Date of Vaccination :");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, 30));

        petVacDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        petVacDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(petVacDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 100, -1));

        petVacYear.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        petVacYear.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(petVacYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 100, -1));

        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("Month");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, -1, 60));

        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Day");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 40, 40));

        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Year");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 30, 40));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Vaccination Serial # :");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, 30));

        VacId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel3.add(VacId, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 380, -1));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, -1, 30));

        petVacMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        jPanel3.add(petVacMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 100, 30));

        petName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        petName.setForeground(new java.awt.Color(255, 255, 255));
        petName.setText("jLabel3");
        jPanel3.add(petName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 380, 30));

        petType.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        petType.setForeground(new java.awt.Color(255, 255, 255));
        petType.setText("jLabel3");
        jPanel3.add(petType, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 380, 30));

        petBreed.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        petBreed.setForeground(new java.awt.Color(255, 255, 255));
        petBreed.setText("jLabel3");
        jPanel3.add(petBreed, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 380, 30));

        petGender.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        petGender.setForeground(new java.awt.Color(255, 255, 255));
        petGender.setText("jLabel3");
        jPanel3.add(petGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 380, 30));

        pbMonth.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pbMonth.setForeground(new java.awt.Color(255, 255, 255));
        pbMonth.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pbMonth.setText("jLabel3");
        jPanel3.add(pbMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 120, 30));

        petBDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        petBDate.setForeground(new java.awt.Color(255, 255, 255));
        petBDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        petBDate.setText("jLabel3");
        jPanel3.add(petBDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 80, 30));

        petBYear.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        petBYear.setForeground(new java.awt.Color(255, 255, 255));
        petBYear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        petBYear.setText("jLabel3");
        jPanel3.add(petBYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 70, 30));

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(258, 258, 258))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jButton2)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(30, 30, 30))
        );

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

       
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         Calendar cal = new GregorianCalendar();
        int month =cal.get(Calendar.MONTH)+1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int year = cal.get(Calendar.YEAR);
        
        String date = month +"/"+day+"/"+year;
        
        String petID = this.pID +"";
        String petN = petName.getText();
        
        String type = (String) petType.getText();
        String petbreed = petBreed.getText();
        String petgen = (String) petGender.getText();
        String bMonth = (String) pbMonth.getText();
        String bDate = petBDate.getText();
        String bYear = petBYear.getText();
        String pWeight = petWeight.getText();
        String pHeight = petHeight.getText();
        String vacMonth = (String) petVacMonth.getSelectedItem();
        String vacDate = petVacDate.getText();
        String vacYear = petVacYear.getText();
        String vacId = VacId.getText();
        
        if (petN.isEmpty() || type.isEmpty() || petbreed.isEmpty() || petgen.isEmpty() || 
        bMonth.isEmpty() || bDate.isEmpty() || bYear.isEmpty() || pWeight.isEmpty() || pHeight.isEmpty() ||
        vacMonth.isEmpty() || vacDate.isEmpty() || vacYear.isEmpty() || vacId.isEmpty()) {
        
        JOptionPane.showMessageDialog(this, "Please fill out all fields.", "Input Required", JOptionPane.WARNING_MESSAGE);
        return; // Exit the method if validation fails
    }

        try {
            // Load the MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            String url = "jdbc:mysql://localhost:3306/pet_license";
            Connection con = DriverManager.getConnection(url, "root", "");

            // Check if the connection is successful
            if (con != null) {
                System.out.println("Connection successful.");
            } else {
                System.out.println("Connection failed.");
            }

            // Prepare the SQL query
            String query = "INSERT INTO pet_info(pet_id,name,type, breed, gender, birth_month, birth_date, birth_year, pet_weight, pet_height, vaccine_month, vaccine_date, vaccine_year, vaccine_id, account_used, Request_For,Request_Sent) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
            PreparedStatement pst = con.prepareStatement(query);

            // Set parameters
            pst.setString(1, petID);
            pst.setString(2, petN);
            pst.setString(3, type);
            pst.setString(4, petbreed);
            pst.setString(5, petgen);
            pst.setString(6, bMonth);
            pst.setString(7, bDate);
            pst.setString(8, bYear);
            pst.setString(9, pWeight);
            pst.setString(10, pHeight); // Corrected parameter usage
            pst.setString(11, vacMonth);
            pst.setString(12, vacDate);
            pst.setString(13, vacYear);
            pst.setString(14, vacId);
            pst.setString(15, this.accounts); // Ensure this.accounts is initialized
            pst.setString(16, "RENEWAL");
            pst.setString(17, date);

            // Execute the insert
           
            int rowsAffected = pst.executeUpdate();

            // Provide feedback
            if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "Request sent!");
            jButton2ActionPerformed(evt);  
            this.dispose();
         
             
            } else {
                System.out.println("Failed to insert the record.");
            }

            // Close the connection
            pst.close();
            con.close();

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         // TODO add your handling code here:
        
    try {
        // Load the MySQL driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish connection
        String url = "jdbc:mysql://localhost:3306/pet_license";
        Connection con = DriverManager.getConnection(url, "root", "");

        // SQL query to select account based on account name and password
        String query = "SELECT * FROM account_info WHERE account_name = ? AND password = ?";
        PreparedStatement pst = con.prepareStatement(query);

        // Set the values for the prepared statement
        pst.setString(1, this.accounts);  // Set the account name
        pst.setString(2, this.passwords);   // Set the password

        // Execute the query
        ResultSet rs = pst.executeQuery();

        // Check if the result set contains a matching user
        if (rs.next()) {
            int pri = rs.getInt("ID");
            String firstName = rs.getString("First_Name"); // Get First Name
            String lastName = rs.getString("Last_Name");   // Get Last Name
            String age = rs.getString("Birth_Date"); // Get Middle Name
            String address = rs.getString("baranggay");    // Get Address
            String contact = rs.getString("contact_number");
            String city = rs.getString("City");          // Get City (or another field you might want to display)
            String province = rs.getString("province");
            String account = rs.getString("account_name");
            String password = rs.getString("password");
            
            // Pass user details to the Main_Dash_Board constructor
            Main_Dash_Board pi = new Main_Dash_Board(pri,firstName, lastName,age, contact, address, city, province, account, password);
            pi.setVisible(true);
            this.dispose(); // Close the current frame
        } else {
            // If no matching user found, show an error message
            JOptionPane.showMessageDialog(this, "Invalid username or password.");
        }

        // Close the ResultSet and PreparedStatement
        rs.close();
        pst.close();
        con.close();

    } catch (ClassNotFoundException | SQLException e) {
        // Handle the exception (e.g., display an error message)
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }   catch (IOException ex) {
            Logger.getLogger(Renewal.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            java.util.logging.Logger.getLogger(Renewal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Renewal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Renewal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Renewal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                int id = 0;
                String firstN = null;
                String lastN = null;
                String edad = null;
                String cont = null;
                String barang = null;
                String muni = null;
                String pro = null;
                String accounts = null;
                String passwords = null;
                String selectedItem = null;
                try {
                    new Renewal(id, firstN, lastN, edad, cont, barang, muni, pro, accounts, passwords, selectedItem).setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Renewal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField VacId;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel pbMonth;
    private javax.swing.JLabel petBDate;
    private javax.swing.JLabel petBYear;
    private javax.swing.JLabel petBreed;
    private javax.swing.JLabel petGender;
    private javax.swing.JTextField petHeight;
    private javax.swing.JLabel petName;
    private javax.swing.JLabel petType;
    private javax.swing.JTextField petVacDate;
    private javax.swing.JComboBox<String> petVacMonth;
    private javax.swing.JTextField petVacYear;
    private javax.swing.JTextField petWeight;
    // End of variables declaration//GEN-END:variables
}
