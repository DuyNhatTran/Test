package Java_project_SGU.GUI;

import Java_project_SGU.BUS.CusSupStaff;
import Java_project_SGU.BUS.TicketInspector;
import Java_project_SGU.BUS.ManagerStaffClient;
import Java_project_SGU.BUS.TicketClerk;
import Java_project_SGU.BUS.Staff;
import Java_project_SGU.BUS.ClassListStaff;
import Java_project_SGU.BUS.CleaningStaff;
import Java_project_SGU.BUS.ManagerShowTimeMovie;
import Java_project_SGU.BUS.FoodDrinkSaler;
import Java_project_SGU.BUS.ManagerRoom;
import Java_project_SGU.DAL.WriteStaffSqlImp;
import Java_project_SGU.DAL.ReadStaffSqlImp;
import Java_project_SGU.Exception.*;
import Java_project_SGU.Controller.StaffControllerImp;
import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class StaffManageView extends javax.swing.JDialog implements ActionListener {

    private AddStaffView addStaffView;
    private FixInfoStaff fixInfoStaff;
    private StaffControllerImp staffControllerImp;
    // list Staff
    private ClassListStaff listStaff;
    // liên quan đến dữ liệu
    private WriteStaffSqlImp writeStaffSqlImp;
    private ReadStaffSqlImp readStaffSqlImp;
    // liên quan đến bảng
    private DefaultTableModel tableModelAllStaff; //
    private int selectRowStaffAll;
    private DefaultTableModel tableModelTicketClerk; // 
    private int selectRowTicketClerk;
    private DefaultTableModel tableModelTicketInspector; // 
    private int selectRowTicketInspector;
    private DefaultTableModel tableModelFoodDrinkSaler; // 
    private int selectRowFoodDrinkSaler;
    private DefaultTableModel tableModelCusSupStaff; // 
    private int selectRowCusSupStaff;
    private DefaultTableModel tableModelCleaningStaff; // 
    private int selectRowCleaningStaff;
    private DefaultTableModel tableModelManagerRoom; // 
    private int selectRowManagerRoom;
    private DefaultTableModel tableModelManagerShowTimeMovie; // 
    private int selectRowManagerShowTimeMovie;
    private DefaultTableModel tableModelMangerStaffClient;
    private int selectRowMangerStaffClient;

    // constructor
    
    public StaffManageView() {
    }

    public StaffManageView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.addActionListener();
        this.tableInitialization();
        this.addJRadioButtonGroup();
        this.staffControllerImp = new StaffControllerImp();
        this.writeStaffSqlImp = new WriteStaffSqlImp();
        this.readStaffSqlImp = new ReadStaffSqlImp();
        this.listStaff = new ClassListStaff(readStaffSqlImp.readStaffFromDataSource());
        this.updateAutoId();
        this.loadStaffsToTable(listStaff.getListStaff());
    }

    public StaffManageView(Dialog owner, boolean modal) {
        super(owner, modal);
        initComponents();
        this.addActionListener();
        this.tableInitialization();
        this.writeStaffSqlImp = new WriteStaffSqlImp();
        this.readStaffSqlImp = new ReadStaffSqlImp();
        this.listStaff = new ClassListStaff(readStaffSqlImp.readStaffFromDataSource());
        this.updateAutoId();
        this.loadStaffsToTable(listStaff.getListStaff());
    }

    // addActionListener
    public void addActionListener() {
        this.addStaffBTN.addActionListener(this);
        this.deleteBTN.addActionListener(this);
        this.refeshBTN.addActionListener(this);
        this.fixBTN.addActionListener(this);
        this.sortNameASCJRB.addActionListener(this);
        this.sortNameDESCJRB.addActionListener(this);
        this.sortStartDateASCJRB.addActionListener(this);
        this.sortStartDateDESCJRB.addActionListener(this);
        this.findNameJRB.addActionListener(this);
        this.findPhoneNumberJRB.addActionListener(this);
        this.findStartDateJRB.addActionListener(this);
        this.searchBTN.addActionListener(this);
        this.refeshBTN.addActionListener(this);
    }
    
    // addJRadioButtonGroup
    public void addJRadioButtonGroup() {
        this.buttonGroupSort.add(this.sortNameASCJRB);
        this.buttonGroupSort.add(this.sortNameDESCJRB);
        this.buttonGroupSort.add(this.sortStartDateASCJRB);
        this.buttonGroupSort.add(this.sortStartDateDESCJRB);
        
        this.buttonGroupSearch.add(this.findNameJRB);
        this.buttonGroupSearch.add(this.findStartDateJRB);
        this.buttonGroupSearch.add(this.findPhoneNumberJRB);
        
        this.findNameJRB.addActionListener(this);
        this.findPhoneNumberJRB.addActionListener(this);
        this.findStartDateJRB.addActionListener(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupSort = new javax.swing.ButtonGroup();
        buttonGroupSearch = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        sortNameASCJRB = new javax.swing.JRadioButton();
        sortNameDESCJRB = new javax.swing.JRadioButton();
        sortStartDateASCJRB = new javax.swing.JRadioButton();
        sortStartDateDESCJRB = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        findNameJRB = new javax.swing.JRadioButton();
        findStartDateJRB = new javax.swing.JRadioButton();
        findPhoneNumberJRB = new javax.swing.JRadioButton();
        fillNameJTF = new javax.swing.JTextField();
        fillStartDateJTF = new javax.swing.JTextField();
        fillPhoneNumberJTF = new javax.swing.JTextField();
        searchBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        addStaffBTN = new javax.swing.JButton();
        fixBTN = new javax.swing.JButton();
        deleteBTN = new javax.swing.JButton();
        refeshBTN = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ticketClerkTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        foodDrinkSalerTable = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        ticketInspectorTable = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        cusSupStaffTable = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        cleaningStaffTable = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        managerRoomTable = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        managerShowTimeMovieTable = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        managerStaffClientTable = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        allStaffTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Sắp xếp"));
        jPanel1.setToolTipText("Sắp xếp");
        jPanel1.setName(""); // NOI18N

        sortNameASCJRB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sortNameASCJRB.setText("Theo tên nhân viên a-z");
        sortNameASCJRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortNameASCJRBActionPerformed(evt);
            }
        });

        sortNameDESCJRB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sortNameDESCJRB.setText("Theo tên nhân viên z-a");

        sortStartDateASCJRB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sortStartDateASCJRB.setText("Theo ngày đăng kí gần nhất");

        sortStartDateDESCJRB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sortStartDateDESCJRB.setText("Theo ngày đăng kí xa nhất");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sortNameASCJRB)
                    .addComponent(sortNameDESCJRB))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sortStartDateASCJRB)
                    .addComponent(sortStartDateDESCJRB))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sortNameASCJRB)
                    .addComponent(sortStartDateASCJRB))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sortNameDESCJRB)
                    .addComponent(sortStartDateDESCJRB))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm kiếm"));

        findNameJRB.setText("Theo tên");

        findStartDateJRB.setText("Theo ngày bắt đầu");

        findPhoneNumberJRB.setText("Theo SĐT");

        searchBTN.setText("Tìm kiếm");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(findNameJRB)
                    .addComponent(findStartDateJRB)
                    .addComponent(findPhoneNumberJRB))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(fillStartDateJTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                    .addComponent(fillNameJTF, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(fillPhoneNumberJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchBTN)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(findNameJRB)
                    .addComponent(fillNameJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(findStartDateJRB)
                    .addComponent(fillStartDateJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(findPhoneNumberJRB)
                    .addComponent(fillPhoneNumberJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBTN))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("DANH SÁCH NHÂN VIÊN");

        addStaffBTN.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addStaffBTN.setText("THÊM NHÂN VIÊN");

        fixBTN.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fixBTN.setText("SỬA NHÂN VIÊN");
        fixBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fixBTNActionPerformed(evt);
            }
        });

        deleteBTN.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        deleteBTN.setText("XÓA NHÂN VIÊN");

        refeshBTN.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        refeshBTN.setText("LÀM MỚI TRANG");

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        ticketClerkTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Họ tên", "Giới tính", "Ngày sinh ", "SĐT", "Email", "Chức vụ", "Ngày bắt đầu"
            }
        ));
        jScrollPane2.setViewportView(ticketClerkTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1132, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Nhân viên bán vé", jPanel3);

        foodDrinkSalerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Họ tên", "Giới tính", "Ngày sinh ", "SĐT", "Email", "Chức vụ", "Ngày bắt đầu"
            }
        ));
        jScrollPane8.setViewportView(foodDrinkSalerTable);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 1132, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Nhân viên bán thức ăn ", jPanel4);

        ticketInspectorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Họ tên", "Giới tính", "Ngày sinh ", "SĐT", "Email", "Chức vụ", "Ngày bắt đầu"
            }
        ));
        jScrollPane9.setViewportView(ticketInspectorTable);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 1132, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Nhân viên soát vé", jPanel5);

        cusSupStaffTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Họ tên", "Giới tính", "Ngày sinh ", "SĐT", "Email", "Chức vụ", "Ngày bắt đầu"
            }
        ));
        jScrollPane7.setViewportView(cusSupStaffTable);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 1132, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Nhân viên hỗ trợ khách hàng", jPanel6);

        cleaningStaffTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Họ tên", "Giới tính", "Ngày sinh ", "SĐT", "Email", "Chức vụ", "Ngày bắt đầu"
            }
        ));
        jScrollPane6.setViewportView(cleaningStaffTable);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 1132, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Nhân viên vệ sinh", jPanel7);

        managerRoomTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Họ tên", "Giới tính", "Ngày sinh ", "SĐT", "Email", "Chức vụ", "Ngày bắt đầu"
            }
        ));
        jScrollPane5.setViewportView(managerRoomTable);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1132, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Quản lí phòng rạp", jPanel8);

        managerShowTimeMovieTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Họ tên", "Giới tính", "Ngày sinh ", "SĐT", "Email", "Chức vụ", "Ngày bắt đầu"
            }
        ));
        jScrollPane4.setViewportView(managerShowTimeMovieTable);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1132, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Quản lí  suất chiếu, phim", jPanel9);

        managerStaffClientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Họ tên", "Giới tính", "Ngày sinh ", "SĐT", "Email", "Chức vụ", "Ngày bắt đầu"
            }
        ));
        jScrollPane1.setViewportView(managerStaffClientTable);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1132, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Quản lý nhân sự, khách hàng", jPanel10);

        allStaffTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Họ tên", "Giới tính", "Ngày sinh ", "SĐT", "Email", "Chức vụ", "Ngày bắt đầu"
            }
        ));
        jScrollPane3.setViewportView(allStaffTable);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1132, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tất cả", jPanel11);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(530, 530, 530))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(deleteBTN)
                        .addGap(127, 127, 127)
                        .addComponent(refeshBTN)
                        .addGap(87, 87, 87))))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(587, 587, 587)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(79, 79, 79))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addStaffBTN)
                                .addGap(148, 148, 148)
                                .addComponent(fixBTN)))
                        .addGap(0, 677, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addStaffBTN)
                    .addComponent(fixBTN)
                    .addComponent(deleteBTN)
                    .addComponent(refeshBTN))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sortNameASCJRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortNameASCJRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sortNameASCJRBActionPerformed

    private void fixBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fixBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fixBTNActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                StaffManageView dialog = new StaffManageView(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton addStaffBTN;
    private javax.swing.JTable allStaffTable;
    private javax.swing.ButtonGroup buttonGroupSearch;
    private javax.swing.ButtonGroup buttonGroupSort;
    private javax.swing.JTable cleaningStaffTable;
    private javax.swing.JTable cusSupStaffTable;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JTextField fillNameJTF;
    private javax.swing.JTextField fillPhoneNumberJTF;
    private javax.swing.JTextField fillStartDateJTF;
    private javax.swing.JRadioButton findNameJRB;
    private javax.swing.JRadioButton findPhoneNumberJRB;
    private javax.swing.JRadioButton findStartDateJRB;
    private javax.swing.JButton fixBTN;
    private javax.swing.JTable foodDrinkSalerTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable managerRoomTable;
    private javax.swing.JTable managerShowTimeMovieTable;
    private javax.swing.JTable managerStaffClientTable;
    private javax.swing.JButton refeshBTN;
    private javax.swing.JButton searchBTN;
    private javax.swing.JRadioButton sortNameASCJRB;
    private javax.swing.JRadioButton sortNameDESCJRB;
    private javax.swing.JRadioButton sortStartDateASCJRB;
    private javax.swing.JRadioButton sortStartDateDESCJRB;
    private javax.swing.JTable ticketClerkTable;
    private javax.swing.JTable ticketInspectorTable;
    // End of variables declaration//GEN-END:variables

    // actionListener
    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src.equals(this.addStaffBTN)) {
            this.addStaffView = new AddStaffView(this, true);
            this.addStaffView.setVisible(true);
        } else if (src.equals(this.deleteBTN)) {
            deleteStaff();
        } else if (src.equals(this.fixBTN)) {
            updateInfoStaff();
        } else if(src.equals(this.sortNameASCJRB)) {
            this.listStaff.sortStaffNameASC();
            this.loadStaffsToTable(listStaff.getListStaff());
        } else if(src.equals(this.sortNameDESCJRB)) {
            this.listStaff.sortStaffNameDESC();
            this.loadStaffsToTable(listStaff.getListStaff());
        } else if(src.equals(this.sortStartDateASCJRB)) {
            this.listStaff.sortStaffStartDateNear();
            this.loadStaffsToTable(listStaff.getListStaff());
        } else if(src.equals(this.sortStartDateDESCJRB)) {
            this.listStaff.sortStaffStartDateFar();
            this.loadStaffsToTable(listStaff.getListStaff());
        } else if(src.equals(this.searchBTN)) {
            if (this.findNameJRB.isSelected()) {
                try {
                    findStaffByName();
                } catch (InvalidNameException ex) {
                    Logger.getLogger(StaffManageView.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if(this.findStartDateJRB.isSelected()) {
                try {
                    findStaffByStartDate();
                } catch (InvalidBirthdayException ex) {
                    Logger.getLogger(StaffManageView.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParseException ex) {
                    Logger.getLogger(StaffManageView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }  else if(this.findPhoneNumberJRB.isSelected()) {
                try {
                    findStaffByPhoneNumber();
                } catch (InvalidPhoneException ex) {
                    Logger.getLogger(StaffManageView.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "VUI LÒNG CHỌN PHƯƠNG THỨC TÌM KIẾM");
            }
        } else if(src.equals(this.refeshBTN)) {
            refeshPage();
        }

    }

    public void tableInitialization() {
        tableModelAllStaff = (DefaultTableModel) this.allStaffTable.getModel();
        tableModelTicketClerk = (DefaultTableModel) ticketClerkTable.getModel();
        tableModelTicketInspector = (DefaultTableModel) ticketInspectorTable.getModel();
        tableModelFoodDrinkSaler = (DefaultTableModel) foodDrinkSalerTable.getModel();
        tableModelCusSupStaff = (DefaultTableModel) cusSupStaffTable.getModel();
        tableModelCleaningStaff = (DefaultTableModel) cleaningStaffTable.getModel();
        tableModelManagerRoom = (DefaultTableModel) managerRoomTable.getModel();
        tableModelManagerShowTimeMovie = (DefaultTableModel) managerShowTimeMovieTable.getModel();
        tableModelMangerStaffClient = (DefaultTableModel) managerStaffClientTable.getModel();

        selectRowStaffAll = -1;
        selectRowTicketClerk = -1;
        selectRowTicketInspector = -1;
        selectRowFoodDrinkSaler = -1;
        selectRowCusSupStaff = -1;
        selectRowCleaningStaff = -1;
        selectRowManagerRoom = -1;
        selectRowManagerShowTimeMovie = -1;
        selectRowMangerStaffClient = -1;
    }

    // hàm xử lý sự kiện
    // xài kiểu này là đa hình nè 
    // thêm nhân viên
    public void callbackStaff(Staff staff) {
        Object[] row = (Object[]) loadStaffToRow(staff);
        this.tableModelAllStaff.addRow(row);
        this.writeStaffSqlImp.insertData(staff);
        this.listStaff.addStaff(staff);
        if (staff instanceof TicketClerk) {
            this.tableModelTicketClerk.addRow(row);
        } else if (staff instanceof FoodDrinkSaler) {
            this.tableModelFoodDrinkSaler.addRow(row);
        } else if (staff instanceof TicketInspector) {
            this.tableModelTicketInspector.addRow(row);
        } else if (staff instanceof CleaningStaff) {
            this.tableModelCleaningStaff.addRow(row);
        } else if (staff instanceof CusSupStaff) {
            this.tableModelCusSupStaff.addRow(row);
        } else if (staff instanceof ManagerRoom) {
            this.tableModelManagerRoom.addRow(row);
        } else if (staff instanceof ManagerShowTimeMovie) {
            this.tableModelManagerShowTimeMovie.addRow(row);
        } else if (staff instanceof ManagerStaffClient) {
            this.tableModelMangerStaffClient.addRow(row);
        }
    }

    private void loadStaffsToTable(List<Staff> staffs) {
        this.tableModelAllStaff.setRowCount(0);
        this.tableModelTicketClerk.setRowCount(0);
        this.tableModelFoodDrinkSaler.setRowCount(0);
        this.tableModelTicketInspector.setRowCount(0);
        this.tableModelCleaningStaff.setRowCount(0);
        this.tableModelCusSupStaff.setRowCount(0);
        this.tableModelManagerRoom.setRowCount(0);
        this.tableModelManagerShowTimeMovie.setRowCount(0);
        this.tableModelMangerStaffClient.setRowCount(0);
        for (Staff staff : staffs) {
            Object[] row = (Object[]) loadStaffToRow(staff);
            this.tableModelAllStaff.addRow(row);
            if (staff instanceof TicketClerk) {
                this.tableModelTicketClerk.addRow(row);
            } else if (staff instanceof FoodDrinkSaler) {
                this.tableModelFoodDrinkSaler.addRow(row);
            } else if (staff instanceof TicketInspector) {
                this.tableModelTicketInspector.addRow(row);
            } else if (staff instanceof CleaningStaff) {
                this.tableModelCleaningStaff.addRow(row);
            } else if (staff instanceof CusSupStaff) {
                this.tableModelCusSupStaff.addRow(row);
            } else if (staff instanceof ManagerRoom) {
                this.tableModelManagerRoom.addRow(row);
            } else if (staff instanceof ManagerShowTimeMovie) {
                this.tableModelManagerShowTimeMovie.addRow(row);
            } else if (staff instanceof ManagerStaffClient) {
                this.tableModelMangerStaffClient.addRow(row);
            }
        }
    }

    private Object loadStaffToRow(Staff staff) {
        String sex = (staff.getSex()) ? "Nam" : "Nữ";
        Object[] row = new Object[]{
            staff.getID_Staff(), staff.getFullName(), sex, new SimpleDateFormat("dd/MM/yyyy").format(staff.getBirthDay()),
            staff.getPhoneNumber(), staff.getEmail(), staff.getNameTask(), new SimpleDateFormat("dd/MM/yyyy").format(staff.getStartDate())
        };
        return row;
    }

    // xóa nhân viên
    private void deleteStaff() {
        this.selectRowStaffAll = this.allStaffTable.getSelectedRow();
        this.selectRowTicketClerk = this.ticketClerkTable.getSelectedRow();
        this.selectRowFoodDrinkSaler = this.foodDrinkSalerTable.getSelectedRow();
        this.selectRowTicketInspector = this.ticketInspectorTable.getSelectedRow();
        this.selectRowCleaningStaff = this.cleaningStaffTable.getSelectedRow();
        this.selectRowCusSupStaff = this.cusSupStaffTable.getSelectedRow();
        this.selectRowManagerRoom = this.managerRoomTable.getSelectedRow();
        this.selectRowManagerShowTimeMovie = this.managerShowTimeMovieTable.getSelectedRow();
        this.selectRowCleaningStaff = this.managerStaffClientTable.getSelectedRow();
        if (selectRowStaffAll > -1) {
            int rsConfirm = JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc muốn xóa dữ liệu? (Dữ liệu sẽ không được khôi phục!)");
            if (rsConfirm == JOptionPane.OK_OPTION) {
                String object = (String) tableModelAllStaff.getValueAt(selectRowStaffAll, 0);
                this.writeStaffSqlImp.deleteStaff(object);
                this.listStaff.removeStaff(object);
                loadStaffsToTable(listStaff.getListStaff());
                this.selectRowCleaningStaff = -1;
            }
        } else if (selectRowTicketClerk > -1) {
            int rsConfirm = JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc muốn xóa dữ liệu? (Dữ liệu sẽ không được khôi phục!)");
            if (rsConfirm == JOptionPane.OK_OPTION) {
                String object = (String) tableModelTicketClerk.getValueAt(selectRowTicketClerk, 0);
                this.writeStaffSqlImp.deleteStaff(object);
                this.listStaff.removeStaff(object);
                loadStaffsToTable(listStaff.getListStaff());
                this.selectRowCleaningStaff = -1;
            }
        } else if (selectRowFoodDrinkSaler > -1) {
            int rsConfirm = JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc muốn xóa dữ liệu? (Dữ liệu sẽ không được khôi phục!)");
            if (rsConfirm == JOptionPane.OK_OPTION) {
                String object = (String) tableModelFoodDrinkSaler.getValueAt(selectRowFoodDrinkSaler, 0);
                this.writeStaffSqlImp.deleteStaff(object);
                listStaff.removeStaff(object);
                loadStaffsToTable(listStaff.getListStaff());
                this.selectRowCleaningStaff = -1;
            }
        } else if (selectRowTicketInspector > -1) {
            int rsConfirm = JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc muốn xóa dữ liệu? (Dữ liệu sẽ không được khôi phục!)");
            if (rsConfirm == JOptionPane.OK_OPTION) {
                String idStaffDelete = (String) tableModelTicketInspector.getValueAt(selectRowTicketInspector, 0);
                this.writeStaffSqlImp.deleteStaff(idStaffDelete);
                listStaff.removeStaff(idStaffDelete);
                loadStaffsToTable(listStaff.getListStaff());
                this.selectRowTicketInspector = -1;
            }
        } else if (selectRowCleaningStaff > -1) {
            int rsConfirm = JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc muốn xóa dữ liệu? (Dữ liệu sẽ không được khôi phục!)");
            if (rsConfirm == JOptionPane.OK_OPTION) {
                String idStaffDelete = (String) tableModelCleaningStaff.getValueAt(selectRowCleaningStaff, 0);
                this.writeStaffSqlImp.deleteStaff(idStaffDelete);
                listStaff.removeStaff(idStaffDelete);
                loadStaffsToTable(listStaff.getListStaff());
                this.selectRowCleaningStaff = -1;
            }
        } else if (selectRowCusSupStaff > -1) {
            int rsConfirm = JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc muốn xóa dữ liệu? (Dữ liệu sẽ không được khôi phục!)");
            if (rsConfirm == JOptionPane.OK_OPTION) {
                String idStaffDelete = (String) tableModelCusSupStaff.getValueAt(selectRowCusSupStaff, 0);
                this.writeStaffSqlImp.deleteStaff(idStaffDelete);
                listStaff.removeStaff(idStaffDelete);
                loadStaffsToTable(listStaff.getListStaff());
                this.selectRowCusSupStaff = -1;
            }
        } else if (selectRowManagerRoom > -1) {
            int rsConfirm = JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc muốn xóa dữ liệu? (Dữ liệu sẽ không được khôi phục!)");
            if (rsConfirm == JOptionPane.OK_OPTION) {
                String idSatffDelete = (String) tableModelManagerRoom.getValueAt(selectRowManagerRoom, 0);
                this.writeStaffSqlImp.deleteStaff(idSatffDelete);
                listStaff.removeStaff(idSatffDelete);
                loadStaffsToTable(listStaff.getListStaff());
                this.selectRowManagerRoom = -1;
            }
        } else if (selectRowManagerShowTimeMovie > -1) {
            int rsConfirm = JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc muốn xóa dữ liệu? (Dữ liệu sẽ không được khôi phục!)");
            if (rsConfirm == JOptionPane.OK_OPTION) {
                String idStaffDelete = (String) tableModelManagerShowTimeMovie.getValueAt(selectRowManagerShowTimeMovie, 0);
                this.writeStaffSqlImp.deleteStaff(idStaffDelete);
                listStaff.removeStaff(idStaffDelete);
                loadStaffsToTable(listStaff.getListStaff());
                this.selectRowManagerShowTimeMovie = -1;
            }
        } else if (selectRowMangerStaffClient > -1) {
            int rsConfirm = JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc muốn xóa dữ liệu? (Dữ liệu sẽ không được khôi phục!)");
            if (rsConfirm == JOptionPane.OK_OPTION) {
                String idStaffDelete = (String) tableModelMangerStaffClient.getValueAt(selectRowCleaningStaff, 0);
                this.writeStaffSqlImp.deleteStaff(idStaffDelete);
                listStaff.removeStaff(idStaffDelete);
                loadStaffsToTable(listStaff.getListStaff());
                this.selectRowMangerStaffClient = -1;
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "VUI LÒNG CHỌN NHÂN VIÊN BẠN MUỐN XÓA!");
        }
    }

    // sửa nhân viên
    private void updateInfoStaff() {
        this.selectRowStaffAll = this.allStaffTable.getSelectedRow();
        this.selectRowTicketClerk = this.ticketClerkTable.getSelectedRow();
        this.selectRowFoodDrinkSaler = this.foodDrinkSalerTable.getSelectedRow();
        this.selectRowTicketInspector = this.ticketInspectorTable.getSelectedRow();
        this.selectRowCleaningStaff = this.cleaningStaffTable.getSelectedRow();
        this.selectRowCusSupStaff = this.cusSupStaffTable.getSelectedRow();
        this.selectRowManagerRoom = this.managerRoomTable.getSelectedRow();
        this.selectRowManagerShowTimeMovie = this.managerShowTimeMovieTable.getSelectedRow();
        if (selectRowStaffAll > -1) {
            this.fixInfoStaff = new FixInfoStaff(this, rootPaneCheckingEnabled, getInfoStaffNeedFix(this.selectRowStaffAll, tableModelAllStaff));
            this.fixInfoStaff.setVisible(true);
            writeStaffSqlImp.upDateStaff(this.fixInfoStaff.getStaffAlterFix());
            listStaff.setListStaff(readStaffSqlImp.readStaffFromDataSource());
            loadStaffsToTable(listStaff.getListStaff());
            this.selectRowStaffAll = -1;
        } else if (selectRowTicketClerk > -1) {
            this.fixInfoStaff = new FixInfoStaff(this, rootPaneCheckingEnabled, getInfoStaffNeedFix(this.selectRowTicketClerk, tableModelTicketClerk));
            this.fixInfoStaff.setVisible(true);
            writeStaffSqlImp.upDateStaff(this.fixInfoStaff.getStaffAlterFix());
            listStaff.setListStaff(readStaffSqlImp.readStaffFromDataSource());
            loadStaffsToTable(listStaff.getListStaff());
            this.selectRowTicketClerk = -1;
        } else if (selectRowFoodDrinkSaler > -1) {
            this.fixInfoStaff = new FixInfoStaff(this, rootPaneCheckingEnabled, getInfoStaffNeedFix(this.selectRowFoodDrinkSaler, tableModelFoodDrinkSaler));
            this.fixInfoStaff.setVisible(true);
            writeStaffSqlImp.upDateStaff(this.fixInfoStaff.getStaffAlterFix());
            listStaff.setListStaff(readStaffSqlImp.readStaffFromDataSource());
            loadStaffsToTable(listStaff.getListStaff());
            this.selectRowFoodDrinkSaler = -1;
        } else if (selectRowTicketInspector > -1) {
            this.fixInfoStaff = new FixInfoStaff(this, rootPaneCheckingEnabled, getInfoStaffNeedFix(selectRowTicketInspector, tableModelTicketInspector));
            this.fixInfoStaff.setVisible(true);
            writeStaffSqlImp.upDateStaff(this.fixInfoStaff.getStaffAlterFix());
            listStaff.setListStaff(readStaffSqlImp.readStaffFromDataSource());
            loadStaffsToTable(listStaff.getListStaff());
            this.selectRowTicketInspector = -1;
        } else if (selectRowCleaningStaff > -1) {
            this.fixInfoStaff = new FixInfoStaff(this, rootPaneCheckingEnabled, getInfoStaffNeedFix(this.selectRowCleaningStaff, tableModelCleaningStaff));
            this.fixInfoStaff.setVisible(true);
            writeStaffSqlImp.upDateStaff(this.fixInfoStaff.getStaffAlterFix());
            listStaff.setListStaff(readStaffSqlImp.readStaffFromDataSource());
            loadStaffsToTable(listStaff.getListStaff());
            this.selectRowCleaningStaff = -1;
        } else if (selectRowCusSupStaff > -1) {
            this.fixInfoStaff = new FixInfoStaff(this, rootPaneCheckingEnabled, getInfoStaffNeedFix(this.selectRowCusSupStaff, tableModelCusSupStaff));
            this.fixInfoStaff.setVisible(true);
            writeStaffSqlImp.upDateStaff(this.fixInfoStaff.getStaffAlterFix());
            listStaff.setListStaff(readStaffSqlImp.readStaffFromDataSource());
            loadStaffsToTable(listStaff.getListStaff());
            this.selectRowCusSupStaff = -1;
        } else if (selectRowManagerRoom > -1) {
            this.fixInfoStaff = new FixInfoStaff(this, rootPaneCheckingEnabled, getInfoStaffNeedFix(this.selectRowManagerRoom, tableModelManagerRoom));
            this.fixInfoStaff.setVisible(true);
            writeStaffSqlImp.upDateStaff(this.fixInfoStaff.getStaffAlterFix());
            listStaff.setListStaff(readStaffSqlImp.readStaffFromDataSource());
            loadStaffsToTable(listStaff.getListStaff());
            this.selectRowManagerRoom = -1;
        } else if (selectRowManagerShowTimeMovie > -1) {
            this.fixInfoStaff = new FixInfoStaff(this, rootPaneCheckingEnabled, getInfoStaffNeedFix(this.selectRowManagerShowTimeMovie, tableModelManagerShowTimeMovie));
            this.fixInfoStaff.setVisible(true);
            writeStaffSqlImp.upDateStaff(this.fixInfoStaff.getStaffAlterFix());
            listStaff.setListStaff(readStaffSqlImp.readStaffFromDataSource());
            loadStaffsToTable(listStaff.getListStaff());
            this.selectRowManagerShowTimeMovie = -1;
        } else if (selectRowMangerStaffClient > -1) {
            this.fixInfoStaff = new FixInfoStaff(this, rootPaneCheckingEnabled, getInfoStaffNeedFix(this.selectRowMangerStaffClient, tableModelMangerStaffClient));
            this.fixInfoStaff.setVisible(true);
            writeStaffSqlImp.upDateStaff(this.fixInfoStaff.getStaffAlterFix());
            listStaff.setListStaff(readStaffSqlImp.readStaffFromDataSource());
            loadStaffsToTable(listStaff.getListStaff());
            this.selectRowMangerStaffClient = -1;
        } else {
            JOptionPane.showMessageDialog(rootPane, "VUI LÒNG CHỌN NHÂN VIÊN BẠN MUỐN SỬA!");
        }
    }

    public List<String> getInfoStaffNeedFix(int row, DefaultTableModel tableModel) {
        List<String> infoStaff = new ArrayList<String>();
        String infoColumn = "";
        for (int i = 0; i < 8; i++) {
            infoColumn = (String) tableModel.getValueAt(row, i);
            infoStaff.add(infoColumn);
        }
        return infoStaff;
    } 
    
    // tìm kiếm nhân viên theo tên
    public void findStaffByName() throws InvalidNameException {
        String fullName = this.fillNameJTF.getText();
        if (fullName.isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "VUI LÒNG NHẬP TÊN CẦN TÌM");
        } else {
            InfoFilterImp infoFilterImp = new InfoFilterImp();
            try {
                if (infoFilterImp.isNamePersonValid(fullName)){
                    List<Staff> StaffsFound = listStaff.searchStatffByName(fullName);
                    if (StaffsFound == null){
                        JOptionPane.showMessageDialog(rootPane, "KHÔNG TỒN TẠI NHÂN VIÊN NÀY");
                    } else {
                        loadStaffsToTable(StaffsFound);
                    }
                }
            } catch(InvalidNameException e){
                JOptionPane.showMessageDialog(rootPane, "HỌ TÊN NHẬP VÀO KHÔNG HỢP LỆ");
                throw e;
            }
        }
    }
    
    // tìm kiếm nhân viên theo ngày bắt đầu
    public void findStaffByStartDate() throws InvalidBirthdayException, ParseException {
        String startDate = this.fillStartDateJTF.getText();
        if (startDate.isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "VUI LÒNG NHẬP NGÀY CẦN TÌM");
        } else {
            InfoFilterImp infoFilterImp = new InfoFilterImp();
            try {
                if(infoFilterImp.isBirthdayValid(startDate)) {
                    List<Staff> StaffsFound = listStaff.searchStaffByStartDate(startDate);
                    if (StaffsFound == null){
                        JOptionPane.showMessageDialog(rootPane, "KHÔNG TỒN TẠI NHÂN VIÊN NÀY");
                    } else {
                        loadStaffsToTable(StaffsFound);
                    }
                }
            } catch(InvalidBirthdayException e) {
                JOptionPane.showMessageDialog(rootPane, "NGÀY NHẬP VÀO KHÔNG HỢP LỆ");
                throw e;
            }  
        }
    }
    
    // tìm kiếm nhân viên theo số điện thoại
    public void findStaffByPhoneNumber() throws InvalidPhoneException {
        String phoneNumber = this.fillPhoneNumberJTF.getText();
        if(phoneNumber.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "VUI LÒNG NHẬP SỐ ĐIỆN THOẠI CẦN TÌM");
        } else {
            InfoFilterImp infoFilterImp = new InfoFilterImp();
            try {
                if(infoFilterImp.isPhonePersonValid(phoneNumber)) {
                    List<Staff> StaffsFound = listStaff.searchStaffByPhoneNumber(phoneNumber);
                    if (StaffsFound == null){
                        JOptionPane.showMessageDialog(rootPane, "KHÔNG TỒN TẠI NHÂN VIÊN NÀY");
                    } else {
                        loadStaffsToTable(StaffsFound);
                    }
                }
            } catch(InvalidPhoneException e) {
                JOptionPane.showMessageDialog(rootPane, "SỐ ĐIỆN THOẠI NHẬP VÀO KHÔNG HỢP LỆ");
                throw e;
            }
        }
    }
    
    // làm mới trang
    public void refeshPage() {
        this.listStaff = new ClassListStaff(readStaffSqlImp.readStaffFromDataSource());
        this.loadStaffsToTable(listStaff.getListStaff());
        
        this.buttonGroupSort.clearSelection();
        this.buttonGroupSearch.clearSelection();
        
        this.findNameJRB.setSelected(false);
        this.findPhoneNumberJRB.setSelected(false);
        this.findStartDateJRB.setSelected(false);
        
        this.sortNameASCJRB.setSelected(false);
        this.sortNameDESCJRB.setSelected(false);
        this.sortStartDateASCJRB.setSelected(false);
        this.sortStartDateDESCJRB.setSelected(false);
        
        this.fillNameJTF.setText("");
        this.fillPhoneNumberJTF.setText("");
        this.fillStartDateJTF.setText("");
    }

    private void updateAutoId() {
        int max = 0;
        for (Staff x : listStaff.getListStaff()){
            if (max < Integer.parseInt(x.getID_Staff().substring(3))){
                max = Integer.parseInt(x.getID_Staff().substring(3));
            }
        }
        Staff.setAutoStaffId(max + 1);
    }
}
