package JAVA_Seminars.Seminar04.Task01;

import java.util.ArrayList;
import java.util.LinkedList;

/*
1. Замерьте время, за которое в ArrayList добавятся 100000 элементов.
2. Замерьте время, за которое в LinkedList добавятся 100000 элементов. Сравните с предыдущим.
*/

public class program {
    static public void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<>();
        long startArrayList1 = System.currentTimeMillis();
        for (int i = 0; i <= 100000; i++) {
            array1.add(i);
        }
        long endArrayList1 = System.currentTimeMillis();
        int timeArrayList1 = (int) (endArrayList1 - startArrayList1);
        System.out.println("Время заполнения ArrayList: " + timeArrayList1 + "ms.");

        ArrayList<Integer> array2 = new ArrayList<>();
        long startArrayList2 = System.currentTimeMillis();
        for (int i = 0; i <= 100000; i++) {
            array2.add(0, i);
        }
        long endArrayList2 = System.currentTimeMillis();
        int timeArrayList2 = (int) (endArrayList2 - startArrayList2);
        System.out.println("Время добавления ArrayList: " + timeArrayList2 + "ms.");

        LinkedList<Integer> list1 = new LinkedList<>();
        long startLinkedList1 = System.currentTimeMillis();
        for (int i = 0; i <= 100000; i++) {
            list1.add(i);
        }
        long endLinkedList1 = System.currentTimeMillis();
        long timeLinkedList1 = endLinkedList1 - startLinkedList1;
        System.out.println("Время заполнения LinkedList: " + timeLinkedList1 + "ms.");

        LinkedList<Integer> list2 = new LinkedList<>();
        long startLinkedList2 = System.currentTimeMillis();
        for (int i = 0; i <= 100000; i++) {
            list2.add(0, i);
        }
        long endLinkedList2 = System.currentTimeMillis();
        long timeLinkedList2 = endLinkedList2 - startLinkedList2;
        System.out.println("Время добавления LinkedList: " + timeLinkedList2 + "ms.");
    }
}