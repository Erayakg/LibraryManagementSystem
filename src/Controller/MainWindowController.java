package Controller;
import DAO.MainDAO;
import Entities.Books.Books;
import java.util.ArrayList;
public class MainWindowController extends AbstractController {
    Books b1 =new Books();
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
    public String[][] filterBooks(String search){
        String[][] data2 = dataGet();
        int searchindex = searchData(dataGet(),search);
        String[][] newData=new String[1][1];
        newData[0]=data2[searchindex];
        return newData;
    }
}




