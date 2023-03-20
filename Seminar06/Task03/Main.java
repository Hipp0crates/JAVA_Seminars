package JAVA_Seminars.Seminar06.Task03;
/*
Продумайте структуру класса Кот.
Какие поля и методы будут актуальны для приложения, которое является информационной системой ветеринарной клиники.
*/

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {
        String pattern = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Cat cat1 = new Cat("Барсик", 6, true, 'м', "Русская дворовая", simpleDateFormat.parse("12-01-2018"));
        cat1.meow();
        cat1.meow(5);
        System.out.println(cat1.humanAge() + " человеческих лет млекопитаюшему по имени " + cat1.getName());
        System.out.println(cat1);
    }
}