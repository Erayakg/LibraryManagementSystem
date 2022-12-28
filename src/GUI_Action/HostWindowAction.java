package GUI_Action;

import GUI.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HostWindowAction implements ActionListener {
    private HostWindow hw;
    private CustomPanel panel;
    public HostWindowAction(HostWindow hw){
        this.hw=hw;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==hw.getGiris()){
            panel=new HostLogWindow();
            hw.getPanel().setVisible(false);
            hw.getPanel().removeAll();
            hw.getPanel().add(panel.getPanel());
            hw.getPanel().setVisible(true);
            hw.getPanel().repaint();
        }
        if(e.getSource()==hw.getGeri()){
            MainWindow mw=new MainWindow();
            mw.build();
        }
    }
}
