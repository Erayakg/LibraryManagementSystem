package Controller;

import DAO.MainDAO;
import Entities.Human.Person;
import GUI.OgrEkleWindow;

public class OgrenciEkleController extends AbstractController {
    Person person =new Person();
    MainDAO mainDAO =new MainDAO();
    private OgrEkleWindow ogrEkleWindow;
    public void save(OgrEkleWindow ogrEkleWindow){
        this.ogrEkleWindow=ogrEkleWindow;
        person.setName(ogrEkleWindow.getTad().getText());
        person.setSurname(ogrEkleWindow.getTsoyad().getText());
        person.setEmail(ogrEkleWindow.getTemail().getText());
        person.setPassword(ogrEkleWindow.getTsifre().getText());
        person.setAge(Integer.parseInt(ogrEkleWindow.getTyas().getText()));
        try {
            mainDAO.Save(person);
        }catch (Exception e){
            System.out.println("ogrenci kaydetme hatası:"+e);
        }
    }
    public boolean sil(String silinecek){
        boolean a=delete(person,silinecek);
        return a;
    }

}
