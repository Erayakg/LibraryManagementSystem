import Controller.MainWindowController;
import DAO.BooksDAO;
import GUI.MainWindow;
import GUI_Action.MainWindowAction;

public class Main {
    public static void main(String[] args) {
        BooksDAO booksDAO= new BooksDAO();
        booksDAO.build();
        MainWindow mw= new MainWindow();
        mw.build();

    }
}