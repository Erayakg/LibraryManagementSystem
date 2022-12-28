package GUI_Action;

import GUI.CustomPanel;
import GUI.HKitapAraWindow;
import GUI.HostLogWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HKitapAraWindowAction implements ActionListener {
    private HKitapAraWindow hkaw;
    private CustomPanel panel;

    public HKitapAraWindowAction(HKitapAraWindow hkaw) {
        this.hkaw = hkaw;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==hkaw.getAra()){

        }
        else {
          //  JOptionPane.showMessageDialog(hkaw.getPanel(), "Aradığınız Kitap Bulunamadı");
        }

        if(e.getSource()==hkaw.getGeri()){
            panel=new HostLogWindow();
            hkaw.getPanel().setVisible(false);
            hkaw.getPanel().removeAll();
            hkaw.getPanel().add(panel.getPanel());
            hkaw.getPanel().setVisible(true);
            hkaw.getPanel().repaint();
        }
        if(e.getSource()==hkaw.getCikis()){
            System.exit(0);
        }
    }
}
