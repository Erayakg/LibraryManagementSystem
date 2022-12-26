package GUI_Action;

import GUI.KitapAlWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KitapAlWindowAction implements ActionListener {
    private KitapAlWindow kaw;

    public KitapAlWindowAction(KitapAlWindow kaw){
        this.kaw=kaw;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==kaw.getKitapal()){

        }
        else {
            JOptionPane.showMessageDialog(kaw.getPanel(), "Aradığınız Kitap Bulunamadı");
        }
        if(e.getSource()==kaw.getCikis()){
            System.exit(0);
        }
    }
}
