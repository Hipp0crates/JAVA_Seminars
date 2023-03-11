package JAVA_Seminars.Seminar02HW.Task02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
Семинар 2. Практическое задание 2.
Дана строка (получение через обычный текстовый файл!!!)
"фамилия":"Иванов","оценка":"5","предмет":"Математика"
"фамилия":"Петрова","оценка":"4","предмет":"Информатика"

Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
Студент [фамилия] получил [оценка] по предмету [предмет].

Пример вывода:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.
*/

public class program {
    public static void main(String[] args) {
        String s = File.separator;
        String fileName = "JAVA_Seminars" + s + "Seminar02HW" + s + "Task02" + s + "data.txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line = br.readLine();
            while (line != null) {
                String[] array = line.split(",");
                line = br.readLine();
                StringBuilder str = new StringBuilder();
                for (String i : array) {
                    String[] words = i.toString().split(":");
                    str.append(words[1]).append(" ");
                }
                String[] list = str.toString().split(" ");
                System.out.println(
                        "Студент " + list[0].replace("\"", "") + " получил " + list[1].replace("\"", "")
                                + " по предмету " + list[2].replace("\"", ""));
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.printf("Файл %s с данными не найден", fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}