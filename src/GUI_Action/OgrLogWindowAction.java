package GUI_Action;

import GUI.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OgrLogWindowAction implements ActionListener {
    private OgrLogWindow olw;
    private CustomPanel panel;

   public OgrLogWindowAction(OgrLogWindow olw) {
        this.olw = olw;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==olw.getAra()){
           panel=new KitapAraWindow();
           olw.getPanel().setVisible(false);
           olw.getPanel().removeAll();
           olw.getPanel().add(panel.getPanel());
           olw.getPanel().setVisible(true);
           olw.getPanel().repaint();
       }
       if(e.getSource()==olw.getAl()){
           panel=new KitapAlWindow();
           olw.getPanel().setVisible(false);
           olw.getPanel().removeAll();
           olw.getPanel().add(panel.getPanel());
           olw.getPanel().setVisible(true);
           olw.getPanel().repaint();
       }
        if(e.getSource()==olw.getGeri()){
            panel=new OgrenciWindow();
            olw.getPanel().setVisible(false);
            olw.getPanel().removeAll();
            olw.getPanel().add(panel.getPanel());
            olw.getPanel().setVisible(true);
            olw.getPanel().repaint();
        }
        if(e.getSource()==olw.getCikis()){
            System.exit(0);
        }
    }
}
