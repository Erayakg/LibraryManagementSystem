package GUI;

import Controller.kitapWindowController;
import GUI_Action.HostWindowAction;
import GUI_Action.KitapWindowAction;

import javax.swing.*;

public class KitapWindow extends MainWindow implements CustomPanel{
        private JPanel panel;
        private JLabel lad,lyazar,laciklama,lsayfa;
        private JTextField tad,tyazar,taciklama,tsayfa;
        private JButton geri,ekle, sil,cikis,listele;


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
                this.panel.add(getLsayfa());
                this.panel.add(getTad());
                this.panel.add(getTyazar());
                this.panel.add(getTaciklama());
                this.panel.add(getTsayfa());
                this.panel.add(getEkle());
                this.panel.add(getSil());
                this.panel.add(getTable());
                this.panel.add(getListele());
                this.panel.add(getGeri());
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

    public JButton getListele() {
            if(this.listele==null)
            {
                this.listele= new JButton("Listele");
                this.listele.setBounds(60,260,100,40);
                this.listele.addActionListener(new KitapWindowAction(this));

            }
        return listele;
    }

    public void setListele(JButton listele) {
        this.listele = listele;
    }

    public JButton getGeri() {
            if(this.geri==null){
                this.geri= new JButton("Geri");
                this.geri.setBounds(10,10,70,30);
                this.geri.addActionListener(new KitapWindowAction(this));
            }
        return geri;
    }

    public void setGeri(JButton geri) {
        this.geri = geri;
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

    public JLabel getLsayfa() {
            if(this.lsayfa==null){
                this.lsayfa= new JLabel("Sayfa");
                this.lsayfa.setBounds(60,175,100,40);
            }
        return lsayfa;
    }

    public void setLsayfa(JLabel lsayfa) {
        this.lsayfa = lsayfa;
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

    public JTextField getTsayfa() {
            if(this.tsayfa==null){
                this.tsayfa= new JTextField();
                this.tsayfa.setBounds(160,175,100,40);
            }
        return tsayfa;
    }

    public void setTsayfa(JTextField tsayfa) {
        this.tsayfa = tsayfa;
    }

    public JButton getEkle() {
            if(this.ekle==null){
                this.ekle= new JButton("EKLE");
                this.ekle.setBounds(60,220,100,40);
                this.ekle.addActionListener(new KitapWindowAction(this));
            }
        return ekle;
    }

    public void setEkle(JButton ekle) {
        this.ekle = ekle;
    }

    public JButton getSil() {
            if(this.sil ==null){
                this.sil =new JButton("SİL");
                this.sil.setBounds(160,220,100,40);
                this.sil.addActionListener(new KitapWindowAction(this));
            }
            return sil;
        }

        public void setSil(JButton sil) {
            this.sil = sil;
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
                this.cikis.addActionListener(new KitapWindowAction(this));
            }
            return cikis;
        }
        public void setCikis(JButton cikis) {
            this.cikis = cikis;
        }
        public JTable getTable() {
            if(this.table==null){
                this.table= new JTable();
                this.table.setBounds(300,30,300,650);
            }
            return table;
        }
        public void setTable(JTable table) {
            this.table = table;
        }
    }


