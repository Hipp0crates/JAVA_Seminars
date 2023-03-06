package JAVA_Seminars.Seminar02.Task01;

import java.util.Scanner;

/*
 * Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N,
 * которая состоит из чередующихся символов c1 и c2, начиная с c1.
 * Ввод: 6 a b
 * Вывод: ababab
 */

public class program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Длина строки: ");
        int n = input.nextInt();
        System.out.print("Сивол 1: ");
        String c1 = input.next();
        System.out.print("Сивол 2: ");
        String c2 = input.next();
        System.out.println(userLine(c1, c2, n));
        input.close();
    }

    public static String userLine(String char1, String char2, int length) {
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) {
                line.append(char1);
            } else {
                line.append(char2);
            }
        }
        return line.toString();
    }
}