package GUI_Action;

import Controller.HostEkleController;
import Entities.Human.Admin;
import GUI.HostEkleWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HostEkleWindowAction implements ActionListener {
    private HostEkleWindow hew;
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
        if(e.getSource()==hew.getCikis()){
            System.exit(0);
        }
    }
}
