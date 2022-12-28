package Controller;
import DAO.MainDAO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class AbstractController {
    MainDAO mainDAO = new MainDAO();
    public  void convertData(Object o,String[][] data){
        String fileName=String.valueOf(o.getClass());
        ArrayList arrayList = new ArrayList();
        mainDAO.GetData(fileName,arrayList);
        int j=0;
        for (int i=0;i<arrayList.size();i++){
            data[j]= String.valueOf(arrayList.get(i)).split("&");
            j++;
        }
    }
    public Boolean  delete(Object o,String silinecek){
        String fileName=String.valueOf(o.getClass());
        ArrayList list1=new ArrayList();
        String[][] data=new String[calculateData(o)][];
        mainDAO.GetData(fileName,list1);
        convertData(o,data);
        boolean a=false;
        int silinecekindex =0;
        for (int i=0;i<data.length;i++){
            if(data[i][0].equals(silinecek)){
                 silinecekindex=i;
                 a=true;
                 break;
            }
        }
        list1.remove(silinecekindex);
        mainDAO.SaveArraylist(fileName,list1);
        return a;
    }
    public int calculateData(Object o){
        String fileName=String.valueOf(o.getClass());
        ArrayList arrayList = new ArrayList();
        mainDAO.GetData(fileName,arrayList);
            return arrayList.size();
    }
    public Boolean Login(String email,String password,Object o){
        String[][] data=new String[calculateData(o)][];
        convertData(o,data);
        for (int i=0;i<data.length;i++){
            if (data[i][2].equals(email)){
                if (data[i][3].equals(password))
                {
                    return true;
                }
            }
        }
        return false;

    }
}
