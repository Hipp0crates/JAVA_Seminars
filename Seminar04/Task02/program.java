package JAVA_Seminars.Seminar04.Task02;

import java.util.LinkedList;
import java.util.Scanner;

/*
Реализовать консольное приложение, которое:
1. Принимает от пользователя строку.
2. сохранить text в связный список.
3. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
*/

public class program {
    static public void main(String[] args) {
        try (Scanner input = new Scanner(System.in, "Cp866")) {
            LinkedList<String> list = new LinkedList<>();
            while (true) {
                System.out.println(list);
                System.out.print("Введите текст: ");
                String text = input.next();
                if (text.contains("print~")) {
                    int remove_idx = Integer.parseInt(text.split("~")[1]);
                    try {
                        System.out.println(list.get(remove_idx));
                        list.remove(remove_idx);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println(e.getMessage());
                    }
                } else {
                    list.add(text);
                }
            }
        }
    }
}