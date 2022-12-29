package GUI;


import GUI_Action.KitapAlWindowAction;
import GUI_Action.KitapAraWindowAction;

import javax.swing.*;
import java.awt.*;

public class KitapAraWindow extends MainWindow implements CustomPanel {
    private JPanel panel;
    private JLabel kitapad;
    private JTextField tkitapad;
    private JButton ara,cikis,listele;
    private JTable table;
    private JScrollPane jScrollPane;



    @Override
    public JPanel getPanel() {
        if(this.panel==null){
            this.panel= new JPanel();
            this.panel.setSize(800,600);
            this.panel.setLayout(null);
            this.panel.add(getKitapad());
            this.panel.add(getTkitapad());
            this.panel.add(getAra());
            this.panel.add(getTable());
            this.panel.add(getCikis());
            this.panel.add(getListele());
        }
        return panel;
    }
    @Override
    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JLabel getKitapad() {
        if(this.kitapad==null){
            this.kitapad= new JLabel("Kitap Adı");
            this.kitapad.setBounds(50,50,100,40);
        }
        return kitapad;
    }

    public JButton getListele() {
        if (this.listele==null){
            this.listele= new JButton("listele");
            this.listele.setBounds(250,100,100,25);
            this.listele.addActionListener(new KitapAraWindowAction(this));
        }
        return listele;
    }

    public void setListele(JButton listele) {
        this.listele = listele;
    }

    public void setKitapad(JLabel kitapad) {
        this.kitapad = kitapad;
    }

    public JTextField getTkitapad() {
        if(this.tkitapad==null){
            this.tkitapad=new JTextField();
            this.tkitapad.setBounds(130,60,120,30);
        }
        return tkitapad;
    }

    public void setTkitapad(JTextField tkitapad) {
        this.tkitapad = tkitapad;
    }
    public JButton getAra() {
        if(this.ara==null){
            this.ara= new JButton("ARA");
            this.ara.setBounds(150,100,100,25);
            this.ara.addActionListener(new KitapAraWindowAction(this));
        }
        return ara;
    }

    public void setAra(JButton ara) {
        this.ara = ara;
    }

    public JButton getCikis() {
        if(this.cikis==null){
            this.cikis= new JButton(new ImageIcon(exit));
            this.cikis.setBounds(650,450,100,100);
            this.cikis.setOpaque(false);
            this.cikis.setFocusPainted(false);
            this.cikis.setBorderPainted(false);
            this.cikis.setContentAreaFilled(false);
            this.cikis.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
            this.cikis.addActionListener(new KitapAraWindowAction(this));
        }
        return cikis;
    }


    public void setCikis(JButton cikis) {
        this.cikis = cikis;
    }

    public JTable getTable() {
        if(this.table==null){
            this.table= new JTable();
            this.table.setBounds(300,50,300,700);
        }
        return table;
    }

    public void setTable(JTable table) {
        this.table = table;
    }
}
