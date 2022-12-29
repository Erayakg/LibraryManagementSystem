package Controller;

import DAO.MainDAO;
import Entities.Books.Books;
import GUI.KitapAraWindow;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class BookSearchPageController extends AbstractController{
    MainDAO mainDAO = new MainDAO();
    Books books = new Books();
    ArrayList<Books> arrayList = new ArrayList<>();
    String BookFileName =String.valueOf(books.getClass());
    private KitapAraWindow kitapAraWindow;


    public void BookSearch(String bookName,KitapAraWindow kitapAraWindow){//aranan değer kitabı dönderir

    this.kitapAraWindow=kitapAraWindow;

    mainDAO.GetData(BookFileName, arrayList);

    int j=0;
    String[][] data;
    data = new String[arrayList.size()][];
    for (int i=0;i<arrayList.size();i++){
        data[j]= String.valueOf(arrayList.get(i)).split("&");
        j++;
    }
    String[][] newData= new String[1][4];
    for (int s=0;s<data.length;s++){
        if(data[s][0].equals(bookName) ){
                newData[0]=data[s];
                break;
        }
    }

    String[] columsNames={"Name","Yazar","Acıklama","Sayfa Sayısı"};

    JTable jTable =new JTable(newData,columsNames);

    jTable.setBounds(300,30,300,650);

    jTable.setVisible(true);

    kitapAraWindow.setTable(jTable);

    }
    public  void listele(KitapAraWindow kitapAraWindow,JScrollPane jScrollPane){

        this.kitapAraWindow=kitapAraWindow;

        mainDAO.GetData(BookFileName, arrayList);

        int j=0;
        String[][] data;
        data = new String[arrayList.size()][];
        for (int i=0;i<arrayList.size();i++){
            data[j]= String.valueOf(arrayList.get(i)).split("&");
            j++;
        }

        String[] columsNames={"Name","Yazar","Acıklama","Sayfa Sayısı"};

        JTable jTable =new JTable(data,columsNames);

        JScrollPane jScrollPane1=new JScrollPane(jTable);

        jScrollPane=jScrollPane1;

        jTable.setBounds(300,30,400,650);

        jScrollPane.setBackground(Color.black);

        kitapAraWindow.setjScrollPane(jScrollPane);


        kitapAraWindow.setTable(jTable);


    }
}
