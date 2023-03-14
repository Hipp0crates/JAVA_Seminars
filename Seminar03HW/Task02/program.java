package JAVA_Seminars.Seminar03HW.Task02;

import java.util.ArrayList;
import java.util.Random;

/*
Семинар 3. Практическое задание 2.
Пусть дан произвольный список целых чисел, удалить из него чётные числа.
*/

public class program {
    static public void main(String[] args) {
        ArrayList<Integer> massive = arrayGenerator(20, 1, 9);
        System.out.println("Исходный массив:");
        System.out.println(massive);
        System.out.println("Массив без чётных чисел:");
        System.out.println(removeEven(massive));
    }

    public static ArrayList<Integer> arrayGenerator(int arrayLength, int minNumber, int maxNumber) {
        ArrayList<Integer> array = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < arrayLength; i++) {
            array.add(random.nextInt(minNumber, maxNumber));
        }
        return array;
    }

    public static ArrayList<Integer> removeEven(ArrayList<Integer> array) {
        for (int i = array.size() - 1; i >= 0; i--) {
            if (array.get(i) % 2 == 0) {
                array.remove(i);
            }
        }
        return array;
    }
}