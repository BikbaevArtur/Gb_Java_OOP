package org.example.Sem_5.presenters;

import org.example.Sem_5.model.Table;

import java.util.Collection;

public interface View {
    public void showTable(Collection<Table> tables);

    /**
     * Регистрация наблюдателя
     * @param observer
     */
    void setObserver(ViewObserver observer);

    /**
     * распечатать результат бронирование столика
     * @param reservationNo
     */
    void printReservationTableResult(int reservationNo);
}
