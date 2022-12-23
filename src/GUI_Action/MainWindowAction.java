package GUI_Action;

import Controller.MainWindowController;
import GUI.CustomPanel;
import GUI.HostWindow;
import GUI.MainWindow;
import GUI.OgrenciWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindowAction implements ActionListener {
    private MainWindow mw;
    MainWindowController mainWindowController = new MainWindowController();
    private CustomPanel panel;

    public MainWindowAction(MainWindow mw) {
        this.mw = mw;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == mw.getStudentButton()) {
            panel = new OgrenciWindow();
            mw.getWindow().setContentPane(panel.getPanel());
            mw.getWindow().repaint();
        }
        if (e.getSource() == mw.getButton3()) {
            panel = new HostWindow();
            mw.getWindow().setContentPane(panel.getPanel());
            mw.getWindow().repaint();
        }

    }
}