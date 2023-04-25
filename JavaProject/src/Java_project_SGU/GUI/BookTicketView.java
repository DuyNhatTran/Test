package Java_project_SGU.GUI;

import Java_project_SGU.DAL.WriteReadShowTimeSQLImp;
import Java_project_SGU.Controller.BookTicketListener;
import Java_project_SGU.BUS.Customer;
import Java_project_SGU.BUS.ShowTime;
import Java_project_SGU.BUS.ClassListShowTime;
import Java_project_SGU.BUS.Seat;
import Java_project_SGU.BUS.TicketSale;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class BookTicketView extends javax.swing.JDialog {
    //View
    private Room1View room1View;
    //Model
    private Customer customer;
    private ShowTime showTimeBooking;
    private TicketSale tickSale;
    private ClassListShowTime classListST;
    private List<JButton> listJButtonChoosen;
    //other
    private Seat seatVip;
    private Seat seatNormal;
    private Seat seatPair;
    private int sumMoneyAllSeat;
    public final static int CHOOSE_SEAT = 1;
    public final static int PROCEED_PAYMENT = 2;
    private int state;
    private boolean isSmallRoom;
    
    // constructor 1
    public BookTicketView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        addActionListener();
    }
    
    public BookTicketView(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

     public BookTicketView(java.awt.Dialog parent, boolean modal, 
             Customer customer, ShowTime showTime) {
        this(parent, modal);
        this.state = 1;
        this.isSmallRoom = false;
        this.customer = customer;
        this.showTimeBooking = showTime;
        tickSale = new TicketSale();
        loadDataFromSQL();
        initPageBooking();
        addActionListener();
        //Test
//        for (Seat seat : this.showTimeBooking.getRoom().getListSeat()) {
//            System.out.println(seat.toString());
//        }
//         System.out.println(this.showTimeBooking.getRoom().getListSeat().size());
        //
        loadDataFromSQL();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        hourTxt = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        dateTxt = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        quantityTopLB = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        sumMoneyTopLB = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        listChoosenSeatLB = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        typeVipTicketLB = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        upPairBtn = new javax.swing.JButton();
        quantityPair = new javax.swing.JLabel();
        quantitySingle = new javax.swing.JLabel();
        upSingleBtn = new javax.swing.JButton();
        downPairBtn = new javax.swing.JButton();
        downSingleBtn = new javax.swing.JButton();
        quantityVip = new javax.swing.JLabel();
        downVipBtn = new javax.swing.JButton();
        upVipBtn = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        surchage_pricePairLB = new javax.swing.JLabel();
        surchage_priceSingleLB = new javax.swing.JLabel();
        surchage_priceVipLB = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        sumPrice_SingleLB = new javax.swing.JLabel();
        sumPrice_PairLB = new javax.swing.JLabel();
        sumPrice_VipLB = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        totalTicketLB = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        sumMoneyBotLB = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        chooseSeatBtn = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jLabel3.setText("jLabel3");

        jLabel6.setText("jLabel6");

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(102, 0, 102));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tên phim");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("KHÓA CHẶT CỬA NÀO SUZUME");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Chọn suất chiếu");

        hourTxt.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        hourTxt.setForeground(new java.awt.Color(255, 255, 255));
        hourTxt.setText("Chọn suất chiếu");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(hourTxt))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addComponent(hourTxt)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 153, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ngày");

        dateTxt.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        dateTxt.setForeground(new java.awt.Color(255, 255, 255));
        dateTxt.setText("Ngày");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(dateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(10, 10, 10)
                .addComponent(dateTxt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 0, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Số lượng");

        quantityTopLB.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        quantityTopLB.setForeground(new java.awt.Color(255, 255, 255));
        quantityTopLB.setText("Số lượng");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quantityTopLB, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(10, 10, 10)
                .addComponent(quantityTopLB)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(255, 0, 153));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tổng số tiền");

        sumMoneyTopLB.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        sumMoneyTopLB.setForeground(new java.awt.Color(255, 255, 255));
        sumMoneyTopLB.setText("Tổng số tiền");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(sumMoneyTopLB, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(10, 10, 10)
                .addComponent(sumMoneyTopLB)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(51, 0, 51));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Số ghế");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel7)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel14.setBackground(new java.awt.Color(51, 0, 51));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        listChoosenSeatLB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        listChoosenSeatLB.setForeground(new java.awt.Color(255, 255, 255));
        listChoosenSeatLB.setText(" ");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listChoosenSeatLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(listChoosenSeatLB)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 884, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setBackground(new java.awt.Color(255, 153, 0));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("LOẠI VÉ");
        jLabel10.setOpaque(true);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel14.setText("Người Lớn (ĐÔI)");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel15.setText("Người Lớn (ĐƠN)");

        typeVipTicketLB.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        typeVipTicketLB.setText("Người Lớn (VIP)");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(typeVipTicketLB)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(typeVipTicketLB)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(153, 153, 153));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel11.setBackground(new java.awt.Color(255, 153, 0));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("SỐ LƯỢNG");
        jLabel11.setOpaque(true);

        upPairBtn.setBackground(new java.awt.Color(153, 153, 153));
        upPairBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        upPairBtn.setForeground(new java.awt.Color(255, 255, 255));
        upPairBtn.setText("+");
        upPairBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        upPairBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upPairBtnActionPerformed(evt);
            }
        });

        quantityPair.setBackground(new java.awt.Color(255, 255, 255));
        quantityPair.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        quantityPair.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantityPair.setText("0");
        quantityPair.setOpaque(true);

        quantitySingle.setBackground(new java.awt.Color(255, 255, 255));
        quantitySingle.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        quantitySingle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantitySingle.setText("0");
        quantitySingle.setOpaque(true);

        upSingleBtn.setBackground(new java.awt.Color(153, 153, 153));
        upSingleBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        upSingleBtn.setForeground(new java.awt.Color(255, 255, 255));
        upSingleBtn.setText("+");
        upSingleBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        downPairBtn.setBackground(new java.awt.Color(153, 153, 153));
        downPairBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        downPairBtn.setForeground(new java.awt.Color(255, 255, 255));
        downPairBtn.setText("-");
        downPairBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        downPairBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downPairBtnActionPerformed(evt);
            }
        });

        downSingleBtn.setBackground(new java.awt.Color(153, 153, 153));
        downSingleBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        downSingleBtn.setForeground(new java.awt.Color(255, 255, 255));
        downSingleBtn.setText("-");
        downSingleBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        downSingleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downSingleBtnActionPerformed(evt);
            }
        });

        quantityVip.setBackground(new java.awt.Color(255, 255, 255));
        quantityVip.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        quantityVip.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantityVip.setText("0");
        quantityVip.setOpaque(true);

        downVipBtn.setBackground(new java.awt.Color(153, 153, 153));
        downVipBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        downVipBtn.setForeground(new java.awt.Color(255, 255, 255));
        downVipBtn.setText("-");
        downVipBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        downVipBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downVipBtnActionPerformed(evt);
            }
        });

        upVipBtn.setBackground(new java.awt.Color(153, 153, 153));
        upVipBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        upVipBtn.setForeground(new java.awt.Color(255, 255, 255));
        upVipBtn.setText("+");
        upVipBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        upVipBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upVipBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(downVipBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quantityVip, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(upVipBtn))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(downPairBtn)
                            .addComponent(downSingleBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(quantitySingle, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(upSingleBtn))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(quantityPair, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(upPairBtn)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(upPairBtn)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(quantityPair, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(downPairBtn)))
                .addGap(5, 5, 5)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantitySingle, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(upSingleBtn)
                    .addComponent(downSingleBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(upVipBtn)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(quantityVip, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(downVipBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel12.setBackground(new java.awt.Color(255, 153, 0));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("GIÁ (VNĐ)");
        jLabel12.setOpaque(true);

        surchage_pricePairLB.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        surchage_pricePairLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        surchage_pricePairLB.setText("155000 đ");

        surchage_priceSingleLB.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        surchage_priceSingleLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        surchage_priceSingleLB.setText("155000 đ");

        surchage_priceVipLB.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        surchage_priceVipLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        surchage_priceVipLB.setText("155000 đ");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
            .addComponent(surchage_pricePairLB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(surchage_priceSingleLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(surchage_priceVipLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(surchage_pricePairLB)
                .addGap(15, 15, 15)
                .addComponent(surchage_priceSingleLB)
                .addGap(15, 15, 15)
                .addComponent(surchage_priceVipLB)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));
        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel10.setPreferredSize(new java.awt.Dimension(233, 40));

        jLabel13.setBackground(new java.awt.Color(255, 153, 0));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("TỔNG TIỀN (VNĐ)");
        jLabel13.setOpaque(true);

        sumPrice_SingleLB.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sumPrice_SingleLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sumPrice_SingleLB.setText("0");

        sumPrice_PairLB.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sumPrice_PairLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sumPrice_PairLB.setText("0");

        sumPrice_VipLB.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sumPrice_VipLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sumPrice_VipLB.setText("0");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
            .addComponent(sumPrice_PairLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sumPrice_SingleLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sumPrice_VipLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(sumPrice_PairLB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sumPrice_SingleLB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sumPrice_VipLB)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(153, 153, 153));
        jLabel18.setText("SỐ LƯỢNG:");

        totalTicketLB.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        totalTicketLB.setForeground(new java.awt.Color(51, 51, 51));
        totalTicketLB.setText("0 VÉ");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(153, 153, 153));
        jLabel20.setText("TỔNG SỐ TIỀN:");

        sumMoneyBotLB.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        sumMoneyBotLB.setForeground(new java.awt.Color(51, 51, 51));
        sumMoneyBotLB.setText("0 đ");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addComponent(totalTicketLB)
                .addGap(54, 54, 54)
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addComponent(sumMoneyBotLB)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(totalTicketLB)
                    .addComponent(jLabel20)
                    .addComponent(sumMoneyBotLB))
                .addGap(33, 33, 33))
        );

        jButton1.setBackground(new java.awt.Color(255, 153, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("QUAY LẠI");

        chooseSeatBtn.setBackground(new java.awt.Color(255, 153, 0));
        chooseSeatBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        chooseSeatBtn.setForeground(new java.awt.Color(255, 255, 255));
        chooseSeatBtn.setText("CHỌN GHẾ");
        chooseSeatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseSeatBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chooseSeatBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(chooseSeatBtn))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void downPairBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downPairBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_downPairBtnActionPerformed

    private void downSingleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downSingleBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_downSingleBtnActionPerformed

    private void chooseSeatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseSeatBtnActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_chooseSeatBtnActionPerformed

    private void upPairBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upPairBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_upPairBtnActionPerformed

    private void downVipBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downVipBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_downVipBtnActionPerformed

    private void upVipBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upVipBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_upVipBtnActionPerformed

    public void addActionListener (){
        BookTicketListener bookTicketListener = new BookTicketListener(this);
        this.chooseSeatBtn.addActionListener(bookTicketListener);
        this.upPairBtn.addActionListener(bookTicketListener);
        this.upSingleBtn.addActionListener(bookTicketListener);
        this.downPairBtn.addActionListener(bookTicketListener);
        this.downSingleBtn.addActionListener(bookTicketListener);
        this.upVipBtn.addActionListener(bookTicketListener);
        this.downVipBtn.addActionListener(bookTicketListener);
    }
    
//    public void callRoomView (){
//        this.room1View = new Room1View();
//        room1View.setVisible(true);
//    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BookTicketView dialog = new BookTicketView(new javax.swing.JFrame(), true);
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
    
    // getter and setter
    public JButton getChooseSeatBtn() {
        return chooseSeatBtn;
    }

    public Room1View getRoom1View() {
        return room1View;
    }

    public JLabel getQuantityPair() {
        return quantityPair;
    }

    public JLabel getQuantitySingle() {
        return quantitySingle;
    }

    public JLabel getQuantityTxt() {
        return quantityTopLB;
    }

    public JLabel getSumMoneyBotTxt() {
        return sumMoneyBotLB;
    }

    public JLabel getSumMoneyTopTxt() {
        return sumMoneyTopLB;
    }

    public JLabel getTotalTicketLB() {
        return totalTicketLB;
    }

    public JButton getUpVipBtn() {
        return upVipBtn;
    }
    
    public JButton getUpPairBtn() {
        return upPairBtn;
    }

    public JButton getUpSingleBtn() {
        return upSingleBtn;
    }

    public List<JButton> getListJButtonChoosen() {
        return listJButtonChoosen;
    }

    public void setListJButtonChoosen(List<JButton> listJButtonChoosen) {
        this.listJButtonChoosen = listJButtonChoosen;
    }

    public JButton getDownPairBtn() {
        return downPairBtn;
    }

    public JButton getDownSingleBtn() {
        return downSingleBtn;
    }

    public JButton getDownVipBtn() {
        return downVipBtn;
    }
    
    
    
    //-------
   

    public ShowTime getShowTimeBooking() {
        return showTimeBooking;
    }

    public int getState() {
        return state;
    }
    
    
    private boolean checkConditionClickUp(String optionType) {
//        String typePair = seatPair.getTypeSeat().getIdTypeSeat().substring(0, 3);
//        String typeVip = seatVip.getTypeSeat().getIdTypeSeat().substring(0, 3);
//        String typeNormal = seatNormal.getTypeSeat().getIdTypeSeat().substring(0, 3);
//        if (typePair.equals(optionType)) return this.tickSale.getQuantityPair() > 0;
//        if (typeNormal.equals(optionType)) return this.tickSale.getQuantityNormal() > 0;
//        if (typeVip.equals(optionType)) return this.tickSale.getQuantityNormal() > 0;
//        return false;
        return true;
    }

    public void increPairTicket () {
        if (true) {
            //Tăng số lương đôi và cập nhập số lượng tổng
            this.tickSale.increPair();
            tickSale.calcuQuantityAll();
            this.totalTicketLB.setText(tickSale.getQuantityAll() + "");
            this.quantityTopLB.setText(tickSale.getQuantityPair()+ " ĐÔI, "
                    + tickSale.getQuantityNormal() + " THƯỜNG, " + 
                    tickSale.getQuantityVip() + " VIP.");
            //Cap nhap so luong ghe doi
            this.quantityPair.setText(this.tickSale.getQuantityPair() + "");
            //Cap nhap tong tien ghe doi
            int sumMoney = tickSale.getQuantityPair() * seatPair.getUnitPrice();
            this.sumPrice_PairLB.setText(sumMoney + "");
            //Set tong tien 3 loai ghe
            this.sumMoneyAllSeat += seatPair.getUnitPrice();
            this.tickSale.setTotalMoney(sumMoneyAllSeat);
            this.sumMoneyTopLB.setText(sumMoneyAllSeat + "");
            this.sumMoneyBotLB.setText(sumMoneyAllSeat + "");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Rất tiếc!"
                    + " Số lượng vé đôi đã hết!");
        }
    }
    
     public void decrePairTicket () {
        if (this.tickSale.getQuantityPair() > 0) {
            //Giảm số lương đôi và cập nhập số lượng tổng
            this.tickSale.decrePair();
            tickSale.calcuQuantityAll();
            this.totalTicketLB.setText(tickSale.getQuantityAll() + "");
            this.quantityTopLB.setText(tickSale.getQuantityPair()+ " ĐÔI, "
                    + tickSale.getQuantityNormal() + " THƯỜNG, " + 
                    tickSale.getQuantityVip() + " VIP.");
            //Cap nhap so luong ghe doi
            this.quantityPair.setText(this.tickSale.getQuantityPair() + "");
            //Cap nhap tong tien ghe doi
            int sumMoney = tickSale.getQuantityPair() * seatPair.getUnitPrice();
            this.sumPrice_PairLB.setText(sumMoney + "");
            //Set tong tien 3 loai ghe
            this.sumMoneyAllSeat -= seatPair.getUnitPrice();
            this.tickSale.setTotalMoney(sumMoneyAllSeat);
            this.sumMoneyTopLB.setText(sumMoneyAllSeat + "");
            this.sumMoneyBotLB.setText(sumMoneyAllSeat + "");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Số lượng vé đôi không phụ hợp!");
        }
    }
    
     public void increVipTicket () {
        if (true) {
            //Tăng số lương vip và cập nhập số lượng tổng
            this.tickSale.increVip();
            tickSale.calcuQuantityAll();
            this.totalTicketLB.setText(tickSale.getQuantityAll() + "");
            this.quantityTopLB.setText(tickSale.getQuantityPair()+ " ĐÔI, "
                    + tickSale.getQuantityNormal() + " THƯỜNG, " + 
                    tickSale.getQuantityVip() + " VIP.");
            //Cap nhap so luong ghe vip
            this.quantityVip.setText(this.tickSale.getQuantityVip()+ "");
            //Cap nhap tong tien ghe vip
            int sumMoney = tickSale.getQuantityVip() * seatVip.getUnitPrice();
            this.sumPrice_VipLB.setText(sumMoney + "");
            //Set tong tien 3 loai ghe
            this.sumMoneyAllSeat += seatVip.getUnitPrice();
            this.tickSale.setTotalMoney(sumMoneyAllSeat);
            this.sumMoneyTopLB.setText(sumMoneyAllSeat + "");
            this.sumMoneyBotLB.setText(sumMoneyAllSeat + "");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Rất tiếc!"
                    + " Số lượng vé vip đã hết!");
        }
    }
     
     public void decreVipTicket () {
        if (this.tickSale.getQuantityVip()> 0) {
            //Giảm số lương Vip và cập nhập số lượng tổng
            this.tickSale.decreVip();
            tickSale.calcuQuantityAll();
            this.totalTicketLB.setText(tickSale.getQuantityAll() + "");
            this.quantityTopLB.setText(tickSale.getQuantityPair()+ " ĐÔI, "
                    + tickSale.getQuantityNormal() + " THƯỜNG, " + 
                    tickSale.getQuantityVip() + " VIP.");
            //Cap nhap so luong ghe vip
            this.quantityVip.setText(this.tickSale.getQuantityVip() + "");
            //Cap nhap tong tien ghe doi
            int sumMoney = tickSale.getQuantityVip() * seatVip.getUnitPrice();
            this.sumPrice_VipLB.setText(sumMoney + "");
            //Set tong tien 3 loai ghe
            this.sumMoneyAllSeat -= seatVip.getUnitPrice();
            this.tickSale.setTotalMoney(sumMoneyAllSeat);
            this.sumMoneyTopLB.setText(sumMoneyAllSeat + "");
            this.sumMoneyBotLB.setText(sumMoneyAllSeat + "");
        } else {
            JOptionPane.showMessageDialog(rootPane, 
                    "Số lượng vé vip không phụ hợp!");
        }
    }
    
    public void increSingleTicket () {
        if (true) {
            //Tăng số lương đơn và cập nhập số lượng tổng
            this.tickSale.increNormal();
            tickSale.calcuQuantityAll();
            this.totalTicketLB.setText(tickSale.getQuantityAll() + "");
            this.quantityTopLB.setText(tickSale.getQuantityPair()+ " ĐÔI, "
                    + tickSale.getQuantityNormal() + " THƯỜNG, " + 
                    tickSale.getQuantityVip() + " VIP.");
            //Cap nhap so luong ghe don
            this.quantitySingle.setText(this.tickSale.getQuantityNormal() + "");
            //Cap nhap tong tien ghe don
            int sumMoney = tickSale.getQuantityNormal() * seatNormal.getUnitPrice();
            this.sumPrice_SingleLB.setText(sumMoney + "");
            this.tickSale.setTotalMoney(sumMoney);
            //Set tong tien 3 loai ghe
            this.sumMoneyAllSeat += seatNormal.getUnitPrice();
            this.tickSale.setTotalMoney(sumMoneyAllSeat);
            this.sumMoneyTopLB.setText(sumMoneyAllSeat + "");
            this.sumMoneyBotLB.setText(sumMoneyAllSeat + "");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Rất tiếc!"
                    + " Số lượng vé đợn đã hết!");
        }
    }
    
    public void decrNormalTicket () {
        if (this.tickSale.getQuantityNormal()> 0) {
            //Giảm số lương thuong và cập nhập số lượng tổng
            this.tickSale.decreNormal();
            tickSale.calcuQuantityAll();
            this.totalTicketLB.setText(tickSale.getQuantityAll() + "");
            this.quantityTopLB.setText(tickSale.getQuantityPair()+ " ĐÔI, "
                    + tickSale.getQuantityNormal() + " THƯỜNG, " + 
                    tickSale.getQuantityVip() + " VIP.");
            //Cap nhap so luong ghe thuong
            this.quantitySingle.setText(this.tickSale.getQuantityNormal()+ "");
            //Cap nhap tong tien ghe doi
            int sumMoney = tickSale.getQuantityNormal()* seatNormal.getUnitPrice();
            this.sumPrice_SingleLB.setText(sumMoney + "");
            //Set tong tien 3 loai ghe
            this.sumMoneyAllSeat -= seatNormal.getUnitPrice();
            this.tickSale.setTotalMoney(sumMoneyAllSeat);
            this.sumMoneyTopLB.setText(sumMoneyAllSeat + "");
            this.sumMoneyBotLB.setText(sumMoneyAllSeat + "");
        } else {
            JOptionPane.showMessageDialog(rootPane, 
                    "Số lượng vé thường không phụ hợp!");
        }
    }
    
    public void renderListChoosenToLB (){
        String listChoosenTxt = "";
        for (JButton btnSeat : listJButtonChoosen){
            listChoosenTxt += btnSeat.getText() + " ";
        }
        this.listChoosenSeatLB.setText(listChoosenTxt);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chooseSeatBtn;
    private javax.swing.JLabel dateTxt;
    private javax.swing.JButton downPairBtn;
    private javax.swing.JButton downSingleBtn;
    private javax.swing.JButton downVipBtn;
    private javax.swing.JLabel hourTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
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
    private javax.swing.JLabel listChoosenSeatLB;
    private javax.swing.JLabel quantityPair;
    private javax.swing.JLabel quantitySingle;
    private javax.swing.JLabel quantityTopLB;
    private javax.swing.JLabel quantityVip;
    private javax.swing.JLabel sumMoneyBotLB;
    private javax.swing.JLabel sumMoneyTopLB;
    private javax.swing.JLabel sumPrice_PairLB;
    private javax.swing.JLabel sumPrice_SingleLB;
    private javax.swing.JLabel sumPrice_VipLB;
    private javax.swing.JLabel surchage_pricePairLB;
    private javax.swing.JLabel surchage_priceSingleLB;
    private javax.swing.JLabel surchage_priceVipLB;
    private javax.swing.JLabel totalTicketLB;
    private javax.swing.JLabel typeVipTicketLB;
    private javax.swing.JButton upPairBtn;
    private javax.swing.JButton upSingleBtn;
    private javax.swing.JButton upVipBtn;
    // End of variables declaration//GEN-END:variables

    private void initPageBooking() {
        this.seatPair = new Seat();
        this.seatNormal = new Seat();
        this.seatVip = new Seat();
        this.hourTxt.setText(new SimpleDateFormat("HH:mm").
                format(this.showTimeBooking.getStartTime()));
        this.dateTxt.setText(new SimpleDateFormat("dd/MM/yyyy")
                .format(this.showTimeBooking.getStartTime()));
        
        //Get normal type seat:
        seatNormal = returnSeat_corresType("ECONOMY");
        //Tinh tien ghe don (Co phu thu)
        seatNormal.setUnitPrice(showTimeBooking.getTicketPrice());
        surchage_priceSingleLB.setText(seatNormal.getUnitPrice() + "");
        
        //Get pair type seat:
        seatPair = returnSeat_corresType("COUPLE");
        //Tinh tien ghe doi (Co phu thu)
        int surChargePrice = seatPair.getTypeSeat().getSurcharge();
        seatPair.setUnitPrice(showTimeBooking.getTicketPrice() + surChargePrice);
        surchage_pricePairLB.setText(seatPair.getUnitPrice() + "");
        if (this.showTimeBooking.getRoom().getIdRoom().equals("ROOM1")
                || this.showTimeBooking.getRoom().getIdRoom().equals("ROOM2")) {
            this.typeVipTicketLB.setVisible(false);
            this.downVipBtn.setVisible(false);
            this.quantityVip.setVisible(false);
            this.upVipBtn.setVisible(false);
            this.sumPrice_VipLB.setVisible(false);
            this.surchage_priceVipLB.setVisible(false);
        } else {
            //Get vip type seat:
            this.seatVip = returnSeat_corresType("VIP");
            System.out.println(seatVip.getTypeSeat());
            int surChargeVipPrice = seatVip.getTypeSeat().getSurcharge();
            seatVip.setUnitPrice(showTimeBooking.getTicketPrice() + surChargeVipPrice);
            surchage_priceVipLB.setText(seatVip.getUnitPrice() + "");
            isSmallRoom = true;
        }
    }
    
    public Seat returnSeat_corresType(String typeOption) {
        for (Seat oneSeat : this.showTimeBooking.getRoom().getListSeat()) {
            if (oneSeat.getTypeSeat().getIdTypeSeat().equals(typeOption)) {
                return oneSeat;
            }
        }
        return null;
    }

    private void loadDataFromSQL() {
        WriteReadShowTimeSQLImp wrSTSQL = new WriteReadShowTimeSQLImp();
        this.showTimeBooking = wrSTSQL.readBookedShowTimesFromSQL(showTimeBooking);
    }

    private int returnSurcharge(String typeId) {
        for (Seat seat : showTimeBooking.getRoom().getListSeat()) {
            if (seat.getTypeSeat().getIdTypeSeat().equals(typeId)) {
                return seat.getTypeSeat().getSurcharge();
            }
        }
        return 0;
    }

    public void showCorresRoomDialog() {
        if (showTimeBooking.getRoom().getIdRoom().equals("ROOM1")
            || showTimeBooking.getRoom().getIdRoom().equals("ROOM2")) {
            Room1View room1View = new Room1View(this, true, showTimeBooking, customer, tickSale);
            room1View.setVisible(true);
        } else {
            Room2 room = new Room2(this, true, showTimeBooking, customer, tickSale);
            room.setVisible(true);
        }
    }

    void updateTextBtn() {
        this.chooseSeatBtn.setText("Thanh Toán");
        this.state = 2;
    }

    public void finishPayment() {
        insertTicketSaleSQL();
        JOptionPane.showMessageDialog(rootPane, "THANH TOÁN THÀNH CÔNG!");
    }

    private void insertTicketSaleSQL() {
        //id -> tao
        this.tickSale.setIdTS(null);
        Date saleDate = new Date();
        this.tickSale.setSaleDate(saleDate);
        this.tickSale.setShowTime(showTimeBooking);
        this.tickSale.setCustomer(customer);
        ArrayList<Seat> listSeatTS = new ArrayList<>();
        for (Seat seatST : this.showTimeBooking.getRoom().getListSeat()) {
            for (JButton choosenSeatBtn : this.listJButtonChoosen) {
                if (choosenSeatBtn.getText().equals(seatST.getID_Seat().substring(0, 3))) {
                    listSeatTS.add(seatST);
                }
            }
        }
        this.tickSale.setListSeat(listSeatTS);
        System.out.println(this.tickSale.toString());
    }
}
