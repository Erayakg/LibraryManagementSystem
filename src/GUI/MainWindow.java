package GUI;

import Controller.MainWindowController;
import GUI_Action.MainWindowAction;

import javax.swing.*;
import java.awt.*;

public class MainWindow {
    private JFrame window;
    private JPanel panel,panel2;
    private JLabel label1,label2;
    private JTextField textField;
    private JButton button1,button2,button3;
    private JTable table;
    MainWindowController mainWindowController= new MainWindowController();

    public void build(){
        getWindow();
        this.getPanel().add(this.getLabel1());
        this.getPanel().add(this.getTextField());
        this.getPanel().add(this.getButton1());
        this.getPanel().add(this.getButton2());
        this.getPanel().add(this.getButton3());
        this.getPanel().add(this.getTable());

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
        if(this.panel== null){
            this.panel=new JPanel();
            this.panel.setLayout(null);
        }
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }



    public JTextField getTextField() {
        if(this.textField== null){
            this.textField=new JTextField();
            this.textField.setBackground(Color.black);
            this.textField.setBounds(130, 55, 150, 30);
        }
        return textField;
    }

    public void setTextField(JTextField textField) {
        this.textField = textField;
    }



    public JLabel getLabel1() {
        if(this.label1== null){
            this.label1= new JLabel("Kitap Adı");
            this.label1.setBounds(40, 50, 100, 20);
        }
        return label1;
    }

    public void setLabel1(JLabel label1) {
        this.label1 = label1;
    }



    public JLabel getLabel2() {
        return label2;
    }

    public void setLabel2(JLabel label2) {
        this.label2 = label2;
    }

    public JButton getButton1() {
        if(this.button1== null){
            this.button1= new JButton("ARA");
            this.button1.setBounds(100,100,100,50);
        }
        return button1;
    }

    public void setButton1(JButton button1) {
        this.button1 = button1;
    }

    public JButton getButton2() {
        if(this.button2== null){
            this.button2= new JButton("Öğrenci Giriş");
            this.button2.setBounds(100,300,100,50);
            this.button2.addActionListener(new MainWindowAction(this));
        }

        return button2;
    }

    public void setButton2(JButton button2) {
        this.button2 = button2;
    }

    public JButton getButton3() {
        if(this.button3== null){
            this.button3= new JButton("Host Giriş");
            this.button3.setBounds(200,300,100,50);
            this.button3.addActionListener(new MainWindowAction(this));
        }

        return button3;
    }
    public void setButton3(JButton button3) {
        this.button3 = button3;
    }
    public JTable getTable() {
        if(this.table== null){
            String[] col={"Kitabın Adı","Yazar","Sayfa Sayısı","Açıklama"};
            this.table = new JTable(mainWindowController.dataGet(),col);
            this.table.setBackground(Color.red);
            this.table.setBounds(400,30,295,600);
        }
        return table;
    }
    public void setTable(JTable table) {
        this.table = table;
    }
}
