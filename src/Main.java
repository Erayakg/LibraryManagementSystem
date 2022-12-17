import DAO.BooksDAO;
import DAO.MainDAO;
import DAO.PersonDAO;
import Entities.Books.Books;
import Entities.Human.Human;
import Entities.Human.Person;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BooksDAO b1 =new BooksDAO();
        b1.build();
        PersonDAO p1 =new PersonDAO();
        p1.build();
    }
}