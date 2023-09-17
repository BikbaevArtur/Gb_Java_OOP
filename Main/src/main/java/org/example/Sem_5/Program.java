package org.example.Sem_5;

import org.example.Sem_5.model.TableModel;
import org.example.Sem_5.presenters.BookingPresenter;
import org.example.Sem_5.view.BookingView;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        TableModel model = new TableModel();
        BookingView view = new BookingView();
        BookingPresenter bookingPresenter=new BookingPresenter(model,view);
        bookingPresenter.updateTablesUi();

        view.reservationTable(new Date(),3,"Debil");

        view.changeReservationTable(3,new Date(),1,"don");
    }
}
