package JAVA_Seminars.Seminar06.Task01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/*
1. Создайте HashSet, заполните его следующими числами: {1, 2, 30000, 2, 4, 5000, 6, 3}.
Распечатайте содержимое данного множества.

2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 30000, 2, 4, 5000, 6, 3}.
Распечатайте содержимое данного множества.
*/

public class program {
    static public void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(30000);
        set.add(2);
        set.add(4);
        set.add(5000);
        set.add(6);
        set.add(3);
        System.out.println(set);

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(1, 2, 30000, 2, 4, 5000, 6, 3));
        System.out.println(linkedHashSet);

        TreeSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder());
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(30000);
        treeSet.add(2);
        treeSet.add(4);
        treeSet.add(5000);
        treeSet.add(6);
        treeSet.add(3);
        System.out.println(treeSet);
    }
}