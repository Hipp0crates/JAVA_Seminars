package JAVA_Seminars.Seminar03HW.Task01;

import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;

/*
Семинар 3. Практическое задание 1 (дополнительное).
Реализовать алгоритм сортировки слиянием.
*/

public class program {
    public static void main(String[] args) {
        int[] massive = { 2, 5, 4, 1, 3, 6, 0 };
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(massive));
        log(massive, false); // добавил лог работы сортировки
        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(arraySplit(massive)));
        System.out.println("Процесс работы сортировки записан в log.txt");
    }

    public static int[] arraySplit(int[] array) {
        if (array == null) {
            return null;
        }
        if (array.length == 1) {
            return array;
        }

        int[] temp1 = new int[array.length / 2];
        System.arraycopy(array, 0, temp1, 0, array.length / 2);

        int[] temp2 = new int[array.length - temp1.length];
        System.arraycopy(array, temp1.length, temp2, 0, array.length - temp1.length);

        arraySplit(temp1);
        arraySplit(temp2);

        arrayMerge(array, temp1, temp2);
        return array;
    }

    public static void arrayMerge(int[] array, int[] temp1, int[] temp2) {
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (index1 == temp1.length) {
                array[i] = temp2[index2];
                index2++;
            } else if (index2 == temp2.length) {
                array[i] = temp1[index1];
                index1++;
            } else if (temp1[index1] < temp2[index2]) {
                array[i] = temp1[index1];
                index1++;
            } else {
                array[i] = temp2[index2];
                index2++;
            }
        }
        log(temp1, true);
        log(temp2, true);
        log(array, true);
    }

    public static void log(int array[], Boolean bool) {
        String text = Arrays.toString(array);
        String s = File.separator;
        String fileName = "JAVA_Seminars" + s + "Seminar03HW" + s + "Task01" + s + "log.txt";
        File file = new File(fileName);
        try {
            FileWriter writer = new FileWriter(file, bool);
            writer.write(text);
            writer.write("\n");
            writer.close();
        } catch (Exception e) {
            System.out.println("Что то пошло не так");
        }
    }
}