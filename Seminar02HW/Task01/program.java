package JAVA_Seminars.Seminar02HW.Task01;

import java.util.Arrays;
import java.io.File;
import java.io.FileWriter;

/*
Семинар 2. Практическое задание 1.
Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
результат после каждой итерации запишите в лог-файл.
*/

public class program {
    public static void main(String[] args) {
        int[] massive = { 5, 2, 3, 1, 4, 0 };
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(massive));
        log(massive, false);
        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < massive.length - 1; i++) {
                if (massive[i] > massive[i + 1]) {
                    isSorted = false;

                    temp = massive[i];
                    massive[i] = massive[i + 1];
                    massive[i + 1] = temp;
                    log(massive, true);
                }
            }
        }
        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(massive));
        System.out.println("Процесс работы сортировки записан в log.txt");
    }

    public static void log(int array[], Boolean bool) {
        String text = Arrays.toString(array);
        String s = File.separator;
        String fileName = "JAVA_Seminars" + s + "Seminar02HW" + s + "Task01" + s + "log.txt";
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