package DAO;

import Entities.Human.Person;

public class PersonDAO extends MainDAO{
    Person p1=new Person();
    public void build(){
        try {
            p1.setName("eray");
            p1.setPassword("asdas");
            p1.setEmail("kraloyunuc44");
            p1.setAge(43);
            p1.setSurname("kralsınıyza");
            Save(p1);

        }catch (Exception e){
            System.out.println("PersonDAO Exception:"+e);
        }
    }
}
