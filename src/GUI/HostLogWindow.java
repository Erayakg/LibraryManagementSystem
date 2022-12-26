package GUI;



import javax.swing.*;
import java.awt.*;

public class HostLogWindow extends MainWindow implements CustomPanel{
    private JPanel panel;
    private JLabel ogrekle,hostekle,kitap,kitapara;
    private JButton bogrekle,bhostekle,bkitap,bkitapara,cikis;
    Image kitab = new ImageIcon(HostLogWindow.class.getResource("/resim/kitapekle.jpg")).getImage();
    Image kk = new ImageIcon(HostLogWindow.class.getResource("/resim/kitapara.jpg")).getImage();
    Image ogr = new ImageIcon(HostLogWindow.class.getResource("/resim/öğrenci ekle.png")).getImage();
    Image host = new ImageIcon(HostLogWindow.class.getResource("/resim/hostekle.png")).getImage();
    Image exit = new ImageIcon(HostLogWindow.class.getResource("/resim/kapatma.jpg")).getImage();

    @Override
    public JPanel getPanel() {
        if(this.panel==null){
            this.panel= new JPanel();
            this.panel.setSize(800,600);
            this.panel.setLayout(null);
            this.panel.add(getOgrekle());
            this.panel.add(getBogrekle());
            this.panel.add(getHostekle());
            this.panel.add(getBhostekle());
            this.panel.add(getKitap());
            this.panel.add(getBkitap());
            this.panel.add(getKitapara());
            this.panel.add(getBkitapara());
            this.panel.add(getCikis());

        }
        return panel;
    }

    @Override
    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JLabel getOgrekle() {
        if(this.ogrekle==null){
            this.ogrekle= new JLabel(new ImageIcon(ogr));
            this.ogrekle.setBounds(100,100,150,150);
        }
        return ogrekle;
    }

    public void setOgrekle(JLabel ogrekle) {
        this.ogrekle = ogrekle;
    }

    public JLabel getHostekle() {
        if(this.hostekle==null){
            this.hostekle= new JLabel(new ImageIcon(host));
            this.hostekle.setBounds(100,300,150,150);
        }
        return hostekle;
    }

    public void setHostekle(JLabel hostekle) {
        this.hostekle = hostekle;
    }

    public JLabel getKitap() {
        if(this.kitap==null){
            this.kitap=new JLabel(new ImageIcon(kitab));
            this.kitap.setBounds(350,100,150,150);
        }
        return kitap;
    }

    public void setKitap(JLabel kitap) {
        this.kitap = kitap;
    }

    public JLabel getKitapara() {
        if(this.kitapara==null){
            this.kitapara=new JLabel(new ImageIcon(kk));
            this.kitapara.setBounds(350,300,150,150);
        }
        return kitapara;
    }

    public void setKitapara(JLabel kitapara) {
        this.kitapara = kitapara;
    }

    public JButton getBogrekle() {
        if(this.bogrekle==null){
            this.bogrekle=new JButton("Öğrenci Ekle/Sil/Güncelle");
            this.bogrekle.setBounds(100,250,150,40);
        }
        return bogrekle;
    }

    public void setBogrekle(JButton bogrekle) {
        this.bogrekle = bogrekle;
    }

    public JButton getBhostekle() {
        if(this.bhostekle==null){
            this.bhostekle= new JButton("Kütüphaneci Ekle/Sil");
            this.bhostekle.setBounds(100,450,150,40);
        }
        return bhostekle;
    }

    public void setBhostekle(JButton bhostekle) {
        this.bhostekle = bhostekle;
    }

    public JButton getBkitap() {
        if(this.bkitap==null){
            this.bkitap= new JButton("Kitap Ekle/Sil/Listele");
            this.bkitap.setBounds(350,250,150,40);
        }
        return bkitap;
    }

    public void setBkitap(JButton bkitap) {
        this.bkitap = bkitap;
    }

    public JButton getBkitapara() {
        if(this.bkitapara==null){
            this.bkitapara=new JButton("Kitap Ara");
            this.bkitapara.setBounds(350,450,150,40);
        }
        return bkitapara;
    }

    public void setBkitapara(JButton bkitapara) {
        this.bkitapara = bkitapara;
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
            //this.cikis.addActionListener(new OgrLogWindowAction(this));
        }
        return cikis;
    }

    public void setCikis(JButton cikis) {
        this.cikis = cikis;
    }
}
