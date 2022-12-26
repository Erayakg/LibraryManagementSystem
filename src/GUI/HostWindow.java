package GUI;

import GUI_Action.HostWindowAction;

import javax.swing.*;

public class HostWindow implements CustomPanel {
    private JPanel panel;
    private JButton giris;
    private JLabel email,sifre;
    private JTextField temail;
    private JPasswordField tsifre;

    @Override
    public JPanel getPanel() {
        if(this.panel== null){
            this.panel=new JPanel();
            this.panel.setSize(800,600);
            this.panel.add(getEmail());
            this.panel.add(getSifre());
            this.panel.add(getTemail());
            this.panel.add(getTsifre());
            this.panel.add(getGiris());
            this.panel.setLayout(null);
        }
        return panel;
    }
    public void setPanel(JPanel panel) {
        this.panel = panel;
    }
    public JButton getGiris() {
        if(this.giris== null){
            this.giris=new JButton("Giris Yap");
            this.giris.setBounds(250, 450, 150, 40);
            this.giris.addActionListener(new HostWindowAction(this));

        }
        return giris;
    }

    public void setGiris(JButton giris) {
        this.giris = giris;
    }

    public JLabel getEmail() {
        if(this.email== null){
            this.email=new JLabel("EMAİL:");
            this.email.setBounds(50, 150, 100, 40);
        }
        return email;
    }

    public void setEmail(JLabel email) {
        this.email = email;
    }

    public JLabel getSifre() {
        if(this.sifre== null){
            this.sifre= new JLabel("ŞİFRE:");
            this.sifre.setBounds(50, 220, 100, 40);
        }
        return sifre;
    }

    public void setSifre(JLabel sifre) {
        this.sifre = sifre;
    }

    public JTextField getTemail() {
        if(this.temail== null){
            this.temail=new JTextField();
            this.temail.setBounds(130, 155, 150, 35);
        }
        return temail;
    }

    public void setTemail(JTextField temail) {
        this.temail = temail;
    }

    public JPasswordField getTsifre() {
        if(this.tsifre== null){
            this.tsifre=new JPasswordField();
            this.tsifre.setBounds(130, 222, 150, 35);
        }
        return tsifre;
    }

    public void setTsifre(JPasswordField tsifre) {
        this.tsifre = tsifre;
    }

}
