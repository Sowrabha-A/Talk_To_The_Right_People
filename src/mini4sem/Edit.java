/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mini4sem;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author sowra
 */
public class Edit extends javax.swing.JFrame {
String name,passyr,dept,passorstud,internship,contactno,work,ugorpg,indiaorabroad,country,workexp,paragraph;

    /**
     * Creates new form Register
     */
    public Edit() {
        initComponents();
    }
    
    public boolean validation(){
        name = txt_name.getText();
        passyr = txt_passyr.getText();
        dept = txt_dept.getText();
        passorstud = txt_passorstud.getText();
        internship = txt_internship.getText();
        contactno = txt_contactno.getText();
       country =txt_country.getText();
        workexp = txt_workexperience.getText();
        paragraph = txt_paragraph.getText();
        
        if(name.equals("")){
            JOptionPane.showMessageDialog(this,"Please enter name");
            return false;
        }
        if(passyr.equals("")){
            JOptionPane.showMessageDialog(this,"Please enter your passing year");
            return false;
        }
        if(dept.equals("")){
            JOptionPane.showMessageDialog(this,"Please enter your Department");
            return false;
        }
        if(passorstud.equals("")){
            JOptionPane.showMessageDialog(this,"Please enter if you are passout student or still studying");
            return false;
        }
        if(internship.equals("")){
            JOptionPane.showMessageDialog(this,"Please enter your internship status");
            return false;
        }
        if(contactno.equals("")){
            JOptionPane.showMessageDialog(this,"Please enter your Contact Number");
            return false;
        }
        if(country.equals("")){
            JOptionPane.showMessageDialog(this,"Please enter Country where you studied");
            return false;
        }
       if(workexp.equals("")){
            JOptionPane.showMessageDialog(this,"Please enter your Work Experience");
            return false;
        }
       if(paragraph.equals("")){
            JOptionPane.showMessageDialog(this,"Please enter a few lines about yourself");
            return false;
        }
        return true;
    }
    void insertDetails(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con  = DriverManager.getConnection("jdbc:mysql://localhost/employeedetails","root",""); 
            String sql ="insert into studentdetails(name,passyr,dept,passorstud,internship,contactno) values(?,?,?,?,?,?)" ;
            PreparedStatement ps = con.prepareStatement(sql);
           // ps.setInt(1,getId());
            ps.setString(1,name);
            ps.setString(2, passyr);
            ps.setString(3,dept);
            ps.setString(4, passorstud);
            ps.setString(5, internship);
            ps.setString(6,contactno);
           int i = ps.executeUpdate();
           if(i>0){
               JOptionPane.showMessageDialog(this, "record inserted");
           }
           else{
               JOptionPane.showMessageDialog(this,"record not inserted");
           }
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    void updateDetails(){
        name = txt_name.getText();
        passyr = txt_passyr.getText();
        dept = txt_dept.getText();
        passorstud = txt_passorstud.getText();
        internship = txt_internship.getText();
        contactno = txt_contactno.getText();
        String work_status = txt_working.getSelectedItem().toString();
        String ugorpg1 = txt_ugorpg.getSelectedItem().toString();
        String indiaorabroad1 = txt_indiaorabroad.getSelectedItem().toString();
        country =txt_country.getText();
        workexp = txt_workexperience.getText();
        paragraph = txt_paragraph.getText();
        try{
            String id = txt_id.getText();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con  = DriverManager.getConnection("jdbc:mysql://localhost/employeedetails","root",""); 
            String sql ="UPDATE studentdetails set name=?,passyr=?,dept=?,passorstud=?,internship=?,contactno=?,work_status=?,ugorpg1=?,indiaorabroad1=?,country=?,workexp=?,paragraph=? where id=?" ;
            PreparedStatement ps = con.prepareStatement(sql);
            
           // ps.setInt(1,getId());
            ps.setString(1,name);
            ps.setString(2, passyr);
            ps.setString(3,dept);
            ps.setString(4, passorstud);
            ps.setString(5, internship);
            ps.setString(6,contactno);
            ps.setString(7, work_status);
            ps.setString(8, ugorpg1);
            ps.setString(9, indiaorabroad1);
            ps.setString(10, country);
             ps.setString(11, workexp);
              ps.setString(12, paragraph);
            ps.setString(13, id);
           int i = ps.executeUpdate();
           if(i>0){
               JOptionPane.showMessageDialog(this, "record inserted");
           }
           else{
               JOptionPane.showMessageDialog(this,"record not inserted");
           }
            
        }
        catch(Exception e){
            e.printStackTrace();
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

        panel_side = new javax.swing.JPanel();
        panel_deregister = new javax.swing.JPanel();
        Panel2 = new javax.swing.JPanel();
        Panel3 = new javax.swing.JPanel();
        Panel4 = new javax.swing.JPanel();
        Panel5 = new javax.swing.JPanel();
        Panel6 = new javax.swing.JPanel();
        Panel7 = new javax.swing.JPanel();
        Panel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Panel41 = new javax.swing.JPanel();
        Panel42 = new javax.swing.JPanel();
        Panel43 = new javax.swing.JPanel();
        Panel44 = new javax.swing.JPanel();
        Panel45 = new javax.swing.JPanel();
        Panel46 = new javax.swing.JPanel();
        Panel47 = new javax.swing.JPanel();
        Panel48 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Panel49 = new javax.swing.JPanel();
        Panel50 = new javax.swing.JPanel();
        Panel51 = new javax.swing.JPanel();
        Panel52 = new javax.swing.JPanel();
        Panel53 = new javax.swing.JPanel();
        Panel54 = new javax.swing.JPanel();
        Panel55 = new javax.swing.JPanel();
        Panel56 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Panel57 = new javax.swing.JPanel();
        Panel58 = new javax.swing.JPanel();
        Panel59 = new javax.swing.JPanel();
        Panel60 = new javax.swing.JPanel();
        Panel61 = new javax.swing.JPanel();
        Panel62 = new javax.swing.JPanel();
        Panel63 = new javax.swing.JPanel();
        Panel64 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Panel65 = new javax.swing.JPanel();
        Panel66 = new javax.swing.JPanel();
        Panel67 = new javax.swing.JPanel();
        Panel68 = new javax.swing.JPanel();
        Panel69 = new javax.swing.JPanel();
        Panel70 = new javax.swing.JPanel();
        Panel71 = new javax.swing.JPanel();
        Panel72 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        Panel73 = new javax.swing.JPanel();
        Panel74 = new javax.swing.JPanel();
        Panel75 = new javax.swing.JPanel();
        Panel76 = new javax.swing.JPanel();
        Panel77 = new javax.swing.JPanel();
        Panel78 = new javax.swing.JPanel();
        Panel79 = new javax.swing.JPanel();
        Panel80 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        Panel81 = new javax.swing.JPanel();
        Panel82 = new javax.swing.JPanel();
        Panel83 = new javax.swing.JPanel();
        Panel84 = new javax.swing.JPanel();
        Panel85 = new javax.swing.JPanel();
        Panel86 = new javax.swing.JPanel();
        Panel87 = new javax.swing.JPanel();
        Panel88 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        Panel89 = new javax.swing.JPanel();
        Panel90 = new javax.swing.JPanel();
        Panel91 = new javax.swing.JPanel();
        Panel92 = new javax.swing.JPanel();
        Panel93 = new javax.swing.JPanel();
        Panel94 = new javax.swing.JPanel();
        Panel95 = new javax.swing.JPanel();
        Panel96 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        btn_delete = new javax.swing.JLabel();
        panel_edit = new javax.swing.JPanel();
        Panel10 = new javax.swing.JPanel();
        Panel11 = new javax.swing.JPanel();
        Panel12 = new javax.swing.JPanel();
        Panel13 = new javax.swing.JPanel();
        Panel14 = new javax.swing.JPanel();
        Panel15 = new javax.swing.JPanel();
        Panel16 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btn_edit = new javax.swing.JLabel();
        panel_view = new javax.swing.JPanel();
        Panel18 = new javax.swing.JPanel();
        Panel19 = new javax.swing.JPanel();
        Panel20 = new javax.swing.JPanel();
        Panel21 = new javax.swing.JPanel();
        Panel22 = new javax.swing.JPanel();
        Panel23 = new javax.swing.JPanel();
        Panel24 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btn_view = new javax.swing.JLabel();
        panel_search = new javax.swing.JPanel();
        Panel26 = new javax.swing.JPanel();
        Panel27 = new javax.swing.JPanel();
        Panel28 = new javax.swing.JPanel();
        Panel29 = new javax.swing.JPanel();
        Panel30 = new javax.swing.JPanel();
        Panel31 = new javax.swing.JPanel();
        Panel32 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btn_search = new javax.swing.JLabel();
        panel_home = new javax.swing.JPanel();
        Panel34 = new javax.swing.JPanel();
        Panel35 = new javax.swing.JPanel();
        Panel36 = new javax.swing.JPanel();
        Panel37 = new javax.swing.JPanel();
        Panel38 = new javax.swing.JPanel();
        Panel39 = new javax.swing.JPanel();
        Panel40 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btn_home = new javax.swing.JLabel();
        panel_back = new javax.swing.JPanel();
        Panel98 = new javax.swing.JPanel();
        Panel99 = new javax.swing.JPanel();
        Panel100 = new javax.swing.JPanel();
        Panel101 = new javax.swing.JPanel();
        Panel102 = new javax.swing.JPanel();
        Panel103 = new javax.swing.JPanel();
        Panel104 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        btn_back = new javax.swing.JLabel();
        panel_logout = new javax.swing.JPanel();
        Panel106 = new javax.swing.JPanel();
        Panel107 = new javax.swing.JPanel();
        Panel108 = new javax.swing.JPanel();
        Panel109 = new javax.swing.JPanel();
        Panel110 = new javax.swing.JPanel();
        Panel111 = new javax.swing.JPanel();
        Panel112 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        btn_logout = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txt_contactno = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        txt_passyr = new javax.swing.JTextField();
        txt_dept = new javax.swing.JTextField();
        txt_internship = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txt_passorstud = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        btn_update = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        txt_working = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        txt_ugorpg = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txt_indiaorabroad = new javax.swing.JComboBox<>();
        txt_country = new javax.swing.JTextField();
        txt_workexperience = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txt_paragraph = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_side.setBackground(new java.awt.Color(102, 0, 102));
        panel_side.setForeground(new java.awt.Color(255, 255, 255));
        panel_side.setMaximumSize(new java.awt.Dimension(540, 1040));
        panel_side.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_deregister.setBackground(new java.awt.Color(153, 0, 153));
        panel_deregister.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        panel_deregister.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel2.setBackground(new java.awt.Color(102, 0, 102));
        Panel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panel_deregister.add(Panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 70));

        Panel3.setBackground(new java.awt.Color(102, 0, 102));
        Panel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel4.setBackground(new java.awt.Color(102, 0, 102));
        Panel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel3.add(Panel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 70));

        panel_deregister.add(Panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 330, 70));

        Panel5.setBackground(new java.awt.Color(102, 0, 102));
        Panel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel6.setBackground(new java.awt.Color(102, 0, 102));
        Panel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel5.add(Panel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 70));

        Panel7.setBackground(new java.awt.Color(102, 0, 102));
        Panel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel8.setBackground(new java.awt.Color(102, 0, 102));
        Panel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel7.add(Panel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 70));

        Panel5.add(Panel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 330, 70));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Home.png"))); // NOI18N
        jLabel2.setText("Home");
        Panel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 170, 50));

        panel_deregister.add(Panel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 330, 70));

        Panel41.setBackground(new java.awt.Color(153, 0, 153));
        Panel41.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel41.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel42.setBackground(new java.awt.Color(102, 0, 102));
        Panel42.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel42.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel41.add(Panel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 70));

        Panel43.setBackground(new java.awt.Color(102, 0, 102));
        Panel43.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel43.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel44.setBackground(new java.awt.Color(102, 0, 102));
        Panel44.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel44.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel43.add(Panel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 70));

        Panel41.add(Panel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 330, 70));

        Panel45.setBackground(new java.awt.Color(102, 0, 102));
        Panel45.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel45.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel46.setBackground(new java.awt.Color(102, 0, 102));
        Panel46.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel46.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel45.add(Panel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 70));

        Panel47.setBackground(new java.awt.Color(102, 0, 102));
        Panel47.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel47.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel48.setBackground(new java.awt.Color(102, 0, 102));
        Panel48.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel48.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel47.add(Panel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 70));

        Panel45.add(Panel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 330, 70));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Home.png"))); // NOI18N
        jLabel7.setText("Home");
        Panel45.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 170, 50));

        Panel41.add(Panel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 330, 70));

        panel_deregister.add(Panel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 330, 70));

        Panel49.setBackground(new java.awt.Color(153, 0, 153));
        Panel49.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel49.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel50.setBackground(new java.awt.Color(102, 0, 102));
        Panel50.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel50.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel49.add(Panel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 70));

        Panel51.setBackground(new java.awt.Color(102, 0, 102));
        Panel51.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel51.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel52.setBackground(new java.awt.Color(102, 0, 102));
        Panel52.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel52.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel51.add(Panel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 70));

        Panel49.add(Panel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 330, 70));

        Panel53.setBackground(new java.awt.Color(102, 0, 102));
        Panel53.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel53.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel54.setBackground(new java.awt.Color(102, 0, 102));
        Panel54.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel54.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel53.add(Panel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 70));

        Panel55.setBackground(new java.awt.Color(102, 0, 102));
        Panel55.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel55.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel56.setBackground(new java.awt.Color(102, 0, 102));
        Panel56.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel56.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel55.add(Panel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 70));

        Panel53.add(Panel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 330, 70));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Home.png"))); // NOI18N
        jLabel8.setText("Home");
        Panel53.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 170, 50));

        Panel49.add(Panel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 330, 70));

        Panel57.setBackground(new java.awt.Color(153, 0, 153));
        Panel57.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel57.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel58.setBackground(new java.awt.Color(102, 0, 102));
        Panel58.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel58.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel57.add(Panel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 70));

        Panel59.setBackground(new java.awt.Color(102, 0, 102));
        Panel59.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel59.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel60.setBackground(new java.awt.Color(102, 0, 102));
        Panel60.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel60.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel59.add(Panel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 70));

        Panel57.add(Panel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 330, 70));

        Panel61.setBackground(new java.awt.Color(102, 0, 102));
        Panel61.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel61.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel62.setBackground(new java.awt.Color(102, 0, 102));
        Panel62.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel62.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel61.add(Panel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 70));

        Panel63.setBackground(new java.awt.Color(102, 0, 102));
        Panel63.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel63.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel64.setBackground(new java.awt.Color(102, 0, 102));
        Panel64.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel64.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel63.add(Panel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 70));

        Panel61.add(Panel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 330, 70));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Home.png"))); // NOI18N
        jLabel9.setText("Home");
        Panel61.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 170, 50));

        Panel57.add(Panel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 330, 70));

        Panel49.add(Panel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 330, 70));

        panel_deregister.add(Panel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, 330, 70));

        Panel65.setBackground(new java.awt.Color(153, 0, 153));
        Panel65.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel65.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel66.setBackground(new java.awt.Color(102, 0, 102));
        Panel66.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel66.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel65.add(Panel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 70));

        Panel67.setBackground(new java.awt.Color(102, 0, 102));
        Panel67.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel67.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel68.setBackground(new java.awt.Color(102, 0, 102));
        Panel68.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel68.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel67.add(Panel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 70));

        Panel65.add(Panel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 330, 70));

        Panel69.setBackground(new java.awt.Color(102, 0, 102));
        Panel69.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel69.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel70.setBackground(new java.awt.Color(102, 0, 102));
        Panel70.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel70.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel69.add(Panel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 70));

        Panel71.setBackground(new java.awt.Color(102, 0, 102));
        Panel71.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel71.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel72.setBackground(new java.awt.Color(102, 0, 102));
        Panel72.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel72.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel71.add(Panel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 70));

        Panel69.add(Panel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 330, 70));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Home.png"))); // NOI18N
        jLabel10.setText("Home");
        Panel69.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 170, 50));

        Panel65.add(Panel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 330, 70));

        Panel73.setBackground(new java.awt.Color(153, 0, 153));
        Panel73.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel73.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel74.setBackground(new java.awt.Color(102, 0, 102));
        Panel74.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel74.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel73.add(Panel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 70));

        Panel75.setBackground(new java.awt.Color(102, 0, 102));
        Panel75.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel75.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel76.setBackground(new java.awt.Color(102, 0, 102));
        Panel76.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel76.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel75.add(Panel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 70));

        Panel73.add(Panel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 330, 70));

        Panel77.setBackground(new java.awt.Color(102, 0, 102));
        Panel77.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel77.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel78.setBackground(new java.awt.Color(102, 0, 102));
        Panel78.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel78.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel77.add(Panel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 70));

        Panel79.setBackground(new java.awt.Color(102, 0, 102));
        Panel79.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel79.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel80.setBackground(new java.awt.Color(102, 0, 102));
        Panel80.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel80.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel79.add(Panel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 70));

        Panel77.add(Panel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 330, 70));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Home.png"))); // NOI18N
        jLabel11.setText("Home");
        Panel77.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 170, 50));

        Panel73.add(Panel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 330, 70));

        Panel65.add(Panel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 330, 70));

        Panel81.setBackground(new java.awt.Color(153, 0, 153));
        Panel81.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel81.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel82.setBackground(new java.awt.Color(102, 0, 102));
        Panel82.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel82.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel81.add(Panel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 70));

        Panel83.setBackground(new java.awt.Color(102, 0, 102));
        Panel83.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel83.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel84.setBackground(new java.awt.Color(102, 0, 102));
        Panel84.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel84.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel83.add(Panel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 70));

        Panel81.add(Panel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 330, 70));

        Panel85.setBackground(new java.awt.Color(102, 0, 102));
        Panel85.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel85.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel86.setBackground(new java.awt.Color(102, 0, 102));
        Panel86.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel86.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel85.add(Panel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 70));

        Panel87.setBackground(new java.awt.Color(102, 0, 102));
        Panel87.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel87.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel88.setBackground(new java.awt.Color(102, 0, 102));
        Panel88.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel88.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel87.add(Panel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 70));

        Panel85.add(Panel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 330, 70));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Home.png"))); // NOI18N
        jLabel12.setText("Home");
        Panel85.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 170, 50));

        Panel81.add(Panel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 330, 70));

        Panel89.setBackground(new java.awt.Color(153, 0, 153));
        Panel89.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel89.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel90.setBackground(new java.awt.Color(102, 0, 102));
        Panel90.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel90.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel89.add(Panel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 70));

        Panel91.setBackground(new java.awt.Color(102, 0, 102));
        Panel91.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel91.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel92.setBackground(new java.awt.Color(102, 0, 102));
        Panel92.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel92.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel91.add(Panel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 70));

        Panel89.add(Panel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 330, 70));

        Panel93.setBackground(new java.awt.Color(102, 0, 102));
        Panel93.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel93.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel94.setBackground(new java.awt.Color(102, 0, 102));
        Panel94.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel94.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel93.add(Panel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 70));

        Panel95.setBackground(new java.awt.Color(102, 0, 102));
        Panel95.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel95.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel96.setBackground(new java.awt.Color(102, 0, 102));
        Panel96.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel96.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel95.add(Panel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 70));

        Panel93.add(Panel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 330, 70));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Home.png"))); // NOI18N
        jLabel13.setText("Home");
        Panel93.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 170, 50));

        Panel89.add(Panel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 330, 70));

        Panel81.add(Panel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 330, 70));

        Panel65.add(Panel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, 330, 70));

        panel_deregister.add(Panel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 600, 330, 70));

        btn_delete.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(255, 255, 255));
        btn_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        btn_delete.setText("De-Register");
        btn_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_deleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_deleteMouseExited(evt);
            }
        });
        panel_deregister.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 230, 60));

        panel_side.add(panel_deregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 330, 70));

        panel_edit.setBackground(new java.awt.Color(153, 0, 153));
        panel_edit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        panel_edit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel10.setBackground(new java.awt.Color(102, 0, 102));
        Panel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panel_edit.add(Panel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 70));

        Panel11.setBackground(new java.awt.Color(102, 0, 102));
        Panel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel12.setBackground(new java.awt.Color(102, 0, 102));
        Panel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel11.add(Panel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 70));

        panel_edit.add(Panel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 330, 70));

        Panel13.setBackground(new java.awt.Color(102, 0, 102));
        Panel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel14.setBackground(new java.awt.Color(102, 0, 102));
        Panel14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel13.add(Panel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 70));

        Panel15.setBackground(new java.awt.Color(102, 0, 102));
        Panel15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel16.setBackground(new java.awt.Color(102, 0, 102));
        Panel16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel15.add(Panel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 70));

        Panel13.add(Panel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 330, 70));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Home.png"))); // NOI18N
        jLabel3.setText("Home");
        Panel13.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 170, 50));

        panel_edit.add(Panel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 330, 70));

        btn_edit.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        btn_edit.setForeground(new java.awt.Color(255, 255, 255));
        btn_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-add-64.png"))); // NOI18N
        btn_edit.setText("Register");
        btn_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_editMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_editMouseExited(evt);
            }
        });
        panel_edit.add(btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 230, 60));

        panel_side.add(panel_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 330, 70));

        panel_view.setBackground(new java.awt.Color(153, 0, 153));
        panel_view.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        panel_view.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel18.setBackground(new java.awt.Color(102, 0, 102));
        Panel18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panel_view.add(Panel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 70));

        Panel19.setBackground(new java.awt.Color(102, 0, 102));
        Panel19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel20.setBackground(new java.awt.Color(102, 0, 102));
        Panel20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel19.add(Panel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 70));

        panel_view.add(Panel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 330, 70));

        Panel21.setBackground(new java.awt.Color(102, 0, 102));
        Panel21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel22.setBackground(new java.awt.Color(102, 0, 102));
        Panel22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel21.add(Panel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 70));

        Panel23.setBackground(new java.awt.Color(102, 0, 102));
        Panel23.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel24.setBackground(new java.awt.Color(102, 0, 102));
        Panel24.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel23.add(Panel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 70));

        Panel21.add(Panel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 330, 70));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Home.png"))); // NOI18N
        jLabel4.setText("Home");
        Panel21.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 170, 50));

        panel_view.add(Panel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 330, 70));

        btn_view.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        btn_view.setForeground(new java.awt.Color(255, 255, 255));
        btn_view.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/List.png"))); // NOI18N
        btn_view.setText("View list");
        btn_view.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_viewMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_viewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_viewMouseExited(evt);
            }
        });
        panel_view.add(btn_view, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 230, 60));

        panel_side.add(panel_view, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 330, 70));

        panel_search.setBackground(new java.awt.Color(153, 0, 153));
        panel_search.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        panel_search.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel26.setBackground(new java.awt.Color(102, 0, 102));
        Panel26.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panel_search.add(Panel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 70));

        Panel27.setBackground(new java.awt.Color(102, 0, 102));
        Panel27.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel28.setBackground(new java.awt.Color(102, 0, 102));
        Panel28.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel27.add(Panel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 70));

        panel_search.add(Panel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 330, 70));

        Panel29.setBackground(new java.awt.Color(102, 0, 102));
        Panel29.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel30.setBackground(new java.awt.Color(102, 0, 102));
        Panel30.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel30.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel29.add(Panel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 70));

        Panel31.setBackground(new java.awt.Color(102, 0, 102));
        Panel31.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel31.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel32.setBackground(new java.awt.Color(102, 0, 102));
        Panel32.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel32.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel31.add(Panel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 70));

        Panel29.add(Panel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 330, 70));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Home.png"))); // NOI18N
        jLabel5.setText("Home");
        Panel29.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 170, 50));

        panel_search.add(Panel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 330, 70));

        btn_search.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        btn_search.setForeground(new java.awt.Color(255, 255, 255));
        btn_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Srarch.png"))); // NOI18N
        btn_search.setText("Search");
        btn_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_searchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_searchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_searchMouseExited(evt);
            }
        });
        panel_search.add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 170, 50));

        panel_side.add(panel_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 330, 70));

        panel_home.setBackground(new java.awt.Color(153, 0, 153));
        panel_home.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        panel_home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel34.setBackground(new java.awt.Color(102, 0, 102));
        Panel34.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel34.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panel_home.add(Panel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 70));

        Panel35.setBackground(new java.awt.Color(102, 0, 102));
        Panel35.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel35.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel36.setBackground(new java.awt.Color(102, 0, 102));
        Panel36.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel36.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel35.add(Panel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 70));

        panel_home.add(Panel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 330, 70));

        Panel37.setBackground(new java.awt.Color(102, 0, 102));
        Panel37.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel37.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel38.setBackground(new java.awt.Color(102, 0, 102));
        Panel38.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel38.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel37.add(Panel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 70));

        Panel39.setBackground(new java.awt.Color(102, 0, 102));
        Panel39.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel39.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel40.setBackground(new java.awt.Color(102, 0, 102));
        Panel40.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel40.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel39.add(Panel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 70));

        Panel37.add(Panel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 330, 70));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Home.png"))); // NOI18N
        jLabel6.setText("Home");
        Panel37.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 170, 50));

        panel_home.add(Panel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 330, 70));

        btn_home.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        btn_home.setForeground(new java.awt.Color(255, 255, 255));
        btn_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Home.png"))); // NOI18N
        btn_home.setText("Home");
        btn_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_homeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_homeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_homeMouseExited(evt);
            }
        });
        panel_home.add(btn_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 170, 50));

        panel_side.add(panel_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 330, 70));

        panel_back.setBackground(new java.awt.Color(153, 0, 153));
        panel_back.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        panel_back.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel98.setBackground(new java.awt.Color(102, 0, 102));
        Panel98.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel98.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panel_back.add(Panel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 70));

        Panel99.setBackground(new java.awt.Color(102, 0, 102));
        Panel99.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel99.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel100.setBackground(new java.awt.Color(102, 0, 102));
        Panel100.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel100.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel99.add(Panel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 70));

        panel_back.add(Panel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 330, 70));

        Panel101.setBackground(new java.awt.Color(102, 0, 102));
        Panel101.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel101.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel102.setBackground(new java.awt.Color(102, 0, 102));
        Panel102.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel102.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel101.add(Panel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 70));

        Panel103.setBackground(new java.awt.Color(102, 0, 102));
        Panel103.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel103.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel104.setBackground(new java.awt.Color(102, 0, 102));
        Panel104.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel104.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel103.add(Panel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 70));

        Panel101.add(Panel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 330, 70));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Home.png"))); // NOI18N
        jLabel14.setText("Home");
        Panel101.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 170, 50));

        panel_back.add(Panel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 330, 70));

        btn_back.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        btn_back.setForeground(new java.awt.Color(255, 255, 255));
        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Back.png"))); // NOI18N
        btn_back.setText("Back");
        btn_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_backMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_backMouseExited(evt);
            }
        });
        panel_back.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 230, 60));

        panel_side.add(panel_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 330, 70));

        panel_logout.setBackground(new java.awt.Color(153, 0, 153));
        panel_logout.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        panel_logout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel106.setBackground(new java.awt.Color(102, 0, 102));
        Panel106.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel106.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panel_logout.add(Panel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 70));

        Panel107.setBackground(new java.awt.Color(102, 0, 102));
        Panel107.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel107.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel108.setBackground(new java.awt.Color(102, 0, 102));
        Panel108.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel108.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel107.add(Panel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 70));

        panel_logout.add(Panel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 330, 70));

        Panel109.setBackground(new java.awt.Color(102, 0, 102));
        Panel109.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel109.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel110.setBackground(new java.awt.Color(102, 0, 102));
        Panel110.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel110.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel109.add(Panel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 70));

        Panel111.setBackground(new java.awt.Color(102, 0, 102));
        Panel111.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel111.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel112.setBackground(new java.awt.Color(102, 0, 102));
        Panel112.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, java.awt.Color.white));
        Panel112.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel111.add(Panel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 70));

        Panel109.add(Panel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 330, 70));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Home.png"))); // NOI18N
        jLabel15.setText("Home");
        Panel109.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 170, 50));

        panel_logout.add(Panel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 330, 70));

        btn_logout.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        btn_logout.setForeground(new java.awt.Color(255, 255, 255));
        btn_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        btn_logout.setText("Exit");
        btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_logoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_logoutMouseExited(evt);
            }
        });
        panel_logout.add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 230, 60));

        panel_side.add(panel_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 330, 70));

        getContentPane().add(panel_side, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 760));

        jPanel1.setBackground(new java.awt.Color(204, 0, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Contact No:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 130, -1));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Intership Status :");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 190, -1));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Department :");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 140, -1));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Passing Year:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 150, -1));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Student Id:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 140, -1));

        txt_contactno.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(txt_contactno, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 250, -1));

        txt_name.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 250, 30));

        txt_passyr.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(txt_passyr, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 250, -1));

        txt_dept.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(txt_dept, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 250, -1));

        txt_internship.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(txt_internship, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 250, -1));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Passout/Studying:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 190, -1));

        txt_passorstud.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(txt_passorstud, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 250, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 650, -1, -1));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Name:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 70, -1));

        txt_id.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 250, 30));

        btn_update.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        jPanel1.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 640, -1, -1));

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Are You Working?:");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 210, -1));

        txt_working.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_working.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "NO" }));
        jPanel1.add(txt_working, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, -1, -1));

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Qualification(UG/PG):");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 240, -1));

        txt_ugorpg.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_ugorpg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UG", "PG" }));
        jPanel1.add(txt_ugorpg, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, -1, -1));

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Where did you study India/Abroad:");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 370, -1));

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("If Abroad Enter Country(Otherwise EnterNo):");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 500, -1));

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Years of Working Experience:");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, -1, -1));

        txt_indiaorabroad.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_indiaorabroad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "India", "Abroad" }));
        jPanel1.add(txt_indiaorabroad, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, -1, -1));

        txt_country.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(txt_country, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 490, 250, 30));

        txt_workexperience.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(txt_workexperience, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 550, 250, 30));

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Tell Us About Yourself:");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 250, -1));

        txt_paragraph.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txt_paragraph, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 380, 200));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 1560, 760));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_homeMouseEntered
        // TODO add your handling code here:
         Color clr = new Color(255,0,255);
        panel_home.setBackground(clr);
    }//GEN-LAST:event_btn_homeMouseEntered

    private void btn_homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_homeMouseExited
        // TODO add your handling code here:
        Color clr = new Color(153,0,153);
        panel_home.setBackground(clr);
    }//GEN-LAST:event_btn_homeMouseExited

    private void btn_searchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_searchMouseEntered
        // TODO add your handling code here:
        Color clr = new Color(255,0,255);
        panel_search.setBackground(clr);
    }//GEN-LAST:event_btn_searchMouseEntered

    private void btn_searchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_searchMouseExited
        // TODO add your handling code here:
        Color clr = new Color(153,0,153);
        panel_search.setBackground(clr);
    }//GEN-LAST:event_btn_searchMouseExited

    private void btn_editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editMouseEntered
        // TODO add your handling code here:
        Color clr = new Color(255,0,255);
        panel_edit.setBackground(clr);
    }//GEN-LAST:event_btn_editMouseEntered

    private void btn_editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editMouseExited
        // TODO add your handling code here:
        Color clr = new Color(153,0,153);
        panel_edit.setBackground(clr);
    }//GEN-LAST:event_btn_editMouseExited

    private void btn_viewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_viewMouseEntered
        // TODO add your handling code here:
        Color clr = new Color(255,0,255);
        panel_view.setBackground(clr);
    }//GEN-LAST:event_btn_viewMouseEntered

    private void btn_viewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_viewMouseExited
        // TODO add your handling code here:
         Color clr = new Color(153,0,153);
        panel_view.setBackground(clr);
    }//GEN-LAST:event_btn_viewMouseExited

    private void btn_backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseEntered
        // TODO add your handling code here:
        Color clr = new Color(255,0,255);
        panel_back.setBackground(clr);
    }//GEN-LAST:event_btn_backMouseEntered

    private void btn_backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseExited
        // TODO add your handling code here:
          Color clr = new Color(153,0,153);
        panel_back.setBackground(clr);
    }//GEN-LAST:event_btn_backMouseExited

    private void btn_logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseEntered
        // TODO add your handling code here:
        Color clr = new Color(255,0,255);
        panel_logout.setBackground(clr);
    }//GEN-LAST:event_btn_logoutMouseEntered

    private void btn_logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseExited
        // TODO add your handling code here:
          Color clr = new Color(153,0,153);
        panel_logout.setBackground(clr);
        
    }//GEN-LAST:event_btn_logoutMouseExited

    private void btn_deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_deleteMouseEntered
        // TODO add your handling code here:
         Color clr = new Color(255,0,255);
        panel_deregister.setBackground(clr);
    }//GEN-LAST:event_btn_deleteMouseEntered

    private void btn_deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_deleteMouseExited
        // TODO add your handling code here:
         Color clr = new Color(153,0,153);
        panel_deregister.setBackground(clr);
    }//GEN-LAST:event_btn_deleteMouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(validation()==true){
            JOptionPane.showMessageDialog(this,"Validation Successfull");
             insertDetails();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editMouseClicked
        // TODO add your handling code here:
         Register register = new Register();
        register.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_editMouseClicked

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
        updateDetails();
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_deleteMouseClicked
        // TODO add your handling code here:
         Delete delete = new Delete();
        delete.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_deleteMouseClicked

    private void btn_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_homeMouseClicked
        // TODO add your handling code here:
                home home =new home();
                home.show();
                this.dispose();
    }//GEN-LAST:event_btn_homeMouseClicked

    private void btn_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseClicked
        // TODO add your handling code here:
        Delete delete = new Delete();
        delete.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_backMouseClicked

    private void btn_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseClicked
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null,"Do you really want to Close Application","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
           System.exit(0);
             }  
    }//GEN-LAST:event_btn_logoutMouseClicked

    private void btn_searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_searchMouseClicked
        // TODO add your handling code here:
        SearchRecord record = new SearchRecord();
        record.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_searchMouseClicked

    private void btn_viewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_viewMouseClicked
        // TODO add your handling code here:
        View view =new View();
        view.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_viewMouseClicked

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
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel10;
    private javax.swing.JPanel Panel100;
    private javax.swing.JPanel Panel101;
    private javax.swing.JPanel Panel102;
    private javax.swing.JPanel Panel103;
    private javax.swing.JPanel Panel104;
    private javax.swing.JPanel Panel106;
    private javax.swing.JPanel Panel107;
    private javax.swing.JPanel Panel108;
    private javax.swing.JPanel Panel109;
    private javax.swing.JPanel Panel11;
    private javax.swing.JPanel Panel110;
    private javax.swing.JPanel Panel111;
    private javax.swing.JPanel Panel112;
    private javax.swing.JPanel Panel12;
    private javax.swing.JPanel Panel13;
    private javax.swing.JPanel Panel14;
    private javax.swing.JPanel Panel15;
    private javax.swing.JPanel Panel16;
    private javax.swing.JPanel Panel18;
    private javax.swing.JPanel Panel19;
    private javax.swing.JPanel Panel2;
    private javax.swing.JPanel Panel20;
    private javax.swing.JPanel Panel21;
    private javax.swing.JPanel Panel22;
    private javax.swing.JPanel Panel23;
    private javax.swing.JPanel Panel24;
    private javax.swing.JPanel Panel26;
    private javax.swing.JPanel Panel27;
    private javax.swing.JPanel Panel28;
    private javax.swing.JPanel Panel29;
    private javax.swing.JPanel Panel3;
    private javax.swing.JPanel Panel30;
    private javax.swing.JPanel Panel31;
    private javax.swing.JPanel Panel32;
    private javax.swing.JPanel Panel34;
    private javax.swing.JPanel Panel35;
    private javax.swing.JPanel Panel36;
    private javax.swing.JPanel Panel37;
    private javax.swing.JPanel Panel38;
    private javax.swing.JPanel Panel39;
    private javax.swing.JPanel Panel4;
    private javax.swing.JPanel Panel40;
    private javax.swing.JPanel Panel41;
    private javax.swing.JPanel Panel42;
    private javax.swing.JPanel Panel43;
    private javax.swing.JPanel Panel44;
    private javax.swing.JPanel Panel45;
    private javax.swing.JPanel Panel46;
    private javax.swing.JPanel Panel47;
    private javax.swing.JPanel Panel48;
    private javax.swing.JPanel Panel49;
    private javax.swing.JPanel Panel5;
    private javax.swing.JPanel Panel50;
    private javax.swing.JPanel Panel51;
    private javax.swing.JPanel Panel52;
    private javax.swing.JPanel Panel53;
    private javax.swing.JPanel Panel54;
    private javax.swing.JPanel Panel55;
    private javax.swing.JPanel Panel56;
    private javax.swing.JPanel Panel57;
    private javax.swing.JPanel Panel58;
    private javax.swing.JPanel Panel59;
    private javax.swing.JPanel Panel6;
    private javax.swing.JPanel Panel60;
    private javax.swing.JPanel Panel61;
    private javax.swing.JPanel Panel62;
    private javax.swing.JPanel Panel63;
    private javax.swing.JPanel Panel64;
    private javax.swing.JPanel Panel65;
    private javax.swing.JPanel Panel66;
    private javax.swing.JPanel Panel67;
    private javax.swing.JPanel Panel68;
    private javax.swing.JPanel Panel69;
    private javax.swing.JPanel Panel7;
    private javax.swing.JPanel Panel70;
    private javax.swing.JPanel Panel71;
    private javax.swing.JPanel Panel72;
    private javax.swing.JPanel Panel73;
    private javax.swing.JPanel Panel74;
    private javax.swing.JPanel Panel75;
    private javax.swing.JPanel Panel76;
    private javax.swing.JPanel Panel77;
    private javax.swing.JPanel Panel78;
    private javax.swing.JPanel Panel79;
    private javax.swing.JPanel Panel8;
    private javax.swing.JPanel Panel80;
    private javax.swing.JPanel Panel81;
    private javax.swing.JPanel Panel82;
    private javax.swing.JPanel Panel83;
    private javax.swing.JPanel Panel84;
    private javax.swing.JPanel Panel85;
    private javax.swing.JPanel Panel86;
    private javax.swing.JPanel Panel87;
    private javax.swing.JPanel Panel88;
    private javax.swing.JPanel Panel89;
    private javax.swing.JPanel Panel90;
    private javax.swing.JPanel Panel91;
    private javax.swing.JPanel Panel92;
    private javax.swing.JPanel Panel93;
    private javax.swing.JPanel Panel94;
    private javax.swing.JPanel Panel95;
    private javax.swing.JPanel Panel96;
    private javax.swing.JPanel Panel98;
    private javax.swing.JPanel Panel99;
    private javax.swing.JLabel btn_back;
    private javax.swing.JLabel btn_delete;
    private javax.swing.JLabel btn_edit;
    private javax.swing.JLabel btn_home;
    private javax.swing.JLabel btn_logout;
    private javax.swing.JLabel btn_search;
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel btn_view;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panel_back;
    private javax.swing.JPanel panel_deregister;
    private javax.swing.JPanel panel_edit;
    private javax.swing.JPanel panel_home;
    private javax.swing.JPanel panel_logout;
    private javax.swing.JPanel panel_search;
    private javax.swing.JPanel panel_side;
    private javax.swing.JPanel panel_view;
    private javax.swing.JTextField txt_contactno;
    private javax.swing.JTextField txt_country;
    private javax.swing.JTextField txt_dept;
    private javax.swing.JTextField txt_id;
    private javax.swing.JComboBox<String> txt_indiaorabroad;
    private javax.swing.JTextField txt_internship;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_paragraph;
    private javax.swing.JTextField txt_passorstud;
    private javax.swing.JTextField txt_passyr;
    private javax.swing.JComboBox<String> txt_ugorpg;
    private javax.swing.JTextField txt_workexperience;
    private javax.swing.JComboBox<String> txt_working;
    // End of variables declaration//GEN-END:variables
}
