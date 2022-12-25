package Controller;
import DAO.MainDAO;
import java.util.ArrayList;
public abstract class AbstractController {

    MainDAO mainDAO = new MainDAO();
    public  String[][] searchData(Object o){
        String fileName=String.valueOf(o.getClass());
        ArrayList arrayList = new ArrayList();
        mainDAO.GetData(fileName,arrayList);
        String[][] data = new String[arrayList.size()][];
        int j=0;
        for (int i=0;i<arrayList.size();i++){
            data[j]= String.valueOf(arrayList.get(i)).split("&");
            j++;
        }
        System.out.println(data);
        return data;

        //String data[][],String search,,int index
         // for (int i = 0; i < data.length; ++i) {
         //   for(int j = 0; j < data[i].length; ++j) {
           //     if(Objects.equals(data[i][j], search)){
             //       return data[i];
               // }
            //}
        //}
        //return data[0];
    }
}
