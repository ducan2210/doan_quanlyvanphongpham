/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import DAO.NhanVienDAO;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nguyen Bach Long
 */
public class NhanVien extends javax.swing.JPanel {

    /**
     * Creates new form NhanVien
     */
    Vector<String> chuDe = new Vector<String>();
    Vector noiDung = new Vector();
    boolean chooseImg = false;
    String srcAnh = "./src/Images/";
    public NhanVien() {
        initComponents();
        
        String [] cds = {"Mã Nhân Viên", "Họ Tên", "Tài Khoản", "Số Điện Thoại", "Địa Chỉ", "Trang Thai", "Quyen"};
        for (String cd : cds) {
            chuDe.add(cd);
        }
        ArrayList<Pojo.NhanVien> listNV = NhanVienDAO.layDanhSachNhanVien();
        for (Pojo.NhanVien nhanVien : listNV) {
            Vector nv = new Vector();
            nv.add(nhanVien.maNV);
            nv.add(nhanVien.hoTen);
            nv.add(nhanVien.taiKhoan);
            nv.add(nhanVien.soDT);
            nv.add(nhanVien.diaChi);
            nv.add(nhanVien.trangThai);
            nv.add(nhanVien.quyen);
            noiDung.add(nv);
        }
        ArrayList<String> listCD = NhanVienDAO.layDanhSachChuDe();
        for (String cd : listCD) {
            cbo_cd.addItem(NhanVienDAO.quyDoi(cd));
        }
        Tb_DSNV.setModel(new DefaultTableModel(noiDung, chuDe));
        cbo_cd.setSelectedIndex(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        btn_add = new javax.swing.JButton();
        btn_del = new javax.swing.JButton();
        btn_detail = new javax.swing.JButton();
        btn_refresh = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tb_DSNV = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbo_cd = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cbo_nd = new javax.swing.JComboBox<>();
        btn_filter = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Thêm/Xóa"));

        btn_add.setText("Thêm");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_del.setText("Xóa");
        btn_del.setEnabled(false);
        btn_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delActionPerformed(evt);
            }
        });

        btn_detail.setText("Xem Chi Tiết");
        btn_detail.setEnabled(false);
        btn_detail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_detailActionPerformed(evt);
            }
        });

        btn_refresh.setText("Làm Mới");
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_detail)
                    .addComponent(btn_del)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btn_add)
                        .addGap(100, 100, 100)
                        .addComponent(btn_refresh)))
                .addContainerGap(355, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_add)
                    .addComponent(btn_refresh))
                .addGap(18, 18, 18)
                .addComponent(btn_del)
                .addGap(18, 18, 18)
                .addComponent(btn_detail)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        Tb_DSNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Tb_DSNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tb_DSNVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tb_DSNV);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Lọc"));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("Chủ đề");

        cbo_cd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_cdActionPerformed(evt);
            }
        });

        jLabel2.setText("Nội dung");

        btn_filter.setText("Lọc");
        btn_filter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_filterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_filter)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(cbo_cd, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 108, Short.MAX_VALUE))
                            .addComponent(cbo_nd, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(152, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbo_cd, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbo_nd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_filter)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:
//        FormThemNhanVien frm = new FormThemNhanVien();
//        frm.show();
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delActionPerformed
        // TODO add your handling code here:
        int pos = this.Tb_DSNV.getSelectedRow();
        if (pos >= 0){
            int code = (int) (Tb_DSNV.getValueAt(pos, 0));
            if (JOptionPane.showConfirmDialog(this, "Bạn muốn xóa nhân viên mang mã " + code + " chứ ?") == JOptionPane.OK_OPTION) {
                NhanVienDAO.xoaNhanVien(String.valueOf(code));
                btn_refreshActionPerformed(evt);
            }
        }
        btn_del.setEnabled(false);
    }//GEN-LAST:event_btn_delActionPerformed

    private void btn_detailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_detailActionPerformed
        // TODO add your handling code here:
//        int pos = this.Tb_DSNV.getSelectedRow();
//        if (pos >= 0){
//            String tk = (String) (Tb_DSNV.getValueAt(pos, 2));
//            try {
//                FormChiTietNhanVienChoTKQuanLy frm = new FormChiTietNhanVienChoTKQuanLy(tk);
//                frm.setTk(tk);
//                frm.show();
//            } catch (MalformedURLException ex) {
//                Logger.getLogger(FormQuanLyNhanVien.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//        btn_detail.setEnabled(false);
    }//GEN-LAST:event_btn_detailActionPerformed

    private void Tb_DSNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tb_DSNVMouseClicked
        // TODO add your handling code here:
        if (Tb_DSNV.getSelectedRow()!=-1) {
            btn_del.setEnabled(true);
            btn_detail.setEnabled(true);
        }
    }//GEN-LAST:event_Tb_DSNVMouseClicked

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        // TODO add your handling code here:
        ArrayList<Pojo.NhanVien> listNV = NhanVienDAO.layDanhSachNhanVien();
        noiDung.clear();
        for (Pojo.NhanVien nhanVien : listNV) {
            Vector nv = new Vector();
            nv.add(nhanVien.maNV);
            nv.add(nhanVien.hoTen);
            nv.add(nhanVien.taiKhoan);
            nv.add(nhanVien.soDT);
            nv.add(nhanVien.diaChi);
            nv.add(nhanVien.trangThai);
            nv.add(nhanVien.quyen);
            noiDung.add(nv);
        }
        Tb_DSNV.setModel(new DefaultTableModel(noiDung, chuDe));
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void cbo_cdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_cdActionPerformed
        // TODO add your handling code here:
        ArrayList<String> listND = NhanVienDAO.layDanhSachNoiDung(NhanVienDAO.quyDoi(String.valueOf(cbo_cd.getSelectedItem()), "r"));
        cbo_nd.removeAllItems();
        for (String nd : listND) {
            cbo_nd.addItem(nd);
        }
        cbo_nd.setSelectedIndex(0);
    }//GEN-LAST:event_cbo_cdActionPerformed

    private void btn_filterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_filterActionPerformed
        // TODO add your handling code here:
        noiDung.clear();
        ArrayList<Pojo.NhanVien> listNV = NhanVienDAO.layDanhSachNhanVien(NhanVienDAO.quyDoi(String.valueOf(cbo_cd.getSelectedItem()), "r"),String.valueOf(cbo_nd.getSelectedItem()));
        for (Pojo.NhanVien nhanVien : listNV) {
            Vector nv = new Vector();
            nv.add(nhanVien.maNV);
            nv.add(nhanVien.hoTen);
            nv.add(nhanVien.taiKhoan);
            nv.add(nhanVien.soDT);
            nv.add(nhanVien.diaChi);
            nv.add(nhanVien.trangThai);
            nv.add(nhanVien.quyen);
            noiDung.add(nv);
        }
        Tb_DSNV.setModel(new DefaultTableModel(noiDung, chuDe));
    }//GEN-LAST:event_btn_filterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tb_DSNV;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_del;
    private javax.swing.JButton btn_detail;
    private javax.swing.JButton btn_filter;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JComboBox<String> cbo_cd;
    private javax.swing.JComboBox<String> cbo_nd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
