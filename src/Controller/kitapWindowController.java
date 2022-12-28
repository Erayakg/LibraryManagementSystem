package Controller;

import DAO.MainDAO;
import Entities.Books.Books;
import GUI.KitapWindow;

import javax.swing.*;

import static java.awt.Color.black;

public class kitapWindowController extends AbstractController{
    MainDAO mainDAO =new MainDAO();
    Books books =new Books();
    MainWindowController mainWindowController =new MainWindowController();
    private KitapWindow kitapWindow;
    public void save(KitapWindow kitapWindow){
        this.kitapWindow=kitapWindow;
        books.setName(kitapWindow.getTad().getText());
        books.setAuthor(kitapWindow.getTyazar().getText());
        books.setPage(Integer.parseInt(kitapWindow.getTsayfa().getText()));
        books.setDescription(kitapWindow.getTaciklama().getText());
        try {
            mainDAO.Save(books);
        }catch (Exception e){
            System.out.println("kitap kaydetme hatası"+e);
        }
    }
    public boolean delete(String silinecek){

        boolean a=delete(books,silinecek);
        return a;
    }
    public  void TableSet(KitapWindow kitapWindow){

        this.kitapWindow=kitapWindow;

        String[][] data=new String[calculateData(books)][];
        convertData(books,data);

        String[] columsNames={"Name","Yazar","Acıklama","Sayfa Sayısı"};

        JTable jTable =new JTable(data,columsNames);

        jTable.setBounds(300,30,300,650);

        jTable.setVisible(true);

        kitapWindow.setTable(jTable);
        System.out.println();
    }
}
