
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

public class Room2OfTicketClerk extends javax.swing.JDialog implements ActionListener{
    private TicketClerkView ticketClerkView;
    private List<JButton> listJbuttonChoosen;
    private List<String> seatChoosen;
    
    // constructor
    public Room2OfTicketClerk(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.listJbuttonChoosen = new ArrayList<>();
        this.seatChoosen = new ArrayList<>();
        this.addActionListener();
    }
    
    public Room2OfTicketClerk(Dialog owner, boolean modal) {
        super(owner, modal);
        initComponents();
        this.ticketClerkView = (TicketClerkView) owner;
        this.listJbuttonChoosen = new ArrayList<>();
        this.seatChoosen = new ArrayList<>();
        this.addActionListener();
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
        seatPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        jButton60 = new javax.swing.JButton();
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
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(255, 153, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("A01");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton2.setBackground(new java.awt.Color(255, 153, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("A02");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton3.setBackground(new java.awt.Color(255, 153, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("A03");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton4.setBackground(new java.awt.Color(255, 153, 0));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setText("A06");
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton5.setBackground(new java.awt.Color(255, 153, 0));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setText("A04");
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton6.setBackground(new java.awt.Color(255, 153, 0));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setText("A05");
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton13.setBackground(new java.awt.Color(255, 153, 0));
        jButton13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton13.setText("B01");
        jButton13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(255, 153, 0));
        jButton14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton14.setText("B02");
        jButton14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton15.setBackground(new java.awt.Color(255, 153, 0));
        jButton15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton15.setText("B03");
        jButton15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton16.setBackground(new java.awt.Color(255, 153, 0));
        jButton16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton16.setText("B04");
        jButton16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton17.setBackground(new java.awt.Color(255, 153, 0));
        jButton17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton17.setText("B05");
        jButton17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton18.setBackground(new java.awt.Color(255, 153, 0));
        jButton18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton18.setText("B06");
        jButton18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton25.setBackground(new java.awt.Color(255, 153, 0));
        jButton25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton25.setText("C01");
        jButton25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton26.setBackground(new java.awt.Color(255, 153, 0));
        jButton26.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton26.setText("C02");
        jButton26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton27.setBackground(new java.awt.Color(255, 153, 0));
        jButton27.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton27.setText("C03");
        jButton27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton28.setBackground(new java.awt.Color(255, 153, 0));
        jButton28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton28.setText("C04");
        jButton28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton29.setBackground(new java.awt.Color(255, 153, 0));
        jButton29.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton29.setText("C05");
        jButton29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton30.setBackground(new java.awt.Color(255, 153, 0));
        jButton30.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton30.setText("C06");
        jButton30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton37.setBackground(new java.awt.Color(255, 153, 0));
        jButton37.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton37.setText("D01");
        jButton37.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        jButton38.setBackground(new java.awt.Color(255, 153, 0));
        jButton38.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton38.setText("D02");
        jButton38.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton39.setBackground(new java.awt.Color(255, 153, 0));
        jButton39.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton39.setText("D03");
        jButton39.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton40.setBackground(new java.awt.Color(255, 153, 0));
        jButton40.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton40.setText("D04");
        jButton40.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton41.setBackground(new java.awt.Color(255, 153, 0));
        jButton41.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton41.setText("D05");
        jButton41.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton42.setBackground(new java.awt.Color(255, 153, 0));
        jButton42.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton42.setText("D06");
        jButton42.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton49.setBackground(new java.awt.Color(255, 204, 0));
        jButton49.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton49.setText("E01");
        jButton49.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });

        jButton50.setBackground(new java.awt.Color(255, 204, 0));
        jButton50.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton50.setText("E02");
        jButton50.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50ActionPerformed(evt);
            }
        });

        jButton51.setBackground(new java.awt.Color(255, 204, 0));
        jButton51.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton51.setText("E03");
        jButton51.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton51ActionPerformed(evt);
            }
        });

        jButton55.setBackground(new java.awt.Color(204, 0, 102));
        jButton55.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton55.setText("E01");
        jButton55.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton55ActionPerformed(evt);
            }
        });

        jButton56.setBackground(new java.awt.Color(204, 0, 102));
        jButton56.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton56.setText("E02");
        jButton56.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton56ActionPerformed(evt);
            }
        });

        jButton57.setBackground(new java.awt.Color(204, 0, 102));
        jButton57.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton57.setText("E03");
        jButton57.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton57ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton56, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton51, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(26, 26, 26))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton51, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton56, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("V");
        jLabel2.setOpaque(true);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jButton7.setBackground(new java.awt.Color(255, 153, 0));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton7.setText("A07");
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton8.setBackground(new java.awt.Color(255, 153, 0));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton8.setText("A12");
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton9.setBackground(new java.awt.Color(255, 153, 0));
        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton9.setText("A08");
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton10.setBackground(new java.awt.Color(255, 153, 0));
        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton10.setText("A09");
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton11.setBackground(new java.awt.Color(255, 153, 0));
        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton11.setText("A11");
        jButton11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton12.setBackground(new java.awt.Color(255, 153, 0));
        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton12.setText("A10");
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton19.setBackground(new java.awt.Color(255, 153, 0));
        jButton19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton19.setText("B07");
        jButton19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton20.setBackground(new java.awt.Color(255, 153, 0));
        jButton20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton20.setText("B08");
        jButton20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton21.setBackground(new java.awt.Color(255, 153, 0));
        jButton21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton21.setText("B09");
        jButton21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton22.setBackground(new java.awt.Color(255, 153, 0));
        jButton22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton22.setText("B10");
        jButton22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton23.setBackground(new java.awt.Color(255, 153, 0));
        jButton23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton23.setText("B11");
        jButton23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton24.setBackground(new java.awt.Color(255, 153, 0));
        jButton24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton24.setText("B12");
        jButton24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton31.setBackground(new java.awt.Color(255, 153, 0));
        jButton31.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton31.setText("C07");
        jButton31.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton32.setBackground(new java.awt.Color(255, 153, 0));
        jButton32.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton32.setText("C08");
        jButton32.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton33.setBackground(new java.awt.Color(255, 153, 0));
        jButton33.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton33.setText("C09");
        jButton33.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton34.setBackground(new java.awt.Color(255, 153, 0));
        jButton34.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton34.setText("C10");
        jButton34.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton35.setBackground(new java.awt.Color(255, 153, 0));
        jButton35.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton35.setText("C11");
        jButton35.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton36.setBackground(new java.awt.Color(255, 153, 0));
        jButton36.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton36.setText("B12");
        jButton36.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton43.setBackground(new java.awt.Color(255, 153, 0));
        jButton43.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton43.setText("D07");
        jButton43.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton44.setBackground(new java.awt.Color(255, 153, 0));
        jButton44.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton44.setText("D08");
        jButton44.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton45.setBackground(new java.awt.Color(255, 153, 0));
        jButton45.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton45.setText("D09");
        jButton45.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton46.setBackground(new java.awt.Color(255, 153, 0));
        jButton46.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton46.setText("D10");
        jButton46.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton47.setBackground(new java.awt.Color(255, 153, 0));
        jButton47.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton47.setText("D11");
        jButton47.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton48.setBackground(new java.awt.Color(255, 153, 0));
        jButton48.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton48.setText("D12");
        jButton48.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton52.setBackground(new java.awt.Color(255, 204, 0));
        jButton52.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton52.setText("E04");
        jButton52.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton52ActionPerformed(evt);
            }
        });

        jButton53.setBackground(new java.awt.Color(255, 204, 0));
        jButton53.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton53.setText("E05");
        jButton53.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton53ActionPerformed(evt);
            }
        });

        jButton54.setBackground(new java.awt.Color(255, 204, 0));
        jButton54.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton54.setText("E06");
        jButton54.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton54ActionPerformed(evt);
            }
        });

        jButton58.setBackground(new java.awt.Color(204, 0, 102));
        jButton58.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton58.setText("E04");
        jButton58.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton58ActionPerformed(evt);
            }
        });

        jButton59.setBackground(new java.awt.Color(204, 0, 102));
        jButton59.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton59.setText("E05");
        jButton59.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton59ActionPerformed(evt);
            }
        });

        jButton60.setBackground(new java.awt.Color(204, 0, 102));
        jButton60.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton60.setText("E06");
        jButton60.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton60ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton58, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jButton59, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton58, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton59, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout seatPanelLayout = new javax.swing.GroupLayout(seatPanel);
        seatPanel.setLayout(seatPanelLayout);
        seatPanelLayout.setHorizontalGroup(
            seatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seatPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        seatPanelLayout.setVerticalGroup(
            seatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        finishBTN.setBackground(new java.awt.Color(204, 204, 204));
        finishBTN.setText("Hoàn tất");

        undoBTN.setBackground(new java.awt.Color(204, 204, 204));
        undoBTN.setText("Hoàn tác");

        aBackBTN.setBackground(new java.awt.Color(204, 204, 204));
        aBackBTN.setText("Trở về");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(seatPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(aBackBTN)
                .addGap(18, 18, 18)
                .addComponent(undoBTN)
                .addGap(18, 18, 18)
                .addComponent(finishBTN)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seatPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(finishBTN)
                    .addComponent(undoBTN)
                    .addComponent(aBackBTN))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton49ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton49ActionPerformed

    private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton50ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton50ActionPerformed

    private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton51ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton51ActionPerformed

    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton52ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton52ActionPerformed

    private void jButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton53ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton53ActionPerformed

    private void jButton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton54ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton54ActionPerformed

    private void jButton55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton55ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton55ActionPerformed

    private void jButton56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton56ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton56ActionPerformed

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

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Room2OfTicketClerk dialog = new Room2OfTicketClerk(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
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
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel seatPanel;
    private javax.swing.JButton undoBTN;
    // End of variables declaration//GEN-END:variables

    // addActionListener
    public void addActionListener() {
        this.aBackBTN.addActionListener(this);
        this.finishBTN.addActionListener(this);
        this.finishBTN.addActionListener(this);
        // các nút nhấn của ghế
        this.jButton10.addActionListener(this);
        this.jButton11.addActionListener(this);
        this.jButton12.addActionListener(this);
        this.jButton13.addActionListener(this);
        this.jButton14.addActionListener(this);
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
        this.jButton7.addActionListener(this);
        this.jButton8.addActionListener(this);
        this.jButton9.addActionListener(this);
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

