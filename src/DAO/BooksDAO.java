package DAO;

import Entities.Books.Books;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BooksDAO extends MainDAO{
    Books b1=new Books();

    ArrayList  arrayList =new ArrayList<>();
    public void build(){
        b1.setName("ince memed");
        b1.setId(1);
        b1.setDescription("yaşar kemalin kitabı");
        try {
            //Save(b1);
            GetData("class Entities.Books.Books",arrayList);

            for (Object i: arrayList) {
                System.out.println(i);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
