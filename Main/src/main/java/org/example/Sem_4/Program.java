package org.example.Sem_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(new Employee("lol", 24));
        arrayList1.add(21);
        arrayList1.add(true);
        arrayList1.add("Hello");


        MyArrayList <Employee> myArrayList = new MyArrayList<>(new Employee[10]); // из обопщенного типа преобразование в Employee
        //myArrayList.add(3);
        myArrayList.add(new Employee("aa",32));
        //myArrayList.add(true);
        //myArrayList.add("asd");

        System.out.println(myArrayList.size());
//        for (Object e: myArrayList) {
//            if(e != null&& e instanceof Employee){ // преобразование даун кастинг(вниз) нужна проверка
//                Employee employee = (Employee)e;
//                System.out.println(e);
//            }
//        }
        for (Employee e: myArrayList) {  // исчезает надобность проверки instanceof
            if(e != null){
                System.out.println(e.getName());
            }
        }

        Integer[] array1 = {1,2,4,5,6,7,2,3,5};
        System.out.println(Arrays.toString(array1));//можно вывести массив(Уау)
        String []array2 = {"22313","qe","asd","asds","dqwr"};
        Integer[]res =  ArrayUtils.replaceTwoElement(array1,2,5);
        System.out.println(Arrays.toString(res));

    }
}
