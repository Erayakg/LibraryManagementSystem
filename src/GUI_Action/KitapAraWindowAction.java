package GUI_Action;

import GUI.CustomPanel;
import GUI.HostLogWindow;
import GUI.KitapAraWindow;
import GUI.OgrLogWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KitapAraWindowAction implements ActionListener {
    private KitapAraWindow kaw;
    private CustomPanel panel;

    public KitapAraWindowAction(KitapAraWindow kaw) {
        this.kaw = kaw;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource()==kaw.getAra()){

      }
      else {
          JOptionPane.showMessageDialog(kaw.getPanel(), "Aradığınız Kitap Bulunamadı");
      }
      if(e.getSource()==kaw.getGeri()){
            panel=new OgrLogWindow();
            kaw.getPanel().setVisible(false);
            kaw.getPanel().removeAll();
            kaw.getPanel().add(panel.getPanel());
            kaw.getPanel().setVisible(true);
            kaw.getPanel().repaint();
      }
      if(e.getSource()==kaw.getCikis()){
          System.exit(0);
      }
    }
}