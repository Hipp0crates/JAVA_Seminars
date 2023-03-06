package JAVA_Seminars.Seminar01.Task03;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Дан массив nums = [3, 2, 2, 3, 4, 3] и число val вводим с клавиатуры.
 * Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
 * Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
 * а остальные - равны ему.
 * Ввод: 3
 * Вывод: 2, 2, 4, 3, 3, 3
 */

public class program {
    public static void main(String[] args) {
        int[] nums = new int[] { 3, 2, 2, 3, 4, 3, 4, 4, 3, 3, 4, 6, 2, 2, 3, 5 };
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        int val = input.nextInt();
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(formatedArray(nums, val)));
        input.close();
    }

    public static int[] formatedArray(int[] array, int number) {
        int[] formated = new int[array.length];
        Arrays.fill(formated, number);
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != number) {
                formated[j] = array[i];
                j++;
            }
        }
        return formated;
    }
}