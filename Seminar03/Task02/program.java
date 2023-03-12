package JAVA_Seminars.Seminar03.Task02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/*
Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
Вывести название каждой планеты и количество его повторений в списке.
*/

public class program {
    public static void main(String[] args) {
        String[] solarSystem = { "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune" };
        ArrayList<String> planets = new ArrayList<String>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            planets.add(solarSystem[random.nextInt(0, 7)]);
        }
        System.out.println(planets);
        // Метод 1
        int count[] = new int[10];
        for (String name : planets) {
            for (int j = 0; j < solarSystem.length; j++) {
                if (name.equals(solarSystem[j])) {
                    count[j]++;
                    break;
                }
            }
        }
        for (int j = 0; j < solarSystem.length; j++) {
            System.out.print(solarSystem[j] + "-" + count[j] + " ");
        }
        // Метод 2
        for (int i = 0; i < solarSystem.length; i++) {
            System.out.printf("\n%s встречается %d раз", solarSystem[i],
                    Collections.frequency(planets, solarSystem[i]));
        }
    }
}