package GUI;

import GUI_Action.KitapAlWindowAction;


import javax.swing.*;
import java.awt.*;

public class KitapAlWindow extends MainWindow implements CustomPanel{
    private JPanel panel;
    private JLabel kitapad;
    private JTextField tkitapad;
    private JButton kitapal,cikis;
    private JTable table;
    Image exit = new ImageIcon(OgrLogWindow.class.getResource("/resim/kapatma.jpg")).getImage();

    @Override
    public JPanel getPanel() {
        if(this.panel==null){
            this.panel= new JPanel();
            this.panel.setSize(800,600);
            this.panel.setLayout(null);
            this.panel.add(getKitapad());
            this.panel.add(getTkitapad());
            this.panel.add(getKitapal());
            this.panel.add(getTable());
            this.panel.add(getCikis());
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
            this.kitapad.setBounds(60,40,100,40);
        }
        return kitapad;
    }

    public void setKitapad(JLabel kitapad) {
        this.kitapad = kitapad;
    }

    public JTextField getTkitapad() {
        if (this.tkitapad==null){
            this.tkitapad= new JTextField();
            this.tkitapad.setBounds(160,40,100,40);
        }
        return tkitapad;
    }

    public void setTkitapad(JTextField tkitapad) {
        this.tkitapad = tkitapad;
    }

    public JButton getKitapal() {
        if(this.kitapal==null){
            this.kitapal= new JButton("Kitap Al");
            this.kitapal.setBounds(160,90,100,40);
            this.kitapal.addActionListener(new KitapAlWindowAction(this));
        }
        return kitapal;
    }

    public void setKitapal(JButton kitapal) {
        this.kitapal = kitapal;
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
            this.cikis.addActionListener(new KitapAlWindowAction(this));
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
