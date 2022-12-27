package GUI;

import GUI_Action.HostEkleWindowAction;
import GUI_Action.OgrEkleWindowAction;

import javax.swing.*;

public class OgrEkleWindow extends MainWindow implements CustomPanel{
    private JPanel panel;
    private JLabel lad,lsoyad,lyas,lemail,lsifre;
    private JTextField tad,tsoyad,tyas,temail,tsifre;
    private JButton bekle,bsil,cikis;

    @Override
    public JPanel getPanel() {
        if(this.panel==null){
            this.panel = new JPanel();
            this.panel.setSize(800, 600);
            this.panel.setLayout(null);
            this.panel.add(getLad());
            this.panel.add(getLsoyad());
            this.panel.add(getLyas());
            this.panel.add(getLemail());
            this.panel.add(getLsifre());
            this.panel.add(getTad());
            this.panel.add(getTsoyad());
            this.panel.add(getTyas());
            this.panel.add(getTemail());
            this.panel.add(getTsifre());
            this.panel.add(getBekle());
            this.panel.add(getBsil());
            this.panel.add(getCikis());

        }
        return panel;
    }

    @Override
    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JLabel getLad() {
        if(this.lad==null){
            this.lad= new JLabel("İSİM");
            this.lad.setBounds(200,50,100,40);

        }
        return lad;
    }

    public void setLad(JLabel lad) {
        this.lad = lad;
    }

    public JLabel getLsoyad() {
        if (this.lsoyad==null){
            this.lsoyad=new JLabel("SOYİSİM");
            this.lsoyad.setBounds(200,100,100,40);
        }
        return lsoyad;
    }

    public void setLsoyad(JLabel lsoyad) {
        this.lsoyad = lsoyad;
    }

    public JLabel getLyas() {
        if(this.lyas==null){
            this.lyas= new JLabel("YAŞ");
            this.lyas.setBounds(200,150,100,40);
        }
        return lyas;
    }

    public void setLyas(JLabel lyas) {
        this.lyas = lyas;
    }

    public JLabel getLemail() {
        if(this.lemail==null){
            this.lemail= new JLabel("EMAİL");
            this.lemail.setBounds(200,200,100,40);
        }
        return lemail;
    }

    public void setLemail(JLabel lemail) {
        this.lemail = lemail;
    }

    public JLabel getLsifre() {
        if(this.lsifre==null){
            this.lsifre= new JLabel("ŞİFRE");
            this.lsifre.setBounds(200,250,100,40);
        }
        return lsifre;
    }

    public void setLsifre(JLabel lsifre) {
        this.lsifre = lsifre;
    }

    public JTextField getTad() {
        if(this.tad==null){
            this.tad= new JTextField();
            this.tad.setBounds(300,50,100,40);
        }
        return tad;
    }

    public void setTad(JTextField tad) {
        this.tad = tad;
    }

    public JTextField getTsoyad() {
        if(this.tsoyad==null){
            this.tsoyad= new JTextField();
            this.tsoyad.setBounds(300,100,100,40);
        }
        return tsoyad;
    }

    public void setTsoyad(JTextField tsoyad) {
        this.tsoyad = tsoyad;
    }

    public JTextField getTyas() {
        if(this.tyas==null){
            this.tyas= new JTextField();
            this.tyas.setBounds(300,150,100,40);
        }
        return tyas;
    }

    public void setTyas(JTextField tyas) {
        this.tyas = tyas;
    }

    public JTextField getTemail() {
        if(this.temail==null){
            this.temail= new JTextField();
            this.temail.setBounds(300,200,100,40);
        }
        return temail;
    }

    public void setTemail(JTextField temail) {
        this.temail = temail;
    }

    public JTextField getTsifre() {
        if(this.tsifre==null){
            this.tsifre= new JTextField();
            this.tsifre.setBounds(300,250,100,40);
        }
        return tsifre;
    }

    public void setTsifre(JTextField tsifre) {
        this.tsifre = tsifre;
    }

    public JButton getBekle() {
        if(this.bekle==null){
            this.bekle= new JButton("EKLE");
            this.bekle.setBounds(220,300,80,30);
            this.bekle.addActionListener(new OgrEkleWindowAction(this));
        }
        return bekle;
    }

    public void setBekle(JButton bekle) {
        this.bekle = bekle;
    }

    public JButton getBsil() {
        if(this.bsil==null){
            this.bsil= new JButton("SİL");
            this.bsil.setBounds(310,300,80,30);
            this.bsil.addActionListener(new OgrEkleWindowAction(this));
        }
        return bsil;
    }

    public void setBsil(JButton bsil) {
        this.bsil = bsil;
    }

    public JButton getCikis() {
        if(this.cikis==null){
            this.cikis= new JButton(new ImageIcon(exit));
            this.cikis.setBounds(650,450,100,100);
            this.cikis.setOpaque(false);
            this.cikis.setFocusPainted(false);
            this.cikis.setBorderPainted(false);
            this.cikis.setContentAreaFilled(false);
            this.cikis.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
            this.cikis.addActionListener(new OgrEkleWindowAction(this));
        }
        return cikis;
    }

    public void setCikis(JButton cikis) {
        this.cikis = cikis;
    }
}
