package JAVA_Seminars.Seminar04HW.Task02;

import java.util.LinkedList;
import java.util.Random;

/*
Семинар 4 Практическое задание 2.
Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.
*/

public class program {
    static public void main(String[] args) {
        int len = 5;
        int min = 1;
        int max = 10;
        LinkedList<Integer> massive = listGenerator(len, min, max);
        System.out.println(massive + " исходный список");
        enqueue(massive, min, max);
        dequeue(massive);
        first(massive);
    }

    public static LinkedList<Integer> listGenerator(int listLength, int minNumber, int maxNumber) {
        LinkedList<Integer> list = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < listLength; i++) {
            list.add(random.nextInt(minNumber, maxNumber));
        }
        return list;
    }

    public static void enqueue(LinkedList<Integer> list, int minNumber, int maxNumber) {
        Random random = new Random();
        int n = random.nextInt(minNumber, maxNumber);
        list.addLast(n);
        System.out.println(list + " добавление рандомного числа <" + n + "> в конец списка");
    }

    public static void dequeue(LinkedList<Integer> list) {
        int first = list.getFirst();
        list.removeFirst();
        System.out.println(list + " возврат первого элемента <" + first + "> с удалением");
    }

    public static void first(LinkedList<Integer> list) {
        System.out.println(list + " возврат первого элемента <" + list.getFirst() + "> без удаления");
    }
}