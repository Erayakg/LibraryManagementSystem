package Controller;

import Entities.Books.Books;
import GUI.KitapAlWindow;
import GUI.KitapWindow;

import javax.swing.*;

public class KitapAlController extends AbstractController{
    Books books=new Books();
    public boolean KitapAl(String BookNames){
        boolean a=false;
        a=delete(books,BookNames);
        return a;
    }
    private KitapAlWindow kitapAlWindow;
    public  void SetKitapTable(KitapAlWindow kitapAlWindow){

        this.kitapAlWindow=kitapAlWindow;

        String[][] data=new String[calculateData(books)][];
        convertData(books,data);

        String[] columsNames={"Name","Yazar","Acıklama","Sayfa Sayısı"};

        JTable jTable =new JTable(data,columsNames);

        jTable.setBounds(300,30,300,650);

        jTable.setVisible(true);

        kitapAlWindow.setTable(jTable);
        System.out.println();

    }

}
