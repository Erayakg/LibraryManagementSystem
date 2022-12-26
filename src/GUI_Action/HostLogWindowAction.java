package GUI_Action;

import GUI.CustomPanel;
import GUI.HostLogWindow;
import GUI.KitapAraWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HostLogWindowAction implements ActionListener {
    private HostLogWindow hlw;
    private CustomPanel panel;
    public HostWindowAction(HostLogWindow hlw){
        this.hlw=hlw;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==hlw.getBhostekle()){
            panel=new KitapAraWindow();
            hlw.getPanel().setVisible(false);
            hlw.getPanel().removeAll();
            hlw.getPanel().add(panel.getPanel());
            hlw.getPanel().setVisible(true);
            hlw.getPanel().repaint();
        }
        if(e.getSource()==hlw.getBogrekle()){
            panel=new KitapAraWindow();
            hlw.getPanel().setVisible(false);
            hlw.getPanel().removeAll();
            hlw.getPanel().add(panel.getPanel());
            hlw.getPanel().setVisible(true);
            hlw.getPanel().repaint();
        }
        if(e.getSource()==hlw.getBkitap()){
            panel=new KitapAraWindow();
            hlw.getPanel().setVisible(false);
            hlw.getPanel().removeAll();
            hlw.getPanel().add(panel.getPanel());
            hlw.getPanel().setVisible(true);
            hlw.getPanel().repaint();
        }
        if(e.getSource()==hlw.getBkitapara()){
            panel=new KitapAraWindow();
            hlw.getPanel().setVisible(false);
            hlw.getPanel().removeAll();
            hlw.getPanel().add(panel.getPanel());
            hlw.getPanel().setVisible(true);
            hlw.getPanel().repaint();
        }
        if(e.getSource()==hlw.getCikis()){
            System.exit(0);
        }
    }
}
