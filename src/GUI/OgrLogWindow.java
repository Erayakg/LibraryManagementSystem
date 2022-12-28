package GUI;

import GUI_Action.KitapWindowAction;
import GUI_Action.OgrLogWindowAction;

import javax.swing.*;
import java.awt.*;

public class OgrLogWindow extends MainWindow implements CustomPanel {
    private JPanel panel;
    private JLabel kitapara, kitapal;
    private JButton geri,ara,al,cikis;
    Image kara = new ImageIcon(OgrLogWindow.class.getResource("/resim/kitapara.jpg")).getImage();
    Image kal = new ImageIcon(OgrLogWindow.class.getResource("/resim/kitapal.jpg")).getImage();
    Image exit = new ImageIcon(OgrLogWindow.class.getResource("/resim/kapatma.jpg")).getImage();

    @Override
    public JPanel getPanel() {
        if (this.panel == null) {
            this.panel = new JPanel();
            this.panel.setSize(800, 600);
            this.panel.setLayout(null);
            this.panel.add(getKitapal());
            this.panel.add(getKitapara());
            this.panel.add(getAra());
            this.panel.add(getAl());
            this.panel.add(getCikis());
            this.panel.add(getGeri());

        }
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JLabel getKitapara() {
        if (this.kitapara == null) {
            this.kitapara = new JLabel(new ImageIcon(kara));
            this.kitapara.setBounds(150, 100, 200, 200);

        }
        return kitapara;
    }

    public void setKitapara(JLabel kitapara) {
        this.kitapara = kitapara;
    }

    public JLabel getKitapal() {
        if (this.kitapal == null) {
            this.kitapal = new JLabel(new ImageIcon(kal));
            this.kitapal.setBounds(370, 100, 200, 200);
            this.kitapal.setBackground(Color.gray);

        }
        return kitapal;
    }

    public void setKitapal(JLabel kitapal) {
        this.kitapal = kitapal;
    }

    public JButton getAra() {
        if(this.ara==null){
            this.ara=new JButton("Kitap Ara");
            this.ara.setBounds(150,300,200,75);
            this.ara.addActionListener(new OgrLogWindowAction(this));
        }
        return ara;
    }

    public void setAra(JButton ara) {
        this.ara = ara;
    }

    public JButton getAl() {
        if(this.al== null){
            this.al= new JButton("KitapAl");
            this.al.setBounds(370,300,200,75);
            this.al.addActionListener(new OgrLogWindowAction(this));

        }
        return al;
    }

    public void setAl(JButton al) {
        this.al = al;
    }
    public JButton getGeri() {
        if(this.geri==null){
            this.geri= new JButton("Geri");
            this.geri.setBounds(10,10,70,30);
            this.geri.addActionListener(new OgrLogWindowAction(this));
        }
        return geri;
    }

    public void setGeri(JButton geri) {
        this.geri = geri;
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
            this.cikis.addActionListener(new OgrLogWindowAction(this));
        }
        return cikis;
    }

    public void setCikis(JButton cikis) {
        this.cikis = cikis;
    }
}
