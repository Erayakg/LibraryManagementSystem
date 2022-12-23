package GUI;

import GUI_Action.OgrenciWindowAction;

import javax.swing.*;

public class OgrLogWindow implements CustomPanel{
    private JPanel panel;
    private JButton giris;
    @Override
    public JPanel getPanel() {
        if (this.panel == null) {
            this.panel = new JPanel();
            this.panel.setSize(800, 600);
            this.panel.setLayout(null);
            this.panel.add(getGiris());
        }
        return panel;
    }
    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JButton getGiris() {
        if(this.giris==null){
            this.giris= new JButton();
            this.giris.setBounds(250, 450, 150, 40);

        }
        return giris;
    }

    public void setGiris(JButton giris) {
        this.giris = giris;
    }
}
