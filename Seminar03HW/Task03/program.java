package JAVA_Seminars.Seminar03HW.Task03;

import java.util.ArrayList;
import java.util.Random;

/*
Семинар 3. Практическое задание 3.
Задан целочисленный список ArrayList.
Найти минимальное, максимальное и среднее арифметическое из этого списка.
*/

public class program {
    static public void main(String[] args) {
        ArrayList<Integer> massive = arrayGenerator(9, 1, 9);
        System.out.println("Задан массив:");
        System.out.println(massive);
        minimum(massive);
        maximum(massive);
        arithmeticMean(massive);
    }

    public static ArrayList<Integer> arrayGenerator(int arrayLength, int minNumber, int maxNumber) {
        ArrayList<Integer> array = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < arrayLength; i++) {
            array.add(random.nextInt(minNumber, maxNumber));
        }
        return array;
    }

    public static void minimum(ArrayList<Integer> array) {
        int min = array.get(0);
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) < min) {
                min = array.get(i);
            }
        }
        System.out.printf("Минимальное число: %s\n", min);
    }

    public static void maximum(ArrayList<Integer> array) {
        int max = array.get(0);
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) > max) {
                max = array.get(i);
            }
        }
        System.out.printf("Максимальное число: %s\n", max);
    }

    public static void arithmeticMean(ArrayList<Integer> array) {
        double sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i);
        }
        double rez = sum / array.size();
        System.out.printf("Cреднее арифметическое: %.4f\n", rez);
    }
}