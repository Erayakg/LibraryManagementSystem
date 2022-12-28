package GUI_Action;

import Controller.AdminLoginController;
import GUI.CustomPanel;
import GUI.HostLogWindow;
import GUI.HostWindow;
import GUI.OgrLogWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HostWindowAction implements ActionListener {
    private HostWindow hw;
    private CustomPanel panel;
    public HostWindowAction(HostWindow hw){
        this.hw=hw;
    }

    AdminLoginController adminLoginController=new AdminLoginController();
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==hw.getGiris()){
            if (adminLoginController.loginAdmin(hw.getTemail().getText(),hw.getTsifre().getText())){
                panel=new HostLogWindow();
                hw.getPanel().setVisible(false);
                hw.getPanel().removeAll();
                hw.getPanel().add(panel.getPanel());
                hw.getPanel().setVisible(true);
                hw.getPanel().repaint();
            }
            else {
                JOptionPane.showMessageDialog(hw.getPanel(), "Giriş başarısız");
            }
        }
    }
}
