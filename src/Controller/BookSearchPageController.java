package Controller;

import DAO.MainDAO;
import Entities.Books.Books;

import java.util.ArrayList;

public class BookSearchPageController extends AbstractController{
    MainDAO mainDAO = new MainDAO();
    Books books = new Books();
    ArrayList<Books> arrayList = new ArrayList<>();
    String BookFileName =String.valueOf(books.getClass());
public String[][] BookSearch(String bookName){//aranan değer kitabı dönderir
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
    return newData;
    }


}
