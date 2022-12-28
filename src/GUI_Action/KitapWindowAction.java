package GUI_Action;


import Controller.kitapWindowController;
import GUI.KitapWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KitapWindowAction implements ActionListener {
    private KitapWindow kw;
    public KitapWindowAction(KitapWindow kw){
        this.kw=kw;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

            if(e.getSource()==kw.getEkle()){
            kitapWindowController kitapWindowController=new kitapWindowController();
            kitapWindowController.save(this.kw);
            JOptionPane.showMessageDialog(kw.getPanel(), "Kitap Eklenmiştir");
            KitapWindow kitapWindow=new KitapWindow();
            kitapWindowController.TableSet(kitapWindow);
            kw.getPanel().setVisible(false);
            kw.getPanel().removeAll();
            kw.getPanel().add(kitapWindow.getPanel());
            kw.getPanel().setVisible(true);
            kw.getPanel().repaint();
        }
        if(e.getSource()==kw.getSil()){
            kitapWindowController kitapWindowController=new kitapWindowController();
            if (kitapWindowController.delete(kw.getTad().getText()))
            {
                JOptionPane.showMessageDialog(kw.getPanel(), "Kitap Silinmiştir");
                KitapWindow kitapWindow=new KitapWindow();
                kitapWindowController.TableSet(kitapWindow);
                kw.getPanel().setVisible(false);
                kw.getPanel().removeAll();
                kw.getPanel().add(kitapWindow.getPanel());
                kw.getPanel().setVisible(true);
                kw.getPanel().repaint();
            }
            else {
                System.out.println("aradığınız kitap bulunamadı!!");
            }

        }
        if(e.getSource()==kw.getCikis()){
            System.exit(0);
        }
        if (e.getSource()==kw.getListele()){
            kitapWindowController kitapWindowController=new kitapWindowController();
            KitapWindow kitapWindow=new KitapWindow();
            kitapWindowController.TableSet(kitapWindow);
            kw.getPanel().setVisible(false);
            kw.getPanel().removeAll();
            kw.getPanel().add(kitapWindow.getPanel());
            kw.getPanel().setVisible(true);
            kw.getPanel().repaint();
        }
    }
}
