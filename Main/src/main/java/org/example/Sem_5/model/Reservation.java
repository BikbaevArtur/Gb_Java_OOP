package org.example.Sem_5.model;

import java.util.Date;

public class Reservation {
    private static int count=100;
    private  int id;
    {
        id = ++count;
    }


    private Date date;
    private String name;


    public Reservation(Date date, String name) {
        this.date = date;
        this.name = name;
    }

    public int getId() {
        return id;
    }


    public Date getDate() {
        return date;
    }

    public String getName() {
        return name;
    }
}
