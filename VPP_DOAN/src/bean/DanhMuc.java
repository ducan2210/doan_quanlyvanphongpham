/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Nguyen Bach Long
 */
public class DanhMuc {
    private String kind;
    private JPanel JPanel;
    private JLabel JLabel;

    public DanhMuc(String kind, JPanel JPanel, JLabel JLabel) {
        this.kind = kind;
        this.JPanel = JPanel;
        this.JLabel = JLabel;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public JPanel getJPanel() {
        return JPanel;
    }

    public void setJPanel(JPanel JPanel) {
        this.JPanel = JPanel;
    }

    public JLabel getJLabel() {
        return JLabel;
    }

    public void setJLabel(JLabel JLabel) {
        this.JLabel = JLabel;
    }
    
}
