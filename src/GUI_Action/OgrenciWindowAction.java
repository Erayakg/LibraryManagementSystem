package GUI_Action;

import Controller.ogrenciWindowController;
import GUI.CustomPanel;
import GUI.MainWindow;
import GUI.OgrLogWindow;
import GUI.OgrenciWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OgrenciWindowAction implements ActionListener {
    ogrenciWindowController ogrenciWindowController=new ogrenciWindowController();
    OgrenciWindow ogrenciWindow= new OgrenciWindow();
    private OgrenciWindow ow;
    private CustomPanel panel;
    public OgrenciWindowAction(OgrenciWindow ow) {
        this.ow = ow;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==ow.getGiris()){

            if (ogrenciWindowController.OgrLogin(ow.getTemail().getText(),ow.getTsifre().getText())){
                panel=new OgrLogWindow();
                ow.getPanel().setVisible(false);
                ow.getPanel().removeAll();
                ow.getPanel().add(panel.getPanel());
                ow.getPanel().setVisible(true);
                ow.getPanel().repaint();
            }
            else {
                JOptionPane.showMessageDialog(ow.getPanel(), "Kullanıcı bilgileri Hatalı");
            }

            //ow.getWindow().setContentPane(panel.getPanel());
            //ow.getWindow().repaint();

        }
    }
}
