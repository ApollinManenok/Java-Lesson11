package by.itacademy.lesson11.reflection.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Sculpture {
    @Generate
    private String name;
    private String author;
    @Generate
    private Date completed;
    private boolean sold;
    private int size;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public Date getCompleted() {
        return completed;
    }

    public boolean isSold() {
        return sold;
    }

    public int getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCompleted(Date completed) {
        this.completed = completed;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Sculpture{" +
                "name='" + name + '\'' +
                "author='" + author + '\'' +
                ", completed=" + ((completed != null) ? (new SimpleDateFormat("dd.MM.yyyy").format(completed)) : (completed)) +
                ", sold=" + sold +
                ", size=" + size +
                '}';
    }
}
