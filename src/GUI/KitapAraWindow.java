package GUI;


import javax.swing.*;

public class KitapAraWindow extends MainWindow implements CustomPanel {
    private JPanel panel;
    private JLabel kitapad;
    private JTextField tkitapad;
    private JButton ara;
    private JTable table;

    @Override
    public JPanel getPanel() {
        if(this.panel==null){
            this.panel= new JPanel();
            this.panel.setSize(800,600);
            this.panel.setLayout(null);
            this.panel.add(getKitapad());
            this.panel.add(getTkitapad());
            this.panel.add(getAra());
            this.panel.add(getTable());
        }
        return panel;
    }

    @Override
    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JLabel getKitapad() {
        if(this.kitapad==null){
            this.kitapad= new JLabel("Kitap Adı");
            this.kitapad.setBounds(50,50,100,40);
        }
        return kitapad;
    }

    public void setKitapad(JLabel kitapad) {
        this.kitapad = kitapad;
    }

    public JTextField getTkitapad() {
        if(this.tkitapad==null){
            this.tkitapad=new JTextField();
            this.tkitapad.setBounds(130,60,120,30);
        }
        return tkitapad;
    }

    public void setTkitapad(JTextField tkitapad) {
        this.tkitapad = tkitapad;
    }

    public JButton getAra() {
        if(this.ara==null){
            this.ara= new JButton("ARA");
            this.ara.setBounds(150,100,100,25);
        }
        return ara;
    }

    public void setAra(JButton ara) {
        this.ara = ara;
    }

    public JTable getTable() {
        if(this.table==null){
            this.table= new JTable();
            this.table.setBounds(300,50,300,700);
        }
        return table;
    }

    public void setTable(JTable table) {
        this.table = table;
    }
}
