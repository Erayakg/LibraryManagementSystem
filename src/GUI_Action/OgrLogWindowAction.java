package GUI_Action;

import GUI.CustomPanel;

import GUI.KitapAraWindow;
import GUI.OgrLogWindow;

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
        if(e.getSource()==olw.getCikis()){
            System.exit(0);
        }
    }
}
