package JAVA_Seminars.Seminar01.Task02;

/*
 * Дан массив двоичных чисел, например [1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1].
 * Вывести максимальное количество подряд идущих 1.
 * Вывод: 4
 */

public class program {
    public static void main(String[] args) {
        int[] users_array = new int[] { 1, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1 };
        System.out.printf("Максимальная последовательность = %d", calc1(users_array));
    }

    public static int calc1(int[] users_array) {
        int counter = 0;
        int tempCount = 0;
        for (int i = 0; i < users_array.length; i++) {
            if (users_array[i] == 1) {
                tempCount++;
            }
            if (tempCount > counter) {
                counter = tempCount;
            }
            if (users_array[i] == 0) {
                tempCount = 0;
            }
        }
        return counter;
    }
}