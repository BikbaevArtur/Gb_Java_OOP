package org.example.Sem_5.presenters;

import org.example.Sem_5.model.Reservation;
import org.example.Sem_5.model.Table;
import org.example.Sem_5.model.TableModel;
import org.example.Sem_5.view.BookingView;

import java.util.Collection;
import java.util.Date;

public class BookingPresenter implements ViewObserver {
    private final Model tableModel;
    private View bookingView;

    public BookingPresenter(Model tableModel, View bookingView) {
        this.tableModel = tableModel;
        this.bookingView = bookingView;
        bookingView.setObserver(this);
    }

    public Collection<Table> loadTables() {
        return tableModel.loadTables();
    }

    public void updateTablesUi() {
        bookingView.showTable(loadTables());
    }

    public void updateReservationResultUI(int reservationId) {
        bookingView.printReservationTableResult(reservationId);

    }

    public void updateChangeReservationResultUi(int oldReservation, int tableNo, int reservationId) {
        bookingView.printСhangeReservationTableResult(oldReservation, tableNo, reservationId);
    }


    @Override
    public void oneReservationTable(Date orderData, int tableNo, String name) {
        int reservetionNo = tableModel.reservationTable(orderData, tableNo, name);
        updateReservationResultUI(reservetionNo);
    }

    @Override
    public void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        int changReservationNo = tableModel.changeReservationTable(oldReservation, reservationDate, tableNo, name);
        updateChangeReservationResultUi(oldReservation, tableNo, changReservationNo);
    }


}
