package GUI_Action;

import Controller.KitapAlController;
import Controller.kitapWindowController;
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
            kitapWindowController kitapWindowController =new kitapWindowController();
            if (kitapWindowController.delete(kaw.getTkitapad().getText())){
                JOptionPane.showMessageDialog(kaw.getPanel(), "Kitabı aldınız 15 gün içerisinde iade ediniz!!");
                KitapAlController kitapAlController=new KitapAlController();
                KitapAlWindow kitapAlWindow=new KitapAlWindow();
                kitapAlController.SetKitapTable(kitapAlWindow);
                kaw.getPanel().setVisible(false);
                kaw.getPanel().removeAll();
                kaw.getPanel().add(kitapAlWindow.getPanel());
                kaw.getPanel().setVisible(true);
                kaw.getPanel().repaint();
            }
            else {
                JOptionPane.showMessageDialog(kaw.getPanel(), "Aradığınız Kitap Bulunamadı");
            }
        }
        if (e.getSource()==kaw.getListele()){
            KitapAlController kitapAlController=new KitapAlController();
            KitapAlWindow kitapAlWindow=new KitapAlWindow();
            kitapAlController.SetKitapTable(kitapAlWindow);
            kaw.getPanel().setVisible(false);
            kaw.getPanel().removeAll();
            kaw.getPanel().add(kitapAlWindow.getPanel());
            kaw.getPanel().setVisible(true);
            kaw.getPanel().repaint();
        }
        if(e.getSource()==kaw.getCikis()){
            System.exit(0);
        }
    }
}
