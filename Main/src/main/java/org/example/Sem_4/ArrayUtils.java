package org.example.Sem_4;

public class ArrayUtils {
    public static <T>T[] replaceTwoElement(T[] array, int index1, int index2) {
        if (index2 >= array.length || index1 >= array.length || index1 < 0 || index2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        T[] newArray = array.clone();
        T temp = newArray[index1];
        newArray[index1] = newArray[index2];
        newArray[index2] = temp;
        temp = null;
        return newArray;


    }
}
