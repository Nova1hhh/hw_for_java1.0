package ru.appline;

import java.util.Scanner;

public class Uravnenie_Final_Task2 {
    public static void main(String[] args) {
        String str;
        Scanner in = new Scanner(System.in);
        str = in.nextLine();
        int index = str.indexOf('x');
        if (index == 4) {
            int pos = str.lastIndexOf("+");
            if (pos == 1) {
                System.out.println(Integer.parseInt(String.valueOf(str.charAt(0))) +
                        Integer.parseInt(String.valueOf(str.charAt(2))));
            } else {
                System.out.println(Integer.parseInt(String.valueOf(str.charAt(0))) -
                        Integer.parseInt(String.valueOf(str.charAt(2))));
            }
        } else if (index == 0) {
            int pos = str.lastIndexOf("+");
            if (pos == 1) {
                System.out.println(Integer.parseInt(String.valueOf(str.charAt(4))) -
                        Integer.parseInt(String.valueOf(str.charAt(2))));
            } else {
                System.out.println(Integer.parseInt(String.valueOf(str.charAt(4))) +
                        Integer.parseInt(String.valueOf(str.charAt(2))));
            }
        } else if (index == 2) {
            int pos = str.lastIndexOf("+");
            if (pos == 1) {
                System.out.println(Integer.parseInt(String.valueOf(str.charAt(4))) -
                        Integer.parseInt(String.valueOf(str.charAt(0))));
            } else {
                System.out.println(-(Integer.parseInt(String.valueOf(str.charAt(4))) -
                        Integer.parseInt(String.valueOf(str.charAt(0)))));
            }
        }

    }
}
