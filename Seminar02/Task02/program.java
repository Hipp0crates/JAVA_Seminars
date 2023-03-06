package JAVA_Seminars.Seminar02.Task02;

/*
 * Напишите метод, который сжимает строку. Пример: вход aaaabbbcddaaa.
 * результат - a4b3cd2a3
 * .charAt(i)
 * stroka = "Привет"
 * stroka1 = new String
 * stroka1 = "Привет"
 * stroka == stroka1 ---> False
 * stroka.equals(stroka1) ---> True
 */

public class program {
    public static void main(String[] args) {
        String stroka = input.StrN("Введите строку");
        System.out.println(compression(stroka));
    }

    public static String compression(String str) {
        int counter = 1;
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                counter++;
            } else {
                line.append(str.charAt(i));
                if (counter != 1) {
                    line.append(counter);
                    counter = 1;
                }
            }
        }
        line.append(str.charAt(str.length() - 1));
        if (counter != 1) {
            line.append(counter);
        }
        return line.toString();
    }
}