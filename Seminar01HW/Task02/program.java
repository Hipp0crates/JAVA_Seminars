package JAVA_Seminars.Seminar01HW.Task02;
/*
 * Семинар 1. Практическое задание 2.
 * Вывести все простые числа от 1 до 1000.
 */

public class program {
    static public void main(String[] args) {
        simpleNumbers(1000);
    }

    public static void simpleNumbers(int number) {
        System.out.printf("Простые числа от 1 до %s: \n", number);
        for (int i = 1; i <= number; i++) {
            int k = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    k++;
                }
            }
            if (k == 2) {
                System.out.print(i + " ");
            }
        }
    }
}