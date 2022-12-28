package GUI_Action;

import Controller.ogrenciWindowController;
import GUI.*;

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
                panel=new OgrLogWindow();
                ow.getPanel().setVisible(false);
                ow.getPanel().removeAll();
                ow.getPanel().add(panel.getPanel());
                ow.getPanel().setVisible(true);
                ow.getPanel().repaint();
         //   if (ogrenciWindowController.OgrLogin(ow.getTemail().getText(),ow.getTsifre().getText())){
           // }
           // else {
             //   JOptionPane.showMessageDialog(ow.getPanel(), "Kullanıcı bilgileri Hatalı");
           // }

            //ow.getWindow().setContentPane(panel.getPanel());
            //ow.getWindow().repaint();

        }
        if(e.getSource()==ow.getGeri()){
         MainWindow mw=new MainWindow();
         mw.build();
        }
        }
    }

