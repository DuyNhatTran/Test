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
import Java_project_SGU.Exception.InvalidPhoneException;
import Java_project_SGU.BUS.Customer;
import java.awt.Dialog;
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
public class CustomerUpdateDialog extends javax.swing.JDialog implements ActionListener {

    private Customer customer;
    private ManageEmployeeFrm manageEmployeeFrm;
    private Date startDate;

    /**
     * Creates new form CustomerUpdateDialog
     */
    public CustomerUpdateDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        addActionListioner();
        addBtnGroup();
        this.manageEmployeeFrm = (ManageEmployeeFrm) parent;
    }
    
    public CustomerUpdateDialog(java.awt.Frame parent, boolean modal, Customer customer) {
        this(parent, modal);
        this.customer = customer;
        loadDataFromCustomer();
    }

    

    public CustomerUpdateDialog(Dialog owner, boolean modal,
            Customer customer, ManageEmployeeFrm manageEmployeeFrm) {
        super(owner, modal);
        this.customer = customer;
        this.manageEmployeeFrm = manageEmployeeFrm;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupSex = new javax.swing.ButtonGroup();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        womanRB = new javax.swing.JRadioButton();
        manRB = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        fullNametxt = new javax.swing.JTextField();
        birthdayTxt = new javax.swing.JTextField();
        addressTxt = new javax.swing.JTextField();
        idPersonTxt = new javax.swing.JTextField();
        emailTxt = new javax.swing.JTextField();
        phoneNumberTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setAutoscrolls(true);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        womanRB.setText("Nữ");
        womanRB.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(255, 0, 204)));
        womanRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                womanRBActionPerformed(evt);
            }
        });

        manRB.setText("Nam");
        manRB.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(255, 0, 204)));
        manRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manRBActionPerformed(evt);
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

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("EMAIL (*)");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("SỐ CCCD/ CMND (*)");

        updateBtn.setBackground(new java.awt.Color(153, 0, 153));
        updateBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn.setText("CẬP NHẬP ");
        updateBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updateBtn.setBorderPainted(false);
        updateBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateBtn.setFocusPainted(false);
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(fullNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(manRB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(womanRB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(51, 51, 51)))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(birthdayTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addComponent(idPersonTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(phoneNumberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manRB)
                    .addComponent(womanRB))
                .addGap(20, 20, 20)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fullNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(birthdayTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idPersonTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Java_project_SGU/Image/logoCinestar.png"))); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateBtnActionPerformed

    private void idPersonTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idPersonTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idPersonTxtActionPerformed

    private void addressTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTxtActionPerformed

    private void birthdayTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birthdayTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_birthdayTxtActionPerformed

    private void manRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manRBActionPerformed

    private void womanRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_womanRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_womanRBActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerUpdateDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerUpdateDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerUpdateDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerUpdateDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CustomerUpdateDialog dialog = new CustomerUpdateDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField addressTxt;
    private javax.swing.JTextField birthdayTxt;
    private javax.swing.ButtonGroup btnGroupSex;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JTextField fullNametxt;
    private javax.swing.JTextField idPersonTxt;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton manRB;
    private javax.swing.JTextField phoneNumberTxt;
    private javax.swing.JButton updateBtn;
    private javax.swing.JRadioButton womanRB;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (e.getSource().equals(updateBtn)) {
            upDateCustomer();
        }
    }

    private void addActionListioner() {
        this.updateBtn.addActionListener(this);
    }

    private void upDateCustomer() {
        boolean isMan = false;
        if (manRB.isSelected()) {
            isMan = true;
        } else if (womanRB.isSelected()) {
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
        String email = emailTxt.getText();
        
        if (fullName.isEmpty() || birthday.isEmpty() || address.isEmpty()
                || idPerson.isEmpty() || phoneNumber.isEmpty() || email.isEmpty()
                || fullName.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane,
                    "VUI LÒNG ĐIỀN ĐẦY ĐỦ THÔNG TIN!");
        } else {
            try {
                customer.setSex(isMan);
                customer.setFullName(fullName);
                customer.setBirthDay(birthday);
                customer.setAddress(address);
                customer.setId_person(idPerson);
                customer.setPhoneNumber(phoneNumber);
                customer.setEmail(email);
                customer.setStartDate(new SimpleDateFormat("HH:mm:ss dd/MM/yyyy")
                        .format(this.startDate));
                this.manageEmployeeFrm.updateCusCallBack(customer);
                JOptionPane.showMessageDialog(rootPane,
                        "Cập nhập thành công!");
            } catch (InvalidNameException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            } catch (InvalidBirthdayException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            } catch (InvalidIdPersonException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            } catch (InvalidEmailException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            } catch (InvalidPhoneException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            } catch (ParseException ex) {
                Logger.getLogger(CustomerUpdateDialog.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void loadDataFromCustomer() {
            SimpleDateFormat dateFomart = new SimpleDateFormat("dd/MM/yyyy");
            boolean isMan = customer.getSex();
            String fullName = customer.getFullName();
            Date birtDate = customer.getBirthDay();
            String address = customer.getAddress();
            String idPerson = customer.getId_person();
            String phone = customer.getPhoneNumber();
            String email = customer.getEmail();
            this.startDate = customer.getStartDate();
            if (isMan) {
                manRB.setSelected(true);
            } else {
                womanRB.setSelected(true);
            }
            birthdayTxt.setText(dateFomart.format(birtDate));
            fullNametxt.setText(fullName);
            emailTxt.setText(email);
            addressTxt.setText(address);
            idPersonTxt.setText(idPerson);
            phoneNumberTxt.setText(phone);
            emailTxt.setText(email);
    }

    private void addBtnGroup() {
        btnGroupSex.add(womanRB);
        btnGroupSex.add(manRB);
    }

}