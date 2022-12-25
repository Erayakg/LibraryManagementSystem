package GUI_Action;

import GUI.CustomPanel;
import GUI.OgrLogWindow;
import GUI.OgrenciWindow;

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
        if(e.getSource()==olw.getCikis()){
            System.exit(0);
        }
    }
}
