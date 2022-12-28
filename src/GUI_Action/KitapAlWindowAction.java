package GUI_Action;

import GUI.CustomPanel;
import GUI.HostLogWindow;
import GUI.KitapAlWindow;
import GUI.OgrLogWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KitapAlWindowAction implements ActionListener {
    private KitapAlWindow kaw;
    private CustomPanel panel;

    public KitapAlWindowAction(KitapAlWindow kaw){
        this.kaw=kaw;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==kaw.getKitapal()){

        }else{
            JOptionPane.showMessageDialog(kaw.getPanel(),"Almak İstediğiniz Kitap Bulunmamaktadır");
        }


        if(e.getSource()==kaw.getCikis()){
            System.exit(0);
        }
        if(e.getSource()==kaw.getGeri()){
            panel=new OgrLogWindow();
            kaw.getPanel().setVisible(false);
            kaw.getPanel().removeAll();
            kaw.getPanel().add(panel.getPanel());
            kaw.getPanel().setVisible(true);
            kaw.getPanel().repaint();
        }
    }
}
