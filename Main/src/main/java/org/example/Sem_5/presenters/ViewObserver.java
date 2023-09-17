package org.example.Sem_5.presenters;

import java.util.Date;

public interface ViewObserver {
    void oneReservationTable(Date orderData, int tableNo, String name);
}
