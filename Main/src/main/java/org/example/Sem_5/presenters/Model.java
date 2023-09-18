package org.example.Sem_5.presenters;

import org.example.Sem_5.model.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {
    public Collection<Table> loadTables();
    public int reservationTable(Date reservationData, int tableNo, String name);
    public int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);
}
