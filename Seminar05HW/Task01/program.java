package JAVA_Seminars.Seminar05HW.Task01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

/*
Семинар 5. Практическое задание 1.
Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
Добавить функции:
1) Добавление номера
2) Вывод всего
*/

public class program {
    static public void main(String[] args) {
        Map<String, ArrayList<Integer>> contacts = new HashMap<String, ArrayList<Integer>>();
        System.out.println("Телефонная книга запущена");

        while (true) {
            String menu = textInput("(1)Добавление (2)Вывод: ");
            switch (menu) {
                case ("1"):
                    addContact(contacts);
                    System.out.println(("Контакт добавлен"));
                    break;
                case ("2"):
                    contacsOutput(contacts);
                    break;
                default:
                    System.out.println("Нет такой команды");
                    break;
            }
        }
    }

    public static Map<String, ArrayList<Integer>> addContact(Map<String, ArrayList<Integer>> phoneBook) {
        ArrayList<Integer> phoneNumbers = new ArrayList<>();
        String name = textInput("Фамилия: ");
        Integer number = numberInput("Телефон: ");
        for (Entry<String, ArrayList<Integer>> item : phoneBook.entrySet()) {
            if (item.getKey().equals(name)) {
                phoneNumbers.addAll(item.getValue());
            }
        }
        phoneNumbers.add(number);
        phoneBook.put(name, phoneNumbers);
        return phoneBook;
    }

    public static void contacsOutput(Map<String, ArrayList<Integer>> phoneBook) {
        for (Entry<String, ArrayList<Integer>> item : phoneBook.entrySet()) {
            System.out.printf("Фамилия: %s  Телефоны: %s\n", item.getKey(), item.getValue());
        }
    }

    static Scanner input = new Scanner(System.in, "Cp866");

    public static Integer numberInput(String text) {
        System.out.print(text);
        int value = input.nextInt();
        return value;
    }

    public static String textInput(String text) {
        System.out.print(text);
        String value = input.next();
        return value;
    }
}