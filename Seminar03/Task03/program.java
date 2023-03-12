package JAVA_Seminars.Seminar03.Task03;

import java.util.ArrayList;
import java.util.Random;

/*
Создать список типа ArrayList. Поместить в него как строки, так и целые числа.
Пройти по списку, найти и удалить целые числа.
*/

public class program {
    static public void main(String[] args) {
        // Забиваем на предупреждение, просто java хочет определиться с типом данных
        ArrayList<Object> array = new ArrayList<Object>();
        String[] words = new String[] { "один", "два", "три", "четыре", "пять" };
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int type = random.nextInt(0, 2);
            if (type == 0) {
                array.add(random.nextInt(1, 9));
            } else {
                array.add(words[random.nextInt(words.length)]);
            }
        }
        System.out.println(array);
        // Метод 1
        int i = 0;
        while (i < array.size()) {
            if (array.get(i) instanceof Integer) {
                array.remove(i);
            } else
                i++;
        }
        System.out.println(array);
        // Метод 2
        for (int j = array.size() - 1; j >= 0; j--) {
            if (array.get(j) instanceof Integer) {
                array.remove(j);
            }
        }
        System.out.println(array);
    }
}