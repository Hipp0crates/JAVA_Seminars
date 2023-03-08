package JAVA_Seminars.Seminar01HW.Task01;

import java.util.Scanner;

/*
 * Семинар 1. Практическое задание 1.
 * Вычислить n-ое треугольного число (сумма чисел от 1 до n) и n! (произведение чисел от 1 до n).
 */

public class program {
    static public void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = input.nextInt();
        triangular(n);
        factorial(n);
        input.close();
    }

    public static void triangular(int number) {
        int result = 0;
        for (int i = 0; i <= number; i++) {
            result = result + i;
        }
        System.out.printf("Т(%s) = %s \n", number, result);
    }

    public static void factorial(int number) {
        int num = number + 1;
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        result = result / num;
        System.out.printf("%s! = %s \n", number, result);
    }
}