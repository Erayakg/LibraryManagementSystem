package GUI_Action;

import GUI.CustomPanel;
import GUI.MainWindow;
import GUI.OgrLogWindow;
import GUI.OgrenciWindow;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OgrenciWindowAction implements ActionListener {

    private OgrenciWindow ow;
    private CustomPanel panel;
    public OgrenciWindowAction(OgrenciWindow ow) {
        this.ow = ow;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==ow.getGiris()){
            panel=new OgrLogWindow();
            ow.getWindow().setContentPane(panel.getPanel());
            ow.getWindow().repaint();



        }
    }
}
