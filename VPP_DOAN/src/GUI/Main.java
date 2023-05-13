/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import bean.DanhMuc;
import controll.chuyenManHinh;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nguyen Bach Long
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        chuyenManHinh contro = new chuyenManHinh(jpnView);
        contro.setView(tab_BanHang, jLbBangHang);
        List<DanhMuc> listItem = new ArrayList<>();
        listItem.add(new DanhMuc("BanHang", tab_BanHang, jLbBangHang));
        listItem.add(new DanhMuc("ThongKe", tab_HoaDon, jLbHoaDon));
        listItem.add(new DanhMuc("SanPham", tab_SanPham, jblSanham));
        listItem.add(new DanhMuc("NhanVien", tab_NhanVien, jblNhanVien));
        contro.setEvent(listItem);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnMenu = new javax.swing.JPanel();
        tab_BanHang = new javax.swing.JPanel();
        jLbBangHang = new javax.swing.JLabel();
        tab_HoaDon = new javax.swing.JPanel();
        jLbHoaDon = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tab_SanPham = new javax.swing.JPanel();
        jblSanham = new javax.swing.JLabel();
        tab_NhanVien = new javax.swing.JPanel();
        jblNhanVien = new javax.swing.JLabel();
        tab_NhanVien1 = new javax.swing.JPanel();
        jblNhanVien1 = new javax.swing.JLabel();
        tab_NhanVien2 = new javax.swing.JPanel();
        jblNhanVien2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jpnView = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnMenu.setBackground(new java.awt.Color(0, 204, 204));

        tab_BanHang.setBackground(new java.awt.Color(153, 153, 255));
        tab_BanHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab_BanHangMouseClicked(evt);
            }
        });

        jLbBangHang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLbBangHang.setForeground(new java.awt.Color(255, 255, 255));
        jLbBangHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-product-30.png"))); // NOI18N
        jLbBangHang.setText("BÁN HÀNG");

        javax.swing.GroupLayout tab_BanHangLayout = new javax.swing.GroupLayout(tab_BanHang);
        tab_BanHang.setLayout(tab_BanHangLayout);
        tab_BanHangLayout.setHorizontalGroup(
            tab_BanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_BanHangLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLbBangHang)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tab_BanHangLayout.setVerticalGroup(
            tab_BanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLbBangHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        tab_HoaDon.setBackground(new java.awt.Color(255, 153, 204));
        tab_HoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab_HoaDonMouseClicked(evt);
            }
        });

        jLbHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLbHoaDon.setForeground(new java.awt.Color(255, 255, 255));
        jLbHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-bill-30.png"))); // NOI18N
        jLbHoaDon.setText("THỐNG KÊ");

        javax.swing.GroupLayout tab_HoaDonLayout = new javax.swing.GroupLayout(tab_HoaDon);
        tab_HoaDon.setLayout(tab_HoaDonLayout);
        tab_HoaDonLayout.setHorizontalGroup(
            tab_HoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_HoaDonLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLbHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tab_HoaDonLayout.setVerticalGroup(
            tab_HoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLbHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Nguyễn Bạch Long");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NV :");

        tab_SanPham.setBackground(new java.awt.Color(255, 153, 204));
        tab_SanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab_SanPhamMouseClicked(evt);
            }
        });

        jblSanham.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jblSanham.setForeground(new java.awt.Color(255, 255, 255));
        jblSanham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-bill-30.png"))); // NOI18N
        jblSanham.setText("SẢN PHẨM");

        javax.swing.GroupLayout tab_SanPhamLayout = new javax.swing.GroupLayout(tab_SanPham);
        tab_SanPham.setLayout(tab_SanPhamLayout);
        tab_SanPhamLayout.setHorizontalGroup(
            tab_SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_SanPhamLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jblSanham, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        tab_SanPhamLayout.setVerticalGroup(
            tab_SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jblSanham, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
        );

        tab_NhanVien.setBackground(new java.awt.Color(255, 153, 204));
        tab_NhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab_NhanVienMouseClicked(evt);
            }
        });

        jblNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jblNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        jblNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-bill-30.png"))); // NOI18N
        jblNhanVien.setText("NHÂN VIÊN");

        javax.swing.GroupLayout tab_NhanVienLayout = new javax.swing.GroupLayout(tab_NhanVien);
        tab_NhanVien.setLayout(tab_NhanVienLayout);
        tab_NhanVienLayout.setHorizontalGroup(
            tab_NhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_NhanVienLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jblNhanVien)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        tab_NhanVienLayout.setVerticalGroup(
            tab_NhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jblNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
        );

        tab_NhanVien1.setBackground(new java.awt.Color(255, 153, 204));
        tab_NhanVien1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab_NhanVien1MouseClicked(evt);
            }
        });

        jblNhanVien1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jblNhanVien1.setForeground(new java.awt.Color(255, 255, 255));
        jblNhanVien1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-bill-30.png"))); // NOI18N
        jblNhanVien1.setText("LỊCH SỬ");

        javax.swing.GroupLayout tab_NhanVien1Layout = new javax.swing.GroupLayout(tab_NhanVien1);
        tab_NhanVien1.setLayout(tab_NhanVien1Layout);
        tab_NhanVien1Layout.setHorizontalGroup(
            tab_NhanVien1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_NhanVien1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jblNhanVien1)
                .addContainerGap(113, Short.MAX_VALUE))
        );
        tab_NhanVien1Layout.setVerticalGroup(
            tab_NhanVien1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jblNhanVien1, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
        );

        tab_NhanVien2.setBackground(new java.awt.Color(255, 153, 204));
        tab_NhanVien2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab_NhanVien2MouseClicked(evt);
            }
        });

        jblNhanVien2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jblNhanVien2.setForeground(new java.awt.Color(255, 255, 255));
        jblNhanVien2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-bill-30.png"))); // NOI18N
        jblNhanVien2.setText("LỊCH SỬ");

        javax.swing.GroupLayout tab_NhanVien2Layout = new javax.swing.GroupLayout(tab_NhanVien2);
        tab_NhanVien2.setLayout(tab_NhanVien2Layout);
        tab_NhanVien2Layout.setHorizontalGroup(
            tab_NhanVien2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_NhanVien2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jblNhanVien2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tab_NhanVien2Layout.setVerticalGroup(
            tab_NhanVien2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jblNhanVien2, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
        jpnMenu.setLayout(jpnMenuLayout);
        jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tab_HoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tab_BanHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addContainerGap(52, Short.MAX_VALUE))
            .addComponent(tab_SanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tab_NhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tab_NhanVien1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tab_NhanVien2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel4))
                .addGap(143, 143, 143)
                .addComponent(tab_BanHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tab_HoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tab_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tab_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tab_NhanVien1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tab_NhanVien2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 879, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tab_SanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_SanPhamMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tab_SanPhamMouseClicked

    private void tab_HoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_HoaDonMouseClicked

    }//GEN-LAST:event_tab_HoaDonMouseClicked

    private void tab_BanHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_BanHangMouseClicked

    }//GEN-LAST:event_tab_BanHangMouseClicked

    private void tab_NhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_NhanVienMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tab_NhanVienMouseClicked

    private void tab_NhanVien1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_NhanVien1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tab_NhanVien1MouseClicked

    private void tab_NhanVien2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_NhanVien2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tab_NhanVien2MouseClicked

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLbBangHang;
    private javax.swing.JLabel jLbHoaDon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jblNhanVien;
    private javax.swing.JLabel jblNhanVien1;
    private javax.swing.JLabel jblNhanVien2;
    private javax.swing.JLabel jblSanham;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JPanel jpnView;
    private javax.swing.JPanel tab_BanHang;
    private javax.swing.JPanel tab_HoaDon;
    private javax.swing.JPanel tab_NhanVien;
    private javax.swing.JPanel tab_NhanVien1;
    private javax.swing.JPanel tab_NhanVien2;
    private javax.swing.JPanel tab_SanPham;
    // End of variables declaration//GEN-END:variables
}
