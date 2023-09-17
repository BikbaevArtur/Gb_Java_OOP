package org.example.Sem_5.model;

import java.util.ArrayList;

import java.util.Collection;
import java.util.Locale;

public class Table {
    private static int count;
    private final int no;

    private final Collection<Reservation>reservations = new ArrayList<>();

    {
        no = ++count;
    }

    public int getNo() {
        return no;
    }

    public Collection<Reservation> getReservations() {
        return reservations;
    }

    @Override
    public String toString() {
        return String.format(Locale.getDefault(),"Столик %d",no);
    }
}
