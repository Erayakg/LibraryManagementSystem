package GUI_Action;

import Controller.OgrenciEkleController;
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
            OgrenciEkleController ogrenciEkleController =new OgrenciEkleController();
            ogrenciEkleController.save(this.oew);
            JOptionPane.showMessageDialog(oew.getPanel(), "öğrenci ekleniştir");
        }
        if(e.getSource()==oew.getBsil()){
            OgrenciEkleController ogrenciEkleController =new OgrenciEkleController();
            if (ogrenciEkleController.sil(oew.getTad().getText()))
            {

                JOptionPane.showMessageDialog(oew.getPanel(), "öğrenci Silinmiştir");
            }
            else {
                JOptionPane.showMessageDialog(oew.getPanel(), "Aradığınız öğrenci bulunamamıştır!!!");

            }

        }
        if(e.getSource()==oew.getCikis()){
            System.exit(0);
        }
    }
}
