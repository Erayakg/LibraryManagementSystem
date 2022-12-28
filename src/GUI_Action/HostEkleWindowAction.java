package GUI_Action;

import Controller.HostEkleController;
import Entities.Human.Admin;
import GUI.CustomPanel;
import GUI.HostEkleWindow;
import GUI.HostLogWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HostEkleWindowAction implements ActionListener {
    private HostEkleWindow hew;
    private CustomPanel panel;
    Admin admin=new Admin();
    public HostEkleWindowAction(HostEkleWindow hew){
        this.hew=hew;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==hew.getBekle()){
            HostEkleController hostEkleController = new HostEkleController();
            hostEkleController.save(this.hew);
            JOptionPane.showMessageDialog(hew.getPanel(), "Kütüphaneci ekleniştir");
        }
        if(e.getSource()==hew.getBsil()){
            HostEkleController hostEkleController =new HostEkleController();
            if(hostEkleController.delete(hew.getTad().getText())){
                JOptionPane.showMessageDialog(hew.getPanel(), "Kütüphaneci Silinmiştir");
            }
            else {
                JOptionPane.showMessageDialog(hew.getPanel(), "Hatalı bilgi Lütfen bilgileriniz kontrol edip tekrar deneyiniz !!");
            }
        }
        if(e.getSource()==hew.getGeri()){
            panel=new HostLogWindow();
            hew.getPanel().setVisible(false);
            hew.getPanel().removeAll();
            hew.getPanel().add(panel.getPanel());
            hew.getPanel().setVisible(true);
            hew.getPanel().repaint();
        }
        if(e.getSource()==hew.getCikis()){
            System.exit(0);
        }
    }
}
