package Controller;
import DAO.MainDAO;
import Entities.Human.Person;
import GUI.OgrenciWindow;
import java.util.ArrayList;
public class ogrenciWindowController extends AbstractController {
    OgrenciWindow ogrenciWindow = new OgrenciWindow();
    MainDAO mainDAO = new MainDAO();
    Person person=new Person();
    String personalFileName=String.valueOf(person.getClass());
    ArrayList<Person> personArrayList= new ArrayList<>();
    String data[][];
    public void convertOgreciData(){
        mainDAO.GetData(personalFileName, personArrayList);
        int j=0;
        data = new String[personArrayList.size()][];
        for (int i=0;i<personArrayList.size();i++){
            data[j]= String.valueOf(personArrayList.get(i)).split("&");
            j++;
        }
    }
    public ogrenciWindowController() {
        convertOgreciData();
    }
    public Boolean OgrLogin(String email, String password){
        for (int i=0;i<data.length;i++){
            if(data[i][2].equals(email) ){
                if (data[i][3].equals(password)){
                    return true;
                }
            }
        }
        return false;
    }
}
