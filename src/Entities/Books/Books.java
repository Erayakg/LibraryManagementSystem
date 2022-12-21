package Entities.Books;

import java.util.Objects;

public class Books {
    private int id;
    private String Name;
    private String Description;
    private String author;

    private int page;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Books books = (Books) o;
        return id == books.id && page == books.page && Objects.equals(Name, books.Name) && Objects.equals(Description, books.Description) && Objects.equals(author, books.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, Name, Description, author, page);
    }

    @Override
    public String toString() {
        return
               Name+"&"+author+"&"+Description+"&"+page;
    }


}
