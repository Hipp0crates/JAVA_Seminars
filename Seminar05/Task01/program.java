package JAVA_Seminars.Seminar05.Task01;

import java.util.HashMap;
import java.util.Map;

/*
Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
123456 Иванов
321456 Васильев
234561 Петрова
234432 Иванов
654321 Петрова
345678 Иванов
Вывести данные по сотрудникам с фамилией Иванов.
*/

public class program {
    public static void main(String[] args) {
        Map<Integer, String> pasports = new HashMap<>();
        pasports.put(123456, "Иванов");
        pasports.put(321456, "Васильев");
        pasports.put(234561, "Петрова");
        pasports.put(234432, "Иванов");
        pasports.put(654321, "Петрова");
        pasports.put(345678, "Иванов");
        for (Map.Entry<Integer, String> item : pasports.entrySet()) {
            if (item.getValue().equals("Иванов")) {
                System.out.printf("Фамилия: %s  Номер: %s \n", item.getValue(), item.getKey());
            }
        }
        for (Map.Entry<Integer, String> item : pasports.entrySet()) {
            if (item.getKey() == 234561) {
                System.out.printf("Номер: %s  Фамилия: %s \n", item.getKey(), item.getValue());
            }
        }
    }
}