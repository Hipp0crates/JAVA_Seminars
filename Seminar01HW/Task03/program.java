package JAVA_Seminars.Seminar01HW.Task03;

import java.util.Scanner;

/*
 * Семинар 1. Практическое задание 3.
 * Реализовать простой калькулятор (+ - / *)
 */

public class program {
    static public void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Число 1 --> ");
        int n1 = input.nextInt();
        System.out.print("Операция -> ");
        char z = input.next().charAt(0);
        System.out.print("Число 2 --> ");
        int n2 = input.nextInt();
        input.close();
        switch (z) {
            case '+':
                addition(n1, n2);
                break;
            case '-':
                subtraction(n1, n2);
                break;
            case '*':
                multiplication(n1, n2);
                break;
            case '/':
                division(n1, n2);
                break;
            default:
                System.out.printf("Ошибка, введите корректную операцию: + - * /");
                return;
        }
    }

    public static void addition(int number1, int number2) {
        int rez = number1 + number2;
        System.out.print(number1 + " + " + number2 + " = " + rez);
    }

    public static void subtraction(int number1, int number2) {
        int rez = number1 - number2;
        System.out.print(number1 + " - " + number2 + " = " + rez);
    }

    public static void multiplication(int number1, int number2) {
        int rez = number1 * number2;
        System.out.print(number1 + " * " + number2 + " = " + rez);
    }

    public static void division(int number1, int number2) {
        double num1 = number1;
        double num2 = number2;
        double rez = num1 / num2;
        // Ограничил вывод при делении до 3 знаков после запятой
        System.out.printf("%s / %s = %.3f", number1, number2, rez);
    }
}