package org.example.Sem_4;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(new Employee("lol", 24));
        arrayList1.add(21);
        arrayList1.add(true);
        arrayList1.add("Hello");


        MyArrayList myArrayList = new MyArrayList(new Object[10]);
        myArrayList.add(3);
        myArrayList.add(new Employee("aa",32));
        myArrayList.add(true);
        myArrayList.add("asd");

        System.out.println(myArrayList.size());
        for (Object e: myArrayList) {
            if(e != null&& e instanceof Employee){ // преобразование даун кастинг(вниз) нужна проверка
                Employee employee = (Employee)e;
                System.out.println(e);
            }
        }

    }
}
