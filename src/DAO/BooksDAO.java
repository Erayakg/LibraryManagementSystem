package DAO;

import Entities.Books.Books;

import java.io.IOException;

public class BooksDAO extends MainDAO{
    Books b1=new Books();
    public void build(){
        b1.setName("ince memed");
        b1.setId(1);
        b1.setDescription("yaşar kemalin kitabı");
        try {
            Save(b1);
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
