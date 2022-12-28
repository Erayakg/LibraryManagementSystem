package Controller;

import Entities.Human.Admin;

public class AdminLoginController extends AbstractController{
    Admin admin=new Admin();
    public Boolean loginAdmin(String email,String password){
        boolean a= false;
        a=Login(email,password,admin);
        return a;
    }

}
