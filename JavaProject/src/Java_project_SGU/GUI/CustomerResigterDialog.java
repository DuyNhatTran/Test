/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Java_project_SGU.GUI;

import Java_project_SGU.Exception.InvalidAccountCusException;
import Java_project_SGU.Exception.InvalidBirthdayException;
import Java_project_SGU.Exception.InvalidEmailException;
import Java_project_SGU.Exception.InvalidIdPersonException;
import Java_project_SGU.Exception.InvalidNameException;
import Java_project_SGU.Exception.InvalidPasswordCusException;
import Java_project_SGU.Exception.InvalidPhoneException;
import Java_project_SGU.BUS.Customer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class CustomerResigterDialog extends javax.swing.JDialog implements ActionListener {
    public static final int WRITE_IN_LOGIN = 1;
    public static final int WRITE_IN_ADMINPAGE = 2;
    
    
    
    private int writeCusOption;
    
    private LoginFrm loginFrm;
    private ManageEmployeeFrm manageEmployeeFrm;

    /**
     * Creates new form CustomerResigterDialog2
     */
    public CustomerResigterDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        addBtnGroupSex();
        addActionListener();
        this.setLocationRelativeTo(null);
        if (parent instanceof LoginFrm) {
            this.loginFrm = (LoginFrm) parent;
        } else if (parent instanceof ManageEmployeeFrm) {
            this.manageEmployeeFrm = (ManageEmployeeFrm) parent;
        }
    }
    
    public CustomerResigterDialog(java.awt.Frame parent, boolean modal, int wirteCusOption) {
        this(parent, modal);
        this.writeCusOption = wirteCusOption;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sexGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jRadioBtnWoman = new javax.swing.JRadioButton();
        jRadioBtnMan = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        fullNametxt = new javax.swing.JTextField();
        birthdayTxt = new javax.swing.JTextField();
        addressTxt = new javax.swing.JTextField();
        accountTxt = new javax.swing.JTextField();
        idPersonTxt = new javax.swing.JTextField();
        emailTxt = new javax.swing.JTextField();
        phoneNumberTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        registerBtn = new javax.swing.JButton();
        rePasswordTxt = new javax.swing.JPasswordField();
        passwordTxt = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setAutoscrolls(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jRadioBtnWoman.setText("Nữ");
        jRadioBtnWoman.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(255, 0, 204)));
        jRadioBtnWoman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBtnWomanActionPerformed(evt);
            }
        });

        jRadioBtnMan.setText("Nam");
        jRadioBtnMan.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(255, 0, 204)));
        jRadioBtnMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBtnManActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("DD/MM/YYYY (NGÀY SINH*)");

        fullNametxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fullNametxt.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(255, 0, 204)));

        birthdayTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        birthdayTxt.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(255, 0, 204)));
        birthdayTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birthdayTxtActionPerformed(evt);
            }
        });

        addressTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addressTxt.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(255, 0, 204)));
        addressTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTxtActionPerformed(evt);
            }
        });

        accountTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        accountTxt.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(255, 0, 204)));

        idPersonTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        idPersonTxt.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(255, 0, 204)));
        idPersonTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idPersonTxtActionPerformed(evt);
            }
        });

        emailTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emailTxt.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(255, 0, 204)));

        phoneNumberTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        phoneNumberTxt.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(255, 0, 204)));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("HỌ VÀ TÊN (*)");
        jLabel3.setOpaque(true);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("ĐỊA CHỈ (*)");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("SỐ ĐIỆN THOẠI (*)");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("TÊN ĐĂNG NHẬP (*)");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("EMAIL (*)");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("SỐ CCCD/ CMND (*)");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("MẬT KHẨU (*)");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("NHẬP LẠI MẬT KHẨU (*)");

        registerBtn.setBackground(new java.awt.Color(153, 0, 153));
        registerBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        registerBtn.setForeground(new java.awt.Color(255, 255, 255));
        registerBtn.setText("Đăng kí");
        registerBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        registerBtn.setBorderPainted(false);
        registerBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerBtn.setFocusPainted(false);
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        rePasswordTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rePasswordTxt.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(255, 0, 204)));

        passwordTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passwordTxt.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(255, 0, 204)));
        passwordTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(accountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(fullNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jRadioBtnMan, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioBtnWoman, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(51, 51, 51)))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(birthdayTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel8)
                                                .addComponent(idPersonTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel6))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(passwordTxt)
                                            .addGap(24, 24, 24)))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(phoneNumberTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                                        .addComponent(emailTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel10)
                                        .addComponent(rePasswordTxt))))
                            .addComponent(jLabel9)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioBtnMan)
                    .addComponent(jRadioBtnWoman))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fullNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(birthdayTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idPersonTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rePasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Java_project_SGU/Image/logoCinestar.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(230, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerBtnActionPerformed

    private void idPersonTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idPersonTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idPersonTxtActionPerformed

    private void birthdayTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birthdayTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_birthdayTxtActionPerformed

    private void jRadioBtnManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBtnManActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioBtnManActionPerformed

    private void addressTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTxtActionPerformed

    private void passwordTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTxtActionPerformed

    private void jRadioBtnWomanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBtnWomanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioBtnWomanActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerResigterDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerResigterDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerResigterDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerResigterDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CustomerResigterDialog dialog = new CustomerResigterDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accountTxt;
    private javax.swing.JTextField addressTxt;
    private javax.swing.JTextField birthdayTxt;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JTextField fullNametxt;
    private javax.swing.JTextField idPersonTxt;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioBtnMan;
    private javax.swing.JRadioButton jRadioBtnWoman;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JTextField phoneNumberTxt;
    private javax.swing.JPasswordField rePasswordTxt;
    private javax.swing.JButton registerBtn;
    private javax.swing.ButtonGroup sexGroup;
    // End of variables declaration//GEN-END:variables

    private void addBtnGroupSex() {
        this.sexGroup.add(jRadioBtnMan);
        this.sexGroup.add(jRadioBtnWoman);
    }

    private void addActionListener() {
        this.registerBtn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src.equals(registerBtn)) {
            addNewCustomer();
        }
        
    }

    private void addNewCustomer() {
        boolean isMan = false;
        if (jRadioBtnMan.isSelected()) {
            isMan = true;
        } else if (jRadioBtnWoman.isSelected()) {
            isMan = false;
        } else {
            JOptionPane.showMessageDialog(rootPane, "VUI LÒNG CHỌN GIỚI TÍNH!");
            return;
        }
        String fullName = fullNametxt.getText();
        String birthday = birthdayTxt.getText();
        String address = addressTxt.getText();
        String idPerson = idPersonTxt.getText();
        String phoneNumber = phoneNumberTxt.getText();
        String account = accountTxt.getText();
        String email = emailTxt.getText();
        String password = String.valueOf(passwordTxt.getPassword());
        String rePassword = String.valueOf(rePasswordTxt.getPassword());
        if (fullName.isEmpty() || birthday.isEmpty() || address.isEmpty()
                || idPerson.isEmpty() || phoneNumber.isEmpty() || email.isEmpty()
                || password.isEmpty() || rePassword.isEmpty() || fullName.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane,
                    "VUI LÒNG ĐIỀN ĐẦY ĐỦ THÔNG TIN!");
        } else {
            Customer customer = new Customer();
            try {
                if (password.equals(rePassword)) {
                    customer.setId_customer(null);
                    customer.setSex(isMan);
                    customer.setFullName(fullName);
                    customer.setBirthDay(birthday);
                    customer.setAddress(address);
                    customer.setId_person(idPerson);
                    customer.setPhoneNumber(phoneNumber);
                    customer.setAccount(account);
                    customer.setEmail(email);
                    customer.setPassword(password);
                    Date date = new Date();
                    SimpleDateFormat startDateFormart
                            = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
                    customer.setStartDate(startDateFormart.format(date));
                    if (this.writeCusOption == CustomerResigterDialog.WRITE_IN_LOGIN) {
                        this.loginFrm.addNewCusCallBack(customer);
                        JOptionPane.showMessageDialog(rootPane,
                            "Đăng kí tài khoản thành công!");
                        this.clearTxt();
                    } else if (this.writeCusOption == CustomerResigterDialog.WRITE_IN_ADMINPAGE) {
                        this.manageEmployeeFrm.addNewCusCallBack(customer);
                        JOptionPane.showMessageDialog(rootPane,
                            "Đăng kí tài khoản thành công!");
                            this.clearTxt();
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "MẬT KHẨU NHẬP "
                            + "LẠI KHÔNG TRÙNG KHỚP");
                }
            } catch (InvalidNameException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            } catch (InvalidBirthdayException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            } catch (InvalidIdPersonException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            } catch (InvalidAccountCusException ex) {
                String rulesAccount = "\n_Ít nhất 8 kí tự\n_ít nhất 1 số và 1 kí tự hoa!";
                JOptionPane.showMessageDialog(rootPane, ex.getMessage() + rulesAccount);
            } catch (InvalidEmailException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            } catch (InvalidPasswordCusException ex) {
                String rulesPassword = "\n_Ít nhất 8 kí tự\n_Ít nhất 1 kí tự đặc biệt"
                        + "\n_Ít nhất kí tự hoa, thường, số!";
                JOptionPane.showMessageDialog(rootPane, ex.getMessage() + rulesPassword);
            } catch (InvalidPhoneException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void clearTxt() {
        this.fullNametxt.setText("");
        this.birthdayTxt.setText("");
        this.birthdayTxt.setText("");
        this.idPersonTxt.setText("");
        this.phoneNumberTxt.setText("");
        this.accountTxt.setText("");
        this.emailTxt.setText("");
        this.passwordTxt.setText("");
        this.rePasswordTxt.setText("");
    }
}