package GUI_Action;

import GUI.HostEkleWindow;
import GUI.OgrEkleWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OgrEkleWindowAction implements ActionListener {
    private OgrEkleWindow oew;
    public OgrEkleWindowAction(OgrEkleWindow oew){
        this.oew=oew;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==oew.getBekle()){
            JOptionPane.showMessageDialog(oew.getPanel(), "Kütüphaneci ekleniştir");
        }
        if(e.getSource()==oew.getBsil()){
            JOptionPane.showMessageDialog(oew.getPanel(), "Kütüphaneci Silinmiştir");
        }
        if(e.getSource()==oew.getCikis()){
            System.exit(0);
        }
    }
}
