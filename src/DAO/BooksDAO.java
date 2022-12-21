package DAO;

import Entities.Books.Books;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BooksDAO extends MainDAO{
    Books b1=new Books();
    ArrayList  arrayList =new ArrayList<>();
    public void build(){
        b1.setName("sefiller");
b1.setAuthor("victor hugo");
        b1.setPage(120);
        b1.setDescription("güzel kitap");
        try {
            Save(b1);

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
