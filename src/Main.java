import Controller.BookSearchPageController;
import Controller.MainWindowController;
import Controller.ogrenciWindowController;
import DAO.BooksDAO;
import DAO.MainDAO;
import Entities.Human.Admin;
import GUI.MainWindow;
import GUI.OgrenciWindow;
import GUI_Action.MainWindowAction;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MainWindow mw= new MainWindow();
        mw.build();
        MainWindowController mainWindowController = new MainWindowController();

    }
}