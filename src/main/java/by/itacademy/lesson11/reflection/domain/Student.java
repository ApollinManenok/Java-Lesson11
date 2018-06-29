package by.itacademy.lesson11.reflection.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    @Generate
    private String name;
    private String surname;
    private Date birth;
    @Generate
    private int course;
    @Generate
    private boolean payed;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getBirth() {
        return birth;
    }

    public int getCourse() {
        return course;
    }

    public boolean isPayed() {
        return payed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setPayed(boolean payed) {
        this.payed = payed;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                "surname='" + surname + '\'' +
                ", birth=" + ((birth != null) ? (new SimpleDateFormat("dd.MM.yyyy").format(birth)) : (birth)) +
                ", course=" + course +
                ", payed=" + payed +
                '}';
    }
}
