/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controll;

import GUI.BanHang;
import GUI.KhachHang;
import GUI.NhaCungCap;
import GUI.ThongKe;
import GUI.NhanVien;
import GUI.NhapHang;
import GUI.QLSANPHAM;

import bean.DanhMuc;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Nguyen Bach Long
 */
public class chuyenManHinh {
    private JPanel root;
    private String kinSelect = "";
    
    
    private List<DanhMuc> listItem = null;
    
    public chuyenManHinh(JPanel jpnRoot)
    {
        this.root = jpnRoot;
    }
    public void setView(JPanel jpn, JLabel jlb)
    {
        kinSelect = "BanHang2";
        jpn.setBackground(new Color(96,100,191));
        jlb.setBackground(new Color(96,100,191));
        
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new BanHang());
        root.validate();
        root.repaint();
    }
    
    public void setEvent(List<DanhMuc> listItem)
    {
        this.listItem = listItem;
        for(DanhMuc item : listItem)
        {
            item.getJLabel().addMouseListener(new LabelEvent(item.getKind(), item.getJPanel(), item.getJLabel()));
        }
    }
    class LabelEvent implements MouseListener{
        private JPanel node;
        private String kind;
        
        private JPanel jpnItem;
        private JLabel jlbItem;

        public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }
        
        

        @Override
        public void mouseClicked(MouseEvent e) {
            switch(kind)
            {
                case "BanHang":
                    node = new GUI.BanHang();
                    break;
                case "ThongKe":
                    node = new ThongKe();
                    break;
                case "SanPham":
                    node = new QLSANPHAM();
                    break;
                case "NhanVien":
                    node = new NhanVien();
                    break;
                case "KhachHang":
                    node = new GUI.KhachHang();
                    break;
                case "NhaCungCap":
                    node =  new NhaCungCap();
                    break;
                case "NhapHang":
                    node =  new NhapHang();
                    break;     
                 default:
                    node = new BanHang();
                    break;
                     
            }
            root.removeAll();
            root.setLayout(new BorderLayout());
            root.add(node);
            root.validate();
            root.repaint();
            setChangeBackground(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            kinSelect = kind;
            jlbItem.setBackground(new Color(96,100,191));
            jpnItem.setBackground(new Color(96,100,191));
        
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            jlbItem.setBackground(new Color(96,100,191));
            jpnItem.setBackground(new Color(96,100,191));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            jlbItem.setBackground(new Color(76,175,80));
            jpnItem.setBackground(new Color(76,175,80));
        }
        private void setChangeBackground(String kind)
        {
            for(DanhMuc item : listItem){
                if(item.getKind().equalsIgnoreCase(kind)){
                     item.getJPanel().setBackground(new Color(96,100,191));
                     item.getJLabel().setBackground(new Color(96,100,191));
                }
                else{
                    item.getJPanel().setBackground(new Color(76,175,80));
                    item.getJLabel().setBackground(new Color(76,175,80));
                }
            }
        }
         
    }
            
}
