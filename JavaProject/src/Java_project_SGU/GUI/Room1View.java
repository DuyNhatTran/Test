package Java_project_SGU.GUI;

import Java_project_SGU.DAL.WriteReadShowTimeSQLImp;
import Java_project_SGU.Controller.SeatListener;
import Java_project_SGU.BUS.Customer;
import Java_project_SGU.BUS.Seat;
import Java_project_SGU.BUS.ShowTime;
import Java_project_SGU.BUS.TicketSale;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dialog;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Room1View extends javax.swing.JDialog {
    private List<JButton> listJbuttonChoosen;
    private BookTicketView bookTicketView;
    private ShowTime showTimeBooking;
    private Customer customer;
    private TicketSale ticketSale;
    
    //others
    private int freePair;
    private int freeNormal;

    // constructor
    
    
    public Room1View(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.listJbuttonChoosen = new ArrayList<>();
        initComponents();
        addAcctionListener();
        
    }

    public Room1View(Dialog owner, boolean modal) {
        super(owner, modal);
        this.bookTicketView = (BookTicketView) owner;
        this.listJbuttonChoosen = new ArrayList<>();
        initComponents();
        addAcctionListener();
    }
    
    public Room1View(Dialog owner, boolean modal, ShowTime 
            showTimeBooking, Customer customer, TicketSale ticketSale) {
        this(owner, modal);
        this.showTimeBooking = showTimeBooking;
        this.customer = customer;
        initPageRoom1();
        this.ticketSale = ticketSale;
        this.freeNormal = this.ticketSale.getQuantityNormal();
        this.freePair = this.ticketSale.getQuantityPair();
        
//        WriteReadShowTimeSQLImp wrSTSQL = new WriteReadShowTimeSQLImp();
//        wrSTSQL.getBookkingTicketSale(showTimeBooking, customer);
//        for (Seat seat : ticketSale.getListSeat()) {
//            System.out.println(seat.getID_Seat());
//        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        choosenSeatsPN = new java.awt.Panel();
        A01 = new javax.swing.JButton();
        A02 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        jButton60 = new javax.swing.JButton();
        jButton61 = new javax.swing.JButton();
        jButton62 = new javax.swing.JButton();
        jButton63 = new javax.swing.JButton();
        jButton64 = new javax.swing.JButton();
        jButton65 = new javax.swing.JButton();
        jButton66 = new javax.swing.JButton();
        jButton67 = new javax.swing.JButton();
        jButton68 = new javax.swing.JButton();
        jButton69 = new javax.swing.JButton();
        jButton70 = new javax.swing.JButton();
        jButton71 = new javax.swing.JButton();
        jButton72 = new javax.swing.JButton();
        jButton73 = new javax.swing.JButton();
        jButton74 = new javax.swing.JButton();
        jButton75 = new javax.swing.JButton();
        jButton76 = new javax.swing.JButton();
        jButton77 = new javax.swing.JButton();
        jButton78 = new javax.swing.JButton();
        jButton79 = new javax.swing.JButton();
        jButton80 = new javax.swing.JButton();
        jButton81 = new javax.swing.JButton();
        jButton82 = new javax.swing.JButton();
        jButton83 = new javax.swing.JButton();
        jButton84 = new javax.swing.JButton();
        jButton85 = new javax.swing.JButton();
        jButton86 = new javax.swing.JButton();
        jButton87 = new javax.swing.JButton();
        jButton88 = new javax.swing.JButton();
        jButton89 = new javax.swing.JButton();
        jButton90 = new javax.swing.JButton();
        jButton91 = new javax.swing.JButton();
        jButton92 = new javax.swing.JButton();
        jButton93 = new javax.swing.JButton();
        jButton94 = new javax.swing.JButton();
        jButton95 = new javax.swing.JButton();
        jButton96 = new javax.swing.JButton();
        jButton97 = new javax.swing.JButton();
        jButton98 = new javax.swing.JButton();
        jButton99 = new javax.swing.JButton();
        jButton100 = new javax.swing.JButton();
        jButton101 = new javax.swing.JButton();
        jButton102 = new javax.swing.JButton();
        jButton103 = new javax.swing.JButton();
        jButton104 = new javax.swing.JButton();
        jButton105 = new javax.swing.JButton();
        jButton106 = new javax.swing.JButton();
        jButton107 = new javax.swing.JButton();
        jButton108 = new javax.swing.JButton();
        jButton109 = new javax.swing.JButton();
        jButton110 = new javax.swing.JButton();
        jButton111 = new javax.swing.JButton();
        jButton112 = new javax.swing.JButton();
        jButton113 = new javax.swing.JButton();
        jButton114 = new javax.swing.JButton();
        jButton115 = new javax.swing.JButton();
        jButton116 = new javax.swing.JButton();
        jButton117 = new javax.swing.JButton();
        jButton118 = new javax.swing.JButton();
        jButton119 = new javax.swing.JButton();
        jButton121 = new javax.swing.JButton();
        jButton122 = new javax.swing.JButton();
        jButton123 = new javax.swing.JButton();
        jButton124 = new javax.swing.JButton();
        jButton125 = new javax.swing.JButton();
        jButton126 = new javax.swing.JButton();
        jButton127 = new javax.swing.JButton();
        jButton128 = new javax.swing.JButton();
        jButton129 = new javax.swing.JButton();
        jButton130 = new javax.swing.JButton();
        jButton131 = new javax.swing.JButton();
        jButton132 = new javax.swing.JButton();
        jButton133 = new javax.swing.JButton();
        jButton134 = new javax.swing.JButton();
        jButton135 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton142 = new javax.swing.JButton();
        jButton143 = new javax.swing.JButton();
        areaPairPN = new javax.swing.JPanel();
        jButton136 = new javax.swing.JButton();
        jButton141 = new javax.swing.JButton();
        jButton140 = new javax.swing.JButton();
        jButton139 = new javax.swing.JButton();
        jButton138 = new javax.swing.JButton();
        jButton144 = new javax.swing.JButton();
        jButton145 = new javax.swing.JButton();
        jButton146 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        redoBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        payBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel3.setBackground(new java.awt.Color(153, 0, 153));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("MÀN HÌNH");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel3.setName(""); // NOI18N
        jLabel3.setOpaque(true);

        choosenSeatsPN.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N

        A01.setBackground(new java.awt.Color(255, 153, 0));
        A01.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        A01.setText("A01");
        A01.setName("few"); // NOI18N
        A01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A01ActionPerformed(evt);
            }
        });

        A02.setBackground(new java.awt.Color(255, 153, 0));
        A02.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        A02.setText("A02");
        A02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A02ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 153, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton3.setText("A03");

        jButton4.setBackground(new java.awt.Color(255, 153, 0));
        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton4.setText("A04");

        jButton5.setBackground(new java.awt.Color(255, 153, 0));
        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton5.setText("A05");

        jButton6.setBackground(new java.awt.Color(255, 153, 0));
        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton6.setText("A06");

        jButton7.setBackground(new java.awt.Color(255, 153, 0));
        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton7.setText("A07");

        jButton8.setBackground(new java.awt.Color(255, 153, 0));
        jButton8.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton8.setText("A08");

        jButton9.setBackground(new java.awt.Color(255, 153, 0));
        jButton9.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton9.setText("A09");

        jButton10.setBackground(new java.awt.Color(255, 153, 0));
        jButton10.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton10.setText("A10");

        jButton11.setBackground(new java.awt.Color(255, 153, 0));
        jButton11.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton11.setText("A11");

        jButton12.setBackground(new java.awt.Color(255, 153, 0));
        jButton12.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton12.setText("A12");

        jButton13.setBackground(new java.awt.Color(255, 153, 0));
        jButton13.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton13.setText("A13");

        jButton14.setBackground(new java.awt.Color(255, 153, 0));
        jButton14.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton14.setText("A14");

        jButton15.setBackground(new java.awt.Color(255, 153, 0));
        jButton15.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton15.setText("A15");

        jButton16.setBackground(new java.awt.Color(255, 153, 0));
        jButton16.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton16.setText("A16");

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(86, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("V");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton17.setBackground(new java.awt.Color(255, 153, 0));
        jButton17.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton17.setText("A17");

        jButton18.setBackground(new java.awt.Color(255, 153, 0));
        jButton18.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton18.setText("B01");

        jButton19.setBackground(new java.awt.Color(255, 153, 0));
        jButton19.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton19.setText("C01");
        jButton19.setRequestFocusEnabled(false);

        jButton20.setBackground(new java.awt.Color(255, 153, 0));
        jButton20.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton20.setText("D01");

        jButton21.setBackground(new java.awt.Color(255, 153, 0));
        jButton21.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton21.setText("E01");

        jButton22.setBackground(new java.awt.Color(255, 153, 0));
        jButton22.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton22.setText("F01");

        jButton23.setBackground(new java.awt.Color(255, 153, 0));
        jButton23.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton23.setText("G02");

        jButton24.setBackground(new java.awt.Color(255, 153, 0));
        jButton24.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton24.setText("H01");

        jButton25.setBackground(new java.awt.Color(255, 153, 0));
        jButton25.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton25.setText("B02");

        jButton26.setBackground(new java.awt.Color(255, 153, 0));
        jButton26.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton26.setText("B03");

        jButton27.setBackground(new java.awt.Color(255, 153, 0));
        jButton27.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton27.setText("B04");

        jButton28.setBackground(new java.awt.Color(255, 153, 0));
        jButton28.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton28.setText("B05");

        jButton29.setBackground(new java.awt.Color(255, 153, 0));
        jButton29.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton29.setText("B06");

        jButton30.setBackground(new java.awt.Color(255, 153, 0));
        jButton30.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton30.setText("B07");

        jButton31.setBackground(new java.awt.Color(255, 153, 0));
        jButton31.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton31.setText("B08");

        jButton32.setBackground(new java.awt.Color(255, 153, 0));
        jButton32.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton32.setText("B09");

        jButton33.setBackground(new java.awt.Color(255, 153, 0));
        jButton33.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton33.setText("B10");

        jButton34.setBackground(new java.awt.Color(255, 153, 0));
        jButton34.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton34.setText("B11");

        jButton35.setBackground(new java.awt.Color(255, 153, 0));
        jButton35.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton35.setText("B12");

        jButton36.setBackground(new java.awt.Color(255, 153, 0));
        jButton36.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton36.setText("B13");

        jButton37.setBackground(new java.awt.Color(255, 153, 0));
        jButton37.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton37.setText("B14");

        jButton38.setBackground(new java.awt.Color(255, 153, 0));
        jButton38.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton38.setText("B15");

        jButton39.setBackground(new java.awt.Color(255, 153, 0));
        jButton39.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton39.setText("B16");

        jButton40.setBackground(new java.awt.Color(255, 153, 0));
        jButton40.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton40.setText("B17");

        jButton41.setBackground(new java.awt.Color(255, 153, 0));
        jButton41.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton41.setText("C02");

        jButton42.setBackground(new java.awt.Color(255, 153, 0));
        jButton42.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton42.setText("C03");

        jButton43.setBackground(new java.awt.Color(255, 153, 0));
        jButton43.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton43.setText("C04");

        jButton44.setBackground(new java.awt.Color(255, 153, 0));
        jButton44.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton44.setText("C05");

        jButton45.setBackground(new java.awt.Color(255, 153, 0));
        jButton45.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton45.setText("C06");

        jButton46.setBackground(new java.awt.Color(255, 153, 0));
        jButton46.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton46.setText("C07");

        jButton47.setBackground(new java.awt.Color(255, 153, 0));
        jButton47.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton47.setText("C08");

        jButton48.setBackground(new java.awt.Color(255, 153, 0));
        jButton48.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton48.setText("C09");

        jButton49.setBackground(new java.awt.Color(255, 153, 0));
        jButton49.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton49.setText("C10");

        jButton50.setBackground(new java.awt.Color(255, 153, 0));
        jButton50.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton50.setText("C11");

        jButton51.setBackground(new java.awt.Color(255, 153, 0));
        jButton51.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton51.setText("C12");

        jButton52.setBackground(new java.awt.Color(255, 153, 0));
        jButton52.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton52.setText("C13");

        jButton53.setBackground(new java.awt.Color(255, 153, 0));
        jButton53.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton53.setText("C14");

        jButton54.setBackground(new java.awt.Color(255, 153, 0));
        jButton54.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton54.setText("C15");

        jButton55.setBackground(new java.awt.Color(255, 153, 0));
        jButton55.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton55.setText("C16");

        jButton56.setBackground(new java.awt.Color(255, 153, 0));
        jButton56.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton56.setText("C17");

        jButton57.setBackground(new java.awt.Color(255, 153, 0));
        jButton57.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton57.setText("D02");

        jButton58.setBackground(new java.awt.Color(255, 153, 0));
        jButton58.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton58.setText("D03");
        jButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton58ActionPerformed(evt);
            }
        });

        jButton59.setBackground(new java.awt.Color(255, 153, 0));
        jButton59.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton59.setText("D04");

        jButton60.setBackground(new java.awt.Color(255, 153, 0));
        jButton60.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton60.setText("D05");

        jButton61.setBackground(new java.awt.Color(255, 153, 0));
        jButton61.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton61.setText("D06");

        jButton62.setBackground(new java.awt.Color(255, 153, 0));
        jButton62.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton62.setText("D07");

        jButton63.setBackground(new java.awt.Color(255, 153, 0));
        jButton63.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton63.setText("D08");

        jButton64.setBackground(new java.awt.Color(255, 153, 0));
        jButton64.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton64.setText("D09");

        jButton65.setBackground(new java.awt.Color(255, 153, 0));
        jButton65.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton65.setText("D10");

        jButton66.setBackground(new java.awt.Color(255, 153, 0));
        jButton66.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton66.setText("D11");

        jButton67.setBackground(new java.awt.Color(255, 153, 0));
        jButton67.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton67.setText("D12");

        jButton68.setBackground(new java.awt.Color(255, 153, 0));
        jButton68.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton68.setText("D13");

        jButton69.setBackground(new java.awt.Color(255, 153, 0));
        jButton69.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton69.setText("D14");

        jButton70.setBackground(new java.awt.Color(255, 153, 0));
        jButton70.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton70.setText("D15");

        jButton71.setBackground(new java.awt.Color(255, 153, 0));
        jButton71.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton71.setText("D16");

        jButton72.setBackground(new java.awt.Color(255, 153, 0));
        jButton72.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton72.setText("D17");

        jButton73.setBackground(new java.awt.Color(255, 153, 0));
        jButton73.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton73.setText("E02");

        jButton74.setBackground(new java.awt.Color(255, 153, 0));
        jButton74.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton74.setText("E03");

        jButton75.setBackground(new java.awt.Color(255, 153, 0));
        jButton75.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton75.setText("E04");

        jButton76.setBackground(new java.awt.Color(255, 153, 0));
        jButton76.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton76.setText("E05");

        jButton77.setBackground(new java.awt.Color(255, 153, 0));
        jButton77.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton77.setText("E06");

        jButton78.setBackground(new java.awt.Color(255, 153, 0));
        jButton78.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton78.setText("E07");

        jButton79.setBackground(new java.awt.Color(255, 153, 0));
        jButton79.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton79.setText("E08");

        jButton80.setBackground(new java.awt.Color(255, 153, 0));
        jButton80.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton80.setText("E09");

        jButton81.setBackground(new java.awt.Color(255, 153, 0));
        jButton81.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton81.setText("E10");

        jButton82.setBackground(new java.awt.Color(255, 153, 0));
        jButton82.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton82.setText("E11");

        jButton83.setBackground(new java.awt.Color(255, 153, 0));
        jButton83.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton83.setText("E12");

        jButton84.setBackground(new java.awt.Color(255, 153, 0));
        jButton84.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton84.setText("E13");

        jButton85.setBackground(new java.awt.Color(255, 153, 0));
        jButton85.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton85.setText("E14");

        jButton86.setBackground(new java.awt.Color(255, 153, 0));
        jButton86.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton86.setText("E15");

        jButton87.setBackground(new java.awt.Color(255, 153, 0));
        jButton87.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton87.setText("E16");

        jButton88.setBackground(new java.awt.Color(255, 153, 0));
        jButton88.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton88.setText("E16");

        jButton89.setBackground(new java.awt.Color(255, 153, 0));
        jButton89.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton89.setText("F02");

        jButton90.setBackground(new java.awt.Color(255, 153, 0));
        jButton90.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton90.setText("F03");

        jButton91.setBackground(new java.awt.Color(255, 153, 0));
        jButton91.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton91.setText("F04");

        jButton92.setBackground(new java.awt.Color(255, 153, 0));
        jButton92.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton92.setText("F05");

        jButton93.setBackground(new java.awt.Color(255, 153, 0));
        jButton93.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton93.setText("F06");

        jButton94.setBackground(new java.awt.Color(255, 153, 0));
        jButton94.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton94.setText("F07");

        jButton95.setBackground(new java.awt.Color(255, 153, 0));
        jButton95.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton95.setText("F08");

        jButton96.setBackground(new java.awt.Color(255, 153, 0));
        jButton96.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton96.setText("F09");

        jButton97.setBackground(new java.awt.Color(255, 153, 0));
        jButton97.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton97.setText("F10");

        jButton98.setBackground(new java.awt.Color(255, 153, 0));
        jButton98.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton98.setText("F11");

        jButton99.setBackground(new java.awt.Color(255, 153, 0));
        jButton99.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton99.setText("F12");

        jButton100.setBackground(new java.awt.Color(255, 153, 0));
        jButton100.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton100.setText("F13");

        jButton101.setBackground(new java.awt.Color(255, 153, 0));
        jButton101.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton101.setText("F14");

        jButton102.setBackground(new java.awt.Color(255, 153, 0));
        jButton102.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton102.setText("F15");

        jButton103.setBackground(new java.awt.Color(255, 153, 0));
        jButton103.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton103.setText("F16");

        jButton104.setBackground(new java.awt.Color(255, 153, 0));
        jButton104.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton104.setText("F17");

        jButton105.setBackground(new java.awt.Color(255, 153, 0));
        jButton105.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton105.setText("G03");

        jButton106.setBackground(new java.awt.Color(255, 153, 0));
        jButton106.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton106.setText("G04");

        jButton107.setBackground(new java.awt.Color(255, 153, 0));
        jButton107.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton107.setText("G05");

        jButton108.setBackground(new java.awt.Color(255, 153, 0));
        jButton108.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton108.setText("G06");

        jButton109.setBackground(new java.awt.Color(255, 153, 0));
        jButton109.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton109.setText("G07");

        jButton110.setBackground(new java.awt.Color(255, 153, 0));
        jButton110.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton110.setText("G08");

        jButton111.setBackground(new java.awt.Color(255, 153, 0));
        jButton111.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton111.setText("G09");

        jButton112.setBackground(new java.awt.Color(255, 153, 0));
        jButton112.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton112.setText("G10");

        jButton113.setBackground(new java.awt.Color(255, 153, 0));
        jButton113.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton113.setText("G11");

        jButton114.setBackground(new java.awt.Color(255, 153, 0));
        jButton114.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton114.setText("G12");

        jButton115.setBackground(new java.awt.Color(255, 153, 0));
        jButton115.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton115.setText("G13");

        jButton116.setBackground(new java.awt.Color(255, 153, 0));
        jButton116.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton116.setText("G14");

        jButton117.setBackground(new java.awt.Color(255, 153, 0));
        jButton117.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton117.setText("G15");

        jButton118.setBackground(new java.awt.Color(255, 153, 0));
        jButton118.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton118.setText("G16");

        jButton119.setBackground(new java.awt.Color(255, 153, 0));
        jButton119.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton119.setText("G17");

        jButton121.setBackground(new java.awt.Color(255, 153, 0));
        jButton121.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton121.setText("H02");

        jButton122.setBackground(new java.awt.Color(255, 153, 0));
        jButton122.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton122.setText("H03");

        jButton123.setBackground(new java.awt.Color(255, 153, 0));
        jButton123.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton123.setText("H04");
        jButton123.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton123ActionPerformed(evt);
            }
        });

        jButton124.setBackground(new java.awt.Color(255, 153, 0));
        jButton124.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton124.setText("H05");
        jButton124.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton124ActionPerformed(evt);
            }
        });

        jButton125.setBackground(new java.awt.Color(255, 153, 0));
        jButton125.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton125.setText("H06");
        jButton125.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton125ActionPerformed(evt);
            }
        });

        jButton126.setBackground(new java.awt.Color(255, 153, 0));
        jButton126.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton126.setText("H07");
        jButton126.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton126ActionPerformed(evt);
            }
        });

        jButton127.setBackground(new java.awt.Color(255, 153, 0));
        jButton127.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton127.setText("H08");
        jButton127.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton127ActionPerformed(evt);
            }
        });

        jButton128.setBackground(new java.awt.Color(255, 153, 0));
        jButton128.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton128.setText("H09");
        jButton128.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton128ActionPerformed(evt);
            }
        });

        jButton129.setBackground(new java.awt.Color(255, 153, 0));
        jButton129.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton129.setText("H10");
        jButton129.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton129ActionPerformed(evt);
            }
        });

        jButton130.setBackground(new java.awt.Color(255, 153, 0));
        jButton130.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton130.setText("H12");
        jButton130.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton130ActionPerformed(evt);
            }
        });

        jButton131.setBackground(new java.awt.Color(255, 153, 0));
        jButton131.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton131.setText("H13");
        jButton131.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton131ActionPerformed(evt);
            }
        });

        jButton132.setBackground(new java.awt.Color(255, 153, 0));
        jButton132.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton132.setText("H14");
        jButton132.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton132ActionPerformed(evt);
            }
        });

        jButton133.setBackground(new java.awt.Color(255, 153, 0));
        jButton133.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton133.setText("H15");
        jButton133.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton133ActionPerformed(evt);
            }
        });

        jButton134.setBackground(new java.awt.Color(255, 153, 0));
        jButton134.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton134.setText("H16");
        jButton134.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton134ActionPerformed(evt);
            }
        });

        jButton135.setBackground(new java.awt.Color(255, 153, 0));
        jButton135.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton135.setText("H17");
        jButton135.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton135ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setPreferredSize(new java.awt.Dimension(86, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("V");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton142.setBackground(new java.awt.Color(255, 153, 0));
        jButton142.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton142.setText("G01");

        jButton143.setBackground(new java.awt.Color(255, 153, 0));
        jButton143.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jButton143.setText("H11");

        jButton136.setBackground(new java.awt.Color(153, 0, 153));
        jButton136.setText("I01");

        jButton141.setBackground(new java.awt.Color(153, 0, 153));
        jButton141.setText("I02");
        jButton141.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton141ActionPerformed(evt);
            }
        });

        jButton140.setBackground(new java.awt.Color(153, 0, 153));
        jButton140.setText("I04");
        jButton140.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton140ActionPerformed(evt);
            }
        });

        jButton139.setBackground(new java.awt.Color(153, 0, 153));
        jButton139.setText("I05");
        jButton139.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton139ActionPerformed(evt);
            }
        });

        jButton138.setBackground(new java.awt.Color(153, 0, 153));
        jButton138.setText("I06");
        jButton138.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton138ActionPerformed(evt);
            }
        });

        jButton144.setBackground(new java.awt.Color(153, 0, 153));
        jButton144.setText("I07");
        jButton144.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton144ActionPerformed(evt);
            }
        });

        jButton145.setBackground(new java.awt.Color(153, 0, 153));
        jButton145.setText("I08");
        jButton145.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton145ActionPerformed(evt);
            }
        });

        jButton146.setBackground(new java.awt.Color(153, 0, 153));
        jButton146.setText("I09");
        jButton146.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton146ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout areaPairPNLayout = new javax.swing.GroupLayout(areaPairPN);
        areaPairPN.setLayout(areaPairPNLayout);
        areaPairPNLayout.setHorizontalGroup(
            areaPairPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPairPNLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jButton136, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton141, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton140, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton139, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton138, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton144, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton145, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton146, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        areaPairPNLayout.setVerticalGroup(
            areaPairPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPairPNLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaPairPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton136, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton138, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton139, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton140, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton141, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton144, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton145, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton146, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout choosenSeatsPNLayout = new javax.swing.GroupLayout(choosenSeatsPN);
        choosenSeatsPN.setLayout(choosenSeatsPNLayout);
        choosenSeatsPNLayout.setHorizontalGroup(
            choosenSeatsPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(choosenSeatsPNLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(choosenSeatsPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(choosenSeatsPNLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(choosenSeatsPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(choosenSeatsPNLayout.createSequentialGroup()
                                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton73, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton74, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton75, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton76, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton77, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton78, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton79, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton80, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton81, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton82, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton83, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton84, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton85, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton86, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton87, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton88, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(choosenSeatsPNLayout.createSequentialGroup()
                                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton51, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton56, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(choosenSeatsPNLayout.createSequentialGroup()
                                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton89, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton90, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton91, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton92, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton93, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton94, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton95, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton96, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton97, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton98, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton99, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton100, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton101, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton102, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton103, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton104, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(choosenSeatsPNLayout.createSequentialGroup()
                                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton58, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton59, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton61, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton62, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton63, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton64, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton65, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton66, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton67, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton68, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton69, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton70, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton71, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton72, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(choosenSeatsPNLayout.createSequentialGroup()
                                .addGroup(choosenSeatsPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(A01, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(choosenSeatsPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(choosenSeatsPNLayout.createSequentialGroup()
                                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, choosenSeatsPNLayout.createSequentialGroup()
                                        .addComponent(A02, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(choosenSeatsPNLayout.createSequentialGroup()
                                .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton121, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton122, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton123, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton124, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton125, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton126, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton127, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton128, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton129, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton143, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton130, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton131, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton132, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton133, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton134, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton135, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(choosenSeatsPNLayout.createSequentialGroup()
                                .addComponent(jButton142, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton105, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton106, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton107, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton108, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton109, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton110, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton111, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton112, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton113, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton114, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton115, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton116, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton117, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton118, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton119, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(choosenSeatsPNLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(areaPairPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))
        );
        choosenSeatsPNLayout.setVerticalGroup(
            choosenSeatsPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(choosenSeatsPNLayout.createSequentialGroup()
                .addGroup(choosenSeatsPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A02, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A01, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(choosenSeatsPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(choosenSeatsPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton51, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton56, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(choosenSeatsPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton58, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton59, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton61, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton62, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton63, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton64, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton65, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton66, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton67, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton68, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton69, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton70, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton71, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton72, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(choosenSeatsPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton73, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton74, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton75, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton76, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton77, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton78, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton79, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton80, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton81, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton82, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton83, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton84, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton85, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton86, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton87, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton88, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(choosenSeatsPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton89, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton90, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton91, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton92, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton93, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton94, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton95, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton96, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton97, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton98, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton99, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton100, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton101, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton102, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton103, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton104, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(choosenSeatsPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton105, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton106, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton107, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton108, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton109, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton110, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton111, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton112, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton113, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton114, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton115, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton116, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton117, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton118, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton119, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton142, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(choosenSeatsPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton121, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton122, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton123, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton124, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton125, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton126, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton127, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton128, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton129, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton130, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton131, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton132, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton133, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton134, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton135, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton143, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(areaPairPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
        );

        jPanel4.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel8.setText("Ghế đơn");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel5.setText("Đang chọn");

        jLabel6.setBackground(new java.awt.Color(51, 153, 255));
        jLabel6.setForeground(new java.awt.Color(51, 153, 255));
        jLabel6.setText("jLabel4");
        jLabel6.setOpaque(true);
        jLabel6.setPreferredSize(new java.awt.Dimension(35, 35));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel7.setText("Ghế đôi");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel10.setText("Đã bán");

        jLabel13.setBackground(new java.awt.Color(255, 153, 0));
        jLabel13.setForeground(new java.awt.Color(255, 153, 0));
        jLabel13.setText("jLabel4");
        jLabel13.setOpaque(true);
        jLabel13.setPreferredSize(new java.awt.Dimension(35, 35));

        jLabel14.setBackground(new java.awt.Color(153, 0, 153));
        jLabel14.setForeground(new java.awt.Color(153, 0, 153));
        jLabel14.setText("jLabel4");
        jLabel14.setOpaque(true);
        jLabel14.setPreferredSize(new java.awt.Dimension(35, 35));

        jLabel15.setBackground(new java.awt.Color(204, 204, 204));
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("jLabel4");
        jLabel15.setOpaque(true);
        jLabel15.setPreferredSize(new java.awt.Dimension(35, 35));

        redoBtn.setBackground(new java.awt.Color(255, 204, 51));
        redoBtn.setText("Hoàn tác");
        redoBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        backBtn.setBackground(new java.awt.Color(255, 153, 0));
        backBtn.setText("Quay lại");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        payBtn.setBackground(new java.awt.Color(255, 153, 0));
        payBtn.setText("Hoàn Tất");
        payBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(redoBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(57, 57, 57)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(54, 54, 54)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(63, 63, 63)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(101, 101, 101)
                .addComponent(backBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(payBtn)
                .addGap(80, 80, 80))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(redoBtn)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(backBtn)
                    .addComponent(payBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(choosenSeatsPN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 909, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(choosenSeatsPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void A01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A01ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A01ActionPerformed

    private void A02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A02ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A02ActionPerformed

    private void jButton58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton58ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton58ActionPerformed

    private void jButton123ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton123ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton123ActionPerformed

    private void jButton124ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton124ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton124ActionPerformed

    private void jButton125ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton125ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton125ActionPerformed

    private void jButton126ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton126ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton126ActionPerformed

    private void jButton127ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton127ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton127ActionPerformed

    private void jButton128ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton128ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton128ActionPerformed

    private void jButton129ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton129ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton129ActionPerformed

    private void jButton130ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton130ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton130ActionPerformed

    private void jButton131ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton131ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton131ActionPerformed

    private void jButton132ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton132ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton132ActionPerformed

    private void jButton133ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton133ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton133ActionPerformed

    private void jButton134ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton134ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton134ActionPerformed

    private void jButton135ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton135ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton135ActionPerformed

    private void jButton138ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton138ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton138ActionPerformed

    private void jButton139ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton139ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton139ActionPerformed

    private void jButton140ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton140ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton140ActionPerformed

    private void jButton141ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton141ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton141ActionPerformed

    private void jButton144ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton144ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton144ActionPerformed

    private void jButton145ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton145ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton145ActionPerformed

    private void jButton146ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton146ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton146ActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backBtnActionPerformed

    private void payBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Room1View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Room1View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Room1View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Room1View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Room1View dialog = new Room1View(new javax.swing.JFrame(), true);
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
    public List<JButton> getListbtnChoosenSeat (){
        return listJbuttonChoosen;
    }

    public void addAcctionListener() {
        SeatListener seatListener = new SeatListener(this);
        redoBtn.addActionListener(seatListener);
        A01.addActionListener(seatListener);
        A02.addActionListener(seatListener);
        jButton10.addActionListener(seatListener);
        jButton100.addActionListener(seatListener);
        jButton101.addActionListener(seatListener);
        jButton102.addActionListener(seatListener);
        jButton103.addActionListener(seatListener);
        jButton104.addActionListener(seatListener);
        jButton105.addActionListener(seatListener);
        jButton106.addActionListener(seatListener);
        jButton107.addActionListener(seatListener);
        jButton108.addActionListener(seatListener);
        jButton109.addActionListener(seatListener);
        jButton11.addActionListener(seatListener);
        jButton110.addActionListener(seatListener);
        jButton111.addActionListener(seatListener);
        jButton112.addActionListener(seatListener);
        jButton113.addActionListener(seatListener);
        jButton114.addActionListener(seatListener);
        jButton115.addActionListener(seatListener);
        jButton116.addActionListener(seatListener);
        jButton117.addActionListener(seatListener);
        jButton118.addActionListener(seatListener);
        jButton119.addActionListener(seatListener);
        jButton12.addActionListener(seatListener);
        jButton121.addActionListener(seatListener);
        jButton122.addActionListener(seatListener);
        jButton123.addActionListener(seatListener);
        jButton124.addActionListener(seatListener);
        jButton125.addActionListener(seatListener);
        jButton126.addActionListener(seatListener);
        jButton127.addActionListener(seatListener);
        jButton128.addActionListener(seatListener);
        jButton129.addActionListener(seatListener);
        jButton13.addActionListener(seatListener);
        jButton130.addActionListener(seatListener);
        jButton131.addActionListener(seatListener);
        jButton132.addActionListener(seatListener);
        jButton133.addActionListener(seatListener);
        jButton134.addActionListener(seatListener);
        jButton135.addActionListener(seatListener);
        jButton136.addActionListener(seatListener);
        jButton138.addActionListener(seatListener);
        jButton139.addActionListener(seatListener);
        jButton14.addActionListener(seatListener);
        jButton140.addActionListener(seatListener);
        jButton141.addActionListener(seatListener);
        jButton142.addActionListener(seatListener);
        jButton143.addActionListener(seatListener);
        jButton144.addActionListener(seatListener);
        jButton145.addActionListener(seatListener);
        jButton146.addActionListener(seatListener);
        jButton15.addActionListener(seatListener);
        jButton16.addActionListener(seatListener);
        jButton17.addActionListener(seatListener);
        jButton18.addActionListener(seatListener);
        jButton19.addActionListener(seatListener);
        jButton20.addActionListener(seatListener);
        jButton21.addActionListener(seatListener);
        jButton22.addActionListener(seatListener);
        jButton23.addActionListener(seatListener);
        jButton24.addActionListener(seatListener);
        jButton25.addActionListener(seatListener);
        jButton26.addActionListener(seatListener);
        jButton27.addActionListener(seatListener);
        jButton28.addActionListener(seatListener);
        jButton29.addActionListener(seatListener);
        jButton3.addActionListener(seatListener);
        jButton30.addActionListener(seatListener);
        jButton31.addActionListener(seatListener);
        jButton32.addActionListener(seatListener);
        jButton33.addActionListener(seatListener);
        jButton34.addActionListener(seatListener);
        jButton35.addActionListener(seatListener);
        jButton36.addActionListener(seatListener);
        jButton37.addActionListener(seatListener);
        jButton38.addActionListener(seatListener);
        jButton39.addActionListener(seatListener);
        jButton4.addActionListener(seatListener);
        jButton40.addActionListener(seatListener);
        jButton41.addActionListener(seatListener);
        jButton42.addActionListener(seatListener);
        jButton43.addActionListener(seatListener);
        jButton44.addActionListener(seatListener);
        jButton45.addActionListener(seatListener);
        jButton46.addActionListener(seatListener);
        jButton47.addActionListener(seatListener);
        jButton48.addActionListener(seatListener);
        jButton49.addActionListener(seatListener);
        jButton5.addActionListener(seatListener);
        jButton50.addActionListener(seatListener);
        jButton51.addActionListener(seatListener);
        jButton52.addActionListener(seatListener);
        jButton53.addActionListener(seatListener);
        jButton54.addActionListener(seatListener);
        jButton55.addActionListener(seatListener);
        jButton56.addActionListener(seatListener);
        jButton57.addActionListener(seatListener);
        jButton58.addActionListener(seatListener);
        jButton59.addActionListener(seatListener);
        jButton6.addActionListener(seatListener);
        jButton60.addActionListener(seatListener);
        jButton61.addActionListener(seatListener);
        jButton62.addActionListener(seatListener);
        jButton63.addActionListener(seatListener);
        jButton64.addActionListener(seatListener);
        jButton65.addActionListener(seatListener);
        jButton66.addActionListener(seatListener);
        jButton67.addActionListener(seatListener);
        jButton68.addActionListener(seatListener);
        jButton69.addActionListener(seatListener);
        jButton7.addActionListener(seatListener);
        jButton70.addActionListener(seatListener);
        jButton71.addActionListener(seatListener);
        jButton72.addActionListener(seatListener);
        jButton73.addActionListener(seatListener);
        jButton74.addActionListener(seatListener);
        jButton75.addActionListener(seatListener);
        jButton76.addActionListener(seatListener);
        jButton77.addActionListener(seatListener);
        jButton78.addActionListener(seatListener);
        jButton79.addActionListener(seatListener);
        jButton8.addActionListener(seatListener);
        jButton80.addActionListener(seatListener);
        jButton81.addActionListener(seatListener);
        jButton82.addActionListener(seatListener);
        jButton83.addActionListener(seatListener);
        jButton84.addActionListener(seatListener);
        jButton85.addActionListener(seatListener);
        jButton86.addActionListener(seatListener);
        jButton87.addActionListener(seatListener);
        jButton88.addActionListener(seatListener);
        jButton89.addActionListener(seatListener);
        jButton9.addActionListener(seatListener);
        jButton90.addActionListener(seatListener);
        jButton91.addActionListener(seatListener);
        jButton92.addActionListener(seatListener);
        jButton93.addActionListener(seatListener);
        jButton94.addActionListener(seatListener);
        jButton95.addActionListener(seatListener);
        jButton96.addActionListener(seatListener);
        jButton97.addActionListener(seatListener);
        jButton98.addActionListener(seatListener);
        jButton99.addActionListener(seatListener);
        payBtn.addActionListener(seatListener);
        backBtn.addActionListener(seatListener);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A01;
    private javax.swing.JButton A02;
    private javax.swing.JPanel areaPairPN;
    private javax.swing.JButton backBtn;
    private java.awt.Panel choosenSeatsPN;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton100;
    private javax.swing.JButton jButton101;
    private javax.swing.JButton jButton102;
    private javax.swing.JButton jButton103;
    private javax.swing.JButton jButton104;
    private javax.swing.JButton jButton105;
    private javax.swing.JButton jButton106;
    private javax.swing.JButton jButton107;
    private javax.swing.JButton jButton108;
    private javax.swing.JButton jButton109;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton110;
    private javax.swing.JButton jButton111;
    private javax.swing.JButton jButton112;
    private javax.swing.JButton jButton113;
    private javax.swing.JButton jButton114;
    private javax.swing.JButton jButton115;
    private javax.swing.JButton jButton116;
    private javax.swing.JButton jButton117;
    private javax.swing.JButton jButton118;
    private javax.swing.JButton jButton119;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton121;
    private javax.swing.JButton jButton122;
    private javax.swing.JButton jButton123;
    private javax.swing.JButton jButton124;
    private javax.swing.JButton jButton125;
    private javax.swing.JButton jButton126;
    private javax.swing.JButton jButton127;
    private javax.swing.JButton jButton128;
    private javax.swing.JButton jButton129;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton130;
    private javax.swing.JButton jButton131;
    private javax.swing.JButton jButton132;
    private javax.swing.JButton jButton133;
    private javax.swing.JButton jButton134;
    private javax.swing.JButton jButton135;
    private javax.swing.JButton jButton136;
    private javax.swing.JButton jButton138;
    private javax.swing.JButton jButton139;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton140;
    private javax.swing.JButton jButton141;
    private javax.swing.JButton jButton142;
    private javax.swing.JButton jButton143;
    private javax.swing.JButton jButton144;
    private javax.swing.JButton jButton145;
    private javax.swing.JButton jButton146;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton61;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton63;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton65;
    private javax.swing.JButton jButton66;
    private javax.swing.JButton jButton67;
    private javax.swing.JButton jButton68;
    private javax.swing.JButton jButton69;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton70;
    private javax.swing.JButton jButton71;
    private javax.swing.JButton jButton72;
    private javax.swing.JButton jButton73;
    private javax.swing.JButton jButton74;
    private javax.swing.JButton jButton75;
    private javax.swing.JButton jButton76;
    private javax.swing.JButton jButton77;
    private javax.swing.JButton jButton78;
    private javax.swing.JButton jButton79;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton80;
    private javax.swing.JButton jButton81;
    private javax.swing.JButton jButton82;
    private javax.swing.JButton jButton83;
    private javax.swing.JButton jButton84;
    private javax.swing.JButton jButton85;
    private javax.swing.JButton jButton86;
    private javax.swing.JButton jButton87;
    private javax.swing.JButton jButton88;
    private javax.swing.JButton jButton89;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButton90;
    private javax.swing.JButton jButton91;
    private javax.swing.JButton jButton92;
    private javax.swing.JButton jButton93;
    private javax.swing.JButton jButton94;
    private javax.swing.JButton jButton95;
    private javax.swing.JButton jButton96;
    private javax.swing.JButton jButton97;
    private javax.swing.JButton jButton98;
    private javax.swing.JButton jButton99;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton payBtn;
    private javax.swing.JButton redoBtn;
    // End of variables declaration//GEN-END:variables

    
    
    public void removeLastChoosenBtn() {
        if (this.areaPairPN.isAncestorOf(this.listJbuttonChoosen.
                get(listJbuttonChoosen.size() - 1))) {
            this.freePair--;
        } else {
            this.freeNormal--;
        }
        this.listJbuttonChoosen.get(listJbuttonChoosen.size() - 1).setEnabled(true);
        this.listJbuttonChoosen.remove(listJbuttonChoosen.size() - 1);
        this.listJbuttonChoosen.remove(this.listJbuttonChoosen.size() - 1);
    }

    public void chooseButton(JButton src) {
        if (!src.equals(redoBtn) && !src.equals(payBtn) && !src.equals(backBtn)) {
            if (this.areaPairPN.isAncestorOf(src)) {
                if (freePair > 0) {
                    freePair--;
                    src.setEnabled(false);
                    src.setBackground(new java.awt.Color(51,153,255));
                    this.listJbuttonChoosen.add(src);
                } else {
                    JOptionPane.showMessageDialog(rootPane, 
                            "Vui lòng quay lại chọn thêm vé đôi!");
                }
            } else {
                if (freeNormal > 0) {
                    freeNormal--;
                    src.setEnabled(false);
                    src.setBackground(new java.awt.Color(51,153,255));
                    this.listJbuttonChoosen.add(src);
                } else {
                    JOptionPane.showMessageDialog(rootPane, 
                            "Vui lòng quay lại chọn thêm vé đơn!");
                }
            }
        }
    }
    
    public void proceedPayment(){
        this.bookTicketView.updateTextBtn();
        this.bookTicketView.setListJButtonChoosen(listJbuttonChoosen);
        this.bookTicketView.renderListChoosenToLB();
    }

    private void initPageRoom1() {
        for (Component choosenSeatCom: choosenSeatsPN.getComponents()) {
            if (choosenSeatCom instanceof JButton) {
                JButton choosenSeatBtn= (JButton) choosenSeatCom;
                for (Seat choosenSeatST : this.
                        showTimeBooking.getRoom().getListSeat()) {
                    String nameSeat = choosenSeatST.getID_Seat().substring(0, 3);
                    if (choosenSeatBtn.getText().equals(nameSeat)) {
                        if (showTimeBooking.isIsChoosen()) {
                            choosenSeatBtn.setEnabled(false);
                        }
                    }
                }
            }
        }
    }
}
