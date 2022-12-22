package Controller;
import DAO.MainDAO;
import Entities.Books.Books;
import GUI.MainWindow;

import java.util.ArrayList;
public class MainWindowController extends AbstractController {
    Books b1 =new Books();
    //MainWindow mainWindow = new MainWindow();
    MainDAO mainDAO= new MainDAO();
    ArrayList<Books> booksArrayList =new ArrayList<>();
    public String BookFileName= String.valueOf(b1.getClass());
    public String[][] dataGet(){
        mainDAO.GetData(BookFileName, booksArrayList);
        int j=0;
        String[][] data;
        data = new String[booksArrayList.size()][];
        for (int i=0;i<booksArrayList.size();i++){
            data[j]= String.valueOf(booksArrayList.get(i)).split("&");
            j++;
        }
        return data;
    }

    @Override
    public int searchData(String[][] data, String search) {
        return super.searchData(data, search);
    }
   // public String[][] filterData(){
     //   String[][] data;
        //int j=0;
       // data = new String[booksArrayList.size()][];
        //for (int i=0;i<booksArrayList.size();i++){
          //  data[j]= String.valueOf(booksArrayList.get(i)).split("&");
           // j++;
       // }
    //}
}




