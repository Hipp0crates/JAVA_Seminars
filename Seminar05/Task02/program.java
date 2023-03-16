package JAVA_Seminars.Seminar05.Task02;

import java.util.HashMap;
import java.util.Map;

/*
Даны 2 строки, написать метод, который вернет true, если эти 
строки являются изоморфными и false, если нет. Строки изоморфны, 
если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом

1. повторяющиеся буквы одного слова меняются на одну и ту же букву 
с сохранением порядка следования. (Например, add - egg изоморфны)
2. буква может не меняться, а остаться такой же. (Например, note - code)

Пример 1:
Input: s = "foo", t = "bar"
f b
o a
o --> a
Output: false

Пример 2:
Input: s = "paper", t = "title"
p t
a i
e l
r e
Output: true
*/

public class program {
    static public void main(String[] args) {
        String a = "title";
        String b = "paper";
        System.out.println(isomorphic(a, b));
    }

    public static boolean isomorphic(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        }
        Map<Character, Character> keys1_values2 = new HashMap<>();
        for (int i = 0; i < string1.length(); i++) {
            if (!keys1_values2.containsKey(string1.charAt(i))) {
                keys1_values2.putIfAbsent(string1.charAt(i), string2.charAt(i));
            } else {
                if (keys1_values2.get(string1.charAt(i)) != string2.charAt(i)) {
                    return false;
                }
            }
        }
        Map<Character, Character> keys2_values1 = new HashMap<>();
        for (int i = 0; i < string2.length(); i++) {
            if (!keys2_values1.containsKey(string2.charAt(i))) {
                keys2_values1.putIfAbsent(string2.charAt(i), string1.charAt(i));
            } else {
                if (keys2_values1.get(string2.charAt(i)) != string1.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }
}