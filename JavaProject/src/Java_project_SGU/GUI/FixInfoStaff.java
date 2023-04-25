package Java_project_SGU.GUI;

import Java_project_SGU.BUS.TicketClerk;
import Java_project_SGU.BUS.Staff;
import Java_project_SGU.Exception.*;
import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class FixInfoStaff extends javax.swing.JDialog implements ActionListener {

    private StaffManageView staffManageView;
    private String ID_Staff;
    private TicketClerk ticketClerk;

    // constructor
    public FixInfoStaff(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

    }

    public FixInfoStaff(Dialog owner, boolean modal, List<String> infoStaff) {
        super(owner, modal);
        initComponents();
        addActionListener();
        this.staffManageView = (StaffManageView) owner;
        getInfoStaff(infoStaff);
        this.staffManageView = (StaffManageView) owner;
    }
    
    // addActionListener
    public void addActionListener() {
        this.finishJBT.addActionListener(this);
        this.cancelJBT.addActionListener(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField13 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fullNameJTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        birthDateJTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        phoneNumberJTF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        emailJTF = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        nameTaskJTF = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        startDateJTF = new javax.swing.JTextField();
        cancelJBT = new javax.swing.JButton();
        finishJBT = new javax.swing.JButton();
        sexJCB = new javax.swing.JComboBox<>();

        jTextField13.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextField13.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Ngày sinh");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("Địa chỉ");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SỬA THÔNG TIN NHÂN VIÊN");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Họ và tên");

        fullNameJTF.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        fullNameJTF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Giới tính");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Ngày sinh");

        birthDateJTF.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        birthDateJTF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        birthDateJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birthDateJTFActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("Số ĐT");

        phoneNumberJTF.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        phoneNumberJTF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        phoneNumberJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberJTFActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setText("Email");

        emailJTF.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        emailJTF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        emailJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailJTFActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setText("Chức vụ");

        nameTaskJTF.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        nameTaskJTF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        nameTaskJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTaskJTFActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel15.setText("Ngày bắt đầu");

        startDateJTF.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        startDateJTF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        startDateJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startDateJTFActionPerformed(evt);
            }
        });

        cancelJBT.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cancelJBT.setText("Hủy");
        cancelJBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelJBTActionPerformed(evt);
            }
        });

        finishJBT.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        finishJBT.setText("Lưu");
        finishJBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishJBTActionPerformed(evt);
            }
        });

        sexJCB.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        sexJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        sexJCB.setSelectedIndex(-1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(41, 41, 41)
                        .addComponent(fullNameJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(37, 37, 37))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(47, 47, 47)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel15))
                                .addGap(12, 12, 12)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phoneNumberJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(birthDateJTF, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                                .addComponent(sexJCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(emailJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameTaskJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(startDateJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(cancelJBT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(finishJBT)
                .addGap(96, 96, 96))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fullNameJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(sexJCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(birthDateJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(phoneNumberJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(emailJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(nameTaskJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(startDateJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelJBT)
                    .addComponent(finishJBT))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void birthDateJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birthDateJTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_birthDateJTFActionPerformed

    private void phoneNumberJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberJTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberJTFActionPerformed

    private void emailJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailJTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailJTFActionPerformed

    private void nameTaskJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTaskJTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTaskJTFActionPerformed

    private void startDateJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startDateJTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startDateJTFActionPerformed

    private void cancelJBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelJBTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelJBTActionPerformed

    private void finishJBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishJBTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_finishJBTActionPerformed

    // ActionListener
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton src = (JButton) e.getSource();
        if (src.equals(this.finishJBT)) {
            updateInfoStaff();
        } else if (src.equals(this.cancelJBT)) {
            
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FixInfoStaff dialog = new FixInfoStaff(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField birthDateJTF;
    private javax.swing.JButton cancelJBT;
    private javax.swing.JTextField emailJTF;
    private javax.swing.JButton finishJBT;
    private javax.swing.JTextField fullNameJTF;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField nameTaskJTF;
    private javax.swing.JTextField phoneNumberJTF;
    private javax.swing.JComboBox<String> sexJCB;
    private javax.swing.JTextField startDateJTF;
    // End of variables declaration//GEN-END:variables

    // hàm xử lý sự kiện
    public void getInfoStaff(List<String> infoStaff) {
        this.ID_Staff = infoStaff.get(0);
        this.fullNameJTF.setText(infoStaff.get(1));
        if (infoStaff.get(2).equals("Nam")) {
            this.sexJCB.setSelectedIndex(0);
        } else {
            this.sexJCB.setSelectedIndex(1);
        }
        this.birthDateJTF.setText(infoStaff.get(3));
        this.phoneNumberJTF.setText(infoStaff.get(4));
        this.emailJTF.setText(infoStaff.get(5));
        this.nameTaskJTF.setText(infoStaff.get(6));
        this.startDateJTF.setText(infoStaff.get(7));
    }

    public void updateInfoStaff() {
        String fullName = this.fullNameJTF.getText();
        boolean sex = true;
        if (this.sexJCB.getSelectedItem().equals("Nam")) {
            sex = true;
        } else if (this.sexJCB.getSelectedItem().equals("Nữ")) {
            sex = false;
        }
        String birthDate = this.birthDateJTF.getText();
        String phoneNumber = this.phoneNumberJTF.getText();
        String email = this.emailJTF.getText();
        String nameTask = this.nameTaskJTF.getText();
        String startDate = this.startDateJTF.getText();
        if (fullName.isEmpty() || birthDate.isEmpty() || phoneNumber.isEmpty() || phoneNumber.isEmpty() || email.isEmpty() || nameTask.isEmpty() || startDate.isEmpty()) {
            JOptionPane.showConfirmDialog(rootPane, "VUI LÒNG NHẬP ĐẦY ĐỦ THÔNG TIN");
        } else {
            try {
                this.ticketClerk = new TicketClerk(ID_Staff, fullName, sex, birthDate, phoneNumber, email, nameTask, startDate);
            } catch (InvalidNameException ex) {
                JOptionPane.showMessageDialog(rootPane, "HỌ TÊN KHÔNG HỢP LỆ");
            } catch (ParseException ex) {
            } catch (InvalidBirthdayException ex) {
                JOptionPane.showMessageDialog(rootPane, "NGÀY NHẬP VÀO KHÔNG HỢP LỆ");
            } catch (InvalidPhoneException ex) {
                JOptionPane.showMessageDialog(rootPane, "SỐ ĐIỆN THOẠI KHÔNG HỢP LỆ");
            } catch (InvalidEmailException ex) {
                JOptionPane.showMessageDialog(rootPane, "EMAIL KHÔNG HỢP LỆ");
            }
        }
    }
    
    public Staff getStaffAlterFix (){
        return this.ticketClerk;
    }
}
