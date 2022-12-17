package Entities.Books;

import java.util.Objects;

public class Books {
    private int id;
    private String Name;
    private String Description;
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
    public String toString() {
        return
               id+"&"+Name+"&"+Description;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Books)) return false;
        Books books = (Books) o;
        return getId() == books.getId() && Objects.equals(getName(), books.getName())  && Objects.equals(getDescription(), books.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getDescription());
    }


}
