package JAVA_Seminars.Seminar02.Task02;

import java.util.Scanner;

public class input {
    static Scanner input = new Scanner(System.in);

    public static int IntN(String Text) {
        System.out.println(Text);
        int value = input.nextInt();
        return value;
    }

    public static int Int(String Text) {
        System.out.print(Text);
        int value = input.nextInt();
        return value;
    }

    public static String StrN(String Text) {
        System.out.println(Text);
        String value = input.next();
        return value;
    }

    public static String Str(String Text) {
        System.out.print(Text);
        String value = input.next();
        return value;
    }

    public static double DoubleN(String Text) {
        System.out.println(Text);
        double value = input.nextDouble();
        return value;
    }

    public static double Double(String usersText) {
        System.out.print(usersText);
        double value = input.nextDouble();
        return value;
    }
}