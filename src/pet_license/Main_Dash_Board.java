
package pet_license;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author 63936
 */
public class Main_Dash_Board extends javax.swing.JFrame {

    /**
     * Creates new form Main_Dash_Board
     */
    private int pri;
    private String firstName;
    private String lastName;
    private String age;
    private String contact;
    private String address;
    private String city;
    private String province;
    private String account;
    private String password;
    private int licenseCount;
    
    
    
 private void populateComboBox() {
     this.licenseCount = 0;
    try {
        // Load the MySQL JDBC Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish database connection
        String url = "jdbc:mysql://localhost:3306/pet_license"; // Update with your DB details
        Connection con = DriverManager.getConnection(url, "root", "");

        // Prepare and execute SQL query
        String query = "SELECT id FROM approved where account =? and state = 'valid'"; // Replace with your table and column names
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, this.account);
        ResultSet rs = ps.executeQuery();

        // Clear existing items in the JComboBox (optional)
        jComboBox1.removeAllItems();

        // Populate the JComboBox with data from the ResultSet
        while (rs.next()) {
            String item = rs.getString("id"); // Replace "some_column" with your column name
            jComboBox1.addItem(item); // Add each item to the JComboBox
            licenseCount++;
        }
        
        jLabel17.setText(licenseCount+"");
        // Close resources
        rs.close();
        ps.close();
        con.close();

    } catch (ClassNotFoundException e) {
        JOptionPane.showMessageDialog(this, "Database driver not found: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
}
 
 private void populateComboBox2() {
     this.licenseCount = 0;
    try {
        // Load the MySQL JDBC Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish database connection
        String url = "jdbc:mysql://localhost:3306/pet_license"; // Update with your DB details
        Connection con = DriverManager.getConnection(url, "root", "");

        // Prepare and execute SQL query
        String query = "SELECT id FROM approved where account =? and state = 'invalid'"; // Replace with your table and column names
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, this.account);
        ResultSet rs = ps.executeQuery();

        // Clear existing items in the JComboBox (optional)
        jComboBox2.removeAllItems();

        // Populate the JComboBox with data from the ResultSet
        while (rs.next()) {
            String item = rs.getString("id"); // Replace "some_column" with your column name
            jComboBox2.addItem(item); // Add each item to the JComboBox
            licenseCount++;
        }
        
        jLabel25.setText(licenseCount+"");
        // Close resources
        rs.close();
        ps.close();
        con.close();

    } catch (ClassNotFoundException e) {
        JOptionPane.showMessageDialog(this, "Database driver not found: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
}

    public Main_Dash_Board(int pri, String firstName, String lastName, String age, String contact, String address, String city, String province, String account, String password) throws IOException{
        initComponents();
        Calendar cal = new GregorianCalendar();
        int month =cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int year = cal.get(Calendar.YEAR);
        Image icon = ImageIO.read(getClass().getResource("/images/logo.png"));
        this.setIconImage(icon);
        this.setTitle("FURLICENSE");
        this.pri = pri;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.contact = contact;
        this.address = address;
        this.city = city;
        this.province = province;
        this.account = account;
        this.password = password;
    

        
        populateComboBox();
        populateComboBox2();
        
        String agE = age+"";  // Concatenating with an empty string
        
        
        fullNameDash.setText(firstName + " " +  lastName);
        completeAddressDash.setText(address+", "+city+", "+province);
        
        fullNameAcc.setText(firstName + " " +  lastName);
        fullAddressAcc.setText(address+", "+city+", "+province);
        ageAcc.setText(agE);
        contactAcc.setText(contact);
        
        int month2 = month+1;
        dashDate.setText(month2 +"/"+day+"/"+year);
        
     
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
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        fullNameDash = new javax.swing.JLabel();
        completeAddressDash = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dashDate = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        fullNameAcc = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        fullAddressAcc = new javax.swing.JLabel();
        contactAcc = new javax.swing.JLabel();
        ageAcc = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(199, 186, 158));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(199, 186, 158));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fa.png"))); // NOI18N
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 70));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel2.setText("FurLicense");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 150, 40));

        jPanel5.setBackground(new java.awt.Color(204, 255, 255));
        jPanel5.setToolTipText("");
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DashBoard");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 70, 30));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Account Info");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 80, 30));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(204, 0, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Log out");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel5)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 70, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 70));

        jPanel2.setBackground(new java.awt.Color(199, 186, 158));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(133, 112, 67));

        fullNameDash.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        fullNameDash.setForeground(new java.awt.Color(255, 255, 255));
        fullNameDash.setText("Joshua Agusan");

        completeAddressDash.setText("Patoceno, Claveria, Misamis Oriental");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("USER NAME :");

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("USER ADDRESS :");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DATE :");

        dashDate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dashDate.setForeground(new java.awt.Color(255, 255, 255));
        dashDate.setText("jLabel23");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(completeAddressDash, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fullNameDash, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dashDate, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fullNameDash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(completeAddressDash)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(dashDate))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 25, 750, -1));

        jPanel9.setBackground(new java.awt.Color(133, 112, 67));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Want to Register your pet?");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel9.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("<html><div style='text-align: center;'>Make sure you<br> have complete<br> documents<br> needed<br> in the<br> registration.<br>And make sure <br>you are the owner of the pet.</div></html>");
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel9.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 260, 210));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 102, 102));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("<html> <u>PROCEED</u> </html> ");
        jLabel13.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel13MouseDragged(evt);
            }
        });
        jLabel13.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel13FocusGained(evt);
            }
        });
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel9.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 120, 30));

        jPanel2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 300, 340));

        jPanel10.setBackground(new java.awt.Color(133, 112, 67));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel10.setMinimumSize(new java.awt.Dimension(275, 49));
        jPanel10.setPreferredSize(new java.awt.Dimension(275, 49));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Want to renew existing license?");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("<html><div style='text-align: center;'>You can renew<br> your license<br> if it's 1 month<br> before it expires. </div></html>");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel10.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 240, 140));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 102, 102));
        jLabel14.setText("<html> <u>PROCEED</u> </html>");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel10.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));

        jPanel2.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, -1, 340));

        jTabbedPane1.addTab("tab1", jPanel2);

        jPanel3.setBackground(new java.awt.Color(199, 186, 158));

        jScrollPane1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jScrollPane1FocusGained(evt);
            }
        });

        jPanel11.setBackground(new java.awt.Color(199, 186, 158));
        jPanel11.setLayout(new javax.swing.BoxLayout(jPanel11, javax.swing.BoxLayout.LINE_AXIS));

        jPanel12.setBackground(new java.awt.Color(199, 186, 158));
        jPanel12.setPreferredSize(new java.awt.Dimension(800, 690));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(133, 112, 67));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 204, 51));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("ACCOUNT INFORMATION");
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        fullNameAcc.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        fullNameAcc.setForeground(new java.awt.Color(255, 255, 255));
        fullNameAcc.setText("JOSHUA AGUSAN");

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("ADDRESS :");

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("CONTACT # :");

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("BIRTH DATE :");

        fullAddressAcc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fullAddressAcc.setForeground(new java.awt.Color(255, 255, 255));
        fullAddressAcc.setText("Patroenio, Claveria, Misamis Oriental");

        contactAcc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        contactAcc.setForeground(new java.awt.Color(255, 255, 255));
        contactAcc.setText("099191240250");

        ageAcc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ageAcc.setForeground(new java.awt.Color(255, 255, 255));
        ageAcc.setText("19");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("NAME :");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(66, 66, 66)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fullNameAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fullAddressAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contactAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(114, 114, 114))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fullNameAcc)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(fullAddressAcc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(contactAcc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(ageAcc))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jPanel12.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 770, 260));

        jPanel14.setBackground(new java.awt.Color(133, 112, 67));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 204, 51));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("LICENSES");
        jLabel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel14.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 130, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ACTIVE");
        jPanel14.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 100, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 100)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("2");
        jPanel14.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 130, 160));

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel14.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 140, -1));

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Select the license ID to be diplayed");
        jPanel14.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 200, -1));

        jButton1.setText("Display");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("INVALID");
        jPanel14.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 100, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 100)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("0");
        jPanel14.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 120, -1));

        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Select the license ID to be diplayed");
        jPanel14.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, -1, -1));

        jPanel14.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 140, -1));

        jButton2.setText("Display");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, -1, -1));

        jPanel12.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 770, 350));

        jPanel11.add(jPanel12);

        jScrollPane1.setViewportView(jPanel11);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("tab2", jPanel3);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 830, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);
        jPanel6.setBackground(new java.awt.Color(255,255,255));
        jPanel5.setBackground(new java.awt.Color(204,255,255));
        jPanel7.setBackground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
        jPanel6.setBackground(new java.awt.Color(204,255,255));
        jPanel5.setBackground(new java.awt.Color(255,255,255));
        jPanel7.setBackground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        // TODO add your handling code here:
        jPanel7.setBackground(new java.awt.Color(204,255,255));
        jPanel5.setBackground(new java.awt.Color(255,255,255));
        jPanel6.setBackground(new java.awt.Color(255,255,255));
        JOptionPane.showMessageDialog(null, "Thank you!");
        System.exit(0);
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jLabel13MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MouseDragged

    private void jLabel13FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel13FocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLabel13FocusGained

    private void jScrollPane1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jScrollPane1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1FocusGained

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        try {
            // TODO add your handling code here:
            int id = this.pri;
            String firstN = this.firstName;
            String lastN = this.lastName;
            String edad = this.age;
            String cont = this.contact;
            String barang = this.address;
            String muni = this.city;
            String pro = this.province;
            String accounts = this.account;
            String passwords = this.password;
            
            Registration_Form pi = new Registration_Form( id, firstN,  lastN,  edad,  cont,  barang,  muni,  pro, accounts, passwords);
            pi.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(Main_Dash_Board.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
                              
        int id = this.pri;
        String firstN = this.firstName;
        String lastN = this.lastName;
        String edad = this.age;
        String cont = this.contact;
        String barang = this.address;
        String muni = this.city;
        String pro = this.province;
        String accounts = this.account;
        String passwords = this.password;    
    try {
        // Load the MySQL driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish connection
        String url = "jdbc:mysql://localhost:3306/pet_license";
        Connection con = DriverManager.getConnection(url, "root", "");

        // SQL query to select account based on account name and password
        String query = "SELECT id FROM approved WHERE account = ?";
        PreparedStatement pst = con.prepareStatement(query);

        // Set the values for the prepared statement
        pst.setString(1, this.account);  // Replace 'this.account' with your actual account variable

        // Execute the query
        ResultSet rs = pst.executeQuery();

        // Check if the ResultSet is empty
        if (!rs.isBeforeFirst()) { // isBeforeFirst() checks if the cursor is before the first row
            JOptionPane.showMessageDialog(null, "No licenses found in this account.");
        } else {
            // Create a ComboBox
            JComboBox<String> cb = new JComboBox<>();

            // Populate the ComboBox with data from the ResultSet
            while (rs.next()) {
                String name = rs.getString("id");
                cb.addItem(name); // Add item to the ComboBox
            }

            // Show the ComboBox in a dialog
            int input = JOptionPane.showConfirmDialog(this,cb,"Select the License ID to be Renewed",JOptionPane.OK_CANCEL_OPTION);

            // Handle user selection
            if (input == JOptionPane.OK_OPTION) {
                String selectedItem = (String) cb.getSelectedItem();
               
                Renewal pi = null;
                try {
                    pi = new Renewal( id, firstN,  lastN,  edad,  cont,  barang,  muni,  pro, accounts, passwords, selectedItem);
                } catch (IOException ex) {
                    Logger.getLogger(Main_Dash_Board.class.getName()).log(Level.SEVERE, null, ex);
                }
                pi.setVisible(true);
                this.dispose();
                
            } 
        }

        // Close the resources
        rs.close();
        pst.close();
        con.close();

    } catch (ClassNotFoundException | SQLException e) {
        // Handle exceptions
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    }


    }//GEN-LAST:event_jLabel14MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                                        
    // Get the selected combo box value
    String combo = (String) jComboBox1.getSelectedItem();

    if (combo == null || combo.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please select an ID.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        // Load the MySQL driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish connection
        String url = "jdbc:mysql://localhost:3306/pet_license";
        Connection con = DriverManager.getConnection(url, "root", "");

        // SQL query to select account based on account name and ID
        String query = "SELECT * FROM approved WHERE account = ? AND id = ? and state = 'VALID'";
        PreparedStatement pst = con.prepareStatement(query);

        // Set the values for the prepared statement
        pst.setString(1, this.account); 
        pst.setString(2, combo);

        // Execute the query
        ResultSet rs = pst.executeQuery();

        // Check if data exists
        if (rs.next()) {
            String Id = combo;
            String nAME = rs.getString("name");
           
            String tYPE = rs.getString("type");
            String bREED = rs.getString("breed");
            String gENDER = rs.getString("gender");
            String birthM = rs.getString("birth_month");
            int birthD = rs.getInt("birth_date");
            int birthY = rs.getInt("birth_year");
            double wEIGHT = rs.getDouble("pet_weight");
            double hEIGHT = rs.getDouble("pet_height");
            String vacM = rs.getString("vaccine_month");
            int vacD = rs.getInt("vaccine_date");
            int vacY = rs.getInt("vaccine_year");
            String vacId = rs.getString("vaccine_id");
            String tID = rs.getString("transaction_ID");
            String owner = this.firstName +" "+this.lastName;
            String connum = this.contact != null ? this.contact : "Unknown";
            String ownadd = (this.address != null ? this.address : "") +", "+ (this.city != null ? this.city : "") +", "+ (this.province != null ? this.province : "");
            String ownacc = this.account;
            String validy = rs.getString("Valid_Until");

            // Open the new display window
            display pi = new display(Id, nAME, tYPE, bREED, gENDER, birthM, birthD, birthY, wEIGHT, hEIGHT, vacM, vacD, vacY, vacId,tID, owner, connum, ownadd, ownacc,validy);
            pi.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "No data found for the selected ID.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Close resources
        rs.close();
        pst.close();
        con.close();

    } catch (ClassNotFoundException ex) {
        Logger.getLogger(Main_Dash_Board.class.getName()).log(Level.SEVERE, "Database Driver Error", ex);
        JOptionPane.showMessageDialog(this, "Database Driver Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException ex) {
        Logger.getLogger(Main_Dash_Board.class.getName()).log(Level.SEVERE, "SQL Error", ex);
        JOptionPane.showMessageDialog(this, "SQL Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String combo = (String) jComboBox2.getSelectedItem();

    if (combo == null || combo.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please select an ID.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        // Load the MySQL driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish connection
        String url = "jdbc:mysql://localhost:3306/pet_license";
        Connection con = DriverManager.getConnection(url, "root", "");

        // SQL query to select account based on account name and ID
        String query = "SELECT * FROM approved WHERE account = ? AND id = ? and state = 'INVALID'";
        PreparedStatement pst = con.prepareStatement(query);

        // Set the values for the prepared statement
        pst.setString(1, this.account); 
        pst.setString(2, combo);

        // Execute the query
        ResultSet rs = pst.executeQuery();

        // Check if data exists
        if (rs.next()) {
            String Id = combo;
            String nAME = rs.getString("name");
           
            String tYPE = rs.getString("type");
            String bREED = rs.getString("breed");
            String gENDER = rs.getString("gender");
            String birthM = rs.getString("birth_month");
            int birthD = rs.getInt("birth_date");
            int birthY = rs.getInt("birth_year");
            double wEIGHT = rs.getDouble("pet_weight");
            double hEIGHT = rs.getDouble("pet_height");
            String vacM = rs.getString("vaccine_month");
            int vacD = rs.getInt("vaccine_date");
            int vacY = rs.getInt("vaccine_year");
            String vacId = rs.getString("vaccine_id");
            String tID = rs.getString("transaction_ID");
            String owner = this.firstName +" "+this.lastName;
            String connum = this.contact != null ? this.contact : "Unknown";
            String ownadd = (this.address != null ? this.address : "") +", "+ (this.city != null ? this.city : "") +", "+ (this.province != null ? this.province : "");
            String ownacc = this.account;
            String validy = rs.getString("Valid_Until");

            // Open the new display window
            display2 pi = new display2(Id, nAME, tYPE, bREED, gENDER, birthM, birthD, birthY, wEIGHT, hEIGHT, vacM, vacD, vacY, vacId,tID, owner, connum, ownadd, ownacc,validy);
            pi.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "No data found for the selected ID.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Close resources
        rs.close();
        pst.close();
        con.close();

    } catch (ClassNotFoundException ex) {
        Logger.getLogger(Main_Dash_Board.class.getName()).log(Level.SEVERE, "Database Driver Error", ex);
        JOptionPane.showMessageDialog(this, "Database Driver Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException ex) {
        Logger.getLogger(Main_Dash_Board.class.getName()).log(Level.SEVERE, "SQL Error", ex);
        JOptionPane.showMessageDialog(this, "SQL Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(Main_Dash_Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Dash_Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Dash_Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Dash_Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                int id = 0;
                String firstName = null;
                String lastName = null;
                String age = null;
                String contact = null;
                String address = null;
                String city = null;
                String province = null;
                String account = null;
                String password = null;
                
                try {
                    new Main_Dash_Board(id,firstName, lastName,age, contact, address, city, province, account, password).setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Main_Dash_Board.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageAcc;
    private javax.swing.JLabel completeAddressDash;
    private javax.swing.JLabel contactAcc;
    private javax.swing.JLabel dashDate;
    private javax.swing.JLabel fullAddressAcc;
    private javax.swing.JLabel fullNameAcc;
    private javax.swing.JLabel fullNameDash;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
