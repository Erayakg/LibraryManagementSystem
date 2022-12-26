package GUI_Action;

import GUI.KitapAraWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KitapAraWindowAction implements ActionListener {
    private KitapAraWindow kaw;

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
      if(e.getSource()==kaw.getCikis()){
          System.exit(0);
      }
    }
}