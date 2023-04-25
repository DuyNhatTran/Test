package Java_project_SGU.GUI;

import Java_project_SGU.DAL.WriteReadShowTimeSQLImp;
import Java_project_SGU.DAL.Write_ReadMovieToSqlImp;
import Java_project_SGU.BUS.ClassListMovie;
import Java_project_SGU.BUS.ClassListShowTime;
import Java_project_SGU.BUS.Movie;
import Java_project_SGU.BUS.Seat;
import Java_project_SGU.BUS.ShowTime;
import Java_project_SGU.BUS.Staff;
import Java_project_SGU.BUS.TicketSale;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class TicketClerkView extends javax.swing.JDialog implements ActionListener {

    // thông tin trên bảng
    private int numOfTicket;
    private int total;
    // các đối tượng
    private Movie movie;
    private ShowTime showTime;
    private String presentTime;
    private ClassListShowTime classListShowTime;
    private ClassListMovie classListMovie;
    // đối tượng lấy dữ liệu
    private WriteReadShowTimeSQLImp writeReadShowTimeSQLImp;
    private Write_ReadMovieToSqlImp write_ReadMovieToSqlImp;
    // các list cần thiết
    private ArrayList<JPanel> listPanelMovie;
    private ArrayList<JButton> listButton;
    private List<String> listSeatChoosen;
    private List<String> listSeatHasJustChoosen;
    // bảng
    private DefaultTableModel tableModle;
    private int selectRow;
    private Staff staff;

    // constructor
    public TicketClerkView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.addActionListener();
        this.total = 0;
        // setup page
        this.getPresentTime();
        this.showTime = new ShowTime();
        this.listSeatHasJustChoosen = new ArrayList<>();
        this.classListShowTime = new ClassListShowTime();
        this.classListMovie = new ClassListMovie();
        this.writeReadShowTimeSQLImp = new WriteReadShowTimeSQLImp();
        this.write_ReadMovieToSqlImp = new Write_ReadMovieToSqlImp();
        this.tableInitialization();
        this.classListShowTime.setClassListShowtime(this.writeReadShowTimeSQLImp.readShowTimesFromSQL());
        
        this.classListMovie.setMovies(this.write_ReadMovieToSqlImp.readMovieFromDS());
        this.getListShowTimeOfDay();
        this.setupMovie();
    }
    
    public TicketClerkView(java.awt.Frame parent, boolean modal, Staff staff) {
        this(parent, modal);
        this.staff = staff;
    }

    public TicketClerkView(Dialog owner, boolean modal) {
        super(owner, modal);
        initComponents();
        this.addActionListener();
        this.total = 0;
        // setup page
        this.getPresentTime();
        this.showTime = new ShowTime();
        this.classListShowTime = new ClassListShowTime();
        this.classListMovie = new ClassListMovie();
        this.writeReadShowTimeSQLImp = new WriteReadShowTimeSQLImp();
        this.write_ReadMovieToSqlImp = new Write_ReadMovieToSqlImp();
        this.tableInitialization();
        this.classListShowTime.setClassListShowtime(this.writeReadShowTimeSQLImp.readShowTimesFromSQL());
        this.classListMovie.setMovies(this.write_ReadMovieToSqlImp.readMovieFromDS());
        this.getListShowTimeOfDay();
        this.setupMovie();
    }

    // getter and setter
    public List<String> getListSeatChoosen() {
        return listSeatChoosen;
    }

    public void setListSeatChoosen(List<String> listSeatChoosen) {
        this.listSeatChoosen = listSeatChoosen;
    }

    public List<String> getListSeatHasJustChoosen() {
        return listSeatHasJustChoosen;
    }

    public void setListSeatHasJustChoosen(List<String> listSeatHasJustChoosen) {
        this.listSeatHasJustChoosen = listSeatHasJustChoosen;
    }

    // addActionListener
    public void addActionListener() {
        this.payBTN.addActionListener(this);
        this.resetBTN.addActionListener(this);
        this.closeBTN.addActionListener(this);
        this.deleteBTN.addActionListener(this);
    }

    public void tableInitialization() {
        this.tableModle = (DefaultTableModel) infoSeatTablbe.getModel();
        this.selectRow = -1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        infoSeatTablbe = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        numOfSeatJLB = new javax.swing.JLabel();
        totalJLB = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        payBTN = new javax.swing.JButton();
        resetBTN = new javax.swing.JButton();
        closeBTN = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        deleteBTN = new javax.swing.JButton();
        printTicketBTN = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        numOfRoomJLB = new javax.swing.JLabel();
        nameOfMovieJLB = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        numOfBoxJLB = new javax.swing.JLabel();
        presentTimeJLB = new javax.swing.JLabel();
        nameOfStaffJLB = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        displayMovieOfDayJPN = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        infoSeatTablbe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ghế", "Loại vé", "Giá vé"
            }
        ));
        jScrollPane1.setViewportView(infoSeatTablbe);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE))
        );

        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        numOfSeatJLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        numOfSeatJLB.setForeground(new java.awt.Color(0, 0, 255));
        numOfSeatJLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numOfSeatJLB.setText("0");
        numOfSeatJLB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        totalJLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        totalJLB.setForeground(new java.awt.Color(255, 51, 0));
        totalJLB.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalJLB.setText("0");
        totalJLB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(numOfSeatJLB, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(totalJLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(numOfSeatJLB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
            .addComponent(totalJLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        payBTN.setText("Thanh toán");

        resetBTN.setText("Chọn lại");

        closeBTN.setBackground(new java.awt.Color(255, 51, 0));
        closeBTN.setText("Đóng");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(payBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resetBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(closeBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payBTN)
                    .addComponent(resetBTN)
                    .addComponent(closeBTN))
                .addContainerGap())
        );

        deleteBTN.setText("Xóa");

        printTicketBTN.setText("In vé");
        printTicketBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printTicketBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(printTicketBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteBTN)
                    .addComponent(printTicketBTN))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        numOfRoomJLB.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        numOfRoomJLB.setText("Phòng: 01");

        nameOfMovieJLB.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        nameOfMovieJLB.setText(" ");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Nhân viên: ");

        numOfBoxJLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        numOfBoxJLB.setText("Quầy: 01");

        presentTimeJLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        presentTimeJLB.setText("Thứ hai - 17/04/2023");

        nameOfStaffJLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nameOfStaffJLB.setText("Nguyễn Vũ Tiến Đạt");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(numOfRoomJLB)
                .addGap(18, 18, 18)
                .addComponent(nameOfMovieJLB, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(numOfBoxJLB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameOfStaffJLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(presentTimeJLB, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 25, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numOfRoomJLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(nameOfStaffJLB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numOfBoxJLB)
                            .addComponent(presentTimeJLB))
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addComponent(nameOfMovieJLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        displayMovieOfDayJPN.setPreferredSize(new java.awt.Dimension(582, 2000));

        javax.swing.GroupLayout displayMovieOfDayJPNLayout = new javax.swing.GroupLayout(displayMovieOfDayJPN);
        displayMovieOfDayJPN.setLayout(displayMovieOfDayJPNLayout);
        displayMovieOfDayJPNLayout.setHorizontalGroup(
            displayMovieOfDayJPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 597, Short.MAX_VALUE)
        );
        displayMovieOfDayJPNLayout.setVerticalGroup(
            displayMovieOfDayJPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2000, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(displayMovieOfDayJPN);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void printTicketBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printTicketBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_printTicketBTNActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TicketClerkView dialog = new TicketClerkView(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton closeBTN;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JPanel displayMovieOfDayJPN;
    private javax.swing.JTable infoSeatTablbe;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nameOfMovieJLB;
    private javax.swing.JLabel nameOfStaffJLB;
    private javax.swing.JLabel numOfBoxJLB;
    private javax.swing.JLabel numOfRoomJLB;
    private javax.swing.JLabel numOfSeatJLB;
    private javax.swing.JButton payBTN;
    private javax.swing.JLabel presentTimeJLB;
    private javax.swing.JButton printTicketBTN;
    private javax.swing.JButton resetBTN;
    private javax.swing.JLabel totalJLB;
    // End of variables declaration//GEN-END:variables

    // actionListener
    @Override
    public void actionPerformed(ActionEvent e) {
        String textOfButton = e.getActionCommand();
        Object src = e.getSource();
        bookMovie(src);
        
        
        if (src.equals(this.closeBTN)) {
            this.dispose();
        } else if (checkButton(src)) {
            
        } else if (src.equals(this.resetBTN)) {
            resetPage();
        } else if (src.equals(this.payBTN)) {
            if (this.movie == null || this.showTime == null) {
                JOptionPane.showMessageDialog(rootPane, "THANH TOÁN KHÔNG THÀNH CÔNG");
            } else {
                Date presentTime = new Date();
                TicketSale ticketSale = new TicketSale();
                ticketSale.setIdTS(null);
                
              
                this.writeReadShowTimeSQLImp.writeTicketSale(ticketSale.getIdTS(), presentTime, total, showTime, "STC1003");
                this.writeReadShowTimeSQLImp.writeDetailTicketSale(ticketSale.getIdTS(), listSeatHasJustChoosen, this.showTime);
                JOptionPane.showMessageDialog(rootPane, "THANH TOÁN THÀNH CÔNG");
                // reset lại trang
                this.resetPage();
            }

        } else if(src.equals(this.deleteBTN)) {
            this.deleteInfo();
        }
    }

// hàm xử lý sự kiện 
    // lấy ngày tháng năm thứ hiện tại 
    public void getPresentTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE - dd/MM/yyyy");
        long millis = System.currentTimeMillis();
        Date presentTimeDate = new java.sql.Date(millis);
        String presentTime = dateFormat.format(presentTimeDate);
        this.presentTimeJLB.setText(presentTime);
    }

    // xử lý set up các phim trong ngày lên page
    public void getListShowTimeOfDay() {
        ArrayList<ShowTime> listShowTime = new ArrayList<>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date presentDate = new Date();
        for (ShowTime x : this.classListShowTime.getClassListShowtime()) {
            x.setIsChoosen(false);
            if (dateFormat.format(x.getStartTime()).equals(dateFormat.format(presentDate))) {
                listShowTime.add(x);
                continue;
            }
        }
        this.classListShowTime.setClassListShowtime(listShowTime);
    }

    public void setupMovie() {
        this.displayMovieOfDayJPN.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.listPanelMovie = new ArrayList<>();
        this.listButton = new ArrayList<>();
        Font font = new Font("Arial", Font.BOLD, 14);
        for (Movie x : this.classListMovie.getMovies()) {
            if (checkShowTimeOfMovie(x)) {
                // tạo panel tổng
                JPanel jpanelAll = new JPanel();
                jpanelAll.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
                jpanelAll.setPreferredSize(new Dimension(600, 370));
                jpanelAll.setBorder(new LineBorder(Color.BLACK));
                this.listPanelMovie.add(jpanelAll);
                // tạo jlabel chứa hình ảnh phim 
                JLabel imageJLB = new JLabel();
                imageJLB.setPreferredSize(new Dimension(240, 355));
                imageJLB.setIcon(new ImageIcon(x.getLinkImage()));
                jpanelAll.add(imageJLB);

                // tạo nút nhất thời gian chiếu
                for (ShowTime y : this.classListShowTime.getClassListShowtime()) {
                    if (y.getMovie().equals(x)) {
                        if (y.isIsChoosen() == false) {
                            JButton jButton = new JButton();
                            jButton.setFont(font);
                            SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
                            jButton.setText(dateFormat.format(y.getStartTime()));
                            jButton.addActionListener(this);
                            jpanelAll.add(jButton);
                            this.listButton.add(jButton);
                            y.setIsChoosen(true);
                        }
                    }
                }
                this.displayMovieOfDayJPN.add(jpanelAll);
            } else {
                continue;
            }
        }
    }

    public boolean checkShowTimeOfMovie(Movie movie) {
        for (ShowTime x : this.classListShowTime.getClassListShowtime()) {
            if (x.getMovie().equals(movie)) {
                return true;
            }
        }
        return false;
    }

    // xử lý sự kiện các nút nhấn suất chiếu của phim
    public boolean checkButton(Object src) {
        for (int i = 0; i < listPanelMovie.size(); i++) {
            if (listPanelMovie.get(i).isAncestorOf((Component) src)) {
                return true;
            }
        }
        return false;
    }

    public Movie getMovie(Object src) {
        for (int i = 0; i < listPanelMovie.size(); i++) {
            if (listPanelMovie.get(i).isAncestorOf((Component) src)) {
                return this.classListMovie.getMovies().get(i);
            }
        }
        return null;
    }

    public ShowTime getShowTimeOfMovie(Movie movie, String textOfButton) {
        SimpleDateFormat DateFormat = new SimpleDateFormat("HH:mm");
        for (ShowTime showTime : this.classListShowTime.getClassListShowtime()) {
            if (showTime.getMovie().equals(movie) && textOfButton.equals(DateFormat.format(showTime.getStartTime()))) {
                return showTime;
            }
        }
        return null;
    }

// các hàm xử lý lấy ghế khách chọn 
    // đẩy ghế đã chọn lên bảng
    public void setSeatChoosenToTable(ShowTime showTime) {
        this.tableModle.setRowCount(0);
        this.numOfSeatJLB.setText(this.listSeatHasJustChoosen.size() + "");
        for (String x : this.listSeatHasJustChoosen) {
            String IdSeat = x + showTime.getRoom().getIdRoom();
            List<String> infoSeat = this.writeReadShowTimeSQLImp.getInfoOfSeat(IdSeat);
            String TypeSeat = infoSeat.get(1);
            String unitPrice = String.valueOf(showTime.getTicketPrice());
            this.total += showTime.getTicketPrice();
            this.tableModle.addRow((Object[]) loadInfoSeatToTable(x, TypeSeat, unitPrice));
        }
        this.totalJLB.setText(this.total + "");
    }

    // load ghế lên một dòng của bảng
    public Object loadInfoSeatToTable(String indexOfSeat, String TypeSeat, String UnitPrice) {
        Object[] row = new Object[]{
            indexOfSeat, TypeSeat, UnitPrice
        };
        return row;
    }
    
 // xử lý sự kiện nút xóa 
    public void deleteInfo() {
        this.selectRow = this.infoSeatTablbe.getSelectedRow();
        if (this.selectRow > -1){
            String ID_Seat = (String) tableModle.getValueAt(selectRow, 0);
            this.listSeatHasJustChoosen.remove(ID_Seat);
            int deleteMoney = Integer.parseInt((String) tableModle.getValueAt(selectRow, 2));
            this.total -= deleteMoney;
            this.totalJLB.setText(this.total + "");
            this.numOfSeatJLB.setText(this.listSeatHasJustChoosen.size() + "");
            tableModle.removeRow(selectRow);
        } else {
            JOptionPane.showMessageDialog(rootPane, "VUI LÒNG CHỌN GHẾ MÀ BẠN MUỐN XÓA");
        }
    }

    private void resetPage() {
        this.numOfSeatJLB.setText("0");
            this.totalJLB.setText("0");

            this.tableModle.setRowCount(0);
            
            this.listSeatChoosen.clear();
            this.listButton.clear();
            this.listSeatHasJustChoosen.clear();
            
            this.movie = null;
            this.showTime = null;
    }

    private void bookMovie(Object src) {
        JButton srcBtn = (JButton) src;
        this.movie = getMovie(src);
        this.showTime = getShowTimeOfMovie((Movie) movie, srcBtn.getText());
        this.numOfRoomJLB.setText("Phòng: 0" + showTime.getMovie().getIdMovie().substring(4));
        this.nameOfMovieJLB.setText(showTime.getMovie().getNameMovie());
        if (showTime.getRoom().getIdRoom().equals("ROOM1") || showTime.getRoom().getIdRoom().equals("ROOM2")) {
            this.setListSeatChoosen(this.writeReadShowTimeSQLImp.getSeatChoosen(showTime));
            Room1OfTicketClerk room1OfTicketClerk = new Room1OfTicketClerk(this, rootPaneCheckingEnabled);
            room1OfTicketClerk.setVisible(true);
            setSeatChoosenToTable(showTime);
        } else if (showTime.getRoom().getIdRoom().equals("ROOM3") || showTime.getRoom().getIdRoom().equals("ROOM4") || showTime.getRoom().getIdRoom().equals("ROOM5")) {
            this.setListSeatChoosen(this.writeReadShowTimeSQLImp.getSeatChoosen(showTime));
            Room2OfTicketClerk room2OfTicketClerk = new Room2OfTicketClerk(this, rootPaneCheckingEnabled);
            room2OfTicketClerk.setVisible(true);
            setSeatChoosenToTable(showTime);
        }
    }
}
