package JAVA_Seminars.Seminar01.Task01;

import java.util.Scanner;

/*
 * Написать программу, которая запросит пользователя ввести <Имя> в консоли.
 * Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
 */

public class program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "Cp866");
        System.out.print("Имя: ");
        String name = input.next();
        System.out.printf("Привет %s \n", name);
        input.close();
    }
}