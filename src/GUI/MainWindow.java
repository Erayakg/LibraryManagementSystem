package GUI;

import Controller.MainWindowController;
import GUI_Action.MainWindowAction;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class MainWindow {
    private JFrame window;
    private JPanel panel;
    private JLabel bglabel,label1, label2;
    private JTextField textField;
    private JButton SearchButton, StudentButton, button3;

    private JTable table;

    Image exit = new ImageIcon(OgrLogWindow.class.getResource("/resim/kapatma.jpg")).getImage();
    Image bg= new ImageIcon(MainWindow.class.getResource("/resim/b1.jpg")).getImage();
    MainWindowController mainWindowController = new MainWindowController();

    Image mg = new ImageIcon(MainWindow.class.getResource("/resim/ogrenci.jpg")).getImage();
    Image mg2 = new ImageIcon(MainWindow.class.getResource("/resim/admin.png")).getImage();


    public void build() {
        getWindow();


    }

    public JFrame getWindow() {
        if (this.window == null) {
            this.window = new JFrame("Kütüphane Otomasyonu");
            this.window.setContentPane(this.getPanel());
            this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.window.setLayout(null);
            this.window.setVisible(true);

            this.window.setSize(800, 600);
        }
        return window;
    }

    public void setWindow(JFrame window) {
        this.window = window;
    }

    public JPanel getPanel() {
        if (this.panel == null) {
            this.panel = new JPanel();
            this.getPanel().add(this.getBglabel());
            this.getBglabel().add(this.getLabel1());
            this.getBglabel().add(this.getLabel2());
            this.getBglabel().add(this.getStudentButton());
            this.getBglabel().add(this.getButton3());
            this.panel.setLayout(null);
        }
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }


    public JLabel getLabel1() {
        if (this.label1 == null) {
            this.label1 = new JLabel(new ImageIcon(mg));
            this.label1.setBounds(200, 100, 150, 150);
            this.label1.setBackground(Color.gray);
        }
        return label1;
    }

    public void setLabel1(JLabel label1) {
        this.label1 = label1;
    }


    public JLabel getLabel2() {
        if(this.label2==null){
            this.label2 = new JLabel(new ImageIcon(mg2));
            this.label2.setBounds(400, 100, 150, 150);
            this.label2.setBackground(Color.gray);
        }
        return label2;
    }

    public void setLabel2(JLabel label2) {
        this.label2 = label2;
    }

    public JLabel getBglabel() {
        if(this.bglabel==null){
            this.bglabel= new JLabel(new ImageIcon(bg));
            this.bglabel.setSize(800,600);
        }
        return bglabel;
    }

    public void setBglabel(JLabel bglabel) {
        this.bglabel = bglabel;
    }

    public JButton getStudentButton() {
        if (this.StudentButton == null) {
            this.StudentButton = new JButton("Öğrenci Giriş");
            this.StudentButton.setBounds(200, 250, 150, 50);
            this.StudentButton.addActionListener(new MainWindowAction(this));
        }

        return StudentButton;
    }

    public void setStudentButton(JButton StudentButton) {
        this.StudentButton = StudentButton;
    }

    public JButton getButton3() {
        if (this.button3 == null) {
            this.button3 = new JButton("Host Giriş");
            this.button3.setBounds(400, 250, 150, 50);
            this.button3.addActionListener(new MainWindowAction(this));
        }

        return button3;
    }

    public void setButton3(JButton button3) {
        this.button3 = button3;
    }
}
