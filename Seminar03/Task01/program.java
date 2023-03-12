package JAVA_Seminars.Seminar03.Task01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

/*
Заполнить список десятью случайными числами. Отсортировать список методом sort() и вывести его на экран.
*/

public class program {
    static public void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            array.add(random.nextInt(1, 9));
        }

        System.out.println(array);
        array.sort(Comparator.naturalOrder());
        System.out.println(array);
    }
}