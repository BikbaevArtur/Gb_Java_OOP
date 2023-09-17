package org.example.Sem_5.model;

import org.example.Sem_5.presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TableModel implements Model {
    private Collection<Table> tables;

    /**
     * Получить список всех столиков
     *
     * @return коллекция столиков
     */
    public Collection<Table> loadTables() {
        if (tables == null) {
            tables = new ArrayList<>();
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }
        return tables;
    }

    /**
     * Бронирование столика
     *
     * @param reservationData дата
     * @param tableNo         номер столика
     * @param name            имя
     * @return номер брони
     */
    public int reservationTable(Date reservationData, int tableNo, String name) {
        for (Table table : loadTables()
        ) {
            if(table.getNo()==tableNo){
                Reservation reservation = new Reservation(reservationData,name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }

        }return -1;
        //throw new RuntimeException("Неккоректный номер столика");
    }

    public int changeReservationTable(int oldReservation,Date reservationDate,int tableNo,String name){
        return 1;//временно
    }
}
