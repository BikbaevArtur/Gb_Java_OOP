package org.example.Sem_3.task_2;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Empoyee> {
    @Override
    public int compare(Empoyee o1, Empoyee o2) {
       return Double.compare(o1.caculateSalary(), o2.caculateSalary());
//        return o1.caculateSalary() == o2.caculateSalary() ? 0 :
//        o1.caculateSalary() > o2.caculateSalary() ? 1:-1;
        // сравнивают 2 объекта, если o1 == o2 то делаем возврат 0
        // если o1>o2 то возвращаем 1
        //если 01<02 то возвращаем -1
        // _____// можно так же использовать через обертку Double
    }
}
