import Controller.MainWindowController;
import DAO.BooksDAO;
import GUI.MainWindow;
public class Main {
    public static void main(String[] args) {
        BooksDAO booksDAO= new BooksDAO();
        booksDAO.build();
        MainWindow mw= new MainWindow();
        mw.build();
    }
}