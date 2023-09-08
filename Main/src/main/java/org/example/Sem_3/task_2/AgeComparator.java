package org.example.Sem_3.task_2;

import java.util.Comparator;

public class AgeComparator implements Comparator<Empoyee> {
    @Override
    public int compare(Empoyee o1, Empoyee o2) {
        return Integer.compare(o1.age,o2.age);
    }
}
