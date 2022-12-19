package DAO;

import Entities.Human.Admin;

import java.io.IOException;
public class AdminDAO extends MainDAO {
    Admin a1=new Admin();
    @Override
    public void Save(Object o) throws IOException {
        super.Save(o);
    }
    public void build(){
        a1.setName("eray");
        a1.setSurname("akgül");
        a1.setAge(32);
        a1.setEmail("aeray2301@gmailocm");
        a1.setPassword("kralsınıy");
        try {
            Save(a1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}