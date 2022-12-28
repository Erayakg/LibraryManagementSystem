package Controller;

import DAO.AdminDAO;
import Entities.Human.Admin;
import GUI.HostEkleWindow;
import GUI.HostWindow;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HostEkleController extends AbstractController{
    Admin admin =new Admin();
    AdminDAO adminDAO= new AdminDAO();
    private HostEkleWindow hostEkleWindow ;
    JPanel jPanel = new JPanel();
    public void save(HostEkleWindow hostEkleWindow){
        this.hostEkleWindow=hostEkleWindow;
        admin.setName(hostEkleWindow.getTad().getText());
        admin.setSurname(hostEkleWindow.getTsoyad().getText());
        admin.setAge(Integer.parseInt(hostEkleWindow.getTyas().getText()));
        admin.setEmail(hostEkleWindow.getTemail().getText());
        admin.setPassword(hostEkleWindow.getTsifre().getText());
        try {
            adminDAO.Save(admin);
            System.out.println("başarıyla admin kaydedildi");
        }catch (Exception e){
            System.out.println("admin kayıt hatası:"+e);
        }
    }
    public boolean delete(String silinecek)  {
        boolean a;
        a=delete(admin,silinecek);
        return a;
    }
}
