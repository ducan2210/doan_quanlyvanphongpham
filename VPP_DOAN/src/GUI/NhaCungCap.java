/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import DAO.NhaCungCapDAO;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nguyen Bach Long
 */
public class NhaCungCap extends javax.swing.JPanel {

    /**
     * Creates new form NhaCungCap
     */
         
    DefaultTableModel dtb1 = new DefaultTableModel();
    DefaultTableModel dtb2 = new DefaultTableModel();
    public NhaCungCap() {
        initComponents();
         String [] tieuDe1={"Mã nhà cung cấp","Tên nhà cung cấp","Địa chỉ","Số điện thoại"};
        dtb1.setColumnIdentifiers(tieuDe1);
        tb_ncc.setModel(dtb1);
        String [] tieuDe2={"Mã nhà cung cấp","Tên nhà cung cấp","Địa chỉ","Số điện thoại"};
        dtb2.setColumnIdentifiers(tieuDe1);
        hienThi();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_tenNCC = new javax.swing.JTextField();
        txt_maNCC = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_diaChi = new javax.swing.JTextField();
        txt_sdt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_ncc = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btn_them = new javax.swing.JButton();
        btn_luu = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("Mã nhà cung cấp");

        jLabel3.setText("Tên nhà cung cấp");

        txt_maNCC.setEnabled(false);

        jLabel6.setText("Địa chỉ");

        jLabel5.setText("Số điện thoại");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_maNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_tenNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_diaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_maNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txt_diaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_tenNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txt_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        tb_ncc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tb_ncc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_nccMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_ncc);

        btn_them.setText("Thêm");
        btn_them.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_themMouseClicked(evt);
            }
        });

        btn_luu.setText("Lưu");
        btn_luu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_luuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_them)
                .addGap(119, 119, 119)
                .addComponent(btn_luu)
                .addGap(315, 315, 315))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_them)
                    .addComponent(btn_luu))
                .addGap(64, 64, 64))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("DANH SÁCH CÁC NHÀ CUNG CẤP CỦA CỬA HÀNG");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(jLabel1)
                .addContainerGap(249, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_luuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_luuMouseClicked
        if(txt_diaChi.getText().isEmpty() || txt_sdt.getText().isEmpty()|| txt_tenNCC.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Chưa nhập đủ thông tin của nhà cung cấp!!!");
        }
        else
        {
            if(!NhaCungCapDAO.kiemTraNhaCungCap(txt_tenNCC.getText()))
            {
                Pojo.NhaCungCap ncc = new Pojo.NhaCungCap();
                ncc.setDiaChi(txt_diaChi.getText());
                ncc.setTenNCC(txt_tenNCC.getText());
                ncc.setSDT(txt_sdt.getText());
                if(NhaCungCapDAO.themNhaCungCap(txt_tenNCC.getText(),txt_diaChi.getText(),txt_sdt.getText())==true)
                {
                    JOptionPane.showMessageDialog(this, "Thêm nhà cung cấp thành công");
                    hienThi();
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Thêm nhà cung cấp thất bại!!!");
                }
            }
            else{
                if(JOptionPane.showConfirmDialog(this,"Đã có thông tin nhà cung cấp này! Bạn có muốn update không?","Thông báo", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
                {
                    if(NhaCungCapDAO.UpdateNhaCungCap( txt_tenNCC.getText(), txt_diaChi.getText(), txt_sdt.getText()))
                    {
                        JOptionPane.showMessageDialog(this, "Sửa thông tin nhà cung cấp thành công");
                        hienThi();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "Sửa thông tin nhà cung cấp thất bại!!!");
                    }
                }
            }
        }
    }//GEN-LAST:event_btn_luuMouseClicked

    private void btn_themMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_themMouseClicked
        txt_maNCC.setText("");
        txt_sdt.setText("");
        txt_tenNCC.setText("");
        txt_diaChi.setText("");
        txt_tenNCC.requestFocus();
    }//GEN-LAST:event_btn_themMouseClicked

    private void tb_nccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_nccMouseClicked
        int numRows = tb_ncc.getSelectedRow();
        txt_maNCC.setText(String.valueOf(tb_ncc.getValueAt(numRows, 0)));
        txt_tenNCC.setText(tb_ncc.getValueAt(numRows, 1).toString());
        txt_diaChi.setText(tb_ncc.getValueAt(numRows, 2).toString());
        txt_sdt.setText(tb_ncc.getValueAt(numRows, 3).toString());
    }//GEN-LAST:event_tb_nccMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_luu;
    private javax.swing.JButton btn_them;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_ncc;
    private javax.swing.JTextField txt_diaChi;
    private javax.swing.JTextField txt_maNCC;
    private javax.swing.JTextField txt_sdt;
    private javax.swing.JTextField txt_tenNCC;
    // End of variables declaration//GEN-END:variables

    private void hienThiDSNcc() {
         dtb1.setRowCount(0);
        ArrayList<Pojo.NhaCungCap> dsncc = NhaCungCapDAO.layDanhSachNhaCungCap();
        
        for(Pojo.NhaCungCap ncc: dsncc)
        {
            Vector<Object> v = new Vector<>();
            v.add(ncc.getMaNCC());
            v.add(ncc.getTenNCC());
            v.add(ncc.getDiaChi());
            v.add(ncc.getSDT());
            dtb1.addRow(v);
        }
    }
    
     private void hienThiDSNCCAn() {
        dtb2.setRowCount(0);
        ArrayList<Pojo.NhaCungCap> dsncc = NhaCungCapDAO.layDanhSachNhaCungCapBiAn();
        
        for(Pojo.NhaCungCap ncc: dsncc)
        {
            Vector<Object> v = new Vector<>();
            v.add(ncc.getMaNCC());
            v.add(ncc.getTenNCC());
            v.add(ncc.getDiaChi());
            v.add(ncc.getSDT());
            dtb2.addRow(v);
        }
    }

    private void hienThi() {
        hienThiDSNCCAn();
        hienThiDSNcc();
    }
}