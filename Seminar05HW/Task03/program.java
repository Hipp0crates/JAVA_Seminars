package JAVA_Seminars.Seminar05HW.Task03;

/*
Семинар 5. Практическое задание 3.
На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга. И вывести Доску.
*/

public class program {
    public static void main(String[] args) {
        String[][] board = new String[8][8];
        eightQueens(0, board);
    }

    private static int count = 1;

    private static void eightQueens(int line, String[][] array) {
        if (line == 8) {
            System.out.println("Вариант " + count);
            count++;
            for (String[] x : array) {
                for (String y : x) {
                    System.out.print(y + " ");
                }
                System.out.println();
            }
        } else {
            String[][] temp = new String[8][8];
            for (int x = 0; x < array.length; x++) {
                for (int y = 0; y < array[x].length; y++) {
                    temp[x][y] = array[x][y];
                }
            }
            for (int x = 0; x < 8; x++) {
                if (noDangerous(line, x, temp)) {
                    for (int y = 0; y < 8; y++) {
                        temp[line][y] = "·";
                    }
                    temp[line][x] = "X";
                    eightQueens(line + 1, temp);
                }
            }
        }
    }

    private static boolean noDangerous(int line, int column, String[][] array) {
        for (int x = line - 1; x >= 0; x--) {
            if (array[x][column] == "X") {
                return false;
            }
        }
        for (int x = line - 1, y = column - 1; x >= 0 && y >= 0; x--, y--) {
            if (array[x][y] == "X") {
                return false;
            }
        }
        for (int x = line - 1, y = column + 1; x >= 0 && y < 8; x--, y++) {
            if (array[x][y] == "X") {
                return false;
            }
        }
        return true;
    }
}