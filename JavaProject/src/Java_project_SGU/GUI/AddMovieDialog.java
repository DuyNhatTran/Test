package Java_project_SGU.GUI;

import Java_project_SGU.BUS.Movie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import Java_project_SGU.Controller.FileFilterPicture;
import Java_project_SGU.Exception.InvalidBirthdayException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class AddMovieDialog extends javax.swing.JDialog implements ActionListener {

    private ManageEmployeeFrm manageEmployeeFrm;
    private Movie movie;
    private String moviePath;

    // constructor
    public AddMovieDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.manageEmployeeFrm = (ManageEmployeeFrm) parent;
        this.setLocationRelativeTo(null);
        addActionListener();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        pictureMovieLB = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        putFileBtn = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        movieNameTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        directorTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        producerTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        countryCB = new javax.swing.JComboBox<>();
        isShowingCB = new javax.swing.JComboBox<>();
        timeTxt = new javax.swing.JTextField();
        ageLimitTxt = new javax.swing.JTextField();
        typeMovieCB = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        openingDateTxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        languageTxt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        contentTxt = new javax.swing.JTextArea();
        SaveMovieBtn = new javax.swing.JButton();
        CancelBtn = new javax.swing.JButton();
        fomartDateLB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Java_project_SGU/Image/logoCinestar_1.png"))); // NOI18N
        jLabel1.setText("      ");

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pictureMovieLB.setMaximumSize(new java.awt.Dimension(240, 355));
        pictureMovieLB.setMinimumSize(new java.awt.Dimension(240, 355));
        pictureMovieLB.setName(""); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pictureMovieLB, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pictureMovieLB, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                .addContainerGap())
        );

        pictureMovieLB.getAccessibleContext().setAccessibleDescription("");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Thêm phim mới");

        putFileBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Java_project_SGU/Image/putFile_icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(putFileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(putFileBtn)
                .addGap(23, 23, 23))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Tên phim");

        movieNameTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        movieNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movieNameTxtActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Thời lượng");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Giới hạn tuổi");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Đạo diễn");

        directorTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Nhà sản xuất");

        producerTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        producerTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                producerTxtActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Quốc gia");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Trạng thái");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Thể loại");

        countryCB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        countryCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Korean", "VietNam", "English", "Malasia", "Chinese", " " }));

        isShowingCB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        isShowingCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đang Hoạt Động", "Ngưng Hoạt Động" }));
        isShowingCB.setActionCommand("Đang Hoạt Động\nNgưng Hoạt Động");

        timeTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        timeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeTxtActionPerformed(evt);
            }
        });

        ageLimitTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ageLimitTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageLimitTxtActionPerformed(evt);
            }
        });

        typeMovieCB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        typeMovieCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Phim lãng mạn", "Phim tội phạm", "Phim lịch sử", "Phim chiến tranh", "Phim hoạt hình", "Phim phiêu lưu", "Phim khoa học viễn tưởng", "Phim thể thao", "Phim viễn Tây", "Phim kiếm hiệp", "Phim cổ trang", "Phim hành động", "Phim phiêu lưu", "Phim bí ẩn", "Phim hài kịch", "Phim kinh dị", "Phim giật gân", "Phim kì ảo" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(ageLimitTxt))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(49, 49, 49)
                        .addComponent(directorTxt))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(movieNameTxt)
                            .addComponent(timeTxt)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(countryCB, 0, 320, Short.MAX_VALUE)
                            .addComponent(producerTxt)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(isShowingCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(2, 2, 2))
                            .addComponent(typeMovieCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(movieNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(timeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(ageLimitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(directorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(producerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(countryCB))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(isShowingCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(typeMovieCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Ngày chiếu");

        openingDateTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        openingDateTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openingDateTxtActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Ngôn ngữ");

        languageTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("Tóm tắt");

        jScrollPane1.setHorizontalScrollBar(null);

        contentTxt.setColumns(20);
        contentTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        contentTxt.setLineWrap(true);
        contentTxt.setRows(5);
        contentTxt.setAutoscrolls(false);
        jScrollPane1.setViewportView(contentTxt);

        SaveMovieBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        SaveMovieBtn.setText("Lưu");

        CancelBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        CancelBtn.setText("Hủy");

        fomartDateLB.setText("(dd/MM/yyyy)*");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                            .addComponent(jLabel13)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(languageTxt)
                                    .addComponent(openingDateTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                    .addComponent(fomartDateLB)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(SaveMovieBtn)
                        .addGap(80, 80, 80)
                        .addComponent(CancelBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fomartDateLB)
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(openingDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(languageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveMovieBtn)
                    .addComponent(CancelBtn))
                .addGap(29, 29, 29))
        );

        jLayeredPane1.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void movieNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movieNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_movieNameTxtActionPerformed

    private void producerTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_producerTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_producerTxtActionPerformed

    private void openingDateTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openingDateTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_openingDateTxtActionPerformed

    private void timeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeTxtActionPerformed

    private void ageLimitTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageLimitTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageLimitTxtActionPerformed

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
            java.util.logging.Logger.getLogger(AddMovieDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMovieDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMovieDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMovieDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddMovieDialog dialog = new AddMovieDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton CancelBtn;
    private javax.swing.JButton SaveMovieBtn;
    private javax.swing.JTextField ageLimitTxt;
    private javax.swing.JTextArea contentTxt;
    private javax.swing.JComboBox<String> countryCB;
    private javax.swing.JTextField directorTxt;
    private javax.swing.JLabel fomartDateLB;
    private javax.swing.JComboBox<String> isShowingCB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField languageTxt;
    private javax.swing.JTextField movieNameTxt;
    private javax.swing.JTextField openingDateTxt;
    private javax.swing.JLabel pictureMovieLB;
    private javax.swing.JTextField producerTxt;
    private javax.swing.JButton putFileBtn;
    private javax.swing.JTextField timeTxt;
    private javax.swing.JComboBox<String> typeMovieCB;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src.equals(putFileBtn)) {
            putPosterMovie();
        } else if (src.equals(SaveMovieBtn)) {
            addMovie();
        } else if (src.equals(CancelBtn)) {
            CancelPageAddMovie();
        }
    }

    private void addActionListener() {
        this.putFileBtn.addActionListener(this);
        this.SaveMovieBtn.addActionListener(this);
        this.CancelBtn.addActionListener(this);
    }

    private void putPosterMovie() {
        String defaultPath = "C:\\Workspace\\JAVA_TITV\\src\\Java_project_SGU\\PosterMovie";
        File initFile = new File(defaultPath);
        JFileChooser fileChooser = new JFileChooser(initFile);
        fileChooser.setFileFilter(new FileFilterPicture());
        int fileChooserRs = fileChooser.showOpenDialog(this);
        if (fileChooserRs == JFileChooser.APPROVE_OPTION) {
            String pathFile = fileChooser.getSelectedFile().getAbsolutePath();
            var icon = new ImageIcon(pathFile);
            pictureMovieLB.setIcon(icon);
            this.moviePath = pathFile;
        }
    }

    private void addMovie() {
        String movieName = movieNameTxt.getText();
        int time = 0;
        if (!timeTxt.getText().isEmpty()) {
            time = Integer.parseInt(timeTxt.getText());
        }
        int ageLimit = 0;
        if (!ageLimitTxt.getText().isEmpty()) {
            ageLimit = Integer.parseInt(ageLimitTxt.getText());
        }
        String director = directorTxt.getText();
        String producer = producerTxt.getText();
        String country = countryCB.getSelectedItem().toString();
        String isShowing = isShowingCB.getSelectedItem().toString();
        String typeMovie = typeMovieCB.getSelectedItem().toString();
        String openingDate = openingDateTxt.getText();
        String language = languageTxt.getText();
        String content = contentTxt.getText();
        if (moviePath == null) {
            JOptionPane.showMessageDialog(rootPane, "VUI LÒNG CHÈN POSTER PHIM!");
        }
        if (movieName.isEmpty() || ageLimitTxt.getText().isEmpty()
                || timeTxt.getText().isEmpty() || director.isEmpty()
                || producer.isEmpty() || country.isEmpty()
                || isShowing.isEmpty() || typeMovie.isEmpty()
                || openingDate.isEmpty() || language.isEmpty() || content.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "VUI LÒNG NHẬP ĐẦY ĐỦ THÔNG TIN!");
        } else {
            boolean isShowingBool = false;
            ComboBoxModel<String> comboxModel = this.isShowingCB.getModel();
            if (comboxModel.getElementAt(0).equals(isShowing)) {
                isShowingBool = true;
            }
            try {
                movie = new Movie(null, movieName, time, ageLimit, openingDate,
                        language, country, producer, content, typeMovie,
                        director, isShowingBool, moviePath);
                this.manageEmployeeFrm.addMovieCallBack(this.movie);
                JOptionPane.showMessageDialog(rootPane, "THÊM PHIM MỚI THÀNH CÔNG!");
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            } catch (InvalidBirthdayException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }
        }
    }

    private void CancelPageAddMovie() {
        int rsChoosen = JOptionPane.showConfirmDialog(rootPane, "Nếu thoát "
                + "các dữ liệu bạn đã điền sẽ không được lưu?");
        if (rsChoosen == JOptionPane.OK_OPTION) {
            this.dispose();
        }
    }
}

//(String idMovie, String nameMovie, int time, int ageLimit, Date openingDate, String laguage, String country, String producer, String content,, String typeMovie, String director, boolean isShowing, String linkImage) {
