package ru.appline;

import java.util.Locale;
import java.util.Scanner;

public class DataPractice_Task12 {
    public static void main(String[] args) {
        System.out.println("Введите строку");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        boolean got = str.contains("Java");
        int i = 0;
        if (got) {
            System.out.println("содердит java");
            i++;
        }
        got = str.startsWith("I like");

        if (got) {
            System.out.println("Начинается с I like");
            i++;
        }
        got = str.endsWith("!!!");

        if (got) {
            System.out.println("Заканчивается на !!!");
            i++;
        }
        if (i == 3) {
            System.out.println(str.toUpperCase());
        }

        str = str.replace('a', 'o');
        System.out.println(str.substring(7, 11));

    }
}
