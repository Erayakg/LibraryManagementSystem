package GUI;

import javax.swing.*;
import java.awt.*;

public class HomePage implements CustomPanel{

    private JPanel panelHome;
    private JTable tblBooks;
    private TextArea txtSearchBook;
    private JButton BtnSearch;
    private JButton BtnLoginPage;


    @Override
    public JPanel getPanel() {
        return null;
    }

    public JPanel getPanelHome() {
        return panelHome;
    }

    public void setPanelHome(JPanel panelHome) {
        this.panelHome = panelHome;
    }

    public JTable getTblBooks() {
        if(this.tblBooks==null){
            tblBooks=new JTable();
        }
        return tblBooks;
    }

    public void setTblBooks(JTable tblBooks) {
        this.tblBooks = tblBooks;
    }

    public TextArea getTxtSearchBook() {

        return txtSearchBook;
    }

    public void setTxtSearchBook(TextArea txtSearchBook) {
        this.txtSearchBook = txtSearchBook;
    }

    public JButton getBtnSearch() {
        return BtnSearch;
    }

    public void setBtnSearch(JButton btnSearch) {
        BtnSearch = btnSearch;
    }

    public JButton getBtnLoginPage() {
        return BtnLoginPage;
    }

    public void setBtnLoginPage(JButton btnLoginPage) {
        BtnLoginPage = btnLoginPage;
    }
}
