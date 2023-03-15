package JAVA_Seminars.Seminar04.Task03;

import java.util.Scanner;
import java.util.Stack;

/*
Реализовать консольное приложение, которое:
1. Принимает от пользователя и “запоминает” строки.
2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
*/

public class program {
    static public void main(String[] args) {
        try (Scanner input = new Scanner(System.in, "Cp866")) {
            Stack<String> list = new Stack<>();
            String text = "";
            while (!text.contains("print")) {
                System.out.println(list);
                System.out.print("Введите текст: ");
                text = input.next();
                if (text.contains("print")) {
                    while (!list.isEmpty()) {
                        System.out.print(list.pop() + " ");
                    }
                } else {
                    list.push(text);
                }
            }
        }
    }
}