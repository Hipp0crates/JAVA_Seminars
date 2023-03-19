package JAVA_Seminars.Seminar04HW.Task03;

import java.util.LinkedList;
import java.util.Scanner;

/*
Семинар 4. Практическое задание 3.
В калькулятор добавьте возможность отменить последнюю операцию.
Дополнительно - реализована каскадная отмена.
*/

public class program {
    static public void main(String[] args) {
        LinkedList<Double> memory = new LinkedList<>();

        double n1 = numberInput("Число   : ");
        memory.add(n1);

        while (true) {
            n1 = memory.getLast();
            String z = operatorInput("Операция: ");
            if (z.equals("отмена")) {
                cancel(n1, memory);
                continue;
            } else {
                double n2 = numberInput("Число   : ");
                calculator(z, n1, n2, memory);
            }
        }
    }

    public static void calculator(String operator, Double number1, Double number2, LinkedList<Double> list) {
        switch (operator) {
            case "+":
                addition(number1, number2, list);
                break;
            case "-":
                subtraction(number1, number2, list);
                break;
            case "*":
                multiplication(number1, number2, list);
                break;
            case "/":
                division(number1, number2, list);
                break;
            case ("отмена"):
                cancel(number1, list);
                break;
            default:
                System.out.println("Ошибка, корректная операция: + - * / или 'отмена'");
                return;
        }
    }

    public static void addition(Double number1, Double number2, LinkedList<Double> list) {
        double rez = number1 + number2;
        list.add(rez);
        System.out.printf("Ответ   : %.2f\n", rez);
    }

    public static void subtraction(Double number1, Double number2, LinkedList<Double> list) {
        double rez = number1 - number2;
        list.add(rez);
        System.out.printf("Ответ   : %.2f\n", rez);
    }

    public static void multiplication(Double number1, Double number2, LinkedList<Double> list) {
        double rez = number1 * number2;
        list.add(rez);
        System.out.printf("Ответ   : %.2f\n", rez);
    }

    public static void division(Double number1, Double number2, LinkedList<Double> list) {
        double rez = number1 / number2;
        list.add(rez);
        System.out.printf("Ответ   : %.2f\n", rez);
    }

    public static void cancel(Double number1, LinkedList<Double> list) {
        list.removeLast();
        if (list.isEmpty()) {
            list.add(number1);
            System.out.printf("Число   : %.2f\n", list.getLast());
        } else {
            System.out.printf("Число   : %.2f\n", list.getLast());
        }
    }

    static Scanner input = new Scanner(System.in, "Cp866");

    public static double numberInput(String text) {
        System.out.print(text);
        double value = input.nextDouble();
        return value;
    }

    public static String operatorInput(String text) {
        System.out.print(text);
        String value = input.next();
        return value;
    }
}