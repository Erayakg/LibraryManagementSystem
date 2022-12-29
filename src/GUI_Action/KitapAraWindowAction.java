package GUI_Action;

import Controller.BookSearchPageController;
import GUI.CustomPanel;
import GUI.KitapAraWindow;
import GUI.OgrLogWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KitapAraWindowAction implements ActionListener {
    private CustomPanel panel;
    private KitapAraWindow kaw;

    public KitapAraWindowAction(KitapAraWindow kaw) {
        this.kaw = kaw;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource()==kaw.getAra()){
          BookSearchPageController bookSearchPageController=new BookSearchPageController();
          KitapAraWindow kitapAraWindow=new KitapAraWindow();
          bookSearchPageController.BookSearch(kaw.getTkitapad().getText(),kitapAraWindow);
          kaw.getPanel().setVisible(false);
          kaw.getPanel().removeAll();
          kaw.getPanel().add(kitapAraWindow.getPanel());
          kaw.getPanel().setVisible(true);
          kaw.getPanel().repaint();
      }
      if (e.getSource()==kaw.getListele()){
          BookSearchPageController bookSearchPageController=new BookSearchPageController();
          KitapAraWindow kitapAraWindow =new KitapAraWindow();
          bookSearchPageController.listele(kitapAraWindow);
          kaw.getPanel().setVisible(false);
          kaw.getPanel().removeAll();
          kaw.getPanel().add(kitapAraWindow.getPanel());
          kaw.getPanel().setVisible(true);
          kaw.getPanel().repaint();

      }
      if(e.getSource()=kaw.getGeri()){
          panel=new OgrLogWindow();
          kaw.getPanel().setVisible(false);
          kaw.getPanel().removeAll();
          kaw.getPanel().add(panel.getPanel());
          kaw.getPanel().setVisible(true);
          kaw.getPanel().repaint();
      }
      if(e.getSource()==kaw.getCikis()){
          System.exit(0);

      }
    }
}