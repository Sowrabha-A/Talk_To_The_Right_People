/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mini4sem;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author sowra
 */
public class home extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    public home() {
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        Reg = new javax.swing.JPanel();
        lbl_Register = new javax.swing.JLabel();
        Reg1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        panel_chatbot = new javax.swing.JPanel();
        lbl_chatbot = new javax.swing.JLabel();
        Reg6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Reg3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Reg4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Reg5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        panel_exit = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Reg8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(255, 0, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 414, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 826, -1));

        jPanel3.setBackground(new java.awt.Color(102, 0, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, -1));

        jPanel4.setBackground(new java.awt.Color(255, 0, 255));
        jPanel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        Reg.setBackground(new java.awt.Color(153, 0, 153));
        Reg.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        Reg.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Reg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_Register.setBackground(new java.awt.Color(204, 0, 204));
        lbl_Register.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_Register.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Register.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-add-64.png"))); // NOI18N
        lbl_Register.setText("Register");
        lbl_Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_RegisterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_RegisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_RegisterMouseExited(evt);
            }
        });
        Reg.add(lbl_Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jPanel4.add(Reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 200, 110));

        Reg1.setBackground(new java.awt.Color(153, 0, 153));
        Reg1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        Reg1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Reg1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Srarch.png"))); // NOI18N
        jLabel5.setText("Search");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        Reg1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jPanel4.add(Reg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 210, 110));

        panel_chatbot.setBackground(new java.awt.Color(153, 0, 153));
        panel_chatbot.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        panel_chatbot.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        panel_chatbot.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_chatbot.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_chatbot.setForeground(new java.awt.Color(255, 255, 255));
        lbl_chatbot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-chatbot-66.png"))); // NOI18N
        lbl_chatbot.setText("CHAT BOT");
        lbl_chatbot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_chatbotMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_chatbotMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_chatbotMouseExited(evt);
            }
        });
        panel_chatbot.add(lbl_chatbot, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 170, -1));

        Reg6.setBackground(new java.awt.Color(153, 0, 153));
        Reg6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        Reg6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Reg6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-exit-64.png"))); // NOI18N
        jLabel8.setText("Exit");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });
        Reg6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 120, -1));

        panel_chatbot.add(Reg6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, 220, 120));

        jPanel4.add(panel_chatbot, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 260, 120));

        Reg3.setBackground(new java.awt.Color(153, 0, 153));
        Reg3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        Reg3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Reg3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        jLabel6.setText("Edit");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        Reg3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 160, -1));

        jPanel4.add(Reg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 220, 120));

        Reg4.setBackground(new java.awt.Color(153, 0, 153));
        Reg4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        Reg4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Reg4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        jLabel3.setText("De-Register");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        Reg4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jPanel4.add(Reg4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 210, 110));

        Reg5.setBackground(new java.awt.Color(153, 0, 153));
        Reg5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        Reg5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Reg5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/view.png"))); // NOI18N
        jLabel4.setText("View");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        Reg5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 130, -1));

        jPanel4.add(Reg5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 220, 110));

        panel_exit.setBackground(new java.awt.Color(153, 0, 153));
        panel_exit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        panel_exit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        panel_exit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-exit-64.png"))); // NOI18N
        jLabel9.setText("Exit");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });
        panel_exit.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 120, -1));

        Reg8.setBackground(new java.awt.Color(153, 0, 153));
        Reg8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        Reg8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Reg8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-exit-64.png"))); // NOI18N
        jLabel10.setText("Exit");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
        });
        Reg8.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 120, -1));

        panel_exit.add(Reg8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, 220, 120));

        jPanel4.add(panel_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, 220, 120));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 900, 460));

        jPanel5.setBackground(new java.awt.Color(102, 0, 102));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/People.png"))); // NOI18N
        jLabel7.setText("Talk To The Right People Home Page");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 27, 830, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 100));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_RegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_RegisterMouseEntered
        // TODO add your handling code here:
        Color clr = new Color(255,0,255);
        Reg.setBackground(clr);
    }//GEN-LAST:event_lbl_RegisterMouseEntered

    private void lbl_RegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_RegisterMouseExited
        // TODO add your handling code here:
        Color clr = new Color(153,0,153);
        Reg.setBackground(clr);
    }//GEN-LAST:event_lbl_RegisterMouseExited

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:
        Color clr = new Color(255,0,255);
        Reg4.setBackground(clr);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        // TODO add your handling code here:
        Color clr = new Color(153,0,153);
        Reg4.setBackground(clr);
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        // TODO add your handling code here: Color clr = new Color(255,0,255);
         Color clr = new Color(255,0,255);
        Reg5.setBackground(clr);
        
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        // TODO add your handling code here:
         Color clr = new Color(255,0,255);
        Reg1.setBackground(clr);
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        // TODO add your handling code here:
         Color clr = new Color(255,0,255);
        Reg3.setBackground(clr);
    }//GEN-LAST:event_jLabel6MouseEntered

    private void lbl_chatbotMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_chatbotMouseEntered
        // TODO add your handling code here:
         Color clr = new Color(255,0,255);
        panel_chatbot.setBackground(clr);
    }//GEN-LAST:event_lbl_chatbotMouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        // TODO add your handling code here:
         Color clr = new Color(153,0,153);
        Reg5.setBackground(clr);
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        // TODO add your handling code here:
         Color clr = new Color(153,0,153);
        Reg1.setBackground(clr);
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        // TODO add your handling code here:
         Color clr = new Color(153,0,153);
        Reg3.setBackground(clr);
    }//GEN-LAST:event_jLabel6MouseExited

    private void lbl_chatbotMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_chatbotMouseExited
        // TODO add your handling code here:
         Color clr = new Color(153,0,153);
        panel_chatbot.setBackground(clr);
    }//GEN-LAST:event_lbl_chatbotMouseExited

    private void lbl_RegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_RegisterMouseClicked
        // TODO add your handling code here:
        Register register = new Register();
        register.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbl_RegisterMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        Edit edit = new Edit();
        edit.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void lbl_chatbotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_chatbotMouseClicked
        // TODO add your handling code here:
        Chatbotdemo chat = new Chatbotdemo();
        chat.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbl_chatbotMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        Delete delete = new Delete();
        delete.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        View view =new View();
        view.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        SearchRecord record = new SearchRecord();
        record.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null,"Do you really want to Close Application","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
           System.exit(0);
             }  
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        // TODO add your handling code here:
        Color clr = new Color(255,0,255);
        panel_exit.setBackground(clr);
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        // TODO add your handling code here:
         Color clr = new Color(153,0,153);
        panel_exit.setBackground(clr);
    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseExited

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Reg;
    private javax.swing.JPanel Reg1;
    private javax.swing.JPanel Reg3;
    private javax.swing.JPanel Reg4;
    private javax.swing.JPanel Reg5;
    private javax.swing.JPanel Reg6;
    private javax.swing.JPanel Reg8;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lbl_Register;
    private javax.swing.JLabel lbl_chatbot;
    private javax.swing.JPanel panel_chatbot;
    private javax.swing.JPanel panel_exit;
    // End of variables declaration//GEN-END:variables
}
