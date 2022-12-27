package GUI_Action;

import GUI.HostEkleWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HostEkleWindowAction implements ActionListener {
    private HostEkleWindow hew;
    public HostEkleWindowAction(HostEkleWindow hew){
        this.hew=hew;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==hew.getBekle()){
            JOptionPane.showMessageDialog(hew.getPanel(), "Kütüphaneci ekleniştir");
        }
        if(e.getSource()==hew.getBsil()){
            JOptionPane.showMessageDialog(hew.getPanel(), "Kütüphaneci Silinmiştir");
        }
        if(e.getSource()==hew.getCikis()){
            System.exit(0);
        }
    }
}
