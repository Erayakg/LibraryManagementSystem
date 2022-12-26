package GUI;

import javax.swing.*;

public class KitapEkleWindow extends MainWindow implements CustomPanel{
    private JPanel panel;
    private JLabel lad,lyazar,laciklama;
    private JTextField tad,tyazar,taciklama;
    private JButton ara,cikis;
    private JTable table;

    @Override
    public JPanel getPanel() {
        if(this.panel==null){
            this.panel=new JPanel();
            this.panel.setSize(800,600);
            this.panel.setLayout(null);
            this.panel.add(getLad());
            this.panel.add(getLyazar());
            this.panel.add(getLaciklama());
            this.panel.add(getTad());
            this.panel.add(getTyazar());
            this.panel.add(getTaciklama());
            this.panel.add(getAra());
        }
        return panel;
    }

    @Override
    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JLabel getLad() {
        if(this.lad== null){
            this.lad= new JLabel("Kitap Adı");
            this.lad.setBounds(60,40,100,40);
        }
        return lad;
    }

    public void setLad(JLabel lad) {
        this.lad = lad;
    }

    public JLabel getLyazar() {
        if(this.lyazar==null){
            this.lyazar= new JLabel("Yazar");
            this.lyazar.setBounds(60,85,100,40);
        }
        return lyazar;
    }

    public void setLyazar(JLabel lyazar) {
        this.lyazar = lyazar;
    }

    public JLabel getLaciklama() {
        if(this.laciklama==null){
            this.laciklama= new JLabel("Açıklama");
            this.laciklama.setBounds(60,130,100,40);
        }
        return laciklama;
    }

    public void setLaciklama(JLabel laciklama) {
        this.laciklama = laciklama;
    }

    public JTextField getTad() {
        if(this.tad==null){
            this.tad=new JTextField();
            this.tad.setBounds(160,40,100,40);
        }
        return tad;
    }

    public void setTad(JTextField tad) {

        this.tad = tad;
    }

    public JTextField getTyazar() {
        if(this.tyazar==null){
            this.tyazar= new JTextField();
            this.tyazar.setBounds(160,85,100,40);
        }
        return tyazar;
    }

    public void setTyazar(JTextField tyazar) {
        this.tyazar = tyazar;
    }

    public JTextField getTaciklama() {
        if(this.taciklama==null){
            this.taciklama= new JTextField();
            this.taciklama.setBounds(160,130,100,40);
        }
        return taciklama;
    }

    public void setTaciklama(JTextField taciklama) {
        this.taciklama = taciklama;
    }

    public JButton getAra() {
        if(this.ara==null){
            this.ara=new JButton("ARA");
            this.ara.setBounds(160,175,100,40);
        }
        return ara;
    }

    public void setAra(JButton ara) {
        this.ara = ara;
    }

    public JButton getCikis() {
        return cikis;
    }

    public void setCikis(JButton cikis) {
        this.cikis = cikis;
    }

    public JTable getTable() {
        return table;
    }

    public void setTable(JTable table) {
        this.table = table;
    }
}
