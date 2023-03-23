package JAVA_Seminars.Seminar05HW.Task02;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*
Семинар 5. Практическое задание 2.
Пусть дан список сотрудников:
Иван Иванов
Светлана Петрова
Кристина Белова
Анна Мусина
Анна Крутова
Иван Юрин
Петр Лыков
Павел Чернов
Петр Чернышов
Мария Федорова
Марина Светлова
Мария Савина
Мария Рыкова
Марина Лугова
Анна Владимирова
Иван Мечников
Петр Петин
Иван Ежов

Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
Отсортировать по убыванию популярности Имени.
*/

public class program {
    static public void main(String[] args) {
        Map<String, String> employees = new HashMap<String, String>();
        employees.put("Иванов", "Иван");
        employees.put("Петрова", "Светлана");
        employees.put("Белова", "Кристина");
        employees.put("Мусина", "Анна");
        employees.put("Крутова", "Анна");
        employees.put("Юрин", "Иван");
        employees.put("Лыков", "Петр");
        employees.put("Чернов", "Павел");
        employees.put("Чернышов", "Петр");
        employees.put("Федорова", "Мария");
        employees.put("Светлова", "Марина");
        employees.put("Савина", "Мария");
        employees.put("Рыкова", "Мария");
        employees.put("Лугова", "Марина");
        employees.put("Владимирова", "Анна");
        employees.put("Мечников", "Иван");
        employees.put("Петин", "Петр");
        employees.put("Ежов", "Иван");

        Map<String, Integer> repetitions = new HashMap<String, Integer>();
        namesRepetition(employees, repetitions);

        Map<String, Integer> sorted = new LinkedHashMap<String, Integer>();
        namesPopularity(repetitions, sorted);
        System.out.println("Повторяющиеся имена отсортированные по убыванию популярности:");
        System.out.println(sorted);
    }

    public static Map<String, Integer> namesRepetition(Map<String, String> employeesList,
            Map<String, Integer> repetitionList) {
        for (String name : employeesList.values()) {
            if (!repetitionList.containsKey(name)) {
                if (Collections.frequency(employeesList.values(), name) > 1) {
                    repetitionList.put(name, Collections.frequency(employeesList.values(), name));
                }
            }
        }
        return repetitionList;
    }

    public static Map<String, Integer> namesPopularity(Map<String, Integer> repetitionList,
            Map<String, Integer> sortedList) {
        repetitionList.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEachOrdered(x -> sortedList.put(x.getKey(), x.getValue()));
        return sortedList;
    }
}