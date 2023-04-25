package Java_project_SGU.GUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Room1OfTicketClerk extends javax.swing.JDialog implements ActionListener {

    private TicketClerkView ticketClerkView;
    private List<JButton> listJbuttonChoosen;
    private List<String> seatChoosen;

    // constructor
    public Room1OfTicketClerk(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.listJbuttonChoosen = new ArrayList<>();
        this.seatChoosen = new ArrayList<>();
        this.addActionListener();
        this.setUpPage();
    }

    public Room1OfTicketClerk(Dialog owner, boolean modal) {
        super(owner, modal);
        initComponents();
        this.ticketClerkView = (TicketClerkView) owner;
        this.listJbuttonChoosen = new ArrayList<>();
        this.seatChoosen = new ArrayList<>();
        this.addActionListener();
        this.setUpPage();
    }

    // getter and setter
    public List<String> getSeatChoosen() {
        return seatChoosen;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        seatPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
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
        jButton120 = new javax.swing.JButton();
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
        jButton136 = new javax.swing.JButton();
        jButton137 = new javax.swing.JButton();
        jButton138 = new javax.swing.JButton();
        jButton139 = new javax.swing.JButton();
        jButton140 = new javax.swing.JButton();
        jButton141 = new javax.swing.JButton();
        jButton142 = new javax.swing.JButton();
        jButton143 = new javax.swing.JButton();
        jButton144 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        finishBTN = new javax.swing.JButton();
        undoBTN = new javax.swing.JButton();
        aBackBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(102, 51, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MÀN HÌNH");
        jLabel1.setToolTipText("");
        jLabel1.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 849, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("V");
        jLabel2.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jButton1.setBackground(new java.awt.Color(255, 153, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton1.setText("A01");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton2.setBackground(new java.awt.Color(255, 153, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton2.setText("A02");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton3.setBackground(new java.awt.Color(255, 153, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton3.setText("A03");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton4.setBackground(new java.awt.Color(255, 153, 0));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton4.setText("A04");
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setMargin(new java.awt.Insets(2, 7, 3, 14));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 153, 0));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton5.setText("A05");
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setMargin(new java.awt.Insets(2, 7, 3, 14));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 153, 0));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton6.setText("A06");
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton7.setBackground(new java.awt.Color(255, 153, 0));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton7.setText("A07");
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton8.setBackground(new java.awt.Color(255, 153, 0));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton8.setText("A08");
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton9.setBackground(new java.awt.Color(255, 153, 0));
        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton9.setText("A09");
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton9.setMargin(new java.awt.Insets(2, 7, 3, 14));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(255, 153, 0));
        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton10.setText("A10");
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton10.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton11.setBackground(new java.awt.Color(255, 153, 0));
        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton11.setText("A11");
        jButton11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton11.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton12.setBackground(new java.awt.Color(255, 153, 0));
        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton12.setText("A12");
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton12.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton13.setBackground(new java.awt.Color(255, 153, 0));
        jButton13.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton13.setText("A13");
        jButton13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton13.setMargin(new java.awt.Insets(2, 7, 3, 14));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(255, 153, 0));
        jButton14.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton14.setText("A14");
        jButton14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton14.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton15.setBackground(new java.awt.Color(255, 153, 0));
        jButton15.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton15.setText("A15");
        jButton15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton15.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton16.setBackground(new java.awt.Color(255, 153, 0));
        jButton16.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton16.setText("A16");
        jButton16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton16.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton17.setBackground(new java.awt.Color(255, 153, 0));
        jButton17.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton17.setText("A17");
        jButton17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton17.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton18.setBackground(new java.awt.Color(255, 153, 0));
        jButton18.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton18.setText("B01");
        jButton18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton18.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton19.setBackground(new java.awt.Color(255, 153, 0));
        jButton19.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton19.setText("C01");
        jButton19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton19.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton20.setBackground(new java.awt.Color(255, 153, 0));
        jButton20.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton20.setText("D01");
        jButton20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton20.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton21.setBackground(new java.awt.Color(255, 153, 0));
        jButton21.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton21.setText("E01");
        jButton21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton21.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton22.setBackground(new java.awt.Color(255, 153, 0));
        jButton22.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton22.setText("F01");
        jButton22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton22.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton23.setBackground(new java.awt.Color(255, 153, 0));
        jButton23.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton23.setText("G01");
        jButton23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton23.setMargin(new java.awt.Insets(2, 7, 3, 14));
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setBackground(new java.awt.Color(255, 153, 0));
        jButton24.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton24.setText("H01");
        jButton24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton24.setMargin(new java.awt.Insets(2, 6, 3, 14));
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setBackground(new java.awt.Color(255, 153, 0));
        jButton25.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton25.setText("B02");
        jButton25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton25.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton26.setBackground(new java.awt.Color(255, 153, 0));
        jButton26.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton26.setText("B03");
        jButton26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton26.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton27.setBackground(new java.awt.Color(255, 153, 0));
        jButton27.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton27.setText("B04");
        jButton27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton27.setMargin(new java.awt.Insets(2, 7, 3, 14));
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton28.setBackground(new java.awt.Color(255, 153, 0));
        jButton28.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton28.setText("B05");
        jButton28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton28.setMargin(new java.awt.Insets(2, 7, 3, 14));
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton29.setBackground(new java.awt.Color(255, 153, 0));
        jButton29.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton29.setText("B06");
        jButton29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton29.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton30.setBackground(new java.awt.Color(255, 153, 0));
        jButton30.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton30.setText("B07");
        jButton30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton30.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton31.setBackground(new java.awt.Color(255, 153, 0));
        jButton31.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton31.setText("B08");
        jButton31.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton31.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton32.setBackground(new java.awt.Color(255, 153, 0));
        jButton32.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton32.setText("B09");
        jButton32.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton32.setMargin(new java.awt.Insets(2, 7, 3, 14));
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jButton33.setBackground(new java.awt.Color(255, 153, 0));
        jButton33.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton33.setText("B10");
        jButton33.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton33.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton34.setBackground(new java.awt.Color(255, 153, 0));
        jButton34.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton34.setText("B11");
        jButton34.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton34.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton35.setBackground(new java.awt.Color(255, 153, 0));
        jButton35.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton35.setText("B12");
        jButton35.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton35.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton36.setBackground(new java.awt.Color(255, 153, 0));
        jButton36.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton36.setText("B13");
        jButton36.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton36.setMargin(new java.awt.Insets(2, 7, 3, 14));
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        jButton37.setBackground(new java.awt.Color(255, 153, 0));
        jButton37.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton37.setText("B14");
        jButton37.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton37.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton38.setBackground(new java.awt.Color(255, 153, 0));
        jButton38.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton38.setText("B15");
        jButton38.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton38.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton39.setBackground(new java.awt.Color(255, 153, 0));
        jButton39.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton39.setText("B16");
        jButton39.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton39.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton40.setBackground(new java.awt.Color(255, 153, 0));
        jButton40.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton40.setText("B17");
        jButton40.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton40.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton41.setBackground(new java.awt.Color(255, 153, 0));
        jButton41.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton41.setText("C02");
        jButton41.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton41.setMargin(new java.awt.Insets(2, 7, 3, 14));
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        jButton42.setBackground(new java.awt.Color(255, 153, 0));
        jButton42.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton42.setText("C03");
        jButton42.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton42.setMargin(new java.awt.Insets(2, 7, 3, 14));
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });

        jButton43.setBackground(new java.awt.Color(255, 153, 0));
        jButton43.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton43.setText("C04");
        jButton43.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton43.setMargin(new java.awt.Insets(2, 7, 3, 14));
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });

        jButton44.setBackground(new java.awt.Color(255, 153, 0));
        jButton44.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton44.setText("C05");
        jButton44.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton44.setMargin(new java.awt.Insets(2, 7, 3, 14));
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });

        jButton45.setBackground(new java.awt.Color(255, 153, 0));
        jButton45.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton45.setText("C06");
        jButton45.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton45.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton46.setBackground(new java.awt.Color(255, 153, 0));
        jButton46.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton46.setText("C07");
        jButton46.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton46.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton47.setBackground(new java.awt.Color(255, 153, 0));
        jButton47.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton47.setText("C08");
        jButton47.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton47.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton48.setBackground(new java.awt.Color(255, 153, 0));
        jButton48.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton48.setText("C09");
        jButton48.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton48.setMargin(new java.awt.Insets(2, 7, 3, 14));
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });

        jButton49.setBackground(new java.awt.Color(255, 153, 0));
        jButton49.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton49.setText("C10");
        jButton49.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton49.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton50.setBackground(new java.awt.Color(255, 153, 0));
        jButton50.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton50.setText("C11");
        jButton50.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton50.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton51.setBackground(new java.awt.Color(255, 153, 0));
        jButton51.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton51.setText("C12");
        jButton51.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton51.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton52.setBackground(new java.awt.Color(255, 153, 0));
        jButton52.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton52.setText("C13");
        jButton52.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton52.setMargin(new java.awt.Insets(2, 7, 3, 14));
        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton52ActionPerformed(evt);
            }
        });

        jButton53.setBackground(new java.awt.Color(255, 153, 0));
        jButton53.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton53.setText("C14");
        jButton53.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton53.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton54.setBackground(new java.awt.Color(255, 153, 0));
        jButton54.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton54.setText("C15");
        jButton54.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton54.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton55.setBackground(new java.awt.Color(255, 153, 0));
        jButton55.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton55.setText("C16");
        jButton55.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton55.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton56.setBackground(new java.awt.Color(255, 153, 0));
        jButton56.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton56.setText("C17");
        jButton56.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton56.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton57.setBackground(new java.awt.Color(255, 153, 0));
        jButton57.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton57.setText("D02");
        jButton57.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton57.setMargin(new java.awt.Insets(2, 7, 3, 14));
        jButton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton57ActionPerformed(evt);
            }
        });

        jButton58.setBackground(new java.awt.Color(255, 153, 0));
        jButton58.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton58.setText("D03");
        jButton58.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton58.setMargin(new java.awt.Insets(2, 7, 3, 14));
        jButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton58ActionPerformed(evt);
            }
        });

        jButton59.setBackground(new java.awt.Color(255, 153, 0));
        jButton59.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton59.setText("D04");
        jButton59.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton59.setMargin(new java.awt.Insets(2, 7, 3, 14));
        jButton59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton59ActionPerformed(evt);
            }
        });

        jButton60.setBackground(new java.awt.Color(255, 153, 0));
        jButton60.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton60.setText("D05");
        jButton60.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton60.setMargin(new java.awt.Insets(2, 7, 3, 14));
        jButton60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton60ActionPerformed(evt);
            }
        });

        jButton61.setBackground(new java.awt.Color(255, 153, 0));
        jButton61.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton61.setText("D06");
        jButton61.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton61.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton62.setBackground(new java.awt.Color(255, 153, 0));
        jButton62.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton62.setText("D07");
        jButton62.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton62.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton63.setBackground(new java.awt.Color(255, 153, 0));
        jButton63.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton63.setText("D08");
        jButton63.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton63.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton64.setBackground(new java.awt.Color(255, 153, 0));
        jButton64.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton64.setText("D09");
        jButton64.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton64.setMargin(new java.awt.Insets(2, 7, 3, 14));
        jButton64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton64ActionPerformed(evt);
            }
        });

        jButton65.setBackground(new java.awt.Color(255, 153, 0));
        jButton65.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton65.setText("D10");
        jButton65.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton65.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton66.setBackground(new java.awt.Color(255, 153, 0));
        jButton66.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton66.setText("D11");
        jButton66.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton66.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton67.setBackground(new java.awt.Color(255, 153, 0));
        jButton67.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton67.setText("D12");
        jButton67.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton67.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton68.setBackground(new java.awt.Color(255, 153, 0));
        jButton68.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton68.setText("D13");
        jButton68.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton68.setMargin(new java.awt.Insets(2, 7, 3, 14));
        jButton68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton68ActionPerformed(evt);
            }
        });

        jButton69.setBackground(new java.awt.Color(255, 153, 0));
        jButton69.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton69.setText("D14");
        jButton69.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton69.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton70.setBackground(new java.awt.Color(255, 153, 0));
        jButton70.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton70.setText("D15");
        jButton70.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton70.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton71.setBackground(new java.awt.Color(255, 153, 0));
        jButton71.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton71.setText("D16");
        jButton71.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton71.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton72.setBackground(new java.awt.Color(255, 153, 0));
        jButton72.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton72.setText("D17");
        jButton72.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton72.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton73.setBackground(new java.awt.Color(255, 153, 0));
        jButton73.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton73.setText("E02");
        jButton73.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton73.setMargin(new java.awt.Insets(2, 7, 3, 14));
        jButton73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton73ActionPerformed(evt);
            }
        });

        jButton74.setBackground(new java.awt.Color(255, 153, 0));
        jButton74.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton74.setText("E03");
        jButton74.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton74.setMargin(new java.awt.Insets(2, 7, 3, 14));
        jButton74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton74ActionPerformed(evt);
            }
        });

        jButton75.setBackground(new java.awt.Color(255, 153, 0));
        jButton75.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton75.setText("E04");
        jButton75.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton75.setMargin(new java.awt.Insets(2, 7, 3, 14));
        jButton75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton75ActionPerformed(evt);
            }
        });

        jButton76.setBackground(new java.awt.Color(255, 153, 0));
        jButton76.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton76.setText("E05");
        jButton76.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton76.setMargin(new java.awt.Insets(2, 7, 3, 14));
        jButton76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton76ActionPerformed(evt);
            }
        });

        jButton77.setBackground(new java.awt.Color(255, 153, 0));
        jButton77.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton77.setText("E06");
        jButton77.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton77.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton78.setBackground(new java.awt.Color(255, 153, 0));
        jButton78.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton78.setText("E07");
        jButton78.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton78.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton79.setBackground(new java.awt.Color(255, 153, 0));
        jButton79.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton79.setText("E08");
        jButton79.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton79.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton80.setBackground(new java.awt.Color(255, 153, 0));
        jButton80.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton80.setText("E09");
        jButton80.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton80.setMargin(new java.awt.Insets(2, 7, 3, 14));
        jButton80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton80ActionPerformed(evt);
            }
        });

        jButton81.setBackground(new java.awt.Color(255, 153, 0));
        jButton81.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton81.setText("E10");
        jButton81.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton81.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton82.setBackground(new java.awt.Color(255, 153, 0));
        jButton82.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton82.setText("E11");
        jButton82.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton82.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton83.setBackground(new java.awt.Color(255, 153, 0));
        jButton83.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton83.setText("E12");
        jButton83.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton83.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton84.setBackground(new java.awt.Color(255, 153, 0));
        jButton84.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton84.setText("E13");
        jButton84.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton84.setMargin(new java.awt.Insets(2, 7, 3, 14));
        jButton84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton84ActionPerformed(evt);
            }
        });

        jButton85.setBackground(new java.awt.Color(255, 153, 0));
        jButton85.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton85.setText("E14");
        jButton85.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton85.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton86.setBackground(new java.awt.Color(255, 153, 0));
        jButton86.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton86.setText("E15");
        jButton86.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton86.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton87.setBackground(new java.awt.Color(255, 153, 0));
        jButton87.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton87.setText("E16");
        jButton87.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton87.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton88.setBackground(new java.awt.Color(255, 153, 0));
        jButton88.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton88.setText("E17");
        jButton88.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton88.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton89.setBackground(new java.awt.Color(255, 153, 0));
        jButton89.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton89.setText("F02");
        jButton89.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton89.setMargin(new java.awt.Insets(2, 7, 3, 14));
        jButton89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton89ActionPerformed(evt);
            }
        });

        jButton90.setBackground(new java.awt.Color(255, 153, 0));
        jButton90.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton90.setText("F03");
        jButton90.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton90.setMargin(new java.awt.Insets(2, 7, 3, 14));
        jButton90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton90ActionPerformed(evt);
            }
        });

        jButton91.setBackground(new java.awt.Color(255, 153, 0));
        jButton91.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton91.setText("F04");
        jButton91.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton91.setMargin(new java.awt.Insets(2, 7, 3, 14));
        jButton91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton91ActionPerformed(evt);
            }
        });

        jButton92.setBackground(new java.awt.Color(255, 153, 0));
        jButton92.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton92.setText("F05");
        jButton92.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton92.setMargin(new java.awt.Insets(2, 7, 3, 14));
        jButton92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton92ActionPerformed(evt);
            }
        });

        jButton93.setBackground(new java.awt.Color(255, 153, 0));
        jButton93.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton93.setText("F06");
        jButton93.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton93.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton94.setBackground(new java.awt.Color(255, 153, 0));
        jButton94.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton94.setText("F07");
        jButton94.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton94.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton95.setBackground(new java.awt.Color(255, 153, 0));
        jButton95.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton95.setText("F08");
        jButton95.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton95.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton96.setBackground(new java.awt.Color(255, 153, 0));
        jButton96.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton96.setText("F09");
        jButton96.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton96.setMargin(new java.awt.Insets(2, 7, 3, 14));
        jButton96.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton96ActionPerformed(evt);
            }
        });

        jButton97.setBackground(new java.awt.Color(255, 153, 0));
        jButton97.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton97.setText("F10");
        jButton97.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton97.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton98.setBackground(new java.awt.Color(255, 153, 0));
        jButton98.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton98.setText("F11");
        jButton98.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton98.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton99.setBackground(new java.awt.Color(255, 153, 0));
        jButton99.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton99.setText("F12");
        jButton99.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton99.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton100.setBackground(new java.awt.Color(255, 153, 0));
        jButton100.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton100.setText("F13");
        jButton100.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton100.setMargin(new java.awt.Insets(2, 7, 3, 14));
        jButton100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton100ActionPerformed(evt);
            }
        });

        jButton101.setBackground(new java.awt.Color(255, 153, 0));
        jButton101.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton101.setText("F14");
        jButton101.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton101.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton102.setBackground(new java.awt.Color(255, 153, 0));
        jButton102.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton102.setText("F15");
        jButton102.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton102.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton103.setBackground(new java.awt.Color(255, 153, 0));
        jButton103.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton103.setText("F16");
        jButton103.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton103.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton104.setBackground(new java.awt.Color(255, 153, 0));
        jButton104.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton104.setText("F17");
        jButton104.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton104.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton105.setBackground(new java.awt.Color(255, 153, 0));
        jButton105.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton105.setText("G02");
        jButton105.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton105.setMargin(new java.awt.Insets(2, 7, 3, 14));
        jButton105.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton105ActionPerformed(evt);
            }
        });

        jButton106.setBackground(new java.awt.Color(255, 153, 0));
        jButton106.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton106.setText("G03");
        jButton106.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton106.setMargin(new java.awt.Insets(2, 7, 3, 14));
        jButton106.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton106ActionPerformed(evt);
            }
        });

        jButton107.setBackground(new java.awt.Color(255, 153, 0));
        jButton107.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton107.setText("G04");
        jButton107.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton107.setMargin(new java.awt.Insets(2, 7, 3, 14));
        jButton107.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton107ActionPerformed(evt);
            }
        });

        jButton108.setBackground(new java.awt.Color(255, 153, 0));
        jButton108.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton108.setText("G05");
        jButton108.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton108.setMargin(new java.awt.Insets(2, 7, 3, 14));
        jButton108.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton108ActionPerformed(evt);
            }
        });

        jButton109.setBackground(new java.awt.Color(255, 153, 0));
        jButton109.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton109.setText("G06");
        jButton109.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton109.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton110.setBackground(new java.awt.Color(255, 153, 0));
        jButton110.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton110.setText("G07");
        jButton110.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton110.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton111.setBackground(new java.awt.Color(255, 153, 0));
        jButton111.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton111.setText("G08");
        jButton111.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton111.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton112.setBackground(new java.awt.Color(255, 153, 0));
        jButton112.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton112.setText("G09");
        jButton112.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton112.setMargin(new java.awt.Insets(2, 7, 3, 14));
        jButton112.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton112ActionPerformed(evt);
            }
        });

        jButton113.setBackground(new java.awt.Color(255, 153, 0));
        jButton113.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton113.setText("G10");
        jButton113.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton113.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton114.setBackground(new java.awt.Color(255, 153, 0));
        jButton114.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton114.setText("G11");
        jButton114.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton114.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton115.setBackground(new java.awt.Color(255, 153, 0));
        jButton115.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton115.setText("G12");
        jButton115.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton115.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton116.setBackground(new java.awt.Color(255, 153, 0));
        jButton116.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton116.setText("G13");
        jButton116.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton116.setMargin(new java.awt.Insets(2, 7, 3, 14));
        jButton116.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton116ActionPerformed(evt);
            }
        });

        jButton117.setBackground(new java.awt.Color(255, 153, 0));
        jButton117.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton117.setText("G14");
        jButton117.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton117.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton118.setBackground(new java.awt.Color(255, 153, 0));
        jButton118.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton118.setText("G15");
        jButton118.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton118.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton119.setBackground(new java.awt.Color(255, 153, 0));
        jButton119.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton119.setText("G16");
        jButton119.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton119.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton120.setBackground(new java.awt.Color(255, 153, 0));
        jButton120.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton120.setText("G17");
        jButton120.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton120.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton121.setBackground(new java.awt.Color(255, 153, 0));
        jButton121.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton121.setText("H02");
        jButton121.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton121.setMargin(new java.awt.Insets(2, 6, 3, 14));
        jButton121.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton121ActionPerformed(evt);
            }
        });

        jButton122.setBackground(new java.awt.Color(255, 153, 0));
        jButton122.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton122.setText("H03");
        jButton122.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton122.setMargin(new java.awt.Insets(2, 6, 3, 14));
        jButton122.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton122ActionPerformed(evt);
            }
        });

        jButton123.setBackground(new java.awt.Color(255, 153, 0));
        jButton123.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton123.setText("H04");
        jButton123.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton123.setMargin(new java.awt.Insets(2, 6, 3, 14));
        jButton123.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton123ActionPerformed(evt);
            }
        });

        jButton124.setBackground(new java.awt.Color(255, 153, 0));
        jButton124.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton124.setText("H05");
        jButton124.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton124.setMargin(new java.awt.Insets(2, 6, 3, 14));
        jButton124.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton124ActionPerformed(evt);
            }
        });

        jButton125.setBackground(new java.awt.Color(255, 153, 0));
        jButton125.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton125.setText("H06");
        jButton125.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton125.setMargin(new java.awt.Insets(2, 6, 3, 14));

        jButton126.setBackground(new java.awt.Color(255, 153, 0));
        jButton126.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton126.setText("H07");
        jButton126.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton126.setMargin(new java.awt.Insets(2, 6, 3, 14));

        jButton127.setBackground(new java.awt.Color(255, 153, 0));
        jButton127.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton127.setText("H08");
        jButton127.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton127.setMargin(new java.awt.Insets(2, 6, 3, 14));

        jButton128.setBackground(new java.awt.Color(255, 153, 0));
        jButton128.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton128.setText("H09");
        jButton128.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton128.setMargin(new java.awt.Insets(2, 6, 3, 14));
        jButton128.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton128ActionPerformed(evt);
            }
        });

        jButton129.setBackground(new java.awt.Color(255, 153, 0));
        jButton129.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton129.setText("H10");
        jButton129.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton129.setMargin(new java.awt.Insets(2, 6, 3, 14));

        jButton130.setBackground(new java.awt.Color(255, 153, 0));
        jButton130.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton130.setText("H11");
        jButton130.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton130.setMargin(new java.awt.Insets(2, 6, 3, 14));

        jButton131.setBackground(new java.awt.Color(255, 153, 0));
        jButton131.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton131.setText("H12");
        jButton131.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton131.setMargin(new java.awt.Insets(2, 6, 3, 14));

        jButton132.setBackground(new java.awt.Color(255, 153, 0));
        jButton132.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton132.setText("H13");
        jButton132.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton132.setMargin(new java.awt.Insets(2, 6, 3, 14));
        jButton132.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton132ActionPerformed(evt);
            }
        });

        jButton133.setBackground(new java.awt.Color(255, 153, 0));
        jButton133.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton133.setText("H14");
        jButton133.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton133.setMargin(new java.awt.Insets(2, 6, 3, 14));

        jButton134.setBackground(new java.awt.Color(255, 153, 0));
        jButton134.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton134.setText("H15");
        jButton134.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton134.setMargin(new java.awt.Insets(2, 6, 3, 14));

        jButton135.setBackground(new java.awt.Color(255, 153, 0));
        jButton135.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton135.setText("H16");
        jButton135.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton135.setMargin(new java.awt.Insets(2, 6, 3, 14));

        jButton136.setBackground(new java.awt.Color(255, 153, 0));
        jButton136.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton136.setText("H17");
        jButton136.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton136.setMargin(new java.awt.Insets(2, 6, 3, 14));

        jButton137.setBackground(new java.awt.Color(204, 0, 102));
        jButton137.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton137.setText("I01");
        jButton137.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton137.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton138.setBackground(new java.awt.Color(204, 0, 102));
        jButton138.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton138.setText("I02");
        jButton138.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton138.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton139.setBackground(new java.awt.Color(204, 0, 102));
        jButton139.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton139.setText("I03");
        jButton139.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton139.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton140.setBackground(new java.awt.Color(204, 0, 102));
        jButton140.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton140.setText("I04");
        jButton140.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton140.setMargin(new java.awt.Insets(2, 7, 3, 14));

        jButton141.setBackground(new java.awt.Color(204, 0, 102));
        jButton141.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton141.setText("I05");
        jButton141.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton141.setMargin(new java.awt.Insets(2, 7, 3, 14));
        jButton141.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton141ActionPerformed(evt);
            }
        });

        jButton142.setBackground(new java.awt.Color(204, 0, 102));
        jButton142.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton142.setText("I06");
        jButton142.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton142.setMargin(new java.awt.Insets(2, 7, 3, 14));
        jButton142.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton142ActionPerformed(evt);
            }
        });

        jButton143.setBackground(new java.awt.Color(204, 0, 102));
        jButton143.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton143.setText("I07");
        jButton143.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton143.setMargin(new java.awt.Insets(2, 7, 3, 14));
        jButton143.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton143ActionPerformed(evt);
            }
        });

        jButton144.setBackground(new java.awt.Color(204, 0, 102));
        jButton144.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton144.setText("I08");
        jButton144.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton144.setMargin(new java.awt.Insets(2, 7, 3, 14));
        jButton144.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton144ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout seatPanelLayout = new javax.swing.GroupLayout(seatPanel);
        seatPanel.setLayout(seatPanelLayout);
        seatPanelLayout.setHorizontalGroup(
            seatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seatPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(seatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(seatPanelLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(seatPanelLayout.createSequentialGroup()
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(seatPanelLayout.createSequentialGroup()
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton51, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton56, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(seatPanelLayout.createSequentialGroup()
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton58, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton59, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton61, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton62, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton63, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton64, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton65, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton66, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton67, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton68, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton69, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton70, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton71, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton72, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(seatPanelLayout.createSequentialGroup()
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton73, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton74, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton75, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton76, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton77, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton78, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton79, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton80, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton81, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton82, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton83, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton84, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton85, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton86, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton87, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton88, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(seatPanelLayout.createSequentialGroup()
                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton89, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton90, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton91, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton92, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton93, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton94, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton95, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton96, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton97, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton98, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton99, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton100, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton101, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton102, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton103, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton104, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(seatPanelLayout.createSequentialGroup()
                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton105, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton106, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton107, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton108, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton109, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton110, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton111, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton112, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton113, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton114, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton115, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton116, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton117, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton118, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton119, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton120, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(seatPanelLayout.createSequentialGroup()
                        .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton121, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton122, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton123, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton124, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton125, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton126, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton127, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton128, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton129, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton130, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton131, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton132, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton133, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton134, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton135, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton136, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(seatPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButton137, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton138, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton139, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton140, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton141, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton142, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton143, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton144, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        seatPanelLayout.setVerticalGroup(
            seatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seatPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(seatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(seatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(seatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton51, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton56, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(seatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton58, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton59, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton61, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton62, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton63, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton64, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton65, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton66, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton67, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton68, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton69, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton70, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton71, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton72, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(seatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton73, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton74, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton75, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton76, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton77, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton78, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton79, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton80, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton81, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton82, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton83, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton84, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton85, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton86, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton87, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton88, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(seatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton89, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton90, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton91, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton92, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton93, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton94, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton95, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton96, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton97, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton98, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton99, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton100, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton101, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton102, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton103, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton104, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(seatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton105, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton106, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton107, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton108, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton109, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton110, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton111, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton112, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton113, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton114, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton115, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton116, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton117, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton118, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton119, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton120, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(seatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton121, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton122, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton123, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton124, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton125, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton126, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton127, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton128, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton129, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton130, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton131, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton132, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton133, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton134, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton135, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton136, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(seatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton137, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton138, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton139, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton140, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton141, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton142, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton143, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton144, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setBackground(new java.awt.Color(153, 153, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("V");
        jLabel3.setOpaque(true);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        finishBTN.setBackground(new java.awt.Color(204, 204, 204));
        finishBTN.setText("Hoàn tất");

        undoBTN.setBackground(new java.awt.Color(204, 204, 204));
        undoBTN.setText("Hoàn tác");

        aBackBTN.setBackground(new java.awt.Color(204, 204, 204));
        aBackBTN.setText("Trở về");
        aBackBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aBackBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(aBackBTN)
                        .addGap(18, 18, 18)
                        .addComponent(undoBTN)
                        .addGap(18, 18, 18)
                        .addComponent(finishBTN))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(seatPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(seatPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(finishBTN)
                    .addComponent(undoBTN)
                    .addComponent(aBackBTN))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton48ActionPerformed

    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton52ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton52ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton57ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton57ActionPerformed

    private void jButton58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton58ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton58ActionPerformed

    private void jButton59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton59ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton59ActionPerformed

    private void jButton60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton60ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton60ActionPerformed

    private void jButton64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton64ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton64ActionPerformed

    private void jButton68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton68ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton68ActionPerformed

    private void jButton73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton73ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton73ActionPerformed

    private void jButton74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton74ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton74ActionPerformed

    private void jButton75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton75ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton75ActionPerformed

    private void jButton76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton76ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton76ActionPerformed

    private void jButton80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton80ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton80ActionPerformed

    private void jButton84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton84ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton84ActionPerformed

    private void jButton89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton89ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton89ActionPerformed

    private void jButton90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton90ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton90ActionPerformed

    private void jButton91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton91ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton91ActionPerformed

    private void jButton92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton92ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton92ActionPerformed

    private void jButton96ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton96ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton96ActionPerformed

    private void jButton100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton100ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton100ActionPerformed

    private void jButton105ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton105ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton105ActionPerformed

    private void jButton106ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton106ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton106ActionPerformed

    private void jButton107ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton107ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton107ActionPerformed

    private void jButton108ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton108ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton108ActionPerformed

    private void jButton112ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton112ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton112ActionPerformed

    private void jButton116ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton116ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton116ActionPerformed

    private void jButton121ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton121ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton121ActionPerformed

    private void jButton122ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton122ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton122ActionPerformed

    private void jButton123ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton123ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton123ActionPerformed

    private void jButton124ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton124ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton124ActionPerformed

    private void jButton128ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton128ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton128ActionPerformed

    private void jButton132ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton132ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton132ActionPerformed

    private void jButton141ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton141ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton141ActionPerformed

    private void jButton142ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton142ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton142ActionPerformed

    private void jButton143ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton143ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton143ActionPerformed

    private void jButton144ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton144ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton144ActionPerformed

    private void aBackBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aBackBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aBackBTNActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Room1OfTicketClerk dialog = new Room1OfTicketClerk(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton aBackBTN;
    private javax.swing.JButton finishBTN;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JButton jButton120;
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
    private javax.swing.JButton jButton137;
    private javax.swing.JButton jButton138;
    private javax.swing.JButton jButton139;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton140;
    private javax.swing.JButton jButton141;
    private javax.swing.JButton jButton142;
    private javax.swing.JButton jButton143;
    private javax.swing.JButton jButton144;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel seatPanel;
    private javax.swing.JButton undoBTN;
    // End of variables declaration//GEN-END:variables

    // addActionListener
    public void addActionListener() {
        this.undoBTN.addActionListener(this);
        this.aBackBTN.addActionListener(this);
        this.finishBTN.addActionListener(this);
        // các nút ghế
        this.jButton1.addActionListener(this);
        this.jButton10.addActionListener(this);
        this.jButton100.addActionListener(this);
        this.jButton101.addActionListener(this);
        this.jButton102.addActionListener(this);
        this.jButton103.addActionListener(this);
        this.jButton104.addActionListener(this);
        this.jButton105.addActionListener(this);
        this.jButton106.addActionListener(this);
        this.jButton107.addActionListener(this);
        this.jButton108.addActionListener(this);
        this.jButton109.addActionListener(this);
        this.jButton11.addActionListener(this);
        this.jButton110.addActionListener(this);
        this.jButton111.addActionListener(this);
        this.jButton112.addActionListener(this);
        this.jButton113.addActionListener(this);
        this.jButton114.addActionListener(this);
        this.jButton115.addActionListener(this);
        this.jButton116.addActionListener(this);
        this.jButton117.addActionListener(this);
        this.jButton118.addActionListener(this);
        this.jButton119.addActionListener(this);
        this.jButton12.addActionListener(this);
        this.jButton120.addActionListener(this);
        this.jButton121.addActionListener(this);
        this.jButton122.addActionListener(this);
        this.jButton123.addActionListener(this);
        this.jButton124.addActionListener(this);
        this.jButton125.addActionListener(this);
        this.jButton126.addActionListener(this);
        this.jButton127.addActionListener(this);
        this.jButton128.addActionListener(this);
        this.jButton129.addActionListener(this);
        this.jButton13.addActionListener(this);
        this.jButton130.addActionListener(this);
        this.jButton131.addActionListener(this);
        this.jButton132.addActionListener(this);
        this.jButton133.addActionListener(this);
        this.jButton134.addActionListener(this);
        this.jButton135.addActionListener(this);
        this.jButton136.addActionListener(this);
        this.jButton137.addActionListener(this);
        this.jButton138.addActionListener(this);
        this.jButton139.addActionListener(this);
        this.jButton14.addActionListener(this);
        this.jButton140.addActionListener(this);
        this.jButton141.addActionListener(this);
        this.jButton142.addActionListener(this);
        this.jButton143.addActionListener(this);
        this.jButton144.addActionListener(this);
        this.jButton15.addActionListener(this);
        this.jButton16.addActionListener(this);
        this.jButton17.addActionListener(this);
        this.jButton18.addActionListener(this);
        this.jButton19.addActionListener(this);
        this.jButton2.addActionListener(this);
        this.jButton20.addActionListener(this);
        this.jButton21.addActionListener(this);
        this.jButton22.addActionListener(this);
        this.jButton23.addActionListener(this);
        this.jButton24.addActionListener(this);
        this.jButton25.addActionListener(this);
        this.jButton26.addActionListener(this);
        this.jButton27.addActionListener(this);
        this.jButton28.addActionListener(this);
        this.jButton29.addActionListener(this);
        this.jButton3.addActionListener(this);
        this.jButton30.addActionListener(this);
        this.jButton31.addActionListener(this);
        this.jButton32.addActionListener(this);
        this.jButton33.addActionListener(this);
        this.jButton34.addActionListener(this);
        this.jButton35.addActionListener(this);
        this.jButton36.addActionListener(this);
        this.jButton37.addActionListener(this);
        this.jButton38.addActionListener(this);
        this.jButton39.addActionListener(this);
        this.jButton4.addActionListener(this);
        this.jButton40.addActionListener(this);
        this.jButton41.addActionListener(this);
        this.jButton42.addActionListener(this);
        this.jButton43.addActionListener(this);
        this.jButton44.addActionListener(this);
        this.jButton45.addActionListener(this);
        this.jButton46.addActionListener(this);
        this.jButton47.addActionListener(this);
        this.jButton48.addActionListener(this);
        this.jButton49.addActionListener(this);
        this.jButton5.addActionListener(this);
        this.jButton50.addActionListener(this);
        this.jButton51.addActionListener(this);
        this.jButton52.addActionListener(this);
        this.jButton53.addActionListener(this);
        this.jButton54.addActionListener(this);
        this.jButton55.addActionListener(this);
        this.jButton56.addActionListener(this);
        this.jButton57.addActionListener(this);
        this.jButton58.addActionListener(this);
        this.jButton59.addActionListener(this);
        this.jButton6.addActionListener(this);
        this.jButton60.addActionListener(this);
        this.jButton61.addActionListener(this);
        this.jButton62.addActionListener(this);
        this.jButton63.addActionListener(this);
        this.jButton64.addActionListener(this);
        this.jButton65.addActionListener(this);
        this.jButton66.addActionListener(this);
        this.jButton67.addActionListener(this);
        this.jButton68.addActionListener(this);
        this.jButton69.addActionListener(this);
        this.jButton7.addActionListener(this);
        this.jButton70.addActionListener(this);
        this.jButton71.addActionListener(this);
        this.jButton72.addActionListener(this);
        this.jButton73.addActionListener(this);
        this.jButton74.addActionListener(this);
        this.jButton75.addActionListener(this);
        this.jButton76.addActionListener(this);
        this.jButton77.addActionListener(this);
        this.jButton78.addActionListener(this);
        this.jButton79.addActionListener(this);
        this.jButton8.addActionListener(this);
        this.jButton80.addActionListener(this);
        this.jButton81.addActionListener(this);
        this.jButton82.addActionListener(this);
        this.jButton83.addActionListener(this);
        this.jButton84.addActionListener(this);
        this.jButton85.addActionListener(this);
        this.jButton86.addActionListener(this);
        this.jButton87.addActionListener(this);
        this.jButton88.addActionListener(this);
        this.jButton89.addActionListener(this);
        this.jButton9.addActionListener(this);
        this.jButton90.addActionListener(this);
        this.jButton91.addActionListener(this);
        this.jButton92.addActionListener(this);
        this.jButton93.addActionListener(this);
        this.jButton94.addActionListener(this);
        this.jButton95.addActionListener(this);
        this.jButton96.addActionListener(this);
        this.jButton97.addActionListener(this);
        this.jButton98.addActionListener(this);
        this.jButton99.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = e.getActionCommand();
        Object src = e.getSource();
        if (src.equals(this.finishBTN)) {
            if(this.seatChoosen.size() != 0) {
                this.ticketClerkView.setListSeatHasJustChoosen(seatChoosen);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(rootPane, "VUI LÒNG CHỌN GHẾ");
            }
            
        } else if (src.equals(this.undoBTN)) {
            this.setEnabledBtn();
        } else if (src.equals(this.aBackBTN)) {
            this.dispose();
        }
        this.choosenButton((JButton) src, text);
    }

    // hàm set up trang
    public void setUpPage() {
        Component[] seatBtns = this.seatPanel.getComponents();
        System.out.println(this.ticketClerkView.getListSeatChoosen().size());
        for (String x : this.ticketClerkView.getListSeatChoosen()) {
            for (int i = 0; i < seatBtns.length; i++) {
                JButton jButton = (JButton) seatBtns[i];
                if(x.substring(0, 3).equals(jButton.getText())) {
                    jButton.setEnabled(false);
                    jButton.setBackground(Color.gray);
                }
            }
        }
    }

    // hàm xử lý sự kện 
    public void choosenButton(JButton src, String text) {
        if (!src.equals(this.undoBTN) && !src.equals(this.aBackBTN) && !src.equals(this.finishBTN)) {
            this.listJbuttonChoosen.add(src);
            src.setEnabled(false);
            src.setBackground(new java.awt.Color(153,153,153));
            src.setForeground(Color.black);
            this.seatChoosen.add(text);
        }
    }

    public void setEnabledBtn() {
        this.listJbuttonChoosen.get(listJbuttonChoosen.size() - 1).setEnabled(true);
        this.listJbuttonChoosen.get(listJbuttonChoosen.size() - 1).setBackground(new java.awt.Color(255,153,0));
        this.listJbuttonChoosen.remove(listJbuttonChoosen.size() - 1);
        this.seatChoosen.remove(this.seatChoosen.size() - 1);
    }
}
