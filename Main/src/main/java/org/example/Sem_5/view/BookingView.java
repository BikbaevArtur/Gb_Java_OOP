package org.example.Sem_5.view;

import org.example.Sem_5.model.Table;
import org.example.Sem_5.presenters.View;
import org.example.Sem_5.presenters.ViewObserver;

import java.util.Collection;
import java.util.Date;

public class BookingView  implements View {
    private ViewObserver observer;

    public void showTable(Collection<Table> tables) {
        for (Table table : tables) {
            System.out.println(table);

        }
    }

    @Override
    public void setObserver(ViewObserver observer) {
        this.observer=observer;
    }

    @Override
    public void printReservationTableResult(int reservationNo) {
        if(reservationNo >0){
            System.out.printf("Столик успешно забронирован. Номер вашей брони %d",reservationNo);
        }
        else {
            System.out.println("Не удолось забронировать");;
        }
    }


    public void reservationTable(Date orderDate, int tableNo, String name){
observer.oneReservationTable(orderDate,tableNo,name);
    }

    public void changeReservationTable(int oldReservation,Date reservation,int tableNo, String name){

    }
}
