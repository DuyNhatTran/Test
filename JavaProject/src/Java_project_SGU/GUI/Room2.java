/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Java_project_SGU.GUI;

import Java_project_SGU.Controller.Seat2Listener;
import Java_project_SGU.BUS.Customer;
import Java_project_SGU.BUS.ShowTime;
import Java_project_SGU.BUS.TicketSale;
import java.awt.Dialog;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class Room2 extends javax.swing.JDialog {
    private List<JButton> listJbuttonChoosen;
    private ShowTime showTimeBooking;
    private Customer customer;
    private TicketSale ticketSale;
    private BookTicketView bookTicketView;
    private int freePair;
    private int freeNormal;
    private int freeVip;
    
    /**
     * Creates new form Room2
     */
    public Room2(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public Room2(java.awt.Frame parent, boolean modal, ShowTime 
            showTimeBooking, Customer customer) {
        this(parent, modal);
        this.showTimeBooking = showTimeBooking;
        this.customer = customer;
    }

    public Room2(Dialog owner, boolean modal) {
        super(owner, modal);
        initComponents();
    }
    
    public Room2(Dialog owner, boolean modal, ShowTime 
            showTimeBooking, Customer customer, TicketSale ticketSale) {
        this(owner, modal);
        
        this.bookTicketView = (BookTicketView) owner;
        this.showTimeBooking = showTimeBooking;
        this.customer = customer;
        this.ticketSale = ticketSale;
        freePair = this.ticketSale.getQuantityPair();
        freeNormal = this.ticketSale.getQuantityNormal();
        freeVip = this.ticketSale.getQuantityVip();
        listJbuttonChoosen = new ArrayList<>();
        addActionListener();
//        WriteReadShowTimeSQLImp wrSTSQL = new WriteReadShowTimeSQLImp();
//        wrSTSQL.getBookkingTicketSale(showTimeBooking, customer);
    }
    
     private void addActionListener() {
        Seat2Listener seat2Listener = new Seat2Listener(this);
        A01.addActionListener(seat2Listener);
        A02.addActionListener(seat2Listener);
        backBtn.addActionListener(seat2Listener);
        jButton10.addActionListener(seat2Listener);
        jButton11.addActionListener(seat2Listener);
        jButton12.addActionListener(seat2Listener);
        jButton136.addActionListener(seat2Listener);
        jButton137.addActionListener(seat2Listener);
        jButton138.addActionListener(seat2Listener);
        jButton139.addActionListener(seat2Listener);
        jButton141.addActionListener(seat2Listener);
        jButton142.addActionListener(seat2Listener);
        jButton18.addActionListener(seat2Listener);
        jButton19.addActionListener(seat2Listener);
        jButton20.addActionListener(seat2Listener);
        jButton25.addActionListener(seat2Listener);
        jButton26.addActionListener(seat2Listener);
        jButton27.addActionListener(seat2Listener);
        jButton28.addActionListener(seat2Listener);
        jButton29.addActionListener(seat2Listener);
        jButton3.addActionListener(seat2Listener);
        jButton30.addActionListener(seat2Listener);
        jButton31.addActionListener(seat2Listener);
        jButton32.addActionListener(seat2Listener);
        jButton33.addActionListener(seat2Listener);
        jButton34.addActionListener(seat2Listener);
        jButton35.addActionListener(seat2Listener);
        jButton4.addActionListener(seat2Listener);
        jButton41.addActionListener(seat2Listener);
        jButton42.addActionListener(seat2Listener);
        jButton43.addActionListener(seat2Listener);
        jButton44.addActionListener(seat2Listener);
        jButton45.addActionListener(seat2Listener);
        jButton46.addActionListener(seat2Listener);
        jButton47.addActionListener(seat2Listener);
        jButton48.addActionListener(seat2Listener);
        jButton49.addActionListener(seat2Listener);
        jButton5.addActionListener(seat2Listener);
        jButton50.addActionListener(seat2Listener);
        jButton51.addActionListener(seat2Listener);
        jButton57.addActionListener(seat2Listener);
        jButton58.addActionListener(seat2Listener);
        jButton59.addActionListener(seat2Listener);
        jButton6.addActionListener(seat2Listener);
        jButton60.addActionListener(seat2Listener);
        jButton61.addActionListener(seat2Listener);
        jButton62.addActionListener(seat2Listener);
        jButton63.addActionListener(seat2Listener);
        jButton64.addActionListener(seat2Listener);
        jButton65.addActionListener(seat2Listener);
        jButton66.addActionListener(seat2Listener);
        jButton67.addActionListener(seat2Listener);
        jButton68.addActionListener(seat2Listener);
        jButton69.addActionListener(seat2Listener);
        jButton7.addActionListener(seat2Listener);
        jButton70.addActionListener(seat2Listener);
        jButton71.addActionListener(seat2Listener);
        jButton72.addActionListener(seat2Listener);
        jButton73.addActionListener(seat2Listener);
        jButton8.addActionListener(seat2Listener);
        jButton9.addActionListener(seat2Listener);
        redoBtn.addActionListener(seat2Listener);
        payBtn.addActionListener(seat2Listener);
    }

    public JButton getRedoBtn() {
        return redoBtn;
    }

    public JButton getPayBtn() {
        return payBtn;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        areaSeatPN = new java.awt.Panel();
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
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
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
        jPanel2 = new javax.swing.JPanel();
        vipAreaLPN = new javax.swing.JPanel();
        jButton68 = new javax.swing.JButton();
        jButton69 = new javax.swing.JButton();
        jButton70 = new javax.swing.JButton();
        pairAreaLPN = new javax.swing.JPanel();
        jButton138 = new javax.swing.JButton();
        jButton141 = new javax.swing.JButton();
        jButton136 = new javax.swing.JButton();
        pairAreaRPN = new javax.swing.JPanel();
        jButton139 = new javax.swing.JButton();
        jButton142 = new javax.swing.JButton();
        jButton137 = new javax.swing.JButton();
        vipAreaRPN = new javax.swing.JPanel();
        jButton71 = new javax.swing.JButton();
        jButton72 = new javax.swing.JButton();
        jButton73 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
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

        areaSeatPN.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N

        A01.setBackground(new java.awt.Color(255, 153, 0));
        A01.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        A01.setText("A01");
        A01.setName("few"); // NOI18N
        A01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A01ActionPerformed(evt);
            }
        });

        A02.setBackground(new java.awt.Color(255, 153, 0));
        A02.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        A02.setText("A02");
        A02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A02ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 153, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton3.setText("A03");

        jButton4.setBackground(new java.awt.Color(255, 153, 0));
        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton4.setText("A04");

        jButton5.setBackground(new java.awt.Color(255, 153, 0));
        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton5.setText("A05");

        jButton6.setBackground(new java.awt.Color(255, 153, 0));
        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton6.setText("A06");

        jButton7.setBackground(new java.awt.Color(255, 153, 0));
        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton7.setText("A07");

        jButton8.setBackground(new java.awt.Color(255, 153, 0));
        jButton8.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton8.setText("A08");

        jButton9.setBackground(new java.awt.Color(255, 153, 0));
        jButton9.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton9.setText("A09");

        jButton10.setBackground(new java.awt.Color(255, 153, 0));
        jButton10.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton10.setText("A10");

        jButton11.setBackground(new java.awt.Color(255, 153, 0));
        jButton11.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton11.setText("A11");

        jButton12.setBackground(new java.awt.Color(255, 153, 0));
        jButton12.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton12.setText("A12");

        jButton18.setBackground(new java.awt.Color(255, 153, 0));
        jButton18.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton18.setText("B01");

        jButton19.setBackground(new java.awt.Color(255, 153, 0));
        jButton19.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton19.setText("C01");
        jButton19.setRequestFocusEnabled(false);

        jButton20.setBackground(new java.awt.Color(255, 153, 0));
        jButton20.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton20.setText("D01");

        jButton25.setBackground(new java.awt.Color(255, 153, 0));
        jButton25.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton25.setText("B02");

        jButton26.setBackground(new java.awt.Color(255, 153, 0));
        jButton26.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton26.setText("B03");

        jButton27.setBackground(new java.awt.Color(255, 153, 0));
        jButton27.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton27.setText("B04");

        jButton28.setBackground(new java.awt.Color(255, 153, 0));
        jButton28.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton28.setText("B05");

        jButton29.setBackground(new java.awt.Color(255, 153, 0));
        jButton29.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton29.setText("B06");

        jButton30.setBackground(new java.awt.Color(255, 153, 0));
        jButton30.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton30.setText("B07");

        jButton31.setBackground(new java.awt.Color(255, 153, 0));
        jButton31.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton31.setText("B08");

        jButton32.setBackground(new java.awt.Color(255, 153, 0));
        jButton32.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton32.setText("B09");

        jButton33.setBackground(new java.awt.Color(255, 153, 0));
        jButton33.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton33.setText("B10");

        jButton34.setBackground(new java.awt.Color(255, 153, 0));
        jButton34.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton34.setText("B11");

        jButton35.setBackground(new java.awt.Color(255, 153, 0));
        jButton35.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton35.setText("B12");

        jButton41.setBackground(new java.awt.Color(255, 153, 0));
        jButton41.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton41.setText("C02");

        jButton42.setBackground(new java.awt.Color(255, 153, 0));
        jButton42.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton42.setText("C03");

        jButton43.setBackground(new java.awt.Color(255, 153, 0));
        jButton43.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton43.setText("C04");

        jButton44.setBackground(new java.awt.Color(255, 153, 0));
        jButton44.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton44.setText("C05");

        jButton45.setBackground(new java.awt.Color(255, 153, 0));
        jButton45.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton45.setText("C06");

        jButton46.setBackground(new java.awt.Color(255, 153, 0));
        jButton46.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton46.setText("C07");

        jButton47.setBackground(new java.awt.Color(255, 153, 0));
        jButton47.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton47.setText("C08");

        jButton48.setBackground(new java.awt.Color(255, 153, 0));
        jButton48.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton48.setText("C09");

        jButton49.setBackground(new java.awt.Color(255, 153, 0));
        jButton49.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton49.setText("C10");

        jButton50.setBackground(new java.awt.Color(255, 153, 0));
        jButton50.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton50.setText("C11");

        jButton51.setBackground(new java.awt.Color(255, 153, 0));
        jButton51.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton51.setText("C12");

        jButton57.setBackground(new java.awt.Color(255, 153, 0));
        jButton57.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton57.setText("D02");

        jButton58.setBackground(new java.awt.Color(255, 153, 0));
        jButton58.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton58.setText("D03");
        jButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton58ActionPerformed(evt);
            }
        });

        jButton59.setBackground(new java.awt.Color(255, 153, 0));
        jButton59.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton59.setText("D04");

        jButton60.setBackground(new java.awt.Color(255, 153, 0));
        jButton60.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton60.setText("D05");

        jButton61.setBackground(new java.awt.Color(255, 153, 0));
        jButton61.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton61.setText("D06");

        jButton62.setBackground(new java.awt.Color(255, 153, 0));
        jButton62.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton62.setText("D07");

        jButton63.setBackground(new java.awt.Color(255, 153, 0));
        jButton63.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton63.setText("D08");

        jButton64.setBackground(new java.awt.Color(255, 153, 0));
        jButton64.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton64.setText("D09");

        jButton65.setBackground(new java.awt.Color(255, 153, 0));
        jButton65.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton65.setText("D10");

        jButton66.setBackground(new java.awt.Color(255, 153, 0));
        jButton66.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton66.setText("D11");

        jButton67.setBackground(new java.awt.Color(255, 153, 0));
        jButton67.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton67.setText("D12");

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setPreferredSize(new java.awt.Dimension(86, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );

        jButton68.setBackground(new java.awt.Color(255, 255, 0));
        jButton68.setText("E01");

        jButton69.setBackground(new java.awt.Color(255, 255, 0));
        jButton69.setText("E02");

        jButton70.setBackground(new java.awt.Color(255, 255, 0));
        jButton70.setText("E03");
        jButton70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton70ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout vipAreaLPNLayout = new javax.swing.GroupLayout(vipAreaLPN);
        vipAreaLPN.setLayout(vipAreaLPNLayout);
        vipAreaLPNLayout.setHorizontalGroup(
            vipAreaLPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vipAreaLPNLayout.createSequentialGroup()
                .addComponent(jButton68, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton69, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton70, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        vipAreaLPNLayout.setVerticalGroup(
            vipAreaLPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vipAreaLPNLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(vipAreaLPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton68, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton69, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton70, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jButton138.setBackground(new java.awt.Color(153, 0, 153));
        jButton138.setText("E09");
        jButton138.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton138ActionPerformed(evt);
            }
        });

        jButton141.setBackground(new java.awt.Color(153, 0, 153));
        jButton141.setText("E08");
        jButton141.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton141ActionPerformed(evt);
            }
        });

        jButton136.setBackground(new java.awt.Color(153, 0, 153));
        jButton136.setText("E07");
        jButton136.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton136ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pairAreaLPNLayout = new javax.swing.GroupLayout(pairAreaLPN);
        pairAreaLPN.setLayout(pairAreaLPNLayout);
        pairAreaLPNLayout.setHorizontalGroup(
            pairAreaLPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pairAreaLPNLayout.createSequentialGroup()
                .addComponent(jButton136, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton141, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton138, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pairAreaLPNLayout.setVerticalGroup(
            pairAreaLPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pairAreaLPNLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pairAreaLPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton138, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton136, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton141, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton139.setBackground(new java.awt.Color(153, 0, 153));
        jButton139.setText("E12");
        jButton139.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton139ActionPerformed(evt);
            }
        });

        jButton142.setBackground(new java.awt.Color(153, 0, 153));
        jButton142.setText("E11");
        jButton142.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton142ActionPerformed(evt);
            }
        });

        jButton137.setBackground(new java.awt.Color(153, 0, 153));
        jButton137.setText("E10");
        jButton137.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton137ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pairAreaRPNLayout = new javax.swing.GroupLayout(pairAreaRPN);
        pairAreaRPN.setLayout(pairAreaRPNLayout);
        pairAreaRPNLayout.setHorizontalGroup(
            pairAreaRPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pairAreaRPNLayout.createSequentialGroup()
                .addComponent(jButton137, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton142, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton139, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pairAreaRPNLayout.setVerticalGroup(
            pairAreaRPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pairAreaRPNLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pairAreaRPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton139, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton137, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton142, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton71.setBackground(new java.awt.Color(255, 255, 0));
        jButton71.setText("E04");
        jButton71.setActionCommand("E07");

        jButton72.setBackground(new java.awt.Color(255, 255, 0));
        jButton72.setText("E05");

        jButton73.setBackground(new java.awt.Color(255, 255, 0));
        jButton73.setText("E06");
        jButton73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton73ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout vipAreaRPNLayout = new javax.swing.GroupLayout(vipAreaRPN);
        vipAreaRPN.setLayout(vipAreaRPNLayout);
        vipAreaRPNLayout.setHorizontalGroup(
            vipAreaRPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vipAreaRPNLayout.createSequentialGroup()
                .addComponent(jButton71, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton72, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton73, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        vipAreaRPNLayout.setVerticalGroup(
            vipAreaRPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vipAreaRPNLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(vipAreaRPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton71, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton72, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton73, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout areaSeatPNLayout = new javax.swing.GroupLayout(areaSeatPN);
        areaSeatPN.setLayout(areaSeatPNLayout);
        areaSeatPNLayout.setHorizontalGroup(
            areaSeatPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaSeatPNLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaSeatPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaSeatPNLayout.createSequentialGroup()
                        .addGroup(areaSeatPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaSeatPNLayout.createSequentialGroup()
                                .addComponent(A01, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(A02, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaSeatPNLayout.createSequentialGroup()
                                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaSeatPNLayout.createSequentialGroup()
                                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaSeatPNLayout.createSequentialGroup()
                                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 5, Short.MAX_VALUE)
                        .addGroup(areaSeatPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaSeatPNLayout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaSeatPNLayout.createSequentialGroup()
                                .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaSeatPNLayout.createSequentialGroup()
                                .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaSeatPNLayout.createSequentialGroup()
                                .addComponent(jButton58, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton59, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(areaSeatPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton61, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8))
                    .addGroup(areaSeatPNLayout.createSequentialGroup()
                        .addGroup(areaSeatPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(vipAreaLPN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                            .addComponent(pairAreaLPN, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaSeatPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaSeatPNLayout.createSequentialGroup()
                        .addGroup(areaSeatPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaSeatPNLayout.createSequentialGroup()
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaSeatPNLayout.createSequentialGroup()
                                .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaSeatPNLayout.createSequentialGroup()
                                .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaSeatPNLayout.createSequentialGroup()
                                .addComponent(jButton62, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton63, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton64, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton65, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton66, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(areaSeatPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton51, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton67, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(vipAreaRPN, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                    .addComponent(pairAreaRPN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE))
                .addContainerGap())
        );
        areaSeatPNLayout.setVerticalGroup(
            areaSeatPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaSeatPNLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaSeatPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaSeatPNLayout.createSequentialGroup()
                        .addGroup(areaSeatPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaSeatPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaSeatPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(A01, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(A02, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(areaSeatPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaSeatPNLayout.createSequentialGroup()
                                .addGroup(areaSeatPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(areaSeatPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(areaSeatPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton51, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(areaSeatPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                                    .addComponent(jButton67, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(areaSeatPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(areaSeatPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaSeatPNLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(vipAreaLPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(pairAreaLPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaSeatPNLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vipAreaRPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(pairAreaRPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel3.setBackground(new java.awt.Color(153, 0, 153));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("MÀN HÌNH");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel3.setName(""); // NOI18N
        jLabel3.setOpaque(true);

        jPanel4.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel8.setText("Ghế đơn");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel5.setText("Ghế VIP");

        jLabel6.setBackground(new java.awt.Color(255, 255, 0));
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(redoBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(89, 89, 89)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(payBtn))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(redoBtn)
                    .addComponent(backBtn)
                    .addComponent(payBtn))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(areaSeatPN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(areaSeatPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

    private void jButton138ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton138ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton138ActionPerformed

    private void jButton141ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton141ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton141ActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backBtnActionPerformed

    private void payBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payBtnActionPerformed

    private void jButton70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton70ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton70ActionPerformed

    private void jButton136ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton136ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton136ActionPerformed

    private void jButton73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton73ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton73ActionPerformed

    private void jButton139ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton139ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton139ActionPerformed

    private void jButton142ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton142ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton142ActionPerformed

    private void jButton137ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton137ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton137ActionPerformed

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
            java.util.logging.Logger.getLogger(Room2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Room2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Room2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Room2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Room2 dialog = new Room2(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton A01;
    private javax.swing.JButton A02;
    private java.awt.Panel areaSeatPN;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton136;
    private javax.swing.JButton jButton137;
    private javax.swing.JButton jButton138;
    private javax.swing.JButton jButton139;
    private javax.swing.JButton jButton141;
    private javax.swing.JButton jButton142;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
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
    private javax.swing.JButton jButton4;
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
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel pairAreaLPN;
    private javax.swing.JPanel pairAreaRPN;
    private javax.swing.JButton payBtn;
    private javax.swing.JButton redoBtn;
    private javax.swing.JPanel vipAreaLPN;
    private javax.swing.JPanel vipAreaRPN;
    // End of variables declaration//GEN-END:variables

    
    
    public void chooseButton(JButton src) {
        if (!src.equals(redoBtn) && !src.equals(payBtn) && !src.equals(backBtn)) {
            if (this.pairAreaLPN.isAncestorOf(src)
                    || this.pairAreaRPN.isAncestorOf(src)) {
                if (freePair > 0) {
                    freePair--;
                    src.setEnabled(false);
                    src.setBackground(new java.awt.Color(51,153,255));
                    this.listJbuttonChoosen.add(src);
                } else {
                    JOptionPane.showMessageDialog(rootPane, 
                            "Vui lòng quay lại chọn thêm vé đôi!");
                }
            } else if (this.vipAreaLPN.isAncestorOf(src)
                    || this.vipAreaRPN.isAncestorOf(src)) {
                if (freeVip > 0) {
                    freeVip--;
                    src.setEnabled(false);
                    src.setBackground(new java.awt.Color(51,153,255));
                    this.listJbuttonChoosen.add(src);
                } else {
                    JOptionPane.showMessageDialog(rootPane, 
                            "Vui lòng quay lại chọn thêm vé vip!");
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

    public void removeLastChoosenBtn() {
        this.listJbuttonChoosen.get(listJbuttonChoosen.size() - 1).setEnabled(false);
        this.listJbuttonChoosen.remove(listJbuttonChoosen.size() - 1);
    }

    public void proceedPayment() {
        this.bookTicketView.updateTextBtn();
        this.bookTicketView.setListJButtonChoosen(listJbuttonChoosen);
        this.bookTicketView.renderListChoosenToLB();
    }
}
