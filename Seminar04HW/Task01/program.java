package JAVA_Seminars.Seminar04HW.Task01;

import java.util.LinkedList;
import java.util.Random;

/*
Семинар 4. Практическое задание 1.
Пусть дан LinkedList с несколькими элементами.
Реализуйте метод(не void), который вернет “перевернутый” список.
*/

public class program {
    static public void main(String[] args) {
        LinkedList<Integer> massive = listGenerator(6, 1, 10);
        System.out.println("Исходный список:");
        System.out.println(massive);
        System.out.println("Перевёрнутый список:");
        System.out.println(flippedList(massive));
    }

    public static LinkedList<Integer> listGenerator(int listLength, int minNumber, int maxNumber) {
        LinkedList<Integer> list = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < listLength; i++) {
            list.add(random.nextInt(minNumber, maxNumber));
        }
        return list;
    }

    public static LinkedList<Integer> flippedList(LinkedList<Integer> list) {
        LinkedList<Integer> reverseList = new LinkedList<>();
        for (int i = 0; i < list.size(); i++) {
            reverseList.add(i, list.get(list.size() - i - 1));
        }
        return reverseList;
    }
}