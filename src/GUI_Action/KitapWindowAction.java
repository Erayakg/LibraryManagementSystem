package GUI_Action;


import GUI.CustomPanel;
import GUI.HostLogWindow;
import GUI.KitapWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KitapWindowAction implements ActionListener {
    private CustomPanel panel;
    private KitapWindow kw;
    public KitapWindowAction(KitapWindow kw){
        this.kw=kw;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==kw.getEkle()){
            JOptionPane.showMessageDialog(kw.getPanel(), "Kitap Eklenmiştir");
        }
        if(e.getSource()==kw.getSil()){
            JOptionPane.showMessageDialog(kw.getPanel(), "Kitap Silinmiştir");
        }
        if(e.getSource()==kw.getGeri()){
            panel=new HostLogWindow();
            kw.getPanel().setVisible(false);
            kw.getPanel().removeAll();
            kw.getPanel().add(panel.getPanel());
            kw.getPanel().setVisible(true);
            kw.getPanel().repaint();
        }
        if(e.getSource()==kw.getCikis()){
            System.exit(0);
        }
    }
}
