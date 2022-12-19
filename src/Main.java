import DAO.AdminDAO;
import DAO.BooksDAO;
import DAO.PersonDAO;

public class Main {
    public static void main(String[] args) {
        BooksDAO b1 =new BooksDAO();
        b1.build();
        PersonDAO p1 =new PersonDAO();
       // p1.build();
        AdminDAO a1 =new AdminDAO();
        //a1.build();
    }
}