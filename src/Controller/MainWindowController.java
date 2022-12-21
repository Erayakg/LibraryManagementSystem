package Controller;

import DAO.MainDAO;
import Entities.Books.Books;
import GUI.MainWindow;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class MainWindowController extends MainDAO {
    Books b1 =new Books();
    ArrayList<Books> booksArrayList =new ArrayList<>();
    public String BookFileName= String.valueOf(b1.getClass());
    public String[][] dataGet(){
        super.GetData(BookFileName, booksArrayList);
        int j=0;
        String[][] data;
        data = new String[booksArrayList.size()][];
        for (int i=0;i<booksArrayList.size();i++){
            data[j]= String.valueOf(booksArrayList.get(i)).split("&");
            j++;
        }
        return data;
    }

}



