package JAVA_Seminars.Seminar02HW.Task03;

import java.util.Scanner;

/*
Семинар 2. Практическое задание 3.
Напишите метод, который принимает на вход строку (String)
и определяет является ли строка палиндромом (возвращает boolean значение).
Без встр. функций
*/

public class program {
    static public void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ввод строки:");
        String line = scan.nextLine();
        char[] massive = line.toCharArray();
        palindrome(massive);
        scan.close();
    }

    public static void palindrome(char array[]) {
        System.out.println("Палиндром?");
        int count = 0;
        boolean bool = true;
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] == array[array.length - 1 - i]) {
                count++;
            }
        }
        if (count == array.length / 2) {
            System.out.println(bool);
        } else {
            System.out.println(!bool);
        }
    }
}