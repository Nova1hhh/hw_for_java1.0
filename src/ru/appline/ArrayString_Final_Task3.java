package ru.appline;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayString_Final_Task3 {
    public static void main(String[] args) {
        System.out.print("Введите кол-во строк: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = 0;
        String[] array = new String[n];
        int[] counter = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Строка %d: ", i + 1);
            array[i] = in.next();
        }
        for (int i = 0; i < n; i++) {
            counter[i] = countUniqueCharacters(array[i]);
            max = Math.max(max, counter[i]);
        }
     //   System.out.println(Arrays.toString(counter));
     //   System.out.println(max);

        int index = 0;
        for (int i = 0; i < n; i++) {
            if (counter[i] == max) {
                index = i;
                break;
            }
        }

        System.out.printf("Ответ: %s", array[index]);
    }

    public static int countUniqueCharacters(String s) {
        char[] characters = s.toCharArray();
        int countOfUniqueChars = s.length();
        for (int i = 0; i < characters.length; i++) {
            if (i != s.indexOf(characters[i])) {
                countOfUniqueChars--;
            }
        }
        return countOfUniqueChars;
    }
}
