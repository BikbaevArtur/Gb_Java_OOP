package org.example.Sem_5.model;

import java.util.Date;

public class Reservation {
    private static int count=100;
    private  int id;
    {
        id = ++count;
    }

    public Reservation(Date date, String name) {
        this.date = date;
        this.name = name;
    }

    private Date date;
    private String name;

    public int getId() {
        return id;
    }

    public int setId(int id) {
        this.id = id;
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getName() {
        return name;
    }
}
