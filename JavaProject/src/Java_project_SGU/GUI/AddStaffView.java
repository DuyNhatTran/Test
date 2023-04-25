package Java_project_SGU.GUI;

import Java_project_SGU.BUS.CusSupStaff;
import Java_project_SGU.BUS.TicketInspector;
import Java_project_SGU.BUS.ManagerStaffClient;
import Java_project_SGU.BUS.TicketClerk;
import Java_project_SGU.BUS.Staff;
import Java_project_SGU.BUS.CleaningStaff;
import Java_project_SGU.BUS.ManagerShowTimeMovie;
import Java_project_SGU.BUS.FoodDrinkSaler;
import Java_project_SGU.BUS.ManagerRoom;
import Java_project_SGU.Exception.InvalidAccountCusException;
import Java_project_SGU.Exception.InvalidBirthdayException;
import Java_project_SGU.Exception.InvalidEmailException;
import Java_project_SGU.Exception.InvalidIdPersonException;
import Java_project_SGU.Exception.InvalidNameException;
import Java_project_SGU.Exception.InvalidPasswordCusException;
import Java_project_SGU.Exception.InvalidPhoneException;
import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class AddStaffView extends javax.swing.JDialog implements ActionListener {
    private StaffManageView staffManageView;

    // constructor
    public AddStaffView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        addActionListener();
    }

    public AddStaffView(Dialog owner, boolean modal) {
        super(owner, modal);
        initComponents();
        addActionListener();
        this.staffManageView = (StaffManageView) owner;
    }

    // addAactionListener
    public void addActionListener() {
        this.finishJBT.addActionListener(this);
        this.cancelJBT.addActionListener(this);
        this.refeshJBT.addActionListener(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fullNameJTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        birthdayJTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        addressJTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        idPersonJTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        emailJTF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        phoneNumJTF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        startDateJTF = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        accountJTF = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        finishJBT = new javax.swing.JButton();
        cancelJBT = new javax.swing.JButton();
        nameTaskCB = new javax.swing.JComboBox<>();
        sexCB = new javax.swing.JComboBox<>();
        refeshJBT = new javax.swing.JButton();
        passwordPF = new javax.swing.JPasswordField();
        passwordAgainPF = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("THÊM NHÂN VIÊN");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Thông tin cơ bản");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Họ và tên");

        fullNameJTF.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        fullNameJTF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Ngày sinh");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Giới tính");

        birthdayJTF.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        birthdayJTF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Địa chỉ");

        addressJTF.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        addressJTF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("Số CCCD");

        idPersonJTF.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        idPersonJTF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("Email");

        emailJTF.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        emailJTF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setText("Số ĐTDĐ");

        phoneNumJTF.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        phoneNumJTF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setText("Chức vụ");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setText("Ngày bắt đầu");

        startDateJTF.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        startDateJTF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Tài khoản đăng nhập");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel12.setText("Tài khoản");

        accountJTF.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        accountJTF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel13.setText("Mật khẩu");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel14.setText("Nhập lại");

        finishJBT.setText("Hoàn tất");
        finishJBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishJBTActionPerformed(evt);
            }
        });

        cancelJBT.setText("Hủy");
        cancelJBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelJBTActionPerformed(evt);
            }
        });

        nameTaskCB.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        nameTaskCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nhân viên bán vé", "Nhân viên bán thức ăn", "Nhân viên soát vé", "Nhân viên vệ sinh", "Nhân viên hỗ trợ khách hàng", "Quản lí phòng rạp", "Quản lí  suất chiếu và phim", "Quản lí nhân viên và khách hàng" }));

        sexCB.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        sexCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));

        refeshJBT.setText("Làm mới");
        refeshJBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refeshJBTActionPerformed(evt);
            }
        });

        passwordPF.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        passwordPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordPFActionPerformed(evt);
            }
        });

        passwordAgainPF.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fullNameJTF, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                                    .addComponent(birthdayJTF, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                                    .addComponent(addressJTF, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                                    .addComponent(idPersonJTF, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                                    .addComponent(emailJTF, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                                    .addComponent(phoneNumJTF, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                                    .addComponent(startDateJTF, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                                    .addComponent(nameTaskCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sexCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(accountJTF, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                                    .addComponent(passwordPF)
                                    .addComponent(passwordAgainPF))))))
                .addContainerGap(9, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(refeshJBT)
                .addGap(18, 18, 18)
                .addComponent(cancelJBT)
                .addGap(18, 18, 18)
                .addComponent(finishJBT)
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fullNameJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(sexCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(birthdayJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(addressJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(idPersonJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(emailJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(phoneNumJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(nameTaskCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(startDateJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(accountJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(passwordPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(passwordAgainPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(finishJBT)
                    .addComponent(cancelJBT)
                    .addComponent(refeshJBT))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void finishJBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishJBTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_finishJBTActionPerformed

    private void cancelJBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelJBTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelJBTActionPerformed

    private void refeshJBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refeshJBTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refeshJBTActionPerformed

    private void passwordPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordPFActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddStaffView dialog = new AddStaffView(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField accountJTF;
    private javax.swing.JTextField addressJTF;
    private javax.swing.JTextField birthdayJTF;
    private javax.swing.JButton cancelJBT;
    private javax.swing.JTextField emailJTF;
    private javax.swing.JButton finishJBT;
    private javax.swing.JTextField fullNameJTF;
    private javax.swing.JTextField idPersonJTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> nameTaskCB;
    private javax.swing.JPasswordField passwordAgainPF;
    private javax.swing.JPasswordField passwordPF;
    private javax.swing.JTextField phoneNumJTF;
    private javax.swing.JButton refeshJBT;
    private javax.swing.JComboBox<String> sexCB;
    private javax.swing.JTextField startDateJTF;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src.equals(this.finishJBT)) {
            try {
                this.addNewStaff();
            } catch (ParseException ex) {
                Logger.getLogger(AddStaffView.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InvalidPasswordCusException ex) {
//                JOptionPane.showMessageDialog(rootPane, "MẬT KHẨU KHÔNG HỢP LỆ (ít nhất 8 kí tự)");
                Logger.getLogger(AddStaffView.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InvalidNameException ex) {
//                JOptionPane.showMessageDialog(rootPane, "HỌ TÊN KHÔNG HỢP LỆ");
                Logger.getLogger(AddStaffView.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InvalidEmailException ex) {
//                JOptionPane.showMessageDialog(rootPane, "EMAIL KHÔNG HỢP LỆ");
                Logger.getLogger(AddStaffView.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InvalidPhoneException ex) {
//                JOptionPane.showMessageDialog(rootPane, "SỐ ĐIỆN THOẠI KHÔNG HỢP LỆ");
                Logger.getLogger(AddStaffView.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InvalidBirthdayException ex) {
//                JOptionPane.showMessageDialog(rootPane, "NGÀY NHẬP VÀO KHÔNG HỢP LỆ");
                Logger.getLogger(AddStaffView.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InvalidAccountCusException ex) {
//                JOptionPane.showMessageDialog(rootPane, "TÊN TÀI KHOẢN KHÔNG HỢP LỆ");
                Logger.getLogger(AddStaffView.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InvalidIdPersonException ex) {
//                JOptionPane.showMessageDialog(rootPane, "SỐ CCCD KHÔNG HỢP LỆ");
                Logger.getLogger(AddStaffView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (src.equals(this.cancelJBT)) {
            this.dispose();
        }
        if (src.equals(this.refeshJBT)) {
            this.refeshPage();
        }
    }

    // hàm xử lý sự kiện
    public void addNewStaff() throws ParseException, InvalidPasswordCusException, InvalidNameException, 
            InvalidEmailException, InvalidPhoneException, InvalidBirthdayException, InvalidAccountCusException, InvalidIdPersonException {
        String fullName = this.fullNameJTF.getText();
        boolean sex = false;
        if(this.sexCB.getSelectedItem().toString().equals("Nam")) {
            sex = true;
        } else {
            sex = false;
        }
        String birthDate = this.birthdayJTF.getText();
        String address = this.addressJTF.getText();
        String idPerson = this.idPersonJTF.getText();
        String email = this.emailJTF.getText();
        String phoneNumber = this.phoneNumJTF.getText();
        String nameTask = this.nameTaskCB.getSelectedItem().toString();
        String startDate = this.startDateJTF.getText();
        String account = this.accountJTF.getText();
        String password = String.valueOf(this.passwordPF.getPassword());
        String repassword = String.valueOf(this.passwordAgainPF.getPassword());
        if(fullName.isEmpty() || birthDate.isEmpty() || address.isEmpty() || idPerson.isEmpty() || email.isEmpty() || 
                phoneNumber.isEmpty() || nameTask.isEmpty() || startDate.isEmpty() || account.isEmpty() || 
                password.isEmpty() || repassword.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "VUI LÒNG NHẬP ĐẦY ĐỦ THÔNG TIN");
        } else {
            if(password.equals(repassword)) {
                Staff staff = createStaff(fullName, sex, birthDate, address, idPerson, email, phoneNumber, startDate, account, password, repassword);
                this.staffManageView.callbackStaff(staff);
                JOptionPane.showMessageDialog(rootPane, "THÊM NHÂN VIÊN THÀNH CÔNG");
            } else {
                JOptionPane.showMessageDialog(rootPane, "MẬT KHẨU NHẬP LẠI KHÔNG TRÙNG KHỚP");
            }
        }
    }

    public Staff createStaff(String fullName, boolean sex, String birthday, String address, String idPerson, String email,
            String phoneNumber, String startDate, String account, String password, String rePassword) throws ParseException, InvalidPasswordCusException, InvalidNameException, InvalidEmailException, InvalidPhoneException, Java_project_SGU.Exception.InvalidBirthdayException, InvalidAccountCusException, InvalidIdPersonException {
        if (this.nameTaskCB.getSelectedItem().toString().equals("Nhân viên bán vé")) {
            TicketClerk ticketClerk = new TicketClerk();
            try {
                ticketClerk.setID_Staff(null);
                ticketClerk.setFullName(fullName);
                ticketClerk.setSex(sex);
                ticketClerk.setBirthDay(birthday);
                ticketClerk.setAddress(address);
                ticketClerk.setId_person(idPerson);
                ticketClerk.setEmail(email);
                ticketClerk.setPhoneNumber(phoneNumber);
                ticketClerk.setNameTask("Nhân viên bán vé");
                ticketClerk.setStartDate(startDate);
                ticketClerk.setAccount(account);
                ticketClerk.setPassword(password);
                ticketClerk.setIsWorking(true);
                ticketClerk.setIsDelete(false);
                ticketClerk.setSalaryDate(25000);
                ticketClerk.setNumOfDateWorked(0);
            } catch (InvalidBirthdayException ex) {
                JOptionPane.showMessageDialog(rootPane, "NGÀY NHẬP VÀO KHÔNG HỢP LỆ");
                throw ex;
            } catch (InvalidIdPersonException ex) {
                JOptionPane.showMessageDialog(rootPane, "SỐ CCCD KHÔNG HỢP LỆ");
                throw ex;
            } catch (InvalidEmailException ex) {
                JOptionPane.showMessageDialog(rootPane, "EMAIL KHÔNG HỢP LỆ");
                throw ex;
            } catch (InvalidPhoneException ex) {
                JOptionPane.showMessageDialog(rootPane, "SỐ ĐIỆN THOẠI KHÔNG HỢP LỆ");
                throw ex;
            } catch (InvalidAccountCusException ex) {
                JOptionPane.showMessageDialog(rootPane, "TÊN TÀI KHOẢN KHÔNG HỢP LỆ");
                throw ex;
            } catch (InvalidNameException ex) {
                JOptionPane.showMessageDialog(rootPane, "HỌ TÊN KHÔNG HỢP LỆ");
                throw ex;
            } catch (InvalidPasswordCusException ex) {
                JOptionPane.showMessageDialog(rootPane, "MẬT KHẨU KHÔNG HỢP LỆ (ít nhất 8 kí tự)");
                throw ex;
            }
            return ticketClerk;
        } else if (this.nameTaskCB.getSelectedItem().toString().equals("Nhân viên bán thức ăn")) {
            FoodDrinkSaler foodDrinkSaler = new FoodDrinkSaler();
            try {
                foodDrinkSaler.setID_Staff(null);
                foodDrinkSaler.setFullName(fullName); //
                foodDrinkSaler.setSex(sex);
                foodDrinkSaler.setBirthDay(birthday); //
                foodDrinkSaler.setAddress(address);
                foodDrinkSaler.setId_person(idPerson); //
                foodDrinkSaler.setEmail(email); // 
                foodDrinkSaler.setPhoneNumber(phoneNumber); // 
                foodDrinkSaler.setNameTask("Nhân viên bán thức ăn");
                foodDrinkSaler.setStartDate(startDate); //
                foodDrinkSaler.setAccount(account); // 
                foodDrinkSaler.setPassword(password);
                foodDrinkSaler.setIsWorking(true);
                foodDrinkSaler.setIsDelete(false);
                foodDrinkSaler.setSalaryDate(25000);
                foodDrinkSaler.setNumOfDateWorked(0);
            } catch (InvalidBirthdayException ex) {
                JOptionPane.showMessageDialog(rootPane, "NGÀY NHẬP VÀO KHÔNG HỢP LỆ");
                throw ex;
            } catch (InvalidIdPersonException ex) {
                JOptionPane.showMessageDialog(rootPane, "SỐ CCCD KHÔNG HỢP LỆ");
                throw ex;
            } catch (InvalidEmailException ex) {
                JOptionPane.showMessageDialog(rootPane, "EMAIL KHÔNG HỢP LỆ");
                throw ex;
            } catch (InvalidPhoneException ex) {
                JOptionPane.showMessageDialog(rootPane, "SỐ ĐIỆN THOẠI KHÔNG HỢP LỆ");
                throw ex;
            } catch (InvalidAccountCusException ex) {
                JOptionPane.showMessageDialog(rootPane, "TÊN TÀI KHOẢN KHÔNG HỢP LỆ");
                throw ex;
            } catch (InvalidNameException ex) {
                JOptionPane.showMessageDialog(rootPane, "HỌ TÊN KHÔNG HỢP LỆ");
                throw ex;
            } catch (InvalidPasswordCusException ex) {
                JOptionPane.showMessageDialog(rootPane, "MẬT KHẨU KHÔNG HỢP LỆ (ít nhất 8 kí tự)");
                throw ex;
            }
            return foodDrinkSaler;
        } else if (this.nameTaskCB.getSelectedItem().toString().equals("Nhân viên soát vé")) {
            TicketInspector ticketInspector = new TicketInspector();
            try {
                ticketInspector.setID_Staff(null);
                ticketInspector.setFullName(fullName); //
                ticketInspector.setSex(sex);
                ticketInspector.setBirthDay(birthday); //
                ticketInspector.setAddress(address);
                ticketInspector.setId_person(idPerson); //
                ticketInspector.setEmail(email); // 
                ticketInspector.setPhoneNumber(phoneNumber); // 
                ticketInspector.setNameTask("Nhân viên soát vé");
                ticketInspector.setStartDate(startDate); //
                ticketInspector.setAccount(account); // 
                ticketInspector.setPassword(password);
                ticketInspector.setIsWorking(true);
                ticketInspector.setIsDelete(false);
                ticketInspector.setSalaryDate(25000);
                ticketInspector.setNumOfDateWorked(0);
            } catch (InvalidBirthdayException ex) {
                JOptionPane.showMessageDialog(rootPane, "NGÀY NHẬP VÀO KHÔNG HỢP LỆ");
                throw ex;
            } catch (InvalidIdPersonException ex) {
                JOptionPane.showMessageDialog(rootPane, "SỐ CCCD KHÔNG HỢP LỆ");
                throw ex;
            } catch (InvalidEmailException ex) {
                JOptionPane.showMessageDialog(rootPane, "EMAIL KHÔNG HỢP LỆ");
                throw ex;
            } catch (InvalidPhoneException ex) {
                JOptionPane.showMessageDialog(rootPane, "SỐ ĐIỆN THOẠI KHÔNG HỢP LỆ");
                throw ex;
            } catch (InvalidAccountCusException ex) {
                JOptionPane.showMessageDialog(rootPane, "TÊN TÀI KHOẢN KHÔNG HỢP LỆ");
                throw ex;
            } catch (InvalidNameException ex) {
                JOptionPane.showMessageDialog(rootPane, "HỌ TÊN KHÔNG HỢP LỆ");
                throw ex;
            } catch (InvalidPasswordCusException ex) {
                JOptionPane.showMessageDialog(rootPane, "MẬT KHẨU KHÔNG HỢP LỆ (ít nhất 8 kí tự)");
                throw ex;
            }
            return ticketInspector;
        } else if (this.nameTaskCB.getSelectedItem().toString().equals("Nhân viên vệ sinh")) {
            CleaningStaff cleaningStaff = new CleaningStaff();
            try {
                cleaningStaff.setID_Staff(null);
                cleaningStaff.setFullName(fullName); //
                cleaningStaff.setSex(sex);
                cleaningStaff.setBirthDay(birthday); //
                cleaningStaff.setAddress(address);
                cleaningStaff.setId_person(idPerson); //
                cleaningStaff.setEmail(email); // 
                cleaningStaff.setPhoneNumber(phoneNumber); // 
                cleaningStaff.setNameTask("Nhân viên vệ sinh");
                cleaningStaff.setStartDate(startDate); //
                cleaningStaff.setAccount(account); // 
                cleaningStaff.setPassword(password);
                cleaningStaff.setIsWorking(true);
                cleaningStaff.setIsDelete(false);
                cleaningStaff.setSalaryDate(25000);
                cleaningStaff.setNumOfDateWorked(0);
            } catch (InvalidBirthdayException ex) {
                JOptionPane.showMessageDialog(rootPane, "NGÀY NHẬP VÀO KHÔNG HỢP LỆ");
                throw ex;
            } catch (InvalidIdPersonException ex) {
                JOptionPane.showMessageDialog(rootPane, "SỐ CCCD KHÔNG HỢP LỆ");
                throw ex;
            } catch (InvalidEmailException ex) {
                JOptionPane.showMessageDialog(rootPane, "EMAIL KHÔNG HỢP LỆ");
                throw ex;
            } catch (InvalidPhoneException ex) {
                JOptionPane.showMessageDialog(rootPane, "SỐ ĐIỆN THOẠI KHÔNG HỢP LỆ");
                throw ex;
            } catch (InvalidAccountCusException ex) {
                JOptionPane.showMessageDialog(rootPane, "TÊN TÀI KHOẢN KHÔNG HỢP LỆ");
                throw ex;
            } catch (InvalidNameException ex) {
                JOptionPane.showMessageDialog(rootPane, "HỌ TÊN KHÔNG HỢP LỆ");
                throw ex;
            } catch (InvalidPasswordCusException ex) {
                JOptionPane.showMessageDialog(rootPane, "MẬT KHẨU KHÔNG HỢP LỆ (ít nhất 8 kí tự)");
                throw ex;
            }
            return cleaningStaff;
        } else if (this.nameTaskCB.getSelectedItem().toString().equals("Nhân viên hỗ trợ khách hàng")) {
            CusSupStaff cusSupStaff = new CusSupStaff();
            try {
                cusSupStaff.setID_Staff(null);
                cusSupStaff.setFullName(fullName); //
                cusSupStaff.setSex(sex);
                cusSupStaff.setBirthDay(birthday); //
                cusSupStaff.setAddress(address);
                cusSupStaff.setId_person(idPerson); //
                cusSupStaff.setEmail(email); // 
                cusSupStaff.setPhoneNumber(phoneNumber); // 
                cusSupStaff.setNameTask("Nhân viên hỗ trợ khách hàng");
                cusSupStaff.setStartDate(startDate); //
                cusSupStaff.setAccount(account); // 
                cusSupStaff.setPassword(password);
                cusSupStaff.setIsWorking(true);
                cusSupStaff.setIsDelete(false);
                cusSupStaff.setSalaryDate(30000);
                cusSupStaff.setNumOfDateWorked(0);
            } catch (InvalidBirthdayException ex) {
                JOptionPane.showMessageDialog(rootPane, "NGÀY NHẬP VÀO KHÔNG HỢP LỆ");
                throw ex;
            } catch (InvalidIdPersonException ex) {
                JOptionPane.showMessageDialog(rootPane, "SỐ CCCD KHÔNG HỢP LỆ");
                throw ex;
            } catch (InvalidEmailException ex) {
                JOptionPane.showMessageDialog(rootPane, "EMAIL KHÔNG HỢP LỆ");
                throw ex;
            } catch (InvalidPhoneException ex) {
                JOptionPane.showMessageDialog(rootPane, "SỐ ĐIỆN THOẠI KHÔNG HỢP LỆ");
                throw ex;
            } catch (InvalidAccountCusException ex) {
                JOptionPane.showMessageDialog(rootPane, "TÊN TÀI KHOẢN KHÔNG HỢP LỆ");
                throw ex;
            } catch (InvalidNameException ex) {
                JOptionPane.showMessageDialog(rootPane, "HỌ TÊN KHÔNG HỢP LỆ");
                throw ex;
            } catch (InvalidPasswordCusException ex) {
                JOptionPane.showMessageDialog(rootPane, "MẬT KHẨU KHÔNG HỢP LỆ (ít nhất 8 kí tự)");
                throw ex;
            }
            return cusSupStaff;
        } else if (this.nameTaskCB.getSelectedItem().toString().equals("Quản lí phòng rạp")) {
            ManagerRoom managerRoom = new ManagerRoom();
            try {
                managerRoom.setID_Staff(null);
                managerRoom.setFullName(fullName); //
                managerRoom.setSex(sex);
                managerRoom.setBirthDay(birthday); //
                managerRoom.setAddress(address);
                managerRoom.setId_person(idPerson); //
                managerRoom.setEmail(email); // 
                managerRoom.setPhoneNumber(phoneNumber); // 
                managerRoom.setNameTask("Quản lí phòng rạp");
                managerRoom.setStartDate(startDate); //
                managerRoom.setAccount(account); // 
                managerRoom.setPassword(password);
                managerRoom.setIsWorking(true);
                managerRoom.setIsDelete(false);
                managerRoom.setSalaryDate(35000);
                managerRoom.setNumOfDateWorked(0);
            } catch (InvalidBirthdayException ex) {
                JOptionPane.showMessageDialog(rootPane, "NGÀY NHẬP VÀO KHÔNG HỢP LỆ");
                throw ex;
            } catch (InvalidIdPersonException ex) {
                JOptionPane.showMessageDialog(rootPane, "SỐ CCCD KHÔNG HỢP LỆ");
                throw ex;
            } catch (InvalidEmailException ex) {
                JOptionPane.showMessageDialog(rootPane, "EMAIL KHÔNG HỢP LỆ");
                throw ex;
            } catch (InvalidPhoneException ex) {
                JOptionPane.showMessageDialog(rootPane, "SỐ ĐIỆN THOẠI KHÔNG HỢP LỆ");
                throw ex;
            } catch (InvalidAccountCusException ex) {
                JOptionPane.showMessageDialog(rootPane, "TÊN TÀI KHOẢN KHÔNG HỢP LỆ");
                throw ex;
            } catch (InvalidNameException ex) {
                JOptionPane.showMessageDialog(rootPane, "HỌ TÊN KHÔNG HỢP LỆ");
                throw ex;
            } catch (InvalidPasswordCusException ex) {
                JOptionPane.showMessageDialog(rootPane, "MẬT KHẨU KHÔNG HỢP LỆ (ít nhất 8 kí tự)");
                throw ex;
            }
            return managerRoom;
        } else if (this.nameTaskCB.getSelectedItem().toString().equals("Quản lí  suất chiếu và phim")) {
            ManagerShowTimeMovie managerShowTimeMovie = new ManagerShowTimeMovie();
            try {
                managerShowTimeMovie.setID_Staff(null);
                managerShowTimeMovie.setFullName(fullName); //
                managerShowTimeMovie.setSex(sex);
                managerShowTimeMovie.setBirthDay(birthday); //
                managerShowTimeMovie.setAddress(address);
                managerShowTimeMovie.setId_person(idPerson); //
                managerShowTimeMovie.setEmail(email); // 
                managerShowTimeMovie.setPhoneNumber(phoneNumber); // 
                managerShowTimeMovie.setNameTask("Quản lí  suất chiếu và phim");
                managerShowTimeMovie.setStartDate(startDate); //
                managerShowTimeMovie.setAccount(account); // 
                managerShowTimeMovie.setPassword(password);
                managerShowTimeMovie.setIsWorking(true);
                managerShowTimeMovie.setIsDelete(false);
                managerShowTimeMovie.setSalaryDate(35000);
                managerShowTimeMovie.setNumOfDateWorked(0);
            } catch (InvalidBirthdayException ex) {
                JOptionPane.showMessageDialog(rootPane, "NGÀY NHẬP VÀO KHÔNG HỢP LỆ");
                throw ex;
            } catch (InvalidIdPersonException ex) {
                JOptionPane.showMessageDialog(rootPane, "SỐ CCCD KHÔNG HỢP LỆ");
                throw ex;
            } catch (InvalidEmailException ex) {
                JOptionPane.showMessageDialog(rootPane, "EMAIL KHÔNG HỢP LỆ");
                throw ex;
            } catch (InvalidPhoneException ex) {
                JOptionPane.showMessageDialog(rootPane, "SỐ ĐIỆN THOẠI KHÔNG HỢP LỆ");
                throw ex;
            } catch (InvalidAccountCusException ex) {
                JOptionPane.showMessageDialog(rootPane, "TÊN TÀI KHOẢN KHÔNG HỢP LỆ");
                throw ex;
            } catch (InvalidNameException ex) {
                JOptionPane.showMessageDialog(rootPane, "HỌ TÊN KHÔNG HỢP LỆ");
                throw ex;
            } catch (InvalidPasswordCusException ex) {
                JOptionPane.showMessageDialog(rootPane, "MẬT KHẨU KHÔNG HỢP LỆ (ít nhất 8 kí tự)");
                throw ex;
            }
            return managerShowTimeMovie;
        } else if (this.nameTaskCB.getSelectedItem().toString().equals("Quản lí nhân viên và khách hàng")) {
            ManagerStaffClient managerStaffClient = new ManagerStaffClient();
            try {
                managerStaffClient.setID_Staff(null);
                managerStaffClient.setFullName(fullName); //
                managerStaffClient.setSex(sex);
                managerStaffClient.setBirthDay( birthday); //
                managerStaffClient.setAddress(address);
                managerStaffClient.setId_person(idPerson); //
                managerStaffClient.setEmail(email); // 
                managerStaffClient.setPhoneNumber(phoneNumber); // 
                managerStaffClient.setNameTask("Quản lí nhân viên và khách hàng");
                managerStaffClient.setStartDate(startDate); //
                managerStaffClient.setAccount(account); // 
                managerStaffClient.setPassword(password);
                managerStaffClient.setIsWorking(true);
                managerStaffClient.setIsDelete(false);
                managerStaffClient.setSalaryDate(35000);
                managerStaffClient.setNumOfDateWorked(0);
            } catch (InvalidBirthdayException ex) {
                JOptionPane.showMessageDialog(rootPane, "NGÀY NHẬP VÀO KHÔNG HỢP LỆ");
                throw ex;
            } catch (InvalidIdPersonException ex) {
                JOptionPane.showMessageDialog(rootPane, "SỐ CCCD KHÔNG HỢP LỆ");
                throw ex;
            } catch (InvalidEmailException ex) {
                JOptionPane.showMessageDialog(rootPane, "EMAIL KHÔNG HỢP LỆ");
                throw ex;
            } catch (InvalidPhoneException ex) {
                JOptionPane.showMessageDialog(rootPane, "SỐ ĐIỆN THOẠI KHÔNG HỢP LỆ");
                throw ex;
            } catch (InvalidAccountCusException ex) {
                JOptionPane.showMessageDialog(rootPane, "TÊN TÀI KHOẢN KHÔNG HỢP LỆ");
                throw ex;
            } catch (InvalidNameException ex) {
                JOptionPane.showMessageDialog(rootPane, "HỌ TÊN KHÔNG HỢP LỆ");
                throw ex;
            } catch (InvalidPasswordCusException ex) {
                JOptionPane.showMessageDialog(rootPane, "MẬT KHẨU KHÔNG HỢP LỆ (ít nhất 8 kí tự)");
                throw ex;
            }
            return managerStaffClient;
        }
        return null;
    }
    
    // refesh page
    public void refeshPage() {
        this.fullNameJTF.setText("");
        this.sexCB.setSelectedIndex(0);
        this.birthdayJTF.setText("");
        this.addressJTF.setText("");
        this.idPersonJTF.setText("");
        this.emailJTF.setText("");
        this.phoneNumJTF.setText("");
        this.nameTaskCB.setSelectedIndex(0);
        this.startDateJTF.setText("");
        this.accountJTF.setText("");
        this.passwordPF.setText("");
        this.passwordAgainPF.setText("");
    }

}
